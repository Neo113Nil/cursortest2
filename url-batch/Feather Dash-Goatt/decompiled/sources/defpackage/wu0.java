package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wu0 extends he1 implements Parcelable, tb1, yd1, ao0 {
    public static final Parcelable.Creator<wu0> CREATOR = new g2(4);
    public qb1 e;

    public wu0(float f) {
        ib1 j = pb1.j();
        qb1 qb1Var = new qb1(f, j.g());
        if (!(j instanceof x40)) {
            qb1Var.b = new qb1(f, 1L);
        }
        this.e = qb1Var;
    }

    @Override // defpackage.ge1
    public final ie1 a() {
        return this.e;
    }

    @Override // defpackage.ge1
    public final ie1 b(ie1 ie1Var, ie1 ie1Var2, ie1 ie1Var3) {
        if (((qb1) ie1Var2).c == ((qb1) ie1Var3).c) {
            return ie1Var2;
        }
        return null;
    }

    @Override // defpackage.ge1
    public final void d(ie1 ie1Var) {
        ie1Var.getClass();
        this.e = (qb1) ie1Var;
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
        return Float.valueOf(((qb1) pb1.t(this.e, this)).c);
    }

    public final void h(float f) {
        ib1 j;
        qb1 qb1Var = (qb1) pb1.h(this.e);
        if (qb1Var.c == f) {
            return;
        }
        qb1 qb1Var2 = this.e;
        synchronized (pb1.c) {
            j = pb1.j();
            ((qb1) pb1.o(qb1Var2, this, j, qb1Var)).c = f;
        }
        pb1.n(j, this);
    }

    @Override // defpackage.ao0
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((qb1) pb1.h(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(((qb1) pb1.t(this.e, this)).c);
    }
}
