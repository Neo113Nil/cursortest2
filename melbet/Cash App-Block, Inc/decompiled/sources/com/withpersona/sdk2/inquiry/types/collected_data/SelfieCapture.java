package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.schema.Element;

/* loaded from: classes9.dex */
public final class SelfieCapture implements Parcelable {
    public static final Parcelable.Creator<SelfieCapture> CREATOR = new Element.AnonymousClass1(10);
    public final CaptureMethod captureMethod;
    public final File data;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CaptureMethod {
        public static final /* synthetic */ CaptureMethod[] $VALUES;
        public static final CaptureMethod Auto;
        public static final CaptureMethod Manual;

        static {
            CaptureMethod captureMethod = new CaptureMethod("Manual", 0);
            Manual = captureMethod;
            CaptureMethod captureMethod2 = new CaptureMethod("Auto", 1);
            Auto = captureMethod2;
            $VALUES = new CaptureMethod[]{captureMethod, captureMethod2};
        }

        public static CaptureMethod valueOf(String str) {
            return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
        }

        public static CaptureMethod[] values() {
            return (CaptureMethod[]) $VALUES.clone();
        }
    }

    public SelfieCapture(CaptureMethod captureMethod, File file) {
        captureMethod.getClass();
        file.getClass();
        this.captureMethod = captureMethod;
        this.data = file;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfieCapture)) {
            return false;
        }
        SelfieCapture selfieCapture = (SelfieCapture) obj;
        return this.captureMethod == selfieCapture.captureMethod && Intrinsics.areEqual(this.data, selfieCapture.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (this.captureMethod.hashCode() * 31);
    }

    public final String toString() {
        return "SelfieCapture(captureMethod=" + this.captureMethod + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.captureMethod.name());
        parcel.writeSerializable(this.data);
    }
}
