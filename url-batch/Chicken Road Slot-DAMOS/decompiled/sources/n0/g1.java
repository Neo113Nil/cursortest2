package n0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g1 extends b1.g0 implements Parcelable, b1.s, m2, z0 {
    public static final Parcelable.Creator<g1> CREATOR = new e1(1);

    /* renamed from: e, reason: collision with root package name */
    public g2 f6683e;

    public g1(int i3) {
        b1.i j = b1.r.j();
        g2 g2Var = new g2(i3, j.g());
        if (!(j instanceof b1.c)) {
            g2Var.f982b = new g2(i3, 1);
        }
        this.f6683e = g2Var;
    }

    @Override // b1.f0
    public final void b(b1.h0 h0Var) {
        h0Var.getClass();
        this.f6683e = (g2) h0Var;
    }

    @Override // b1.f0
    public final b1.h0 c() {
        return this.f6683e;
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
        if (((g2) h0Var2).f6684c == ((g2) h0Var3).f6684c) {
            return h0Var2;
        }
        return null;
    }

    @Override // n0.m2
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((g2) b1.r.t(this.f6683e, this)).f6684c;
    }

    public final void i(int i3) {
        b1.i j;
        g2 g2Var = (g2) b1.r.h(this.f6683e);
        if (g2Var.f6684c != i3) {
            g2 g2Var2 = this.f6683e;
            synchronized (b1.r.f1030c) {
                j = b1.r.j();
                ((g2) b1.r.o(g2Var2, this, j, g2Var)).f6684c = i3;
            }
            b1.r.n(j, this);
        }
    }

    @Override // n0.z0
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((g2) b1.r.h(this.f6683e)).f6684c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(h());
    }
}
