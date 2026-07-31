package I;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102j0 extends S.y implements Parcelable, S.r {
    public static final Parcelable.Creator<C0102j0> CREATOR = new C0100i0();

    /* renamed from: e, reason: collision with root package name */
    public final N0 f2264e;

    /* renamed from: f, reason: collision with root package name */
    public M0 f2265f;

    public C0102j0(Object obj, N0 n02) {
        this.f2264e = n02;
        M0 m02 = new M0(obj);
        if (S.q.f3234a.g() != null) {
            M0 m03 = new M0(obj);
            m03.f3272a = 1;
            m02.f3273b = m03;
        }
        this.f2265f = m02;
    }

    @Override // S.r
    public final N0 a() {
        return this.f2264e;
    }

    @Override // S.x
    public final S.z b(S.z zVar, S.z zVar2, S.z zVar3) {
        if (this.f2264e.a(((M0) zVar2).f2168c, ((M0) zVar3).f2168c)) {
            return zVar2;
        }
        return null;
    }

    @Override // S.x
    public final S.z c() {
        return this.f2265f;
    }

    @Override // S.x
    public final void d(S.z zVar) {
        Z1.i.d(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f2265f = (M0) zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // I.X0
    public final Object getValue() {
        return ((M0) S.q.t(this.f2265f, this)).f2168c;
    }

    @Override // I.InterfaceC0088c0
    public final void setValue(Object obj) {
        S.i k3;
        M0 m02 = (M0) S.q.i(this.f2265f);
        if (this.f2264e.a(m02.f2168c, obj)) {
            return;
        }
        M0 m03 = this.f2265f;
        synchronized (S.q.f3235b) {
            k3 = S.q.k();
            ((M0) S.q.o(m03, this, k3, m02)).f2168c = obj;
        }
        S.q.n(k3, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((M0) S.q.i(this.f2265f)).f2168c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4;
        parcel.writeValue(getValue());
        X x3 = X.f2225f;
        N0 n02 = this.f2264e;
        if (Z1.i.a(n02, x3)) {
            i4 = 0;
        } else if (Z1.i.a(n02, X.f2228i)) {
            i4 = 1;
        } else {
            if (!Z1.i.a(n02, X.f2226g)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i4 = 2;
        }
        parcel.writeInt(i4);
    }
}
