package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czx extends cri {
    public static final Parcelable.Creator CREATOR = new ctt(11);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;

    public czx(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, float f7) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = i;
        this.h = i2;
        this.i = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof czx) {
            czx czxVar = (czx) obj;
            if (this.a == czxVar.a && this.b == czxVar.b && this.c == czxVar.c && this.d == czxVar.d && this.e == czxVar.e && this.f == czxVar.f && this.g == czxVar.g && this.h == czxVar.h && this.i == czxVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Float.valueOf(this.i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int q = oy.q(parcel, 20293);
        oy.u(parcel, 1, f);
        oy.u(parcel, 2, this.b);
        oy.u(parcel, 3, this.c);
        oy.u(parcel, 4, this.d);
        oy.u(parcel, 5, this.e);
        oy.u(parcel, 6, this.f);
        oy.v(parcel, 7, this.g);
        oy.v(parcel, 8, this.h);
        oy.u(parcel, 9, this.i);
        oy.r(parcel, q);
    }
}
