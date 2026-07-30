package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c1 extends q0.v implements Parcelable, q0.o, z0, m2 {
    public static final Parcelable.Creator<c1> CREATOR = new b1(0);

    /* renamed from: g, reason: collision with root package name */
    public b2 f3698g;

    public c1(float f9) {
        b2 b2Var = new b2(f9);
        if (q0.n.f7426a.j() != null) {
            b2 b2Var2 = new b2(f9);
            b2Var2.f7464a = 1;
            b2Var.f7465b = b2Var2;
        }
        this.f3698g = b2Var;
    }

    @Override // q0.u
    public final q0.w a() {
        return this.f3698g;
    }

    @Override // q0.o
    public final f2 b() {
        return t0.f3903k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return ((b2) q0.n.t(this.f3698g, this)).f3694c;
    }

    public final void f(float f9) {
        q0.g k8;
        b2 b2Var = (b2) q0.n.i(this.f3698g);
        if (b2Var.f3694c == f9) {
            return;
        }
        b2 b2Var2 = this.f3698g;
        synchronized (q0.n.f7427b) {
            k8 = q0.n.k();
            ((b2) q0.n.o(b2Var2, this, k8, b2Var)).f3694c = f9;
        }
        q0.n.n(k8, this);
    }

    @Override // q0.u
    public final q0.w g(q0.w wVar, q0.w wVar2, q0.w wVar3) {
        if (((b2) wVar2).f3694c == ((b2) wVar3).f3694c) {
            return wVar2;
        }
        return null;
    }

    @Override // g0.m2
    public Object getValue() {
        return Float.valueOf(e());
    }

    @Override // q0.u
    public final void m(q0.w wVar) {
        r6.k.d(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f3698g = (b2) wVar;
    }

    @Override // g0.z0
    public void setValue(Object obj) {
        f(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((b2) q0.n.i(this.f3698g)).f3694c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(e());
    }
}
