package com.anythink.basead.mixad.b;

/* loaded from: classes.dex */
public final class g extends a implements com.anythink.core.common.l.c.a.f {

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.core.common.l.b.a.a f9663b;

    @Override // com.anythink.core.common.l.c.a.f
    public final com.anythink.core.common.l.e.a.c a() {
        try {
            com.anythink.core.common.l.e.a.a aVar = this.f9658a;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.anythink.core.common.l.c.a.f
    public final com.anythink.core.common.l.b.a.c b() {
        com.anythink.core.common.l.b.a.a aVar = this.f9663b;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    @Override // com.anythink.core.common.l.c.a.f
    public final void a(com.anythink.core.common.l.b.a.a aVar) {
        this.f9663b = aVar;
    }
}
