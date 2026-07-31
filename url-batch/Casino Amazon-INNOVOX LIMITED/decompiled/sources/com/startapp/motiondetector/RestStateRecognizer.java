package com.startapp.motiondetector;

/* loaded from: classes3.dex */
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

    private double smsq(double d, double d2, double d3) {
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    public double getAcceleration() {
        return this.acceleration;
    }

    public double getJerk() {
        return this.jerk;
    }

    public RestStateRecognizer(double d, boolean z) {
        this(10.0d, 15.0d, 25.0d, 15.0d, 8.0d, d, 1.0d, z);
    }

    private RestStateRecognizer(double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z) {
        this.pool = new SamplePool();
        this.state = 0;
        this.alphaJerk = d4 / (1.0d + d4);
        this.delayIntervalNanos = (long) (d5 * 1.0E9d);
        this.decisionMakingIntervalNanos = (long) (d6 * 1.0E9d);
        this.decisionValidnessIntervalNanos = (long) (1.0E9d * d7);
        this.applyCorrection = z;
        this.gravity = new HighPassFilter3D(new HighPassFilter(d), new HighPassFilter(d), new HighPassFilter(d));
        this.linear = new HighPassFilter3D(new HighPassFilter(d2), new HighPassFilter(d2), new HighPassFilter(d2));
        this.forward = new HighPassFilter3D(new HighPassFilter(d3), new HighPassFilter(d3), new HighPassFilter(d3));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void add(long j, double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7;
        Sample acquire;
        Sample sample;
        Sample updateNearest;
        Sample sample2;
        Sample sample3 = this.newest;
        if (sample3 != null && sample3.timestampNanos >= j) {
            return;
        }
        if (this.startTimestampNanos <= 0) {
            this.startTimestampNanos = j;
        }
        this.gravity.add(d, d2, d3);
        double value = d - this.gravity.getX().getValue();
        double value2 = d2 - this.gravity.getY().getValue();
        double value3 = d3 - this.gravity.getZ().getValue();
        this.linear.add(value, value2, value3);
        double value4 = this.forward.getX().getValue();
        double value5 = this.forward.getY().getValue();
        double value6 = this.forward.getZ().getValue();
        this.forward.add(value, value2, -Math.abs(value3));
        if (smsq(this.forward.getX().getValue() - value4, this.forward.getY().getValue() - value5, this.forward.getZ().getValue() - value6) > 0.01d) {
            this.validTimestampNanos = this.delayIntervalNanos + j;
        }
        this.scalarLF = scalarProduct(this.linear.getX(), this.forward.getX(), this.linear.getY(), this.forward.getY(), this.linear.getZ(), this.forward.getZ());
        if (this.applyCorrection) {
            long j2 = this.brakingTimeEnd;
            if (j > j2 && j2 > 0) {
                long j3 = this.brakingTimeMin;
                if (j2 > j3) {
                    d4 = 1.0E9d;
                    if (j3 > this.brakingTimeBegin) {
                        d5 = 1.0d - ((1.0d - Math.exp(this.brakingAccelerationMin / 3.0d)) * Math.exp(-Math.pow(((j - j2) / 1.0E9d) / ((j2 - r4) / 1.0E9d), 2.0d)));
                        d6 = Math.pow(d5, 0.25d);
                        d7 = this.acceleration;
                        double value7 = Double.compare(this.forward.getValue(), 0.0d) == 0 ? 0.0d : (d5 * this.scalarLF) / this.forward.getValue();
                        this.acceleration = value7;
                        if (d7 < 0.0d) {
                            if (value7 >= 0.0d) {
                                this.brakingTimeEnd = j;
                            } else if (this.brakingAccelerationMin > value7) {
                                this.brakingAccelerationMin = value7;
                                this.brakingTimeMin = j;
                            }
                        } else if (value7 < 0.0d) {
                            this.brakingTimeBegin = j;
                            this.brakingTimeEnd = 0L;
                            this.brakingTimeMin = j;
                            this.brakingAccelerationMin = value7;
                        }
                        purgeRollingValues(j);
                        acquire = this.pool.acquire();
                        acquire.timestampNanos = j;
                        acquire.maxStartTime = j;
                        acquire.minStartTime = j;
                        acquire.acceleration = this.acceleration;
                        acquire.accelerationMax = this.acceleration;
                        acquire.accelerationMin = this.acceleration;
                        acquire.maxStartValue = this.acceleration;
                        acquire.minStartValue = this.acceleration;
                        sample = this.nearestBack;
                        if (sample == null) {
                            sample = this.oldest;
                        }
                        updateNearest = updateNearest(sample, j - 100000000);
                        this.nearestBack = updateNearest;
                        if (updateNearest == null && updateNearest.timestampNanos < j) {
                            double d8 = this.alphaJerk;
                            double d9 = ((this.jerk * d8) + (((1.0d - d8) * (this.acceleration - this.nearestBack.acceleration)) / ((j - this.nearestBack.timestampNanos) / d4))) * d6;
                            this.jerk = d9;
                            if (d9 > 2.0d) {
                                acquire.spurt = 1;
                            } else if (d9 > 0.4d) {
                                acquire.racing = 1;
                            } else if (d9 < -2.0d) {
                                acquire.braking = 1;
                            } else if (d9 < -0.4d) {
                                acquire.retard = 1;
                            } else {
                                acquire.steady = 1;
                            }
                        } else {
                            acquire.steady = 1;
                        }
                        sample2 = this.newest;
                        if (sample2 != null) {
                            sample2.next = acquire;
                        }
                        acquire.prev = this.newest;
                        this.newest = acquire;
                        if (this.oldest == null) {
                            this.oldest = acquire;
                        }
                        updateMinMax();
                        addSample(acquire);
                        if (!isEnoughData()) {
                            this.state = 0;
                            this.stableTillTimestampNanos = 0L;
                            return;
                        }
                        if (j <= this.validTimestampNanos) {
                            this.state = 2;
                            this.stableTillTimestampNanos = 0L;
                            return;
                        } else {
                            if (j > this.stableTillTimestampNanos) {
                                int i = isRest() ? 1 : 2;
                                if (i == 1 || this.state == 1) {
                                    this.stableTillTimestampNanos = this.decisionValidnessIntervalNanos + j;
                                }
                                this.state = i;
                                return;
                            }
                            return;
                        }
                    }
                    d5 = 1.0d;
                    d6 = 1.0d;
                    d7 = this.acceleration;
                    if (Double.compare(this.forward.getValue(), 0.0d) == 0) {
                    }
                    this.acceleration = value7;
                    if (d7 < 0.0d) {
                    }
                    purgeRollingValues(j);
                    acquire = this.pool.acquire();
                    acquire.timestampNanos = j;
                    acquire.maxStartTime = j;
                    acquire.minStartTime = j;
                    acquire.acceleration = this.acceleration;
                    acquire.accelerationMax = this.acceleration;
                    acquire.accelerationMin = this.acceleration;
                    acquire.maxStartValue = this.acceleration;
                    acquire.minStartValue = this.acceleration;
                    sample = this.nearestBack;
                    if (sample == null) {
                    }
                    updateNearest = updateNearest(sample, j - 100000000);
                    this.nearestBack = updateNearest;
                    if (updateNearest == null) {
                    }
                    acquire.steady = 1;
                    sample2 = this.newest;
                    if (sample2 != null) {
                    }
                    acquire.prev = this.newest;
                    this.newest = acquire;
                    if (this.oldest == null) {
                    }
                    updateMinMax();
                    addSample(acquire);
                    if (!isEnoughData()) {
                    }
                }
            }
        }
        d4 = 1.0E9d;
        d5 = 1.0d;
        d6 = 1.0d;
        d7 = this.acceleration;
        if (Double.compare(this.forward.getValue(), 0.0d) == 0) {
        }
        this.acceleration = value7;
        if (d7 < 0.0d) {
        }
        purgeRollingValues(j);
        acquire = this.pool.acquire();
        acquire.timestampNanos = j;
        acquire.maxStartTime = j;
        acquire.minStartTime = j;
        acquire.acceleration = this.acceleration;
        acquire.accelerationMax = this.acceleration;
        acquire.accelerationMin = this.acceleration;
        acquire.maxStartValue = this.acceleration;
        acquire.minStartValue = this.acceleration;
        sample = this.nearestBack;
        if (sample == null) {
        }
        updateNearest = updateNearest(sample, j - 100000000);
        this.nearestBack = updateNearest;
        if (updateNearest == null) {
        }
        acquire.steady = 1;
        sample2 = this.newest;
        if (sample2 != null) {
        }
        acquire.prev = this.newest;
        this.newest = acquire;
        if (this.oldest == null) {
        }
        updateMinMax();
        addSample(acquire);
        if (!isEnoughData()) {
        }
    }

    private double srss(Valuable valuable, Valuable valuable2, Valuable valuable3) {
        return Math.sqrt(smsq(valuable.getValue(), valuable2.getValue(), valuable3.getValue()));
    }

    private double scalarProduct(Valuable valuable, Valuable valuable2, Valuable valuable3, Valuable valuable4, Valuable valuable5, Valuable valuable6) {
        return (valuable.getValue() * valuable2.getValue()) + (valuable3.getValue() * valuable4.getValue()) + (valuable5.getValue() * valuable6.getValue());
    }

    private Sample updateNearest(Sample sample, long j) {
        Sample sample2 = null;
        while (sample != null && sample.timestampNanos < j) {
            sample2 = sample;
            sample = sample.next;
        }
        return sample2;
    }

    private void updateMinMax() {
        Sample sample = this.newest;
        if (sample == null) {
            return;
        }
        while (sample != this.nearestBack && sample.prev != null) {
            if (sample.prev.accelerationMax < sample.accelerationMax) {
                sample.prev.accelerationMax = sample.accelerationMax;
            }
            if (sample.prev.accelerationMin > sample.accelerationMin) {
                sample.prev.accelerationMin = sample.accelerationMin;
            }
            sample = sample.prev;
        }
        if (sample == this.nearestBack) {
            if (this.newest.acceleration == sample.next.accelerationMax) {
                this.newest.max = 1;
                Sample sample2 = this.newest;
                sample2.maxStartTime = sample2.prev.maxStartTime;
                Sample sample3 = this.newest;
                sample3.maxStartValue = sample3.prev.maxStartValue;
            } else {
                this.newest.max = 0;
            }
            if (this.newest.acceleration == sample.next.accelerationMin) {
                this.newest.min = 1;
                Sample sample4 = this.newest;
                sample4.minStartTime = sample4.prev.minStartTime;
                Sample sample5 = this.newest;
                sample5.minStartValue = sample5.prev.minStartValue;
                return;
            }
            this.newest.min = 0;
        }
    }

    void purgeRollingValues(long j) {
        long j2 = j - this.decisionMakingIntervalNanos;
        while (true) {
            Sample sample = this.oldest;
            if (sample == null || sample.timestampNanos >= j2 || this.oldest.next == null || this.oldest.next.timestampNanos >= j2) {
                return;
            }
            Sample sample2 = this.oldest;
            Sample sample3 = sample2.next;
            this.oldest = sample3;
            sample3.prev = null;
            removeSample(sample2);
            this.pool.release(sample2);
        }
    }

    private void addSample(Sample sample) {
        this.accelerationMaxSum += sample.accelerationMax;
        this.maxCount += sample.max;
        this.steadyCount += sample.steady;
        this.samplesCount++;
    }

    private void removeSample(Sample sample) {
        this.accelerationMaxSum -= sample.accelerationMax;
        this.maxCount -= sample.max;
        this.steadyCount -= sample.steady;
        this.samplesCount--;
    }

    private boolean isEnoughData() {
        Sample sample;
        return this.samplesCount > 1 && (sample = this.oldest) != null && this.newest != null && sample.timestampNanos >= this.startTimestampNanos + this.delayIntervalNanos && this.newest.timestampNanos >= this.oldest.timestampNanos + this.decisionMakingIntervalNanos && this.nearestBack != null;
    }

    private boolean isRest() {
        int i = this.steadyCount;
        int i2 = this.samplesCount;
        if (i != i2) {
            return false;
        }
        return this.maxCount <= 0 || this.accelerationMaxSum / ((double) i2) <= 0.01d;
    }

    public int getState() {
        return this.state;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        while (true) {
            Sample sample = this.oldest;
            if (sample != null) {
                this.oldest = sample.next;
                this.pool.release(sample);
            } else {
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
        }
    }

    static class Sample {
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

        Sample() {
        }

        void reset() {
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

    static class SamplePool {
        Sample head;

        SamplePool() {
        }

        Sample acquire() {
            Sample sample = this.head;
            if (sample == null) {
                return new Sample();
            }
            this.head = sample.next;
            sample.reset();
            return sample;
        }

        void release(Sample sample) {
            sample.next = this.head;
            sample.prev = null;
            this.head = sample;
        }
    }
}
