package androidx.constraintlayout.core.motion.utils;

import cn.hutool.core.text.l;

/* loaded from: classes.dex */
public class StopLogicEngine implements StopEngine {
    private static final float EPSILON = 1.0E-5f;
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private float mLastTime;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    public static class Decelerate implements StopEngine {
        private float mAcceleration;
        private float mDestination;
        private boolean mDone = false;
        private float mDuration;
        private float mInitialPos;
        private float mInitialVelocity;
        private float mLastVelocity;

        public void config(float f8, float f9, float f10) {
            this.mDone = false;
            this.mDestination = f9;
            this.mInitialVelocity = f10;
            this.mInitialPos = f8;
            float f11 = (f9 - f8) / (f10 / 2.0f);
            this.mDuration = f11;
            this.mAcceleration = (-f10) / f11;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public String debug(String str, float f8) {
            return this.mDuration + l.SPACE + this.mLastVelocity;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getInterpolation(float f8) {
            if (f8 > this.mDuration) {
                this.mDone = true;
                return this.mDestination;
            }
            getVelocity(f8);
            return this.mInitialPos + ((this.mInitialVelocity + ((this.mAcceleration * f8) / 2.0f)) * f8);
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity() {
            return this.mLastVelocity;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public boolean isStopped() {
            return this.mDone;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity(float f8) {
            if (f8 > this.mDuration) {
                return 0.0f;
            }
            float f9 = this.mInitialVelocity + (this.mAcceleration * f8);
            this.mLastVelocity = f9;
            return f9;
        }
    }

    private float calcY(float f8) {
        this.mDone = false;
        float f9 = this.mStage1Duration;
        if (f8 <= f9) {
            float f10 = this.mStage1Velocity;
            return (f10 * f8) + ((((this.mStage2Velocity - f10) * f8) * f8) / (f9 * 2.0f));
        }
        int i8 = this.mNumberOfStages;
        if (i8 == 1) {
            return this.mStage1EndPosition;
        }
        float f11 = f8 - f9;
        float f12 = this.mStage2Duration;
        if (f11 < f12) {
            float f13 = this.mStage1EndPosition;
            float f14 = this.mStage2Velocity;
            return f13 + (f14 * f11) + ((((this.mStage3Velocity - f14) * f11) * f11) / (f12 * 2.0f));
        }
        if (i8 == 2) {
            return this.mStage2EndPosition;
        }
        float f15 = f11 - f12;
        float f16 = this.mStage3Duration;
        if (f15 > f16) {
            this.mDone = true;
            return this.mStage3EndPosition;
        }
        float f17 = this.mStage2EndPosition;
        float f18 = this.mStage3Velocity;
        return (f17 + (f18 * f15)) - (((f18 * f15) * f15) / (f16 * 2.0f));
    }

    private void setup(float f8, float f9, float f10, float f11, float f12) {
        this.mDone = false;
        this.mStage3EndPosition = f9;
        if (f8 == 0.0f) {
            f8 = 1.0E-4f;
        }
        float f13 = f8 / f10;
        float f14 = (f13 * f8) / 2.0f;
        if (f8 < 0.0f) {
            float sqrt = (float) Math.sqrt((f9 - ((((-f8) / f10) * f8) / 2.0f)) * f10);
            if (sqrt < f11) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f8;
                this.mStage2Velocity = sqrt;
                this.mStage3Velocity = 0.0f;
                float f15 = (sqrt - f8) / f10;
                this.mStage1Duration = f15;
                this.mStage2Duration = sqrt / f10;
                this.mStage1EndPosition = ((f8 + sqrt) * f15) / 2.0f;
                this.mStage2EndPosition = f9;
                this.mStage3EndPosition = f9;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = f11;
            this.mStage3Velocity = f11;
            float f16 = (f11 - f8) / f10;
            this.mStage1Duration = f16;
            float f17 = f11 / f10;
            this.mStage3Duration = f17;
            float f18 = ((f8 + f11) * f16) / 2.0f;
            float f19 = (f17 * f11) / 2.0f;
            this.mStage2Duration = ((f9 - f18) - f19) / f11;
            this.mStage1EndPosition = f18;
            this.mStage2EndPosition = f9 - f19;
            this.mStage3EndPosition = f9;
            return;
        }
        if (f14 >= f9) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f9;
            this.mStage1Duration = (2.0f * f9) / f8;
            return;
        }
        float f20 = f9 - f14;
        float f21 = f20 / f8;
        if (f21 + f13 < f12) {
            this.mType = "cruse decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = f8;
            this.mStage3Velocity = 0.0f;
            this.mStage1EndPosition = f20;
            this.mStage2EndPosition = f9;
            this.mStage1Duration = f21;
            this.mStage2Duration = f13;
            return;
        }
        float sqrt2 = (float) Math.sqrt((f10 * f9) + ((f8 * f8) / 2.0f));
        float f22 = (sqrt2 - f8) / f10;
        this.mStage1Duration = f22;
        float f23 = sqrt2 / f10;
        this.mStage2Duration = f23;
        if (sqrt2 < f11) {
            this.mType = "accelerate decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = sqrt2;
            this.mStage3Velocity = 0.0f;
            this.mStage1Duration = f22;
            this.mStage2Duration = f23;
            this.mStage1EndPosition = ((f8 + sqrt2) * f22) / 2.0f;
            this.mStage2EndPosition = f9;
            return;
        }
        this.mType = "accelerate cruse decelerate";
        this.mNumberOfStages = 3;
        this.mStage1Velocity = f8;
        this.mStage2Velocity = f11;
        this.mStage3Velocity = f11;
        float f24 = (f11 - f8) / f10;
        this.mStage1Duration = f24;
        float f25 = f11 / f10;
        this.mStage3Duration = f25;
        float f26 = ((f8 + f11) * f24) / 2.0f;
        float f27 = (f25 * f11) / 2.0f;
        this.mStage2Duration = ((f9 - f26) - f27) / f11;
        this.mStage1EndPosition = f26;
        this.mStage2EndPosition = f9 - f27;
        this.mStage3EndPosition = f9;
    }

    public void config(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.mDone = false;
        this.mStartPosition = f8;
        boolean z7 = f8 > f9;
        this.mBackwards = z7;
        if (z7) {
            setup(-f10, f8 - f9, f12, f13, f11);
        } else {
            setup(f10, f9 - f8, f12, f13, f11);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f8) {
        String str2 = str + " ===== " + this.mType + "\n";
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        sb.append(this.mBackwards ? "backwards" : "forward ");
        sb.append(" time = ");
        sb.append(f8);
        sb.append("  stages ");
        sb.append(this.mNumberOfStages);
        sb.append("\n");
        String str3 = sb.toString() + str + " dur " + this.mStage1Duration + " vel " + this.mStage1Velocity + " pos " + this.mStage1EndPosition + "\n";
        if (this.mNumberOfStages > 1) {
            str3 = str3 + str + " dur " + this.mStage2Duration + " vel " + this.mStage2Velocity + " pos " + this.mStage2EndPosition + "\n";
        }
        if (this.mNumberOfStages > 2) {
            str3 = str3 + str + " dur " + this.mStage3Duration + " vel " + this.mStage3Velocity + " pos " + this.mStage3EndPosition + "\n";
        }
        float f9 = this.mStage1Duration;
        if (f8 <= f9) {
            return str3 + str + "stage 0\n";
        }
        int i8 = this.mNumberOfStages;
        if (i8 == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f10 = f8 - f9;
        float f11 = this.mStage2Duration;
        if (f10 < f11) {
            return str3 + str + " stage 1\n";
        }
        if (i8 == 2) {
            return str3 + str + "end stage 1\n";
        }
        if (f10 - f11 < this.mStage3Duration) {
            return str3 + str + " stage 2\n";
        }
        return str3 + str + " end stage 2\n";
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f8) {
        float calcY = calcY(f8);
        this.mLastPosition = calcY;
        this.mLastTime = f8;
        return this.mBackwards ? this.mStartPosition - calcY : this.mStartPosition + calcY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f8) {
        float f9 = this.mStage1Duration;
        if (f8 <= f9) {
            float f10 = this.mStage1Velocity;
            return f10 + (((this.mStage2Velocity - f10) * f8) / f9);
        }
        int i8 = this.mNumberOfStages;
        if (i8 == 1) {
            return 0.0f;
        }
        float f11 = f8 - f9;
        float f12 = this.mStage2Duration;
        if (f11 < f12) {
            float f13 = this.mStage2Velocity;
            return f13 + (((this.mStage3Velocity - f13) * f11) / f12);
        }
        if (i8 == 2) {
            return 0.0f;
        }
        float f14 = f11 - f12;
        float f15 = this.mStage3Duration;
        if (f14 >= f15) {
            return 0.0f;
        }
        float f16 = this.mStage3Velocity;
        return f16 - ((f14 * f16) / f15);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        return getVelocity() < EPSILON && Math.abs(this.mStage3EndPosition - this.mLastPosition) < EPSILON;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.mBackwards ? -getVelocity(this.mLastTime) : getVelocity(this.mLastTime);
    }
}
