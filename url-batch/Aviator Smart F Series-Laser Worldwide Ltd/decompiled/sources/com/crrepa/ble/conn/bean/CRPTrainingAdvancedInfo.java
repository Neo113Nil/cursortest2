package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPTrainingAdvancedInfo {
    private float aerobicEffect;
    private float aerobicPower;
    private float anaerobicEffect;
    private float anaerobicPower;
    private int carbohydrate;
    private ClimbingInfo climbingInfo;
    private CyclingInfo cyclingInfo;
    private DumbbellInfo dumbbellInfo;
    private EllipticalMachineInfo ellipticalMachineInfo;
    private int fat;
    private int recoveryTime;
    private RowingMachineInfo rowingMachineInfo;
    private RunningInfo runningInfo;
    private SkippingInfo skippingInfo;
    private SwimmingInfo swimmingInfo;
    private int trainingLoad;
    private int trainingState;
    private int trainingType;
    private WalkingInfo walkingInfo;

    public static class ClimbingInfo {
        private float averageStepFrequency;

        public float getAverageStepFrequency() {
            return this.averageStepFrequency;
        }

        public void setAverageStepFrequency(float f8) {
            this.averageStepFrequency = f8;
        }
    }

    public static class CyclingInfo {
        private float averageSpeed;
        private float maxOxygenIntake;

        public float getAverageSpeed() {
            return this.averageSpeed;
        }

        public float getMaxOxygenIntake() {
            return this.maxOxygenIntake;
        }

        public void setAverageSpeed(float f8) {
            this.averageSpeed = f8;
        }

        public void setMaxOxygenIntake(float f8) {
            this.maxOxygenIntake = f8;
        }
    }

    public static class DumbbellInfo {
        private int totalDumbbellTimes;

        public int getTotalDumbbellTimes() {
            return this.totalDumbbellTimes;
        }

        public void setTotalDumbbellTimes(int i8) {
            this.totalDumbbellTimes = i8;
        }
    }

    public static class EllipticalMachineInfo {
        private float stepFrequency;

        public float getStepFrequency() {
            return this.stepFrequency;
        }

        public void setStepFrequency(float f8) {
            this.stepFrequency = f8;
        }
    }

    public static class RowingMachineInfo {
        private float rowingFrequency;
        private int rowingTimes;

        public float getRowingFrequency() {
            return this.rowingFrequency;
        }

        public int getRowingTimes() {
            return this.rowingTimes;
        }

        public void setRowingFrequency(float f8) {
            this.rowingFrequency = f8;
        }

        public void setRowingTimes(int i8) {
            this.rowingTimes = i8;
        }
    }

    public static class RunningInfo {
        private float averageBalance;
        private float averagePower;
        private float averageShakeAmplitude;
        private float averageSpeed;
        private float averageStepFrequency;
        private float averageStepLength;
        private float averageTouchDownTime;
        private float maxOxygenIntake;

        public float getAverageBalance() {
            return this.averageBalance;
        }

        public float getAveragePower() {
            return this.averagePower;
        }

        public float getAverageShakeAmplitude() {
            return this.averageShakeAmplitude;
        }

        public float getAverageSpeed() {
            return this.averageSpeed;
        }

        public float getAverageStepFrequency() {
            return this.averageStepFrequency;
        }

        public float getAverageStepLength() {
            return this.averageStepLength;
        }

        public float getAverageTouchDownTime() {
            return this.averageTouchDownTime;
        }

        public float getMaxOxygenIntake() {
            return this.maxOxygenIntake;
        }

        public void setAverageBalance(float f8) {
            this.averageBalance = f8;
        }

        public void setAveragePower(float f8) {
            this.averagePower = f8;
        }

        public void setAverageShakeAmplitude(float f8) {
            this.averageShakeAmplitude = f8;
        }

        public void setAverageSpeed(float f8) {
            this.averageSpeed = f8;
        }

        public void setAverageStepFrequency(float f8) {
            this.averageStepFrequency = f8;
        }

        public void setAverageStepLength(float f8) {
            this.averageStepLength = f8;
        }

        public void setAverageTouchDownTime(float f8) {
            this.averageTouchDownTime = f8;
        }

        public void setMaxOxygenIntake(float f8) {
            this.maxOxygenIntake = f8;
        }
    }

    public static class SkippingInfo {
        private int maxConsecutiveSkippingTimes;
        private int skippingRopeTimes;
        private int totalSkippingTimes;

        public int getMaxConsecutiveSkippingTimes() {
            return this.maxConsecutiveSkippingTimes;
        }

        public int getSkippingRopeTimes() {
            return this.skippingRopeTimes;
        }

        public int getTotalSkippingTimes() {
            return this.totalSkippingTimes;
        }

        public void setMaxConsecutiveSkippingTimes(int i8) {
            this.maxConsecutiveSkippingTimes = i8;
        }

        public void setSkippingRopeTimes(int i8) {
            this.skippingRopeTimes = i8;
        }

        public void setTotalSkippingTimes(int i8) {
            this.totalSkippingTimes = i8;
        }
    }

    public static class SwimmingInfo {
        private int backstroke;
        private int butterflySwimming;
        private int freeSwimming;
        private int frogSwimming;
        private int mainSwimmingPose;
        private float swolf;
        private int totalSwimmingTimes;
        private int trainingRound;

        public int getBackstroke() {
            return this.backstroke;
        }

        public int getButterflySwimming() {
            return this.butterflySwimming;
        }

        public int getFreeSwimming() {
            return this.freeSwimming;
        }

        public int getFrogSwimming() {
            return this.frogSwimming;
        }

        public int getMainSwimmingPose() {
            return this.mainSwimmingPose;
        }

        public float getSwolf() {
            return this.swolf;
        }

        public int getTotalSwimmingTimes() {
            return this.totalSwimmingTimes;
        }

        public int getTrainingRound() {
            return this.trainingRound;
        }

        public void setBackstroke(int i8) {
            this.backstroke = i8;
        }

        public void setButterflySwimming(int i8) {
            this.butterflySwimming = i8;
        }

        public void setFreeSwimming(int i8) {
            this.freeSwimming = i8;
        }

        public void setFrogSwimming(int i8) {
            this.frogSwimming = i8;
        }

        public void setMainSwimmingPose(int i8) {
            this.mainSwimmingPose = i8;
        }

        public void setSwolf(float f8) {
            this.swolf = f8;
        }

        public void setTotalSwimmingTimes(int i8) {
            this.totalSwimmingTimes = i8;
        }

        public void setTrainingRound(int i8) {
            this.trainingRound = i8;
        }
    }

    public static class WalkingInfo {
        private float averageSpeed;
        private float averageStepFrequency;
        private float averageStepLength;

        public float getAverageSpeed() {
            return this.averageSpeed;
        }

        public float getAverageStepFrequency() {
            return this.averageStepFrequency;
        }

        public float getAverageStepLength() {
            return this.averageStepLength;
        }

        public void setAverageSpeed(float f8) {
            this.averageSpeed = f8;
        }

        public void setAverageStepFrequency(float f8) {
            this.averageStepFrequency = f8;
        }

        public void setAverageStepLength(float f8) {
            this.averageStepLength = f8;
        }
    }

    public float getAerobicEffect() {
        return this.aerobicEffect;
    }

    public float getAerobicPower() {
        return this.aerobicPower;
    }

    public float getAnaerobicEffect() {
        return this.anaerobicEffect;
    }

    public float getAnaerobicPower() {
        return this.anaerobicPower;
    }

    public int getCarbohydrate() {
        return this.carbohydrate;
    }

    public ClimbingInfo getClimbingInfo() {
        return this.climbingInfo;
    }

    public CyclingInfo getCyclingInfo() {
        return this.cyclingInfo;
    }

    public DumbbellInfo getDumbbellInfo() {
        return this.dumbbellInfo;
    }

    public EllipticalMachineInfo getEllipticalMachineInfo() {
        return this.ellipticalMachineInfo;
    }

    public int getFat() {
        return this.fat;
    }

    public int getRecoveryTime() {
        return this.recoveryTime;
    }

    public RowingMachineInfo getRowingMachineInfo() {
        return this.rowingMachineInfo;
    }

    public RunningInfo getRunningInfo() {
        return this.runningInfo;
    }

    public SkippingInfo getSkippingInfo() {
        return this.skippingInfo;
    }

    public SwimmingInfo getSwimmingInfo() {
        return this.swimmingInfo;
    }

    public int getTrainingLoad() {
        return this.trainingLoad;
    }

    public int getTrainingState() {
        return this.trainingState;
    }

    public int getTrainingType() {
        return this.trainingType;
    }

    public WalkingInfo getWalkingInfo() {
        return this.walkingInfo;
    }

    public void setAerobicEffect(float f8) {
        this.aerobicEffect = f8;
    }

    public void setAerobicPower(float f8) {
        this.aerobicPower = f8;
    }

    public void setAnaerobicEffect(float f8) {
        this.anaerobicEffect = f8;
    }

    public void setAnaerobicPower(float f8) {
        this.anaerobicPower = f8;
    }

    public void setCarbohydrate(int i8) {
        this.carbohydrate = i8;
    }

    public void setClimbingInfo(ClimbingInfo climbingInfo) {
        this.climbingInfo = climbingInfo;
    }

    public void setCyclingInfo(CyclingInfo cyclingInfo) {
        this.cyclingInfo = cyclingInfo;
    }

    public void setDumbbellInfo(DumbbellInfo dumbbellInfo) {
        this.dumbbellInfo = dumbbellInfo;
    }

    public void setEllipticalMachineInfo(EllipticalMachineInfo ellipticalMachineInfo) {
        this.ellipticalMachineInfo = ellipticalMachineInfo;
    }

    public void setFat(int i8) {
        this.fat = i8;
    }

    public void setRecoveryTime(int i8) {
        this.recoveryTime = i8;
    }

    public void setRowingMachineInfo(RowingMachineInfo rowingMachineInfo) {
        this.rowingMachineInfo = rowingMachineInfo;
    }

    public void setRunningInfo(RunningInfo runningInfo) {
        this.runningInfo = runningInfo;
    }

    public void setSkippingInfo(SkippingInfo skippingInfo) {
        this.skippingInfo = skippingInfo;
    }

    public void setSwimmingInfo(SwimmingInfo swimmingInfo) {
        this.swimmingInfo = swimmingInfo;
    }

    public void setTrainingLoad(int i8) {
        this.trainingLoad = i8;
    }

    public void setTrainingState(int i8) {
        this.trainingState = i8;
    }

    public void setTrainingType(int i8) {
        this.trainingType = i8;
    }

    public void setWalkingInfo(WalkingInfo walkingInfo) {
        this.walkingInfo = walkingInfo;
    }
}
