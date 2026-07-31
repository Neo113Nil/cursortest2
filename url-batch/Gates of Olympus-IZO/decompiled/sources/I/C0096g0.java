package I;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096g0 extends S.y implements Parcelable, S.r, InterfaceC0088c0, X0 {
    public static final Parcelable.Creator<C0096g0> CREATOR = new C0092e0(1);

    /* renamed from: e, reason: collision with root package name */
    public K0 f2257e;

    public C0096g0(int i3) {
        K0 k02 = new K0(i3);
        if (S.q.f3234a.g() != null) {
            K0 k03 = new K0(i3);
            k03.f3272a = 1;
            k02.f3273b = k03;
        }
        this.f2257e = k02;
    }

    @Override // S.r
    public final N0 a() {
        return X.f2228i;
    }

    @Override // S.x
    public final S.z b(S.z zVar, S.z zVar2, S.z zVar3) {
        if (((K0) zVar2).f2158c == ((K0) zVar3).f2158c) {
            return zVar2;
        }
        return null;
    }

    @Override // S.x
    public final S.z c() {
        return this.f2257e;
    }

    @Override // S.x
    public final void d(S.z zVar) {
        Z1.i.d(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f2257e = (K0) zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((K0) S.q.t(this.f2257e, this)).f2158c;
    }

    @Override // I.X0
    public Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i3) {
        S.i k3;
        K0 k02 = (K0) S.q.i(this.f2257e);
        if (k02.f2158c != i3) {
            K0 k03 = this.f2257e;
            synchronized (S.q.f3235b) {
                k3 = S.q.k();
                ((K0) S.q.o(k03, this, k3, k02)).f2158c = i3;
            }
            S.q.n(k3, this);
        }
    }

    @Override // I.InterfaceC0088c0
    public void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((K0) S.q.i(this.f2257e)).f2158c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(g());
    }
}
