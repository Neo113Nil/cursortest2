package I;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150g0 extends S.z implements Parcelable, S.q, InterfaceC0142c0, W0 {
    public static final Parcelable.Creator<C0150g0> CREATOR = new C0146e0(1);

    /* renamed from: e, reason: collision with root package name */
    public J0 f2814e;

    public C0150g0(int i3) {
        J0 j02 = new J0(i3);
        if (S.p.f4240a.g() != null) {
            J0 j03 = new J0(i3);
            j03.f4174a = 1;
            j02.f4175b = j03;
        }
        this.f2814e = j02;
    }

    @Override // S.q
    public final M0 a() {
        return W.f2783i;
    }

    @Override // S.y
    public final S.A b(S.A a3, S.A a4, S.A a5) {
        if (((J0) a4).f2713c == ((J0) a5).f2713c) {
            return a4;
        }
        return null;
    }

    @Override // S.y
    public final S.A c() {
        return this.f2814e;
    }

    @Override // S.y
    public final void d(S.A a3) {
        f2.j.d(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f2814e = (J0) a3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((J0) S.p.t(this.f2814e, this)).f2713c;
    }

    @Override // I.W0
    public Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i3) {
        S.i k3;
        J0 j02 = (J0) S.p.i(this.f2814e);
        if (j02.f2713c != i3) {
            J0 j03 = this.f2814e;
            synchronized (S.p.f4241b) {
                k3 = S.p.k();
                ((J0) S.p.o(j03, this, k3, j02)).f2713c = i3;
            }
            S.p.n(k3, this);
        }
    }

    @Override // I.InterfaceC0142c0
    public void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((J0) S.p.i(this.f2814e)).f2713c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(g());
    }
}
