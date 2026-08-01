package a2;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: d, reason: collision with root package name */
    public int f131d;

    /* renamed from: e, reason: collision with root package name */
    public int f132e;

    /* renamed from: i, reason: collision with root package name */
    public long f133i;

    /* renamed from: r, reason: collision with root package name */
    public long f134r = q0.f141a;

    /* renamed from: s, reason: collision with root package name */
    public long f135s = 0;

    public o0() {
        long j = 0;
        this.f133i = (j & 4294967295L) | (j << 32);
    }

    public int W() {
        return (int) (this.f133i & 4294967295L);
    }

    public int X() {
        return (int) (this.f133i >> 32);
    }

    public final void Y() {
        this.f131d = be.f.c((int) (this.f133i >> 32), x2.a.j(this.f134r), x2.a.h(this.f134r));
        this.f132e = be.f.c((int) (this.f133i & 4294967295L), x2.a.i(this.f134r), x2.a.g(this.f134r));
        int i3 = this.f131d;
        long j = this.f133i;
        this.f135s = (((i3 - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void Z(long j, float f3, Function1 function1);

    public final void a0(long j) {
        if (x2.k.a(this.f133i, j)) {
            return;
        }
        this.f133i = j;
        Y();
    }

    public final void b0(long j) {
        if (x2.a.b(this.f134r, j)) {
            return;
        }
        this.f134r = j;
        Y();
    }

    public abstract Object h();
}
