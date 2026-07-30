package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class av0 extends he1 implements Parcelable, tb1 {
    public static final Parcelable.Creator<av0> CREATOR = new zu0();
    public final vb1 e;
    public ub1 g;

    public av0(Object obj, vb1 vb1Var) {
        this.e = vb1Var;
        ib1 j = pb1.j();
        ub1 ub1Var = new ub1(j.g(), obj);
        if (!(j instanceof x40)) {
            ub1Var.b = new ub1(1L, obj);
        }
        this.g = ub1Var;
    }

    @Override // defpackage.ge1
    public final ie1 a() {
        return this.g;
    }

    @Override // defpackage.ge1
    public final ie1 b(ie1 ie1Var, ie1 ie1Var2, ie1 ie1Var3) {
        if (this.e.b(((ub1) ie1Var2).c, ((ub1) ie1Var3).c)) {
            return ie1Var2;
        }
        return null;
    }

    @Override // defpackage.ge1
    public final void d(ie1 ie1Var) {
        ie1Var.getClass();
        this.g = (ub1) ie1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.tb1
    public final vb1 e() {
        return this.e;
    }

    @Override // defpackage.yd1
    public final Object getValue() {
        return ((ub1) pb1.t(this.g, this)).c;
    }

    @Override // defpackage.ao0
    public final void setValue(Object obj) {
        ib1 j;
        ub1 ub1Var = (ub1) pb1.h(this.g);
        if (this.e.b(ub1Var.c, obj)) {
            return;
        }
        ub1 ub1Var2 = this.g;
        synchronized (pb1.c) {
            j = pb1.j();
            ((ub1) pb1.o(ub1Var2, this, j, ub1Var)).c = obj;
        }
        pb1.n(j, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((ub1) pb1.h(this.g)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        j50 j50Var = j50.A;
        vb1 vb1Var = this.e;
        if (Intrinsics.a(vb1Var, j50Var)) {
            i2 = 0;
        } else if (Intrinsics.a(vb1Var, j41.o)) {
            i2 = 1;
        } else {
            if (!Intrinsics.a(vb1Var, j50.B)) {
                dd0.j("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
