package G;

import Q.AbstractC0274j;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: G.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197f0 extends Q.E implements Parcelable, Q.s, InterfaceC0191c0, X0 {
    public static final Parcelable.Creator<C0197f0> CREATOR = new C0195e0(0);

    /* renamed from: e, reason: collision with root package name */
    public I0 f2804e;

    public C0197f0(float f4) {
        I0 i02 = new I0(f4);
        if (Q.q.f3877a.j() != null) {
            I0 i03 = new I0(f4);
            i03.f3809a = 1;
            i02.f3810b = i03;
        }
        this.f2804e = i02;
    }

    @Override // Q.s
    public final M0 a() {
        return W.f2779l;
    }

    public final float d() {
        return ((I0) Q.q.t(this.f2804e, this)).f2709c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Q.D
    public final void e(Q.F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f2804e = (I0) f4;
    }

    public final void f(float f4) {
        AbstractC0274j k4;
        I0 i02 = (I0) Q.q.i(this.f2804e);
        if (i02.f2709c == f4) {
            return;
        }
        I0 i03 = this.f2804e;
        synchronized (Q.q.f3878b) {
            k4 = Q.q.k();
            ((I0) Q.q.o(i03, this, k4, i02)).f2709c = f4;
            Unit unit = Unit.f7487a;
        }
        Q.q.n(k4, this);
    }

    @Override // G.X0
    public Object getValue() {
        return Float.valueOf(d());
    }

    @Override // Q.D
    public final Q.F h() {
        return this.f2804e;
    }

    @Override // Q.D
    public final Q.F s(Q.F f4, Q.F f5, Q.F f6) {
        if (((I0) f5).f2709c == ((I0) f6).f2709c) {
            return f5;
        }
        return null;
    }

    @Override // G.InterfaceC0191c0
    public void setValue(Object obj) {
        f(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((I0) Q.q.i(this.f2804e)).f2709c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(d());
    }
}
