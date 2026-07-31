package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e1 extends w0.v implements Parcelable, w0.n, z0, t2 {
    public static final Parcelable.Creator<e1> CREATOR = new c1(1);

    /* renamed from: e, reason: collision with root package name */
    public k2 f4906e;

    public e1(int i) {
        w0.f k3 = w0.m.k();
        k2 k2Var = new k2(i, k3.g());
        if (!(k3 instanceof w0.a)) {
            k2Var.f7573b = new k2(i, 1);
        }
        this.f4906e = k2Var;
    }

    @Override // w0.u
    public final w0.w a() {
        return this.f4906e;
    }

    @Override // w0.u
    public final w0.w b(w0.w wVar, w0.w wVar2, w0.w wVar3) {
        if (((k2) wVar2).f4997c == ((k2) wVar3).f4997c) {
            return wVar2;
        }
        return null;
    }

    @Override // w0.u
    public final void c(w0.w wVar) {
        q6.i.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f4906e = (k2) wVar;
    }

    @Override // w0.n
    public final n2 d() {
        return v0.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((k2) w0.m.t(this.f4906e, this)).f4997c;
    }

    @Override // m0.t2
    public Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        w0.f k3;
        k2 k2Var = (k2) w0.m.i(this.f4906e);
        if (k2Var.f4997c != i) {
            k2 k2Var2 = this.f4906e;
            synchronized (w0.m.f7537c) {
                k3 = w0.m.k();
                ((k2) w0.m.o(k2Var2, this, k3, k2Var)).f4997c = i;
            }
            w0.m.n(k3, this);
        }
    }

    @Override // m0.z0
    public void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((k2) w0.m.i(this.f4906e)).f4997c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
