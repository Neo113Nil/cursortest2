package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.9M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9M implements AnonymousClass39 {
    public final C9J A00;
    public final C1711mt A01;
    public final AnonymousClass38[] A02;

    public C9M(AnonymousClass38... anonymousClass38Arr) {
        this(anonymousClass38Arr, new C9J(), new C1711mt());
    }

    public C9M(AnonymousClass38[] anonymousClass38Arr, C9J c9j, C1711mt c1711mt) {
        this.A02 = new AnonymousClass38[anonymousClass38Arr.length + 2];
        System.arraycopy(anonymousClass38Arr, 0, this.A02, 0, anonymousClass38Arr.length);
        this.A00 = c9j;
        this.A01 = c1711mt;
        this.A02[anonymousClass38Arr.length] = c9j;
        this.A02[anonymousClass38Arr.length + 1] = c1711mt;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass39
    public final C1814ob A47(C1814ob c1814ob) {
        this.A01.A02(c1814ob.A01);
        this.A01.A01(c1814ob.A00);
        return c1814ob;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass39
    public final boolean A48(boolean z) {
        this.A00.A0D(z);
        return z;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass39
    public final AnonymousClass38[] A6r() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass39
    public final long A8M(long j) {
        return this.A01.A00(j);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass39
    public final long A90() {
        return this.A00.A0C();
    }
}
