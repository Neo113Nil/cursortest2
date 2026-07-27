package G;

import Q.AbstractC0274j;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: G.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199g0 extends Q.E implements Parcelable, Q.s, InterfaceC0191c0, X0 {
    public static final Parcelable.Creator<C0199g0> CREATOR = new C0195e0(1);

    /* renamed from: e, reason: collision with root package name */
    public J0 f2811e;

    public C0199g0(int i2) {
        J0 j02 = new J0(i2);
        if (Q.q.f3877a.j() != null) {
            J0 j03 = new J0(i2);
            j03.f3809a = 1;
            j02.f3810b = j03;
        }
        this.f2811e = j02;
    }

    @Override // Q.s
    public final M0 a() {
        return W.f2779l;
    }

    public final int d() {
        return ((J0) Q.q.t(this.f2811e, this)).f2711c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Q.D
    public final void e(Q.F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f2811e = (J0) f4;
    }

    public final void f(int i2) {
        AbstractC0274j k4;
        J0 j02 = (J0) Q.q.i(this.f2811e);
        if (j02.f2711c != i2) {
            J0 j03 = this.f2811e;
            synchronized (Q.q.f3878b) {
                k4 = Q.q.k();
                ((J0) Q.q.o(j03, this, k4, j02)).f2711c = i2;
                Unit unit = Unit.f7487a;
            }
            Q.q.n(k4, this);
        }
    }

    @Override // G.X0
    public Object getValue() {
        return Integer.valueOf(d());
    }

    @Override // Q.D
    public final Q.F h() {
        return this.f2811e;
    }

    @Override // Q.D
    public final Q.F s(Q.F f4, Q.F f5, Q.F f6) {
        if (((J0) f5).f2711c == ((J0) f6).f2711c) {
            return f5;
        }
        return null;
    }

    @Override // G.InterfaceC0191c0
    public void setValue(Object obj) {
        f(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((J0) Q.q.i(this.f2811e)).f2711c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(d());
    }
}
