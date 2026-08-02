package net.idrnd.face.iad.capture.internal;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class v implements Parcelable {
    public static final a CREATOR = new a();
    public final u a;
    public final int b;
    public final int c;
    public final int d;

    public final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Object obj;
            parcel.getClass();
            ClassLoader classLoader = u.class.getClassLoader();
            if (Build.VERSION.SDK_INT >= 33) {
                obj = (Serializable) parcel.readSerializable(classLoader, u.class);
            } else {
                Serializable readSerializable = parcel.readSerializable();
                if (!(readSerializable instanceof u)) {
                    readSerializable = null;
                }
                obj = (u) readSerializable;
            }
            obj.getClass();
            return new v((u) obj, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new v[i];
        }
    }

    public v(u uVar, int i, int i2, int i3) {
        this.a = uVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        if (i3 < 0 || i3 >= 101) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
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
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && this.b == vVar.b && this.c == vVar.c && this.d == vVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.c, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CropsParameters(format=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return Recorder$$ExternalSyntheticOutline1.m(this.c, this.d, ", jpegQuality=", ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
