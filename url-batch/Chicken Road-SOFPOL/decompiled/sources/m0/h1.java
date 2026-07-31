package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h1 extends w0.v implements Parcelable, w0.n {
    public static final Parcelable.Creator<h1> CREATOR = new g1();

    /* renamed from: e, reason: collision with root package name */
    public final n2 f4945e;

    /* renamed from: f, reason: collision with root package name */
    public m2 f4946f;

    public h1(Object obj, n2 n2Var) {
        this.f4945e = n2Var;
        w0.f k3 = w0.m.k();
        m2 m2Var = new m2(k3.g(), obj);
        if (!(k3 instanceof w0.a)) {
            m2Var.f7573b = new m2(1, obj);
        }
        this.f4946f = m2Var;
    }

    @Override // w0.u
    public final w0.w a() {
        return this.f4946f;
    }

    @Override // w0.u
    public final w0.w b(w0.w wVar, w0.w wVar2, w0.w wVar3) {
        if (this.f4945e.a(((m2) wVar2).f5018c, ((m2) wVar3).f5018c)) {
            return wVar2;
        }
        return null;
    }

    @Override // w0.u
    public final void c(w0.w wVar) {
        q6.i.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f4946f = (m2) wVar;
    }

    @Override // w0.n
    public final n2 d() {
        return this.f4945e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // m0.t2
    public final Object getValue() {
        return ((m2) w0.m.t(this.f4946f, this)).f5018c;
    }

    @Override // m0.z0
    public final void setValue(Object obj) {
        w0.f k3;
        m2 m2Var = (m2) w0.m.i(this.f4946f);
        if (this.f4945e.a(m2Var.f5018c, obj)) {
            return;
        }
        m2 m2Var2 = this.f4946f;
        synchronized (w0.m.f7537c) {
            k3 = w0.m.k();
            ((m2) w0.m.o(m2Var2, this, k3, m2Var)).f5018c = obj;
        }
        w0.m.n(k3, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((m2) w0.m.i(this.f4946f)).f5018c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i8;
        parcel.writeValue(getValue());
        v0 v0Var = v0.f5133f;
        n2 n2Var = this.f4945e;
        if (q6.i.a(n2Var, v0Var)) {
            i8 = 0;
        } else if (q6.i.a(n2Var, v0.i)) {
            i8 = 1;
        } else {
            if (!q6.i.a(n2Var, v0.f5134g)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i8 = 2;
        }
        parcel.writeInt(i8);
    }
}
