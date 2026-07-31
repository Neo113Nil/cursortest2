package I;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148f0 extends S.z implements Parcelable, S.q, InterfaceC0142c0, W0 {
    public static final Parcelable.Creator<C0148f0> CREATOR = new C0146e0(0);

    /* renamed from: e, reason: collision with root package name */
    public I0 f2807e;

    public C0148f0(float f3) {
        I0 i02 = new I0(f3);
        if (S.p.f4240a.g() != null) {
            I0 i03 = new I0(f3);
            i03.f4174a = 1;
            i02.f4175b = i03;
        }
        this.f2807e = i02;
    }

    @Override // S.q
    public final M0 a() {
        return W.f2783i;
    }

    @Override // S.y
    public final S.A b(S.A a3, S.A a4, S.A a5) {
        if (((I0) a4).f2711c == ((I0) a5).f2711c) {
            return a4;
        }
        return null;
    }

    @Override // S.y
    public final S.A c() {
        return this.f2807e;
    }

    @Override // S.y
    public final void d(S.A a3) {
        f2.j.d(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f2807e = (I0) a3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((I0) S.p.t(this.f2807e, this)).f2711c;
    }

    @Override // I.W0
    public Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f3) {
        S.i k3;
        I0 i02 = (I0) S.p.i(this.f2807e);
        if (i02.f2711c == f3) {
            return;
        }
        I0 i03 = this.f2807e;
        synchronized (S.p.f4241b) {
            k3 = S.p.k();
            ((I0) S.p.o(i03, this, k3, i02)).f2711c = f3;
        }
        S.p.n(k3, this);
    }

    @Override // I.InterfaceC0142c0
    public void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((I0) S.p.i(this.f2807e)).f2711c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(g());
    }
}
