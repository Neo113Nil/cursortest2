package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gvw implements hut {
    final /* synthetic */ guq a;
    final /* synthetic */ hut b;

    public gvw(guq guqVar, hut hutVar) {
        this.a = guqVar;
        this.b = hutVar;
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        th.getClass();
        guq g = gta.g(gta.a(), this.a);
        try {
            this.b.a(th);
        } finally {
        }
    }

    @Override // defpackage.hut
    public final void b(Object obj) {
        guq g = gta.g(gta.a(), this.a);
        try {
            this.b.b(obj);
        } finally {
        }
    }
}
