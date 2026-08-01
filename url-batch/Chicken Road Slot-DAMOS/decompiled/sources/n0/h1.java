package n0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h1 extends b1.g0 implements Parcelable, b1.s, m2, z0 {
    public static final Parcelable.Creator<h1> CREATOR = new e1(2);

    /* renamed from: e, reason: collision with root package name */
    public h2 f6696e;

    public h1(long j) {
        b1.i j3 = b1.r.j();
        h2 h2Var = new h2(j3.g(), j);
        if (!(j3 instanceof b1.c)) {
            h2Var.f982b = new h2(1, j);
        }
        this.f6696e = h2Var;
    }

    @Override // b1.f0
    public final void b(b1.h0 h0Var) {
        h0Var.getClass();
        this.f6696e = (h2) h0Var;
    }

    @Override // b1.f0
    public final b1.h0 c() {
        return this.f6696e;
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
        if (((h2) h0Var2).f6697c == ((h2) h0Var3).f6697c) {
            return h0Var2;
        }
        return null;
    }

    @Override // n0.m2
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((h2) b1.r.t(this.f6696e, this)).f6697c;
    }

    public final void i(long j) {
        b1.i j3;
        h2 h2Var = (h2) b1.r.h(this.f6696e);
        if (h2Var.f6697c != j) {
            h2 h2Var2 = this.f6696e;
            synchronized (b1.r.f1030c) {
                j3 = b1.r.j();
                ((h2) b1.r.o(h2Var2, this, j3, h2Var)).f6697c = j;
            }
            b1.r.n(j3, this);
        }
    }

    @Override // n0.z0
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((h2) b1.r.h(this.f6696e)).f6697c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(h());
    }
}
