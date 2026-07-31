package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f1 extends w0.v implements Parcelable, w0.n, z0, t2 {
    public static final Parcelable.Creator<f1> CREATOR = new c1(2);

    /* renamed from: e, reason: collision with root package name */
    public l2 f4927e;

    public f1(long j7) {
        w0.f k3 = w0.m.k();
        l2 l2Var = new l2(k3.g(), j7);
        if (!(k3 instanceof w0.a)) {
            l2Var.f7573b = new l2(1, j7);
        }
        this.f4927e = l2Var;
    }

    @Override // w0.u
    public final w0.w a() {
        return this.f4927e;
    }

    @Override // w0.u
    public final w0.w b(w0.w wVar, w0.w wVar2, w0.w wVar3) {
        if (((l2) wVar2).f5014c == ((l2) wVar3).f5014c) {
            return wVar2;
        }
        return null;
    }

    @Override // w0.u
    public final void c(w0.w wVar) {
        q6.i.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f4927e = (l2) wVar;
    }

    @Override // w0.n
    public final n2 d() {
        return v0.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(long j7) {
        w0.f k3;
        l2 l2Var = (l2) w0.m.i(this.f4927e);
        if (l2Var.f5014c != j7) {
            l2 l2Var2 = this.f4927e;
            synchronized (w0.m.f7537c) {
                k3 = w0.m.k();
                ((l2) w0.m.o(l2Var2, this, k3, l2Var)).f5014c = j7;
            }
            w0.m.n(k3, this);
        }
    }

    @Override // m0.t2
    public Object getValue() {
        return Long.valueOf(((l2) w0.m.t(this.f4927e, this)).f5014c);
    }

    @Override // m0.z0
    public void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((l2) w0.m.i(this.f4927e)).f5014c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(((l2) w0.m.t(this.f4927e, this)).f5014c);
    }
}
