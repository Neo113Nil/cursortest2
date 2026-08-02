package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public interface GovernmentId extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public abstract class CaptureMethod {
        public static final /* synthetic */ CaptureMethod[] $VALUES;
        public static final AUTO AUTO;
        public static final MANUAL MANUAL;
        public static final UPLOAD UPLOAD;

        public final class AUTO extends CaptureMethod {
            public AUTO() {
                super("AUTO", 0);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "auto";
            }
        }

        public final class MANUAL extends CaptureMethod {
            public MANUAL() {
                super("MANUAL", 1);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "manual";
            }
        }

        public final class UPLOAD extends CaptureMethod {
            public UPLOAD() {
                super("UPLOAD", 2);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "upload";
            }
        }

        static {
            AUTO auto = new AUTO();
            AUTO = auto;
            MANUAL manual = new MANUAL();
            MANUAL = manual;
            UPLOAD upload = new UPLOAD();
            UPLOAD = upload;
            $VALUES = new CaptureMethod[]{auto, manual, upload};
        }

        public static CaptureMethod valueOf(String str) {
            return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
        }

        public static CaptureMethod[] values() {
            return (CaptureMethod[]) $VALUES.clone();
        }
    }

    public final class GovernmentIdVideo implements GovernmentId {
        public static final Parcelable.Creator<GovernmentIdVideo> CREATOR = new Frame.Creator(12);
        public final CaptureMethod captureMethod;
        public final List frames;
        public final String idClassKey;
        public final Side side;

        public GovernmentIdVideo(List list, Side side, String str, CaptureMethod captureMethod) {
            list.getClass();
            side.getClass();
            str.getClass();
            captureMethod.getClass();
            this.frames = list;
            this.side = side;
            this.idClassKey = str;
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
            if (!(obj instanceof GovernmentIdVideo)) {
                return false;
            }
            GovernmentIdVideo governmentIdVideo = (GovernmentIdVideo) obj;
            return Intrinsics.areEqual(this.frames, governmentIdVideo.frames) && this.side == governmentIdVideo.side && Intrinsics.areEqual(this.idClassKey, governmentIdVideo.idClassKey) && this.captureMethod == governmentIdVideo.captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public final CaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public final List getFrames() {
            return this.frames;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public final String getIdClassKey() {
            return this.idClassKey;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public final Side getSide() {
            return this.side;
        }

        public final int hashCode() {
            return this.captureMethod.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.side.hashCode() + (this.frames.hashCode() * 31)) * 31, 31, this.idClassKey);
        }

        public final String toString() {
            return "GovernmentIdVideo(frames=" + this.frames + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ", captureMethod=" + this.captureMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.frames, parcel);
            while (m.hasNext()) {
                ((Frame) m.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.side.name());
            parcel.writeString(this.idClassKey);
            parcel.writeString(this.captureMethod.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Side {
        public static final /* synthetic */ Side[] $VALUES;
        public static final Side BACK;
        public static final Side FRONT;
        public static final Side FRONT_AND_BACK;

        static {
            Side side = new Side("FRONT", 0);
            FRONT = side;
            Side side2 = new Side("BACK", 1);
            BACK = side2;
            Side side3 = new Side("FRONT_AND_BACK", 2);
            FRONT_AND_BACK = side3;
            $VALUES = new Side[]{side, side2, side3};
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }

    CaptureMethod getCaptureMethod();

    List getFrames();

    String getIdClassKey();

    Side getSide();

    public final class GovernmentIdImage implements GovernmentId {
        public static final Parcelable.Creator<GovernmentIdImage> CREATOR = new Frame.Creator(11);
        public final CaptureMethod captureMethod;
        public final List frames;
        public final String idClassKey;
        public final GovernmentIdDetails idDetails;
        public final RawExtraction rawExtraction;
        public final Side side;

        public GovernmentIdImage(List list, Side side, String str, CaptureMethod captureMethod, RawExtraction rawExtraction, GovernmentIdDetails governmentIdDetails) {
            list.getClass();
            side.getClass();
            str.getClass();
            captureMethod.getClass();
            this.frames = list;
            this.side = side;
            this.idClassKey = str;
            this.captureMethod = captureMethod;
            this.rawExtraction = rawExtraction;
            this.idDetails = governmentIdDetails;
        }

        public static GovernmentIdImage copy$default(GovernmentIdImage governmentIdImage, ArrayList arrayList) {
            Side side = governmentIdImage.side;
            String str = governmentIdImage.idClassKey;
            CaptureMethod captureMethod = governmentIdImage.captureMethod;
            RawExtraction rawExtraction = governmentIdImage.rawExtraction;
            GovernmentIdDetails governmentIdDetails = governmentIdImage.idDetails;
            governmentIdImage.getClass();
            side.getClass();
            str.getClass();
            captureMethod.getClass();
            return new GovernmentIdImage(arrayList, side, str, captureMethod, rawExtraction, governmentIdDetails);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GovernmentIdImage)) {
                return false;
            }
            GovernmentIdImage governmentIdImage = (GovernmentIdImage) obj;
            return Intrinsics.areEqual(this.frames, governmentIdImage.frames) && this.side == governmentIdImage.side && Intrinsics.areEqual(this.idClassKey, governmentIdImage.idClassKey) && this.captureMethod == governmentIdImage.captureMethod && Intrinsics.areEqual(this.rawExtraction, governmentIdImage.rawExtraction) && Intrinsics.areEqual(this.idDetails, governmentIdImage.idDetails);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public final CaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public final List getFrames() {
            return this.frames;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public final String getIdClassKey() {
            return this.idClassKey;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentId
        public final Side getSide() {
            return this.side;
        }

        public final int hashCode() {
            int hashCode = (this.captureMethod.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.side.hashCode() + (this.frames.hashCode() * 31)) * 31, 31, this.idClassKey)) * 31;
            RawExtraction rawExtraction = this.rawExtraction;
            int hashCode2 = (hashCode + (rawExtraction == null ? 0 : rawExtraction.hashCode())) * 31;
            GovernmentIdDetails governmentIdDetails = this.idDetails;
            return hashCode2 + (governmentIdDetails != null ? governmentIdDetails.hashCode() : 0);
        }

        public final String toString() {
            return "GovernmentIdImage(frames=" + this.frames + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ", captureMethod=" + this.captureMethod + ", rawExtraction=" + this.rawExtraction + ", idDetails=" + this.idDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.frames, parcel);
            while (m.hasNext()) {
                ((Frame) m.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.side.name());
            parcel.writeString(this.idClassKey);
            parcel.writeString(this.captureMethod.name());
            RawExtraction rawExtraction = this.rawExtraction;
            if (rawExtraction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                rawExtraction.writeToParcel(parcel, i);
            }
            GovernmentIdDetails governmentIdDetails = this.idDetails;
            if (governmentIdDetails == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdDetails.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ GovernmentIdImage(List list, Side side, String str, CaptureMethod captureMethod) {
            this(list, side, str, captureMethod, null, null);
        }
    }
}
