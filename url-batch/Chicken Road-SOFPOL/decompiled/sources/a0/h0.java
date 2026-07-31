package a0;

import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 implements t2 {

    /* renamed from: d, reason: collision with root package name */
    public final m0.h1 f88d;

    /* renamed from: e, reason: collision with root package name */
    public int f89e;

    public h0(int i) {
        int i8 = (i / 30) * 30;
        this.f88d = new m0.h1(r2.o.u0(Math.max(i8 - 100, 0), i8 + 130), m0.v0.i);
        this.f89e = i;
    }

    @Override // m0.t2
    public final Object getValue() {
        return (v6.d) this.f88d.getValue();
    }
}
