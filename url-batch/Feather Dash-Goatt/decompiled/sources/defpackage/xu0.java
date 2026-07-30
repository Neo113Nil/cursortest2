package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xu0 extends he1 implements Parcelable, tb1, yd1, ao0 {
    public static final Parcelable.Creator<xu0> CREATOR = new g2(5);
    public rb1 e;

    public xu0(int i) {
        ib1 j = pb1.j();
        rb1 rb1Var = new rb1(i, j.g());
        if (!(j instanceof x40)) {
            rb1Var.b = new rb1(i, 1L);
        }
        this.e = rb1Var;
    }

    @Override // defpackage.ge1
    public final ie1 a() {
        return this.e;
    }

    @Override // defpackage.ge1
    public final ie1 b(ie1 ie1Var, ie1 ie1Var2, ie1 ie1Var3) {
        if (((rb1) ie1Var2).c == ((rb1) ie1Var3).c) {
            return ie1Var2;
        }
        return null;
    }

    @Override // defpackage.ge1
    public final void d(ie1 ie1Var) {
        ie1Var.getClass();
        this.e = (rb1) ie1Var;
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
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((rb1) pb1.t(this.e, this)).c;
    }

    public final void i(int i) {
        ib1 j;
        rb1 rb1Var = (rb1) pb1.h(this.e);
        if (rb1Var.c != i) {
            rb1 rb1Var2 = this.e;
            synchronized (pb1.c) {
                j = pb1.j();
                ((rb1) pb1.o(rb1Var2, this, j, rb1Var)).c = i;
            }
            pb1.n(j, this);
        }
    }

    @Override // defpackage.ao0
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((rb1) pb1.h(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}
