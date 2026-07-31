package n0;

import m0.i2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5275a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5276b;

    public j0(int i, int i8) {
        this.f5275a = i;
        this.f5276b = i8;
    }

    public abstract void a(androidx.datastore.preferences.protobuf.k kVar, m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var);

    public m0.a b(androidx.datastore.preferences.protobuf.k kVar) {
        return null;
    }

    public final String toString() {
        String b8 = q6.t.a(getClass()).b();
        return b8 == null ? "" : b8;
    }

    public /* synthetic */ j0(int i, int i8, int i9) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 0 : i8);
    }
}
