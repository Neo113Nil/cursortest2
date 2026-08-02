package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import com.withpersona.sdk2.camera.ExtractedTexts;

/* loaded from: classes9.dex */
public final class CameraProperties implements Parcelable {
    public static final Parcelable.Creator<CameraProperties> CREATOR = new ExtractedTexts.Creator(7);
    public final FacingMode facingMode;
    public final int frameRate;
    public final String label;
    public final int rotation;
    public final Size size;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FacingMode {
        public static final /* synthetic */ FacingMode[] $VALUES;
        public static final FacingMode Environment;
        public static final FacingMode Unknown;
        public static final FacingMode User;

        static {
            FacingMode facingMode = new FacingMode("User", 0);
            User = facingMode;
            FacingMode facingMode2 = new FacingMode("Environment", 1);
            Environment = facingMode2;
            FacingMode facingMode3 = new FacingMode("Unknown", 2);
            Unknown = facingMode3;
            $VALUES = new FacingMode[]{facingMode, facingMode2, facingMode3};
        }

        public static FacingMode valueOf(String str) {
            return (FacingMode) Enum.valueOf(FacingMode.class, str);
        }

        public static FacingMode[] values() {
            return (FacingMode[]) $VALUES.clone();
        }
    }

    public /* synthetic */ CameraProperties(String str, FacingMode facingMode, Size size, int i, int i2, int i3) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? FacingMode.Unknown : facingMode, (i2 & 4) != 0 ? new Size(0, 0) : size, (i2 & 8) != 0 ? 0 : i, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final double getAspectRatio() {
        if (this.size.getHeight() == 0) {
            return 0.0d;
        }
        return r4.getWidth() / r4.getHeight();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.label);
        parcel.writeString(this.facingMode.name());
        parcel.writeSize(this.size);
        parcel.writeInt(this.frameRate);
        parcel.writeInt(this.rotation);
    }

    public CameraProperties(String str, FacingMode facingMode, Size size, int i, int i2) {
        str.getClass();
        facingMode.getClass();
        size.getClass();
        this.label = str;
        this.facingMode = facingMode;
        this.size = size;
        this.frameRate = i;
        this.rotation = i2;
    }
}
