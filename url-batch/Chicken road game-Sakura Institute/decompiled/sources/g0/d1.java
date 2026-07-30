package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d1 extends q0.v implements Parcelable, q0.o, z0, m2 {
    public static final Parcelable.Creator<d1> CREATOR = new b1(1);

    /* renamed from: g, reason: collision with root package name */
    public c2 f3714g;

    public d1(int i7) {
        c2 c2Var = new c2(i7);
        if (q0.n.f7426a.j() != null) {
            c2 c2Var2 = new c2(i7);
            c2Var2.f7464a = 1;
            c2Var.f7465b = c2Var2;
        }
        this.f3714g = c2Var;
    }

    @Override // q0.u
    public final q0.w a() {
        return this.f3714g;
    }

    @Override // q0.o
    public final f2 b() {
        return t0.f3903k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return ((c2) q0.n.t(this.f3714g, this)).f3699c;
    }

    public final void f(int i7) {
        q0.g k8;
        c2 c2Var = (c2) q0.n.i(this.f3714g);
        if (c2Var.f3699c != i7) {
            c2 c2Var2 = this.f3714g;
            synchronized (q0.n.f7427b) {
                k8 = q0.n.k();
                ((c2) q0.n.o(c2Var2, this, k8, c2Var)).f3699c = i7;
            }
            q0.n.n(k8, this);
        }
    }

    @Override // q0.u
    public final q0.w g(q0.w wVar, q0.w wVar2, q0.w wVar3) {
        if (((c2) wVar2).f3699c == ((c2) wVar3).f3699c) {
            return wVar2;
        }
        return null;
    }

    @Override // g0.m2
    public Object getValue() {
        return Integer.valueOf(e());
    }

    @Override // q0.u
    public final void m(q0.w wVar) {
        r6.k.d(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f3714g = (c2) wVar;
    }

    @Override // g0.z0
    public void setValue(Object obj) {
        f(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((c2) q0.n.i(this.f3714g)).f3699c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(e());
    }
}
