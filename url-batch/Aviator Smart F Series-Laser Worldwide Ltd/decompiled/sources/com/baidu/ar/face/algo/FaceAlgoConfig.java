package com.baidu.ar.face.algo;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class FaceAlgoConfig implements Parcelable {
    public static final Parcelable.Creator<FaceAlgoConfig> CREATOR = new Parcelable.Creator<FaceAlgoConfig>() { // from class: com.baidu.ar.face.algo.FaceAlgoConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FaceAlgoConfig createFromParcel(Parcel parcel) {
            return new FaceAlgoConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FaceAlgoConfig[] newArray(int i8) {
            return new FaceAlgoConfig[i8];
        }
    };
    public boolean autoCalibrate;
    public boolean debug;
    public float eyeCloseProbThreshold;
    public int failureThreshold;
    public boolean forceLost;
    public boolean isAnimojiMode;
    public int maxTrackingFace;
    public float minDetectionWidth;
    public boolean mirror;
    public boolean needExpression;
    public boolean needHeadPose;
    public boolean needRefineEyes;
    public boolean needRefineIris;
    public boolean needRefineMouth;
    public boolean needSkeleton;
    public boolean needTriggers;
    public int runningMode;
    public float trackingMouthSmoothAlpha;
    public float trackingMouthThreshold;
    public int trackingQuality;
    public int trackingRotation;
    public float trackingSmoothAlpha;
    public float trackingSmoothThreshold;

    public FaceAlgoConfig(int i8) {
        this.runningMode = 0;
        this.maxTrackingFace = 1;
        this.failureThreshold = 5;
        this.minDetectionWidth = 100.0f;
        this.trackingSmoothAlpha = 0.1f;
        this.trackingSmoothThreshold = 1.0f;
        this.trackingMouthThreshold = -1.0f;
        this.trackingMouthSmoothAlpha = 0.0075f;
        this.eyeCloseProbThreshold = -1.0f;
        this.mirror = true;
        this.isAnimojiMode = false;
        this.needRefineEyes = false;
        this.needRefineIris = false;
        this.needHeadPose = true;
        this.needSkeleton = true;
        this.needTriggers = true;
        this.forceLost = false;
        this.needRefineMouth = false;
        this.needExpression = false;
        this.debug = false;
        this.trackingRotation = i8;
    }

    public FaceAlgoConfig cloneInstance() {
        FaceAlgoConfig faceAlgoConfig = new FaceAlgoConfig(this.trackingRotation, this.failureThreshold, this.trackingSmoothAlpha, this.trackingSmoothThreshold);
        faceAlgoConfig.setAnimateRunningMode(this.needHeadPose, this.needSkeleton, this.needTriggers);
        faceAlgoConfig.setAutoCalibrate(this.autoCalibrate);
        faceAlgoConfig.setRunningMode(this.runningMode);
        faceAlgoConfig.setMirror(this.mirror);
        faceAlgoConfig.setIsAnimojiMode(this.isAnimojiMode);
        faceAlgoConfig.setMaxTrackingFace(this.maxTrackingFace);
        faceAlgoConfig.setNeedRefineEyes(this.needRefineEyes);
        faceAlgoConfig.setForceLost(this.forceLost);
        faceAlgoConfig.setNeedRefineMouth(this.needRefineMouth);
        faceAlgoConfig.setNeedExpression(this.needExpression);
        faceAlgoConfig.setTrackingMouthThreshold(this.trackingMouthThreshold);
        faceAlgoConfig.setTrackingMouthSmoothAlpha(this.trackingMouthSmoothAlpha);
        return faceAlgoConfig;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setAnimateRunningMode(boolean z7, boolean z8, boolean z9) {
        this.needHeadPose = z7;
        this.needSkeleton = z8;
        this.needTriggers = z9;
    }

    public void setAutoCalibrate(boolean z7) {
        this.autoCalibrate = z7;
    }

    public void setDebug(boolean z7) {
        this.debug = z7;
    }

    public void setEyeCloseProbThreshold(float f8) {
        this.eyeCloseProbThreshold = f8;
    }

    public void setFailureThreshold(int i8) {
        this.failureThreshold = i8;
    }

    public void setForceLost(boolean z7) {
        this.forceLost = z7;
    }

    public void setIsAnimojiMode(boolean z7) {
        this.isAnimojiMode = z7;
    }

    public void setMaxTrackingFace(int i8) {
        this.maxTrackingFace = i8;
    }

    public void setMirror(boolean z7) {
        this.mirror = z7;
    }

    public void setNeedExpression(boolean z7) {
        this.needExpression = z7;
    }

    public void setNeedHeadPose(boolean z7) {
        this.needHeadPose = z7;
    }

    public void setNeedRefineEyes(boolean z7) {
        this.needRefineEyes = z7;
        this.needRefineIris = z7;
    }

    public void setNeedRefineMouth(boolean z7) {
        this.needRefineMouth = z7;
    }

    public void setNeedSkeleton(boolean z7) {
        this.needSkeleton = z7;
    }

    public void setNeedTriggers(boolean z7) {
        this.needTriggers = z7;
    }

    public void setRunningMode(int i8) {
        this.runningMode = i8;
    }

    public void setTrackingMouthSmoothAlpha(float f8) {
        this.trackingMouthSmoothAlpha = f8;
    }

    public void setTrackingMouthThreshold(float f8) {
        this.trackingMouthThreshold = f8;
    }

    public void setTrackingRT(int i8) {
        this.trackingRotation = i8;
    }

    public void setTrackingSmoothAlpha(float f8) {
        this.trackingSmoothAlpha = f8;
    }

    public void setTrackingSmoothThreshold(float f8) {
        this.trackingSmoothThreshold = f8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.runningMode);
        parcel.writeInt(this.maxTrackingFace);
        parcel.writeInt(this.trackingRotation);
        parcel.writeInt(this.failureThreshold);
        parcel.writeFloat(this.minDetectionWidth);
        parcel.writeFloat(this.trackingSmoothAlpha);
        parcel.writeFloat(this.trackingSmoothThreshold);
        parcel.writeFloat(this.trackingMouthThreshold);
        parcel.writeFloat(this.trackingMouthSmoothAlpha);
        parcel.writeFloat(this.eyeCloseProbThreshold);
        parcel.writeByte(this.mirror ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isAnimojiMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needRefineEyes ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needRefineIris ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needRefineMouth ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needHeadPose ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needSkeleton ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needTriggers ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needExpression ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.forceLost ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.debug ? (byte) 1 : (byte) 0);
    }

    public FaceAlgoConfig(int i8, int i9, float f8, float f9) {
        this.runningMode = 0;
        this.maxTrackingFace = 1;
        this.minDetectionWidth = 100.0f;
        this.trackingMouthThreshold = -1.0f;
        this.trackingMouthSmoothAlpha = 0.0075f;
        this.eyeCloseProbThreshold = -1.0f;
        this.mirror = true;
        this.isAnimojiMode = false;
        this.needRefineEyes = false;
        this.needRefineIris = false;
        this.needHeadPose = true;
        this.needSkeleton = true;
        this.needTriggers = true;
        this.forceLost = false;
        this.needRefineMouth = false;
        this.needExpression = false;
        this.debug = false;
        this.trackingRotation = i8;
        this.failureThreshold = i9;
        this.trackingSmoothAlpha = f8;
        this.trackingSmoothThreshold = f9;
    }

    public FaceAlgoConfig(Parcel parcel) {
        this.runningMode = 0;
        this.maxTrackingFace = 1;
        this.trackingRotation = -1;
        this.failureThreshold = 5;
        this.minDetectionWidth = 100.0f;
        this.trackingSmoothAlpha = 0.1f;
        this.trackingSmoothThreshold = 1.0f;
        this.trackingMouthThreshold = -1.0f;
        this.trackingMouthSmoothAlpha = 0.0075f;
        this.eyeCloseProbThreshold = -1.0f;
        this.mirror = true;
        this.isAnimojiMode = false;
        this.needRefineEyes = false;
        this.needRefineIris = false;
        this.needHeadPose = true;
        this.needSkeleton = true;
        this.needTriggers = true;
        this.forceLost = false;
        this.needRefineMouth = false;
        this.needExpression = false;
        this.debug = false;
        this.runningMode = parcel.readInt();
        this.maxTrackingFace = parcel.readInt();
        this.trackingRotation = parcel.readInt();
        this.failureThreshold = parcel.readInt();
        this.minDetectionWidth = parcel.readFloat();
        this.trackingSmoothAlpha = parcel.readFloat();
        this.trackingSmoothThreshold = parcel.readFloat();
        this.trackingMouthThreshold = parcel.readFloat();
        this.trackingMouthSmoothAlpha = parcel.readFloat();
        this.eyeCloseProbThreshold = parcel.readFloat();
        this.mirror = parcel.readByte() != 0;
        this.isAnimojiMode = parcel.readByte() != 0;
        this.needRefineEyes = parcel.readByte() != 0;
        this.needRefineIris = parcel.readByte() != 0;
        this.needRefineMouth = parcel.readByte() != 0;
        this.needHeadPose = parcel.readByte() != 0;
        this.needSkeleton = parcel.readByte() != 0;
        this.needTriggers = parcel.readByte() != 0;
        this.needExpression = parcel.readByte() != 0;
        this.forceLost = parcel.readByte() != 0;
        this.debug = parcel.readByte() != 0;
    }
}
