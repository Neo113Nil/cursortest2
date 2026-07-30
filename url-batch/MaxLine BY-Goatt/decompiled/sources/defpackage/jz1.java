package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jz1 extends zo2 implements Parcelable, xm2, so2, zn1 {
    public static final Parcelable.Creator<jz1> CREATOR = new s3(21);
    public wm2 n;

    public jz1(long j) {
        nm2 k = tm2.k();
        wm2 wm2Var = new wm2(k.g(), j);
        if (!(k instanceof mv0)) {
            wm2Var.b = new wm2(1L, j);
        }
        this.n = wm2Var;
    }

    @Override // defpackage.yo2
    public final ap2 a() {
        return this.n;
    }

    @Override // defpackage.yo2
    public final ap2 b(ap2 ap2Var, ap2 ap2Var2, ap2 ap2Var3) {
        if (((wm2) ap2Var2).c == ((wm2) ap2Var3).c) {
            return ap2Var2;
        }
        return null;
    }

    @Override // defpackage.yo2
    public final void d(ap2 ap2Var) {
        ap2Var.getClass();
        this.n = (wm2) ap2Var;
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
        return Long.valueOf(h());
    }

    public final long h() {
        return ((wm2) tm2.t(this.n, this)).c;
    }

    public final void i(long j) {
        nm2 k;
        wm2 wm2Var = (wm2) tm2.i(this.n);
        if (wm2Var.c != j) {
            wm2 wm2Var2 = this.n;
            synchronized (tm2.c) {
                k = tm2.k();
                ((wm2) tm2.o(wm2Var2, this, k, wm2Var)).c = j;
                Unit unit = Unit.a;
            }
            tm2.n(k, this);
        }
    }

    @Override // defpackage.zn1
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((wm2) tm2.i(this.n)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}
