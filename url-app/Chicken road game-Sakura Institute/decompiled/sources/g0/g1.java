package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g1 extends q0.v implements Parcelable, q0.o {
    public static final Parcelable.Creator<g1> CREATOR = new f1();

    /* renamed from: g, reason: collision with root package name */
    public final f2 f3731g;

    /* renamed from: h, reason: collision with root package name */
    public e2 f3732h;

    public g1(Object obj, f2 f2Var) {
        this.f3731g = f2Var;
        e2 e2Var = new e2(obj);
        if (q0.n.f7426a.j() != null) {
            e2 e2Var2 = new e2(obj);
            e2Var2.f7464a = 1;
            e2Var.f7465b = e2Var2;
        }
        this.f3732h = e2Var;
    }

    @Override // q0.u
    public final q0.w a() {
        return this.f3732h;
    }

    @Override // q0.o
    public final f2 b() {
        return this.f3731g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // q0.u
    public final q0.w g(q0.w wVar, q0.w wVar2, q0.w wVar3) {
        if (this.f3731g.a(((e2) wVar2).f3720c, ((e2) wVar3).f3720c)) {
            return wVar2;
        }
        return null;
    }

    @Override // g0.m2
    public final Object getValue() {
        return ((e2) q0.n.t(this.f3732h, this)).f3720c;
    }

    @Override // q0.u
    public final void m(q0.w wVar) {
        r6.k.d(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f3732h = (e2) wVar;
    }

    @Override // g0.z0
    public final void setValue(Object obj) {
        q0.g k8;
        e2 e2Var = (e2) q0.n.i(this.f3732h);
        if (this.f3731g.a(e2Var.f3720c, obj)) {
            return;
        }
        e2 e2Var2 = this.f3732h;
        synchronized (q0.n.f7427b) {
            k8 = q0.n.k();
            ((e2) q0.n.o(e2Var2, this, k8, e2Var)).f3720c = obj;
        }
        q0.n.n(k8, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((e2) q0.n.i(this.f3732h)).f3720c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8;
        parcel.writeValue(getValue());
        t0 t0Var = t0.f3900h;
        f2 f2Var = this.f3731g;
        if (r6.k.a(f2Var, t0Var)) {
            i8 = 0;
        } else if (r6.k.a(f2Var, t0.f3903k)) {
            i8 = 1;
        } else {
            if (!r6.k.a(f2Var, t0.f3901i)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i8 = 2;
        }
        parcel.writeInt(i8);
    }
}
