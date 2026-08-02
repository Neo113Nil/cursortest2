package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class RestStateRecognizer implements SignalProcessor {
    public static final int STATE_MOTION = 2;
    public static final int STATE_REST = 1;
    public static final int STATE_UNKNOWN = 0;
    private double acceleration;
    private double accelerationMaxSum;
    private final double alphaJerk;
    private final boolean applyCorrection;
    private double brakingAccelerationMin;
    private long brakingTimeBegin;
    private long brakingTimeEnd;
    private long brakingTimeMin;
    private final long decisionMakingIntervalNanos;
    private final long decisionValidnessIntervalNanos;
    private final long delayIntervalNanos;
    private final HighPassFilter3D forward;
    private final HighPassFilter3D gravity;
    private double jerk;
    private final HighPassFilter3D linear;
    private int maxCount;
    private Sample nearestBack;
    private Sample newest;
    private Sample oldest;
    private final SamplePool pool;
    private int samplesCount;
    private double scalarLF;
    private long stableTillTimestampNanos;
    private long startTimestampNanos;
    private int state;
    private int steadyCount;
    private long validTimestampNanos;

    public static class Sample {
        double acceleration;
        double accelerationMax;
        double accelerationMin;
        int braking;
        int max;
        long maxStartTime;
        double maxStartValue;
        int min;
        long minStartTime;
        double minStartValue;
        Sample next;
        Sample prev;
        int racing;
        int retard;
        int spurt;
        int steady;
        long timestampNanos;

        public void reset() {
            this.timestampNanos = 0L;
            this.acceleration = 0.0d;
            this.accelerationMax = 0.0d;
            this.accelerationMin = 0.0d;
            this.max = 0;
            this.min = 0;
            this.maxStartTime = 0L;
            this.maxStartValue = 0.0d;
            this.minStartTime = 0L;
            this.minStartValue = 0.0d;
            this.spurt = 0;
            this.racing = 0;
            this.steady = 0;
            this.retard = 0;
            this.braking = 0;
            this.next = null;
            this.prev = null;
        }
    }

    public static class SamplePool {
        Sample head;

        public Sample acquire() {
            Sample sample = this.head;
            if (sample == null) {
                return new Sample();
            }
            this.head = sample.next;
            sample.reset();
            return sample;
        }

        public void release(Sample sample) {
            sample.next = this.head;
            sample.prev = null;
            this.head = sample;
        }
    }

    public RestStateRecognizer(double d4, boolean z) {
        this(10.0d, 15.0d, 25.0d, 15.0d, 8.0d, d4, 1.0d, z);
    }

    private void addSample(Sample sample) {
        this.accelerationMaxSum += sample.accelerationMax;
        this.maxCount += sample.max;
        this.steadyCount += sample.steady;
        this.samplesCount++;
    }

    private boolean isEnoughData() {
        Sample sample;
        Sample sample2;
        if (this.samplesCount <= 1 || (sample = this.oldest) == null || (sample2 = this.newest) == null) {
            return false;
        }
        long j4 = sample.timestampNanos;
        return j4 >= this.startTimestampNanos + this.delayIntervalNanos && sample2.timestampNanos >= j4 + this.decisionMakingIntervalNanos && this.nearestBack != null;
    }

    private boolean isRest() {
        int i4 = this.steadyCount;
        int i5 = this.samplesCount;
        if (i4 != i5) {
            return false;
        }
        return this.maxCount <= 0 || this.accelerationMaxSum / ((double) i5) <= 0.01d;
    }

    private void removeSample(Sample sample) {
        this.accelerationMaxSum -= sample.accelerationMax;
        this.maxCount -= sample.max;
        this.steadyCount -= sample.steady;
        this.samplesCount--;
    }

    private double scalarProduct(Valuable valuable, Valuable valuable2, Valuable valuable3, Valuable valuable4, Valuable valuable5, Valuable valuable6) {
        return (valuable6.getValue() * valuable5.getValue()) + (valuable4.getValue() * valuable3.getValue()) + (valuable2.getValue() * valuable.getValue());
    }

    private double smsq(double d4, double d5, double d6) {
        return (d6 * d6) + (d5 * d5) + (d4 * d4);
    }

    private double srss(Valuable valuable, Valuable valuable2, Valuable valuable3) {
        return Math.sqrt(smsq(valuable.getValue(), valuable2.getValue(), valuable3.getValue()));
    }

    private void updateMinMax() {
        Sample sample;
        Sample sample2;
        Sample sample3 = this.newest;
        if (sample3 == null) {
            return;
        }
        while (true) {
            sample = this.nearestBack;
            if (sample3 == sample || (sample2 = sample3.prev) == null) {
                break;
            }
            double d4 = sample2.accelerationMax;
            double d5 = sample3.accelerationMax;
            if (d4 < d5) {
                sample2.accelerationMax = d5;
            }
            double d6 = sample2.accelerationMin;
            double d7 = sample3.accelerationMin;
            if (d6 > d7) {
                sample2.accelerationMin = d7;
            }
            sample3 = sample2;
        }
        if (sample3 == sample) {
            Sample sample4 = this.newest;
            double d8 = sample4.acceleration;
            Sample sample5 = sample3.next;
            if (d8 == sample5.accelerationMax) {
                sample4.max = 1;
                Sample sample6 = sample4.prev;
                sample4.maxStartTime = sample6.maxStartTime;
                sample4.maxStartValue = sample6.maxStartValue;
            } else {
                sample4.max = 0;
            }
            if (d8 != sample5.accelerationMin) {
                sample4.min = 0;
                return;
            }
            sample4.min = 1;
            Sample sample7 = sample4.prev;
            sample4.minStartTime = sample7.minStartTime;
            sample4.minStartValue = sample7.minStartValue;
        }
    }

    private Sample updateNearest(Sample sample, long j4) {
        Sample sample2 = null;
        while (sample != null && sample.timestampNanos < j4) {
            sample2 = sample;
            sample = sample.next;
        }
        return sample2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void add(long j4, double d4, double d5, double d6) {
        double d7;
        double d8;
        double d9;
        double d10;
        Sample sample;
        Sample updateNearest;
        Sample sample2;
        Sample sample3 = this.newest;
        if (sample3 != null && sample3.timestampNanos >= j4) {
            return;
        }
        if (this.startTimestampNanos <= 0) {
            this.startTimestampNanos = j4;
        }
        this.gravity.add(d4, d5, d6);
        double value = d4 - this.gravity.getX().getValue();
        double value2 = d5 - this.gravity.getY().getValue();
        double value3 = d6 - this.gravity.getZ().getValue();
        this.linear.add(value, value2, value3);
        double value4 = this.forward.getX().getValue();
        double value5 = this.forward.getY().getValue();
        double value6 = this.forward.getZ().getValue();
        this.forward.add(value, value2, -Math.abs(value3));
        if (smsq(this.forward.getX().getValue() - value4, this.forward.getY().getValue() - value5, this.forward.getZ().getValue() - value6) > 0.01d) {
            this.validTimestampNanos = this.delayIntervalNanos + j4;
        }
        this.scalarLF = scalarProduct(this.linear.getX(), this.forward.getX(), this.linear.getY(), this.forward.getY(), this.linear.getZ(), this.forward.getZ());
        if (this.applyCorrection) {
            long j5 = this.brakingTimeEnd;
            if (j4 > j5 && j5 > 0) {
                long j6 = this.brakingTimeMin;
                if (j5 > j6) {
                    d7 = 1.0E9d;
                    if (j6 > this.brakingTimeBegin) {
                        d8 = 1.0d - (Math.exp(-Math.pow(((j4 - j5) / 1.0E9d) / ((j5 - r4) / 1.0E9d), 2.0d)) * (1.0d - Math.exp(this.brakingAccelerationMin / 3.0d)));
                        d9 = Math.pow(d8, 0.25d);
                        d10 = this.acceleration;
                        double value7 = Double.compare(this.forward.getValue(), 0.0d) == 0 ? 0.0d : (d8 * this.scalarLF) / this.forward.getValue();
                        this.acceleration = value7;
                        if (d10 < 0.0d) {
                            if (value7 >= 0.0d) {
                                this.brakingTimeEnd = j4;
                            } else if (this.brakingAccelerationMin > value7) {
                                this.brakingAccelerationMin = value7;
                                this.brakingTimeMin = j4;
                            }
                        } else if (value7 < 0.0d) {
                            this.brakingTimeBegin = j4;
                            this.brakingTimeEnd = 0L;
                            this.brakingTimeMin = j4;
                            this.brakingAccelerationMin = value7;
                        }
                        purgeRollingValues(j4);
                        Sample acquire = this.pool.acquire();
                        acquire.timestampNanos = j4;
                        acquire.maxStartTime = j4;
                        acquire.minStartTime = j4;
                        double d11 = this.acceleration;
                        acquire.acceleration = d11;
                        acquire.accelerationMax = d11;
                        acquire.accelerationMin = d11;
                        acquire.maxStartValue = d11;
                        acquire.minStartValue = d11;
                        sample = this.nearestBack;
                        if (sample == null) {
                            sample = this.oldest;
                        }
                        updateNearest = updateNearest(sample, j4 - 100000000);
                        this.nearestBack = updateNearest;
                        if (updateNearest != null) {
                            if (updateNearest.timestampNanos < j4) {
                                double d12 = this.alphaJerk;
                                double d13 = ((((this.acceleration - updateNearest.acceleration) * (1.0d - d12)) / ((j4 - r4) / d7)) + (this.jerk * d12)) * d9;
                                this.jerk = d13;
                                if (d13 > 2.0d) {
                                    acquire.spurt = 1;
                                } else if (d13 > 0.4d) {
                                    acquire.racing = 1;
                                } else if (d13 < -2.0d) {
                                    acquire.braking = 1;
                                } else if (d13 < -0.4d) {
                                    acquire.retard = 1;
                                } else {
                                    acquire.steady = 1;
                                }
                                sample2 = this.newest;
                                if (sample2 != null) {
                                    sample2.next = acquire;
                                }
                                acquire.prev = sample2;
                                this.newest = acquire;
                                if (this.oldest == null) {
                                    this.oldest = acquire;
                                }
                                updateMinMax();
                                addSample(acquire);
                                if (isEnoughData()) {
                                    this.state = 0;
                                    this.stableTillTimestampNanos = 0L;
                                    return;
                                }
                                if (j4 <= this.validTimestampNanos) {
                                    this.state = 2;
                                    this.stableTillTimestampNanos = 0L;
                                    return;
                                } else {
                                    if (j4 > this.stableTillTimestampNanos) {
                                        int i4 = isRest() ? 1 : 2;
                                        if (i4 == 1 || this.state == 1) {
                                            this.stableTillTimestampNanos = this.decisionValidnessIntervalNanos + j4;
                                        }
                                        this.state = i4;
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        acquire.steady = 1;
                        sample2 = this.newest;
                        if (sample2 != null) {
                        }
                        acquire.prev = sample2;
                        this.newest = acquire;
                        if (this.oldest == null) {
                        }
                        updateMinMax();
                        addSample(acquire);
                        if (isEnoughData()) {
                        }
                    }
                    d8 = 1.0d;
                    d9 = 1.0d;
                    d10 = this.acceleration;
                    if (Double.compare(this.forward.getValue(), 0.0d) == 0) {
                    }
                    this.acceleration = value7;
                    if (d10 < 0.0d) {
                    }
                    purgeRollingValues(j4);
                    Sample acquire2 = this.pool.acquire();
                    acquire2.timestampNanos = j4;
                    acquire2.maxStartTime = j4;
                    acquire2.minStartTime = j4;
                    double d112 = this.acceleration;
                    acquire2.acceleration = d112;
                    acquire2.accelerationMax = d112;
                    acquire2.accelerationMin = d112;
                    acquire2.maxStartValue = d112;
                    acquire2.minStartValue = d112;
                    sample = this.nearestBack;
                    if (sample == null) {
                    }
                    updateNearest = updateNearest(sample, j4 - 100000000);
                    this.nearestBack = updateNearest;
                    if (updateNearest != null) {
                    }
                    acquire2.steady = 1;
                    sample2 = this.newest;
                    if (sample2 != null) {
                    }
                    acquire2.prev = sample2;
                    this.newest = acquire2;
                    if (this.oldest == null) {
                    }
                    updateMinMax();
                    addSample(acquire2);
                    if (isEnoughData()) {
                    }
                }
            }
        }
        d7 = 1.0E9d;
        d8 = 1.0d;
        d9 = 1.0d;
        d10 = this.acceleration;
        if (Double.compare(this.forward.getValue(), 0.0d) == 0) {
        }
        this.acceleration = value7;
        if (d10 < 0.0d) {
        }
        purgeRollingValues(j4);
        Sample acquire22 = this.pool.acquire();
        acquire22.timestampNanos = j4;
        acquire22.maxStartTime = j4;
        acquire22.minStartTime = j4;
        double d1122 = this.acceleration;
        acquire22.acceleration = d1122;
        acquire22.accelerationMax = d1122;
        acquire22.accelerationMin = d1122;
        acquire22.maxStartValue = d1122;
        acquire22.minStartValue = d1122;
        sample = this.nearestBack;
        if (sample == null) {
        }
        updateNearest = updateNearest(sample, j4 - 100000000);
        this.nearestBack = updateNearest;
        if (updateNearest != null) {
        }
        acquire22.steady = 1;
        sample2 = this.newest;
        if (sample2 != null) {
        }
        acquire22.prev = sample2;
        this.newest = acquire22;
        if (this.oldest == null) {
        }
        updateMinMax();
        addSample(acquire22);
        if (isEnoughData()) {
        }
    }

    public double getAcceleration() {
        return this.acceleration;
    }

    public double getJerk() {
        return this.jerk;
    }

    public int getState() {
        return this.state;
    }

    public void purgeRollingValues(long j4) {
        Sample sample;
        long j5 = j4 - this.decisionMakingIntervalNanos;
        while (true) {
            Sample sample2 = this.oldest;
            if (sample2 == null || sample2.timestampNanos >= j5 || (sample = sample2.next) == null || sample.timestampNanos >= j5) {
                return;
            }
            this.oldest = sample;
            sample.prev = null;
            removeSample(sample2);
            this.pool.release(sample2);
        }
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        while (true) {
            Sample sample = this.oldest;
            if (sample == null) {
                this.nearestBack = null;
                this.newest = null;
                this.startTimestampNanos = 0L;
                this.validTimestampNanos = 0L;
                this.stableTillTimestampNanos = 0L;
                this.gravity.reset();
                this.linear.reset();
                this.forward.reset();
                this.scalarLF = 0.0d;
                this.acceleration = 0.0d;
                this.jerk = 0.0d;
                this.accelerationMaxSum = 0.0d;
                this.maxCount = 0;
                this.steadyCount = 0;
                this.samplesCount = 0;
                this.state = 0;
                return;
            }
            this.oldest = sample.next;
            this.pool.release(sample);
        }
    }

    private RestStateRecognizer(double d4, double d5, double d6, double d7, double d8, double d9, double d10, boolean z) {
        this.pool = new SamplePool();
        this.state = 0;
        this.alphaJerk = d7 / (1.0d + d7);
        this.delayIntervalNanos = (long) (d8 * 1.0E9d);
        this.decisionMakingIntervalNanos = (long) (d9 * 1.0E9d);
        this.decisionValidnessIntervalNanos = (long) (1.0E9d * d10);
        this.applyCorrection = z;
        this.gravity = new HighPassFilter3D(new HighPassFilter(d4), new HighPassFilter(d4), new HighPassFilter(d4));
        this.linear = new HighPassFilter3D(new HighPassFilter(d5), new HighPassFilter(d5), new HighPassFilter(d5));
        this.forward = new HighPassFilter3D(new HighPassFilter(d6), new HighPassFilter(d6), new HighPassFilter(d6));
    }
}
