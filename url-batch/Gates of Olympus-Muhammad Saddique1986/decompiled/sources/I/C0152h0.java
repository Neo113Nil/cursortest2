package I;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152h0 extends S.z implements Parcelable, S.q, InterfaceC0142c0, W0 {
    public static final Parcelable.Creator<C0152h0> CREATOR = new C0146e0(2);

    /* renamed from: e, reason: collision with root package name */
    public K0 f2818e;

    public C0152h0(long j3) {
        K0 k02 = new K0(j3);
        if (S.p.f4240a.g() != null) {
            K0 k03 = new K0(j3);
            k03.f4174a = 1;
            k02.f4175b = k03;
        }
        this.f2818e = k02;
    }

    @Override // S.q
    public final M0 a() {
        return W.f2783i;
    }

    @Override // S.y
    public final S.A b(S.A a3, S.A a4, S.A a5) {
        if (((K0) a4).f2717c == ((K0) a5).f2717c) {
            return a4;
        }
        return null;
    }

    @Override // S.y
    public final S.A c() {
        return this.f2818e;
    }

    @Override // S.y
    public final void d(S.A a3) {
        f2.j.d(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f2818e = (K0) a3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(long j3) {
        S.i k3;
        K0 k02 = (K0) S.p.i(this.f2818e);
        if (k02.f2717c != j3) {
            K0 k03 = this.f2818e;
            synchronized (S.p.f4241b) {
                k3 = S.p.k();
                ((K0) S.p.o(k03, this, k3, k02)).f2717c = j3;
            }
            S.p.n(k3, this);
        }
    }

    @Override // I.W0
    public Object getValue() {
        return Long.valueOf(((K0) S.p.t(this.f2818e, this)).f2717c);
    }

    @Override // I.InterfaceC0142c0
    public void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((K0) S.p.i(this.f2818e)).f2717c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(((K0) S.p.t(this.f2818e, this)).f2717c);
    }
}
