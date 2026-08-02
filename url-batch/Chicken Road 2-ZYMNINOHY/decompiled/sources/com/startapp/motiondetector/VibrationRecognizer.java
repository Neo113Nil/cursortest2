package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class VibrationRecognizer implements SignalProcessor, Periodical {
    private double amplitude;
    private double amplitudeSum;
    private final Valuable average;
    private final long decisionMakingIntervalNanos;
    private double frequency;
    private long localMaxTime;
    private double localMaxValue;
    private long localZeroTime;
    private final double minAmplitude;
    private Sample newest;
    private Sample oldest;
    private final SamplePool pool = new SamplePool();

    /* renamed from: t1, reason: collision with root package name */
    private long f6063t1;

    /* renamed from: t2, reason: collision with root package name */
    private long f6064t2;

    /* renamed from: v0, reason: collision with root package name */
    private double f6065v0;

    /* renamed from: v1, reason: collision with root package name */
    private double f6066v1;

    /* renamed from: v2, reason: collision with root package name */
    private double f6067v2;
    private int zeros;

    public static class Sample {
        double amplitude;
        Sample next;
        long time;
        long timeZero;
        int zero;

        public void reset() {
            this.next = null;
            this.time = 0L;
            this.timeZero = 0L;
            this.zero = 0;
            this.amplitude = 0.0d;
        }
    }

    public static class SamplePool {
        private Sample head;

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
            this.head = sample;
        }
    }

    public VibrationRecognizer(double d4, double d5, Valuable valuable) {
        this.decisionMakingIntervalNanos = (long) (d4 * 1.0E9d);
        this.minAmplitude = d5;
        this.average = valuable;
    }

    private void addSample(Sample sample) {
        this.zeros += sample.zero;
        this.amplitudeSum += sample.amplitude;
    }

    private void removeSample(Sample sample) {
        this.zeros -= sample.zero;
        this.amplitudeSum -= sample.amplitude;
    }

    public void add(long j4, double d4) {
        this.f6065v0 = this.f6066v1;
        this.f6066v1 = this.f6067v2;
        this.f6067v2 = d4;
        this.f6063t1 = this.f6064t2;
        this.f6064t2 = j4;
        purgeSamples(j4);
        Sample acquire = this.pool.acquire();
        acquire.time = this.f6064t2;
        acquire.timeZero = this.localZeroTime;
        double value = this.average.getValue();
        double d5 = this.f6065v0;
        double d6 = this.f6066v1;
        if (d5 < d6 && d6 > this.f6067v2) {
            double d7 = d6 - value;
            if (d7 > this.minAmplitude) {
                this.localMaxValue = d7;
                this.localMaxTime = this.f6063t1;
            }
        }
        if (d6 > value && value > this.f6067v2 && this.localMaxTime > this.localZeroTime) {
            this.localZeroTime = this.f6064t2;
            acquire.zero = 1;
            acquire.amplitude = this.localMaxValue;
        }
        addSample(acquire);
        Sample sample = this.newest;
        if (sample != null) {
            sample.next = acquire;
        }
        this.newest = acquire;
        if (this.oldest == null) {
            this.oldest = acquire;
        }
        long j5 = this.localZeroTime - this.oldest.timeZero;
        if (j5 > 0) {
            this.frequency = this.zeros / (j5 / 1.0E9d);
        }
        int i4 = this.zeros;
        if (i4 > 0) {
            this.amplitude = this.amplitudeSum / i4;
        } else {
            this.amplitude = 0.0d;
        }
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getAmplitude() {
        return this.amplitude;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getFrequency() {
        return this.frequency;
    }

    public void purgeSamples(long j4) {
        Sample sample;
        long j5 = j4 - this.decisionMakingIntervalNanos;
        while (true) {
            Sample sample2 = this.oldest;
            if (sample2 == null || sample2.time >= j5 || (sample = sample2.next) == null || sample.time >= j5) {
                return;
            }
            this.oldest = sample;
            removeSample(sample2);
            this.pool.release(sample2);
        }
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        while (true) {
            Sample sample = this.oldest;
            if (sample == null) {
                this.newest = null;
                this.f6065v0 = 0.0d;
                this.f6066v1 = 0.0d;
                this.f6067v2 = 0.0d;
                this.f6063t1 = 0L;
                this.f6064t2 = 0L;
                this.localMaxValue = 0.0d;
                this.localMaxTime = 0L;
                this.localZeroTime = 0L;
                this.zeros = 0;
                this.frequency = 0.0d;
                this.amplitude = 0.0d;
                this.amplitudeSum = 0.0d;
                return;
            }
            this.oldest = sample.next;
            this.pool.release(sample);
        }
    }
}
