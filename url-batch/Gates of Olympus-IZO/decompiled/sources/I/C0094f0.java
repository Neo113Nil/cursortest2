package I;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094f0 extends S.y implements Parcelable, S.r, InterfaceC0088c0, X0 {
    public static final Parcelable.Creator<C0094f0> CREATOR = new C0092e0(0);

    /* renamed from: e, reason: collision with root package name */
    public J0 f2250e;

    public C0094f0(float f3) {
        J0 j02 = new J0(f3);
        if (S.q.f3234a.g() != null) {
            J0 j03 = new J0(f3);
            j03.f3272a = 1;
            j02.f3273b = j03;
        }
        this.f2250e = j02;
    }

    @Override // S.r
    public final N0 a() {
        return X.f2228i;
    }

    @Override // S.x
    public final S.z b(S.z zVar, S.z zVar2, S.z zVar3) {
        if (((J0) zVar2).f2156c == ((J0) zVar3).f2156c) {
            return zVar2;
        }
        return null;
    }

    @Override // S.x
    public final S.z c() {
        return this.f2250e;
    }

    @Override // S.x
    public final void d(S.z zVar) {
        Z1.i.d(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f2250e = (J0) zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((J0) S.q.t(this.f2250e, this)).f2156c;
    }

    @Override // I.X0
    public Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f3) {
        S.i k3;
        J0 j02 = (J0) S.q.i(this.f2250e);
        if (j02.f2156c == f3) {
            return;
        }
        J0 j03 = this.f2250e;
        synchronized (S.q.f3235b) {
            k3 = S.q.k();
            ((J0) S.q.o(j03, this, k3, j02)).f2156c = f3;
        }
        S.q.n(k3, this);
    }

    @Override // I.InterfaceC0088c0
    public void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((J0) S.q.i(this.f2250e)).f2156c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(g());
    }
}
