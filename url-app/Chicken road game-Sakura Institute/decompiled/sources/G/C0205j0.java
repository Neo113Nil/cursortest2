package G;

import Q.AbstractC0274j;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: G.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205j0 extends Q.E implements Parcelable, Q.s {
    public static final Parcelable.Creator<C0205j0> CREATOR = new C0203i0();

    /* renamed from: e, reason: collision with root package name */
    public final M0 f2818e;

    /* renamed from: i, reason: collision with root package name */
    public L0 f2819i;

    public C0205j0(Object obj, M0 m02) {
        this.f2818e = m02;
        L0 l02 = new L0(obj);
        if (Q.q.f3877a.j() != null) {
            L0 l03 = new L0(obj);
            l03.f3809a = 1;
            l02.f3810b = l03;
        }
        this.f2819i = l02;
    }

    @Override // Q.s
    public final M0 a() {
        return this.f2818e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Q.D
    public final void e(Q.F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f2819i = (L0) f4;
    }

    @Override // G.X0
    public final Object getValue() {
        return ((L0) Q.q.t(this.f2819i, this)).f2721c;
    }

    @Override // Q.D
    public final Q.F h() {
        return this.f2819i;
    }

    @Override // Q.D
    public final Q.F s(Q.F f4, Q.F f5, Q.F f6) {
        if (this.f2818e.a(((L0) f5).f2721c, ((L0) f6).f2721c)) {
            return f5;
        }
        return null;
    }

    @Override // G.InterfaceC0191c0
    public final void setValue(Object obj) {
        AbstractC0274j k4;
        L0 l02 = (L0) Q.q.i(this.f2819i);
        if (this.f2818e.a(l02.f2721c, obj)) {
            return;
        }
        L0 l03 = this.f2819i;
        synchronized (Q.q.f3878b) {
            k4 = Q.q.k();
            ((L0) Q.q.o(l03, this, k4, l02)).f2721c = obj;
            Unit unit = Unit.f7487a;
        }
        Q.q.n(k4, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((L0) Q.q.i(this.f2819i)).f2721c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i4;
        parcel.writeValue(getValue());
        W w4 = W.f2776i;
        M0 m02 = this.f2818e;
        if (Intrinsics.a(m02, w4)) {
            i4 = 0;
        } else if (Intrinsics.a(m02, W.f2779l)) {
            i4 = 1;
        } else {
            if (!Intrinsics.a(m02, W.f2777j)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i4 = 2;
        }
        parcel.writeInt(i4);
    }
}
