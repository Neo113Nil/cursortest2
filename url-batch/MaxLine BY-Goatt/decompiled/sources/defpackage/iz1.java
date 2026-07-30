package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class iz1 extends zo2 implements Parcelable, xm2, so2, zn1 {
    public static final Parcelable.Creator<iz1> CREATOR = new s3(20);
    public vm2 n;

    public iz1(int i) {
        nm2 k = tm2.k();
        vm2 vm2Var = new vm2(k.g(), i);
        if (!(k instanceof mv0)) {
            vm2Var.b = new vm2(1L, i);
        }
        this.n = vm2Var;
    }

    @Override // defpackage.yo2
    public final ap2 a() {
        return this.n;
    }

    @Override // defpackage.yo2
    public final ap2 b(ap2 ap2Var, ap2 ap2Var2, ap2 ap2Var3) {
        if (((vm2) ap2Var2).c == ((vm2) ap2Var3).c) {
            return ap2Var2;
        }
        return null;
    }

    @Override // defpackage.yo2
    public final void d(ap2 ap2Var) {
        ap2Var.getClass();
        this.n = (vm2) ap2Var;
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
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((vm2) tm2.t(this.n, this)).c;
    }

    public final void i(int i) {
        nm2 k;
        vm2 vm2Var = (vm2) tm2.i(this.n);
        if (vm2Var.c != i) {
            vm2 vm2Var2 = this.n;
            synchronized (tm2.c) {
                k = tm2.k();
                ((vm2) tm2.o(vm2Var2, this, k, vm2Var)).c = i;
                Unit unit = Unit.a;
            }
            tm2.n(k, this);
        }
    }

    @Override // defpackage.zn1
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((vm2) tm2.i(this.n)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}
