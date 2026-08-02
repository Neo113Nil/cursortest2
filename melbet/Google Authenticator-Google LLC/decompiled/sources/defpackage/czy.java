package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czy extends cri {
    public static final Parcelable.Creator CREATOR = new ctt(12);
    public final float a;
    public final float b;
    public final float c;

    public czy(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof czy) {
            czy czyVar = (czy) obj;
            if (this.a == czyVar.a && this.b == czyVar.b && this.c == czyVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int q = oy.q(parcel, 20293);
        oy.u(parcel, 1, f);
        oy.u(parcel, 2, this.b);
        oy.u(parcel, 3, this.c);
        oy.r(parcel, q);
    }
}
