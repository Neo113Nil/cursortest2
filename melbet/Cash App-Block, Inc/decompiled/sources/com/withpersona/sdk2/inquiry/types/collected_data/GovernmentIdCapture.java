package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.schema.Element;

/* loaded from: classes9.dex */
public final class GovernmentIdCapture implements Parcelable {
    public static final Parcelable.Creator<GovernmentIdCapture> CREATOR = new Element.AnonymousClass1(8);
    public final CaptureMethod captureMethod;
    public final ArrayList frames;
    public final String idClass;
    public final Side side;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CaptureMethod {
        public static final /* synthetic */ CaptureMethod[] $VALUES;
        public static final CaptureMethod Auto;
        public static final CaptureMethod Manual;
        public static final CaptureMethod Upload;

        static {
            CaptureMethod captureMethod = new CaptureMethod("Manual", 0);
            Manual = captureMethod;
            CaptureMethod captureMethod2 = new CaptureMethod("Auto", 1);
            Auto = captureMethod2;
            CaptureMethod captureMethod3 = new CaptureMethod("Upload", 2);
            Upload = captureMethod3;
            $VALUES = new CaptureMethod[]{captureMethod, captureMethod2, captureMethod3};
        }

        public static CaptureMethod valueOf(String str) {
            return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
        }

        public static CaptureMethod[] values() {
            return (CaptureMethod[]) $VALUES.clone();
        }
    }

    public final class Frame implements Parcelable {
        public static final Parcelable.Creator<Frame> CREATOR = new Element.AnonymousClass1(9);
        public final File data;
        public final String mimeType;

        public Frame(File file, String str) {
            file.getClass();
            str.getClass();
            this.data = file;
            this.mimeType = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) obj;
            return Intrinsics.areEqual(this.data, frame.data) && Intrinsics.areEqual(this.mimeType, frame.mimeType);
        }

        public final int hashCode() {
            return this.mimeType.hashCode() + (this.data.hashCode() * 31);
        }

        public final String toString() {
            return "Frame(data=" + this.data + ", mimeType=" + this.mimeType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.data);
            parcel.writeString(this.mimeType);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Side {
        public static final /* synthetic */ Side[] $VALUES;
        public static final Side Back;
        public static final Side Front;
        public static final Side FrontAndBack;

        static {
            Side side = new Side("Front", 0);
            Front = side;
            Side side2 = new Side(Constants.META_BACK_BUTTON, 1);
            Back = side2;
            Side side3 = new Side("FrontAndBack", 2);
            FrontAndBack = side3;
            $VALUES = new Side[]{side, side2, side3};
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }

    public GovernmentIdCapture(String str, Side side, CaptureMethod captureMethod, ArrayList arrayList) {
        str.getClass();
        side.getClass();
        captureMethod.getClass();
        this.idClass = str;
        this.side = side;
        this.captureMethod = captureMethod;
        this.frames = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GovernmentIdCapture)) {
            return false;
        }
        GovernmentIdCapture governmentIdCapture = (GovernmentIdCapture) obj;
        return Intrinsics.areEqual(this.idClass, governmentIdCapture.idClass) && this.side == governmentIdCapture.side && this.captureMethod == governmentIdCapture.captureMethod && this.frames.equals(governmentIdCapture.frames);
    }

    public final int hashCode() {
        return this.frames.hashCode() + ((this.captureMethod.hashCode() + ((this.side.hashCode() + (this.idClass.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GovernmentIdCapture(idClass=" + this.idClass + ", side=" + this.side + ", captureMethod=" + this.captureMethod + ", frames=" + this.frames + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.idClass);
        parcel.writeString(this.side.name());
        parcel.writeString(this.captureMethod.name());
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.frames, parcel);
        while (m.hasNext()) {
            ((Frame) m.next()).writeToParcel(parcel, i);
        }
    }
}
