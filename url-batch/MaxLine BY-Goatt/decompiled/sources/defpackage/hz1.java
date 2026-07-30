package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hz1 extends zo2 implements Parcelable, xm2, so2, zn1 {
    public static final Parcelable.Creator<hz1> CREATOR = new s3(19);
    public um2 n;

    public hz1(float f) {
        nm2 k = tm2.k();
        um2 um2Var = new um2(k.g(), f);
        if (!(k instanceof mv0)) {
            um2Var.b = new um2(1L, f);
        }
        this.n = um2Var;
    }

    @Override // defpackage.yo2
    public final ap2 a() {
        return this.n;
    }

    @Override // defpackage.yo2
    public final ap2 b(ap2 ap2Var, ap2 ap2Var2, ap2 ap2Var3) {
        if (((um2) ap2Var2).c == ((um2) ap2Var3).c) {
            return ap2Var2;
        }
        return null;
    }

    @Override // defpackage.yo2
    public final void d(ap2 ap2Var) {
        ap2Var.getClass();
        this.n = (um2) ap2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.xm2
    public final zm2 e() {
        return by1.B;
    }

    @Override // defpackage.so2
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((um2) tm2.t(this.n, this)).c;
    }

    public final void i(float f) {
        nm2 k;
        um2 um2Var = (um2) tm2.i(this.n);
        if (um2Var.c == f) {
            return;
        }
        um2 um2Var2 = this.n;
        synchronized (tm2.c) {
            k = tm2.k();
            ((um2) tm2.o(um2Var2, this, k, um2Var)).c = f;
            Unit unit = Unit.a;
        }
        tm2.n(k, this);
    }

    @Override // defpackage.zn1
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((um2) tm2.i(this.n)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}
