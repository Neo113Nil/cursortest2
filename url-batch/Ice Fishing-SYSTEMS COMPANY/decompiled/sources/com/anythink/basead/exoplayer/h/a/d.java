package com.anythink.basead.exoplayer.h.a;

import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.p;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
final class d extends p {

    /* renamed from: c, reason: collision with root package name */
    private final a f7614c;

    public d(ae aeVar, a aVar) {
        super(aeVar);
        C0544a.b(aeVar.c() == 1);
        C0544a.b(aeVar.b() == 1);
        this.f7614c = aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
    public final ae.a a(int i, ae.a aVar, boolean z8) {
        this.f7916b.a(i, aVar, z8);
        aVar.a(aVar.f6499a, aVar.f6500b, aVar.f6501c, aVar.f6502d, aVar.b(), this.f7614c);
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
    public final ae.b a(int i, ae.b bVar, boolean z8, long j9) {
        ae.b a9 = super.a(i, bVar, z8, j9);
        if (a9.i == com.anythink.basead.exoplayer.b.f6539b) {
            a9.i = this.f7614c.f7570k;
        }
        return a9;
    }
}
