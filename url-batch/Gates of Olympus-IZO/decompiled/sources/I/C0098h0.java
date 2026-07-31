package I;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098h0 extends S.y implements Parcelable, S.r, InterfaceC0088c0, X0 {
    public static final Parcelable.Creator<C0098h0> CREATOR = new C0092e0(2);

    /* renamed from: e, reason: collision with root package name */
    public L0 f2261e;

    public C0098h0(long j3) {
        L0 l02 = new L0(j3);
        if (S.q.f3234a.g() != null) {
            L0 l03 = new L0(j3);
            l03.f3272a = 1;
            l02.f3273b = l03;
        }
        this.f2261e = l02;
    }

    @Override // S.r
    public final N0 a() {
        return X.f2228i;
    }

    @Override // S.x
    public final S.z b(S.z zVar, S.z zVar2, S.z zVar3) {
        if (((L0) zVar2).f2162c == ((L0) zVar3).f2162c) {
            return zVar2;
        }
        return null;
    }

    @Override // S.x
    public final S.z c() {
        return this.f2261e;
    }

    @Override // S.x
    public final void d(S.z zVar) {
        Z1.i.d(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f2261e = (L0) zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(long j3) {
        S.i k3;
        L0 l02 = (L0) S.q.i(this.f2261e);
        if (l02.f2162c != j3) {
            L0 l03 = this.f2261e;
            synchronized (S.q.f3235b) {
                k3 = S.q.k();
                ((L0) S.q.o(l03, this, k3, l02)).f2162c = j3;
            }
            S.q.n(k3, this);
        }
    }

    @Override // I.X0
    public Object getValue() {
        return Long.valueOf(((L0) S.q.t(this.f2261e, this)).f2162c);
    }

    @Override // I.InterfaceC0088c0
    public void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((L0) S.q.i(this.f2261e)).f2162c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(((L0) S.q.t(this.f2261e, this)).f2162c);
    }
}
