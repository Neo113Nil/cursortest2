package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public abstract class i extends c {

    /* renamed from: j, reason: collision with root package name */
    public final long f7737j;

    public i(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j9, long j10, long j11) {
        super(hVar, kVar, mVar, i, obj, j9, j10);
        C0544a.a(mVar);
        this.f7737j = j11;
    }

    public long e() {
        long j9 = this.f7737j;
        if (j9 != -1) {
            return j9 + 1;
        }
        return -1L;
    }

    public abstract boolean f();
}
