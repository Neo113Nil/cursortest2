package net.idrnd.face.iad.capture.internal;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes9.dex */
public final class q0 implements Parcelable {
    public static final a CREATOR = new a();
    public final x2 a;
    public final Integer b;

    public final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Object obj;
            parcel.getClass();
            ClassLoader classLoader = x2.class.getClassLoader();
            if (Build.VERSION.SDK_INT >= 33) {
                obj = (Serializable) parcel.readSerializable(classLoader, x2.class);
            } else {
                Serializable readSerializable = parcel.readSerializable();
                if (!(readSerializable instanceof x2)) {
                    readSerializable = null;
                }
                obj = (x2) readSerializable;
            }
            obj.getClass();
            return new q0((x2) obj, (Integer) parcel.readValue(Integer.TYPE.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new q0[i];
        }
    }

    public q0(x2 x2Var, Integer num) {
        this.a = x2Var;
        this.b = num;
        if (num != null && !new IntRange(0, 100, 1).contains(num.intValue())) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
        if (x2Var == x2.b && num != null) {
            a$$ExternalSyntheticBUOutline0.m$3("If the image format is PNG then the JPEG quality should be null");
            throw null;
        }
        if (x2Var == x2.a && num == null) {
            a$$ExternalSyntheticBUOutline0.m$3("If the image format is JPEG then the JPEG quality should be not null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.a == q0Var.a && Intrinsics.areEqual(this.b, q0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ImageParameters(format=" + this.a + ", jpegQuality=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.a);
        parcel.writeValue(this.b);
    }
}
