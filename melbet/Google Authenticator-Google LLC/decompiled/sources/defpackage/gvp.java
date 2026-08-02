package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gvp implements htv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gvp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [htv, java.lang.Object] */
    @Override // defpackage.htv
    public final Object a(bry bryVar, Object obj) {
        if (this.c != 0) {
            gdm gdmVar = (gdm) obj;
            if (cbp.f(gdmVar, (geh) this.a, (Instant) this.b)) {
                return gdmVar.c();
            }
            throw new IllegalStateException("fetchAndStore() did not produce a cache hit");
        }
        ?? r0 = this.a;
        long j = gvx.a;
        bryVar.getClass();
        guq g = gta.g(gta.a(), r0);
        try {
            return this.b.a(bryVar, obj);
        } finally {
        }
    }
}
