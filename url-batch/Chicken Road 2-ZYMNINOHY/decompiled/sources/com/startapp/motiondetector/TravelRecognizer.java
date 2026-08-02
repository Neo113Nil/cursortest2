package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class TravelRecognizer implements SignalProcessor {
    private final AmortizedMaximum driverInstability;
    private final HighPassFilter3D gravity;
    private long lastTimestampNanos;
    private final HighPassFilter3D linear;
    private final HighPassFilter linearM;
    private final AmortizedMaximum passengerInstability;
    private final RestStateRecognizer restState;
    private long startTimestampNanos;
    private final AmortizedMaximum travel;
    private final VehicleDriverRecognizer vehicleDriver;
    private final VehiclePassengerRecognizer vehiclePassenger;
    private final HighPassFilter vehiclePassengerHpf;
    private final Vibration3DRecognizer vibration;

    public TravelRecognizer() {
        this(10.0d, 15.0d, 25.0d, 1000.0d, 1.0d, 0.1d, 100.0d, 1.0d, 3600000.0d, 3.0d, -2.0d, 100.0d, 1.0d, 20000.0d, 0.0d, -4.0d);
    }

    public void add(long j4, long j5, double d4, double d5, double d6) {
        if (this.lastTimestampNanos >= j5) {
            return;
        }
        if (this.startTimestampNanos <= 0) {
            this.startTimestampNanos = j5;
        }
        double value = this.gravity.getX().getValue();
        double value2 = this.gravity.getY().getValue();
        double value3 = this.gravity.getZ().getValue();
        this.gravity.add(d4, d5, d6);
        double smsq = Utils.smsq(this.gravity.getX().getValue() - value, this.gravity.getY().getValue() - value2, this.gravity.getZ().getValue() - value3);
        this.passengerInstability.add(j4, Utils.logisticalFunction(smsq, 1.5d, 4.0d));
        double value4 = 1.0d - this.passengerInstability.getValue();
        this.driverInstability.add(j4, Utils.logisticalFunction(smsq, 0.01d, 1000.0d));
        this.linear.add(d4 - this.gravity.getX().getValue(), d5 - this.gravity.getY().getValue(), d6 - this.gravity.getZ().getValue());
        this.linearM.add(this.linear.getValue());
        this.vibration.add(j5, d4, d5, d6);
        double logisticalFunction = Utils.logisticalFunction((j5 - this.startTimestampNanos) / 1.0E9d, 10.0d, 1.0d);
        this.vehiclePassenger.add(this.vibration.getFrequency(), this.vibration.getAmplitude(), this.linearM.getValue());
        this.vehiclePassengerHpf.add(this.vehiclePassenger.getValue() * value4 * logisticalFunction);
        double value5 = this.vehiclePassengerHpf.getValue();
        this.vehicleDriver.add(this.vibration.getFrequency(), this.vibration.getAmplitude(), this.restState.getAcceleration(), this.restState.getJerk());
        this.travel.add(j4, ((1.0d - this.driverInstability.getValue()) * this.vehicleDriver.getValue() * logisticalFunction) + (this.driverInstability.getValue() * value5));
        this.lastTimestampNanos = j5;
    }

    public double getLinearAcceleration() {
        return this.linearM.getValue();
    }

    public double getTravelProbability() {
        return this.travel.getValue();
    }

    public long getTravelProbabilityMaximumTime() {
        return this.travel.getMaximumTime();
    }

    public double getTravelProbabilityMaximumValue() {
        return this.travel.getMaximumValue();
    }

    public double getVibrationAmplitude() {
        return this.vibration.getAmplitude();
    }

    public double getVibrationFrequency() {
        return this.vibration.getFrequency();
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.startTimestampNanos = 0L;
        this.lastTimestampNanos = 0L;
        this.gravity.reset();
        this.linear.reset();
        this.linearM.reset();
        this.vibration.reset();
        this.vehiclePassenger.reset();
        this.vehiclePassengerHpf.reset();
        this.travel.reset();
    }

    public void setTravelProbabilityMaximum(double d4, long j4) {
        this.travel.setMaximumValue(Math.min(Math.max(0.0d, d4), 1.0d));
        this.travel.setMaximumTime(j4);
    }

    public TravelRecognizer(double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        HighPassFilter3D highPassFilter3D = new HighPassFilter3D(new HighPassFilter(d4), new HighPassFilter(d4), new HighPassFilter(d4));
        this.gravity = highPassFilter3D;
        this.linear = new HighPassFilter3D(new HighPassFilter(d5), new HighPassFilter(d5), new HighPassFilter(d5));
        this.linearM = new HighPassFilter(d6);
        this.vibration = new Vibration3DRecognizer(new VibrationRecognizer(d8, d9, highPassFilter3D.getX()), new VibrationRecognizer(d8, d9, highPassFilter3D.getY()), new VibrationRecognizer(d8, d9, highPassFilter3D.getZ()));
        this.vehiclePassenger = new VehiclePassengerRecognizer();
        this.vehiclePassengerHpf = new HighPassFilter(d7);
        this.passengerInstability = new AmortizedMaximum(d15, d16, d17, d18, d19);
        this.vehicleDriver = new VehicleDriverRecognizer();
        this.driverInstability = new AmortizedMaximum(d15, d16, d17, d18, d19);
        this.restState = new RestStateRecognizer(5.0d, false);
        this.travel = new AmortizedMaximum(d10, d11, d12, d13, d14);
    }
}
