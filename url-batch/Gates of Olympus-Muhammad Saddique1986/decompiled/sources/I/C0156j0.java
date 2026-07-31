package I;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156j0 extends S.z implements Parcelable, S.q {
    public static final Parcelable.Creator<C0156j0> CREATOR = new C0154i0();

    /* renamed from: e, reason: collision with root package name */
    public final M0 f2821e;

    /* renamed from: f, reason: collision with root package name */
    public L0 f2822f;

    public C0156j0(Object obj, M0 m02) {
        this.f2821e = m02;
        L0 l02 = new L0(obj);
        if (S.p.f4240a.g() != null) {
            L0 l03 = new L0(obj);
            l03.f4174a = 1;
            l02.f4175b = l03;
        }
        this.f2822f = l02;
    }

    @Override // S.q
    public final M0 a() {
        return this.f2821e;
    }

    @Override // S.y
    public final S.A b(S.A a3, S.A a4, S.A a5) {
        if (this.f2821e.a(((L0) a4).f2723c, ((L0) a5).f2723c)) {
            return a4;
        }
        return null;
    }

    @Override // S.y
    public final S.A c() {
        return this.f2822f;
    }

    @Override // S.y
    public final void d(S.A a3) {
        f2.j.d(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f2822f = (L0) a3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // I.W0
    public final Object getValue() {
        return ((L0) S.p.t(this.f2822f, this)).f2723c;
    }

    @Override // I.InterfaceC0142c0
    public final void setValue(Object obj) {
        S.i k3;
        L0 l02 = (L0) S.p.i(this.f2822f);
        if (this.f2821e.a(l02.f2723c, obj)) {
            return;
        }
        L0 l03 = this.f2822f;
        synchronized (S.p.f4241b) {
            k3 = S.p.k();
            ((L0) S.p.o(l03, this, k3, l02)).f2723c = obj;
        }
        S.p.n(k3, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((L0) S.p.i(this.f2822f)).f2723c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4;
        parcel.writeValue(getValue());
        W w2 = W.f2780f;
        M0 m02 = this.f2821e;
        if (f2.j.a(m02, w2)) {
            i4 = 0;
        } else if (f2.j.a(m02, W.f2783i)) {
            i4 = 1;
        } else {
            if (!f2.j.a(m02, W.f2781g)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i4 = 2;
        }
        parcel.writeInt(i4);
    }
}
