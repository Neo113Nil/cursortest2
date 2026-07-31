package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d1 extends w0.v implements Parcelable, w0.n, z0, t2 {
    public static final Parcelable.Creator<d1> CREATOR = new c1(0);

    /* renamed from: e, reason: collision with root package name */
    public j2 f4895e;

    public d1(float f6) {
        w0.f k3 = w0.m.k();
        j2 j2Var = new j2(k3.g(), f6);
        if (!(k3 instanceof w0.a)) {
            j2Var.f7573b = new j2(1, f6);
        }
        this.f4895e = j2Var;
    }

    @Override // w0.u
    public final w0.w a() {
        return this.f4895e;
    }

    @Override // w0.u
    public final w0.w b(w0.w wVar, w0.w wVar2, w0.w wVar3) {
        if (((j2) wVar2).f4978c == ((j2) wVar3).f4978c) {
            return wVar2;
        }
        return null;
    }

    @Override // w0.u
    public final void c(w0.w wVar) {
        q6.i.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f4895e = (j2) wVar;
    }

    @Override // w0.n
    public final n2 d() {
        return v0.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((j2) w0.m.t(this.f4895e, this)).f4978c;
    }

    @Override // m0.t2
    public Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f6) {
        w0.f k3;
        j2 j2Var = (j2) w0.m.i(this.f4895e);
        if (j2Var.f4978c == f6) {
            return;
        }
        j2 j2Var2 = this.f4895e;
        synchronized (w0.m.f7537c) {
            k3 = w0.m.k();
            ((j2) w0.m.o(j2Var2, this, k3, j2Var)).f4978c = f6;
        }
        w0.m.n(k3, this);
    }

    @Override // m0.z0
    public void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((j2) w0.m.i(this.f4895e)).f4978c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
