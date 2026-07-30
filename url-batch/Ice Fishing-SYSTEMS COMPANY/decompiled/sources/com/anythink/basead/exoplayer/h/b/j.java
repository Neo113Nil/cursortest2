package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: k, reason: collision with root package name */
    private final int f7738k;

    /* renamed from: l, reason: collision with root package name */
    private final m f7739l;

    /* renamed from: m, reason: collision with root package name */
    private volatile int f7740m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f7741n;

    private j(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j9, long j10, long j11, int i4, m mVar2) {
        super(hVar, kVar, mVar, i, obj, j9, j10, com.anythink.basead.exoplayer.b.f6539b, j11);
        this.f7738k = i4;
        this.f7739l = mVar2;
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.j.t.c
    public final void b() {
        try {
            long a9 = this.i.a(this.f7683b.a(this.f7740m));
            if (a9 != -1) {
                a9 += this.f7740m;
            }
            com.anythink.basead.exoplayer.e.b bVar = new com.anythink.basead.exoplayer.e.b(this.i, this.f7740m, a9);
            b c4 = c();
            c4.a(0L);
            com.anythink.basead.exoplayer.e.m a10 = c4.a(this.f7738k);
            a10.a(this.f7739l);
            for (int i = 0; i != -1; i = a10.a(bVar, Integer.MAX_VALUE, true)) {
                this.f7740m += i;
            }
            a10.a(this.f7688g, 1, this.f7740m, 0, null);
            af.a(this.i);
            this.f7741n = true;
        } catch (Throwable th) {
            af.a(this.i);
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.b.c
    public final long d() {
        return this.f7740m;
    }

    @Override // com.anythink.basead.exoplayer.h.b.i
    public final boolean f() {
        return this.f7741n;
    }
}
