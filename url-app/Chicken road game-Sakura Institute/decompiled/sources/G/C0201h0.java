package G;

import Q.AbstractC0274j;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: G.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201h0 extends Q.E implements Parcelable, Q.s, InterfaceC0191c0, X0 {
    public static final Parcelable.Creator<C0201h0> CREATOR = new C0195e0(2);

    /* renamed from: e, reason: collision with root package name */
    public K0 f2815e;

    public C0201h0(long j4) {
        K0 k02 = new K0(j4);
        if (Q.q.f3877a.j() != null) {
            K0 k03 = new K0(j4);
            k03.f3809a = 1;
            k02.f3810b = k03;
        }
        this.f2815e = k02;
    }

    @Override // Q.s
    public final M0 a() {
        return W.f2779l;
    }

    public final void d(long j4) {
        AbstractC0274j k4;
        K0 k02 = (K0) Q.q.i(this.f2815e);
        if (k02.f2715c != j4) {
            K0 k03 = this.f2815e;
            synchronized (Q.q.f3878b) {
                k4 = Q.q.k();
                ((K0) Q.q.o(k03, this, k4, k02)).f2715c = j4;
                Unit unit = Unit.f7487a;
            }
            Q.q.n(k4, this);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Q.D
    public final void e(Q.F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f2815e = (K0) f4;
    }

    @Override // G.X0
    public Object getValue() {
        return Long.valueOf(((K0) Q.q.t(this.f2815e, this)).f2715c);
    }

    @Override // Q.D
    public final Q.F h() {
        return this.f2815e;
    }

    @Override // Q.D
    public final Q.F s(Q.F f4, Q.F f5, Q.F f6) {
        if (((K0) f5).f2715c == ((K0) f6).f2715c) {
            return f5;
        }
        return null;
    }

    @Override // G.InterfaceC0191c0
    public void setValue(Object obj) {
        d(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((K0) Q.q.i(this.f2815e)).f2715c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(((K0) Q.q.t(this.f2815e, this)).f2715c);
    }
}
