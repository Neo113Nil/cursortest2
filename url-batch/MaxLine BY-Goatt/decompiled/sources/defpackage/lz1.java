package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lz1 extends zo2 implements Parcelable, xm2 {
    public static final Parcelable.Creator<lz1> CREATOR = new kz1(0);
    public final zm2 n;
    public ym2 o;

    public lz1(Object obj, zm2 zm2Var) {
        this.n = zm2Var;
        nm2 k = tm2.k();
        ym2 ym2Var = new ym2(k.g(), obj);
        if (!(k instanceof mv0)) {
            ym2Var.b = new ym2(1L, obj);
        }
        this.o = ym2Var;
    }

    @Override // defpackage.yo2
    public final ap2 a() {
        return this.o;
    }

    @Override // defpackage.yo2
    public final ap2 b(ap2 ap2Var, ap2 ap2Var2, ap2 ap2Var3) {
        if (this.n.d(((ym2) ap2Var2).c, ((ym2) ap2Var3).c)) {
            return ap2Var2;
        }
        return null;
    }

    @Override // defpackage.yo2
    public final void d(ap2 ap2Var) {
        ap2Var.getClass();
        this.o = (ym2) ap2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.xm2
    public final zm2 e() {
        return this.n;
    }

    @Override // defpackage.so2
    public final Object getValue() {
        return ((ym2) tm2.t(this.o, this)).c;
    }

    @Override // defpackage.zn1
    public final void setValue(Object obj) {
        nm2 k;
        ym2 ym2Var = (ym2) tm2.i(this.o);
        if (this.n.d(ym2Var.c, obj)) {
            return;
        }
        ym2 ym2Var2 = this.o;
        synchronized (tm2.c) {
            k = tm2.k();
            ((ym2) tm2.o(ym2Var2, this, k, ym2Var)).c = obj;
            Unit unit = Unit.a;
        }
        tm2.n(k, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((ym2) tm2.i(this.o)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        qb2 qb2Var = qb2.Z;
        zm2 zm2Var = this.n;
        if (Intrinsics.b(zm2Var, qb2Var)) {
            i2 = 0;
        } else if (Intrinsics.b(zm2Var, by1.B)) {
            i2 = 1;
        } else {
            if (!Intrinsics.b(zm2Var, by1.q)) {
                lh.g("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
