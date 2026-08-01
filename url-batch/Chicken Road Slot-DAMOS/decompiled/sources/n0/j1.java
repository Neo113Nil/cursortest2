package n0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j1 extends b1.g0 implements Parcelable, b1.s {
    public static final Parcelable.Creator<j1> CREATOR = new i1();

    /* renamed from: e, reason: collision with root package name */
    public final e f6725e;

    /* renamed from: i, reason: collision with root package name */
    public i2 f6726i;

    public j1(Object obj, e eVar) {
        this.f6725e = eVar;
        b1.i j = b1.r.j();
        i2 i2Var = new i2(j.g(), obj);
        if (!(j instanceof b1.c)) {
            i2Var.f982b = new i2(1, obj);
        }
        this.f6726i = i2Var;
    }

    @Override // b1.f0
    public final void b(b1.h0 h0Var) {
        h0Var.getClass();
        this.f6726i = (i2) h0Var;
    }

    @Override // b1.f0
    public final b1.h0 c() {
        return this.f6726i;
    }

    @Override // b1.s
    public final e d() {
        return this.f6725e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // b1.f0
    public final b1.h0 e(b1.h0 h0Var, b1.h0 h0Var2, b1.h0 h0Var3) {
        if (this.f6725e.b(((i2) h0Var2).f6722c, ((i2) h0Var3).f6722c)) {
            return h0Var2;
        }
        return null;
    }

    @Override // n0.m2
    public final Object getValue() {
        return ((i2) b1.r.t(this.f6726i, this)).f6722c;
    }

    @Override // n0.z0
    public final void setValue(Object obj) {
        b1.i j;
        i2 i2Var = (i2) b1.r.h(this.f6726i);
        if (this.f6725e.b(i2Var.f6722c, obj)) {
            return;
        }
        i2 i2Var2 = this.f6726i;
        synchronized (b1.r.f1030c) {
            j = b1.r.j();
            ((i2) b1.r.o(i2Var2, this, j, i2Var)).f6722c = obj;
        }
        b1.r.n(j, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((i2) b1.r.h(this.f6726i)).f6722c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i10;
        parcel.writeValue(getValue());
        e eVar = e.f6660r;
        e eVar2 = this.f6725e;
        if (Intrinsics.a(eVar2, eVar)) {
            i10 = 0;
        } else if (Intrinsics.a(eVar2, e.f6663u)) {
            i10 = 1;
        } else {
            if (!Intrinsics.a(eVar2, e.f6661s)) {
                kotlin.collections.i0.l("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i10 = 2;
        }
        parcel.writeInt(i10);
    }
}
