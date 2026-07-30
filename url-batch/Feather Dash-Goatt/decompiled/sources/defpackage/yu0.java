package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yu0 extends he1 implements Parcelable, tb1, yd1, ao0 {
    public static final Parcelable.Creator<yu0> CREATOR = new g2(6);
    public sb1 e;

    public yu0(long j) {
        ib1 j2 = pb1.j();
        sb1 sb1Var = new sb1(j2.g(), j);
        if (!(j2 instanceof x40)) {
            sb1Var.b = new sb1(1L, j);
        }
        this.e = sb1Var;
    }

    @Override // defpackage.ge1
    public final ie1 a() {
        return this.e;
    }

    @Override // defpackage.ge1
    public final ie1 b(ie1 ie1Var, ie1 ie1Var2, ie1 ie1Var3) {
        if (((sb1) ie1Var2).c == ((sb1) ie1Var3).c) {
            return ie1Var2;
        }
        return null;
    }

    @Override // defpackage.ge1
    public final void d(ie1 ie1Var) {
        ie1Var.getClass();
        this.e = (sb1) ie1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.tb1
    public final vb1 e() {
        return j41.o;
    }

    @Override // defpackage.yd1
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((sb1) pb1.t(this.e, this)).c;
    }

    public final void i(long j) {
        ib1 j2;
        sb1 sb1Var = (sb1) pb1.h(this.e);
        if (sb1Var.c != j) {
            sb1 sb1Var2 = this.e;
            synchronized (pb1.c) {
                j2 = pb1.j();
                ((sb1) pb1.o(sb1Var2, this, j2, sb1Var)).c = j;
            }
            pb1.n(j2, this);
        }
    }

    @Override // defpackage.ao0
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((sb1) pb1.h(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}
