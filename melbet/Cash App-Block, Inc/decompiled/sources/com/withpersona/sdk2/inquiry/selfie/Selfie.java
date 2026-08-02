package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class Selfie implements Parcelable {

    public enum CaptureMethod {
        AUTO("auto"),
        MANUAL("manual");

        public final String method;

        CaptureMethod(String str) {
            this.method = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Pose {
        public static final /* synthetic */ Pose[] $VALUES;
        public static final Pose Center;
        public static final Pose Left;
        public static final Pose Right;

        static {
            Pose pose = new Pose("Center", 0);
            Center = pose;
            Pose pose2 = new Pose("Left", 1);
            Left = pose2;
            Pose pose3 = new Pose("Right", 2);
            Right = pose3;
            $VALUES = new Pose[]{pose, pose2, pose3};
        }

        public static Pose valueOf(String str) {
            return (Pose) Enum.valueOf(Pose.class, str);
        }

        public static Pose[] values() {
            return (Pose[]) $VALUES.clone();
        }
    }

    public final class SelfieImage extends Selfie {
        public static final Parcelable.Creator<SelfieImage> CREATOR = new PoseConfigs.Creator(1);
        public final String absoluteFilePath;
        public final CaptureMethod captureMethod;
        public final long capturedTimestamp;
        public final Pose pose;

        public SelfieImage(String str, CaptureMethod captureMethod, Pose pose, long j) {
            str.getClass();
            captureMethod.getClass();
            pose.getClass();
            this.absoluteFilePath = str;
            this.captureMethod = captureMethod;
            this.pose = pose;
            this.capturedTimestamp = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelfieImage)) {
                return false;
            }
            SelfieImage selfieImage = (SelfieImage) obj;
            return Intrinsics.areEqual(this.absoluteFilePath, selfieImage.absoluteFilePath) && this.captureMethod == selfieImage.captureMethod && this.pose == selfieImage.pose && this.capturedTimestamp == selfieImage.capturedTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        public final String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        public final CaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        public final int hashCode() {
            return Long.hashCode(this.capturedTimestamp) + ((this.pose.hashCode() + ((this.captureMethod.hashCode() + (this.absoluteFilePath.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "SelfieImage(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ", pose=" + this.pose + ", capturedTimestamp=" + this.capturedTimestamp + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.absoluteFilePath);
            parcel.writeString(this.captureMethod.name());
            parcel.writeString(this.pose.name());
            parcel.writeLong(this.capturedTimestamp);
        }
    }

    public final class SelfieVideo extends Selfie {
        public static final Parcelable.Creator<SelfieVideo> CREATOR = new PoseConfigs.Creator(2);
        public final String absoluteFilePath;
        public final CaptureMethod captureMethod;

        public SelfieVideo(String str, CaptureMethod captureMethod) {
            str.getClass();
            captureMethod.getClass();
            this.absoluteFilePath = str;
            this.captureMethod = captureMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelfieVideo)) {
                return false;
            }
            SelfieVideo selfieVideo = (SelfieVideo) obj;
            return Intrinsics.areEqual(this.absoluteFilePath, selfieVideo.absoluteFilePath) && this.captureMethod == selfieVideo.captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        public final String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        public final CaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        public final int hashCode() {
            return this.captureMethod.hashCode() + (this.absoluteFilePath.hashCode() * 31);
        }

        public final String toString() {
            return "SelfieVideo(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.absoluteFilePath);
            parcel.writeString(this.captureMethod.name());
        }
    }

    public abstract String getAbsoluteFilePath();

    public abstract CaptureMethod getCaptureMethod();
}
