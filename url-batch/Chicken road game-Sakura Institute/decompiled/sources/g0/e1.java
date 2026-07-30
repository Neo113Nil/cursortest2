package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e1 extends q0.v implements Parcelable, q0.o, z0, m2 {
    public static final Parcelable.Creator<e1> CREATOR = new b1(2);

    /* renamed from: g, reason: collision with root package name */
    public d2 f3719g;

    public e1(long j8) {
        d2 d2Var = new d2(j8);
        if (q0.n.f7426a.j() != null) {
            d2 d2Var2 = new d2(j8);
            d2Var2.f7464a = 1;
            d2Var.f7465b = d2Var2;
        }
        this.f3719g = d2Var;
    }

    @Override // q0.u
    public final q0.w a() {
        return this.f3719g;
    }

    @Override // q0.o
    public final f2 b() {
        return t0.f3903k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(long j8) {
        q0.g k8;
        d2 d2Var = (d2) q0.n.i(this.f3719g);
        if (d2Var.f3715c != j8) {
            d2 d2Var2 = this.f3719g;
            synchronized (q0.n.f7427b) {
                k8 = q0.n.k();
                ((d2) q0.n.o(d2Var2, this, k8, d2Var)).f3715c = j8;
            }
            q0.n.n(k8, this);
        }
    }

    @Override // q0.u
    public final q0.w g(q0.w wVar, q0.w wVar2, q0.w wVar3) {
        if (((d2) wVar2).f3715c == ((d2) wVar3).f3715c) {
            return wVar2;
        }
        return null;
    }

    @Override // g0.m2
    public Object getValue() {
        return Long.valueOf(((d2) q0.n.t(this.f3719g, this)).f3715c);
    }

    @Override // q0.u
    public final void m(q0.w wVar) {
        r6.k.d(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f3719g = (d2) wVar;
    }

    @Override // g0.z0
    public void setValue(Object obj) {
        e(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((d2) q0.n.i(this.f3719g)).f3715c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(((d2) q0.n.t(this.f3719g, this)).f3715c);
    }
}
