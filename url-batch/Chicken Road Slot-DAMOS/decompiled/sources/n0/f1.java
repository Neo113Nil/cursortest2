package n0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f1 extends b1.g0 implements Parcelable, b1.s, m2, z0 {
    public static final Parcelable.Creator<f1> CREATOR = new e1(0);

    /* renamed from: e, reason: collision with root package name */
    public f2 f6679e;

    public f1(float f3) {
        b1.i j = b1.r.j();
        f2 f2Var = new f2(j.g(), f3);
        if (!(j instanceof b1.c)) {
            f2Var.f982b = new f2(1, f3);
        }
        this.f6679e = f2Var;
    }

    @Override // b1.f0
    public final void b(b1.h0 h0Var) {
        h0Var.getClass();
        this.f6679e = (f2) h0Var;
    }

    @Override // b1.f0
    public final b1.h0 c() {
        return this.f6679e;
    }

    @Override // b1.s
    public final e d() {
        return e.f6663u;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // b1.f0
    public final b1.h0 e(b1.h0 h0Var, b1.h0 h0Var2, b1.h0 h0Var3) {
        if (((f2) h0Var2).f6680c == ((f2) h0Var3).f6680c) {
            return h0Var2;
        }
        return null;
    }

    @Override // n0.m2
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((f2) b1.r.t(this.f6679e, this)).f6680c;
    }

    public final void i(float f3) {
        b1.i j;
        f2 f2Var = (f2) b1.r.h(this.f6679e);
        if (f2Var.f6680c == f3) {
            return;
        }
        f2 f2Var2 = this.f6679e;
        synchronized (b1.r.f1030c) {
            j = b1.r.j();
            ((f2) b1.r.o(f2Var2, this, j, f2Var)).f6680c = f3;
        }
        b1.r.n(j, this);
    }

    @Override // n0.z0
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((f2) b1.r.h(this.f6679e)).f6680c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(h());
    }
}
