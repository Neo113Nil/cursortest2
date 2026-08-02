package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gnk implements koe {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gnk(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, krt] */
    @Override // defpackage.koe, defpackage.kod
    public final Object b() {
        AutoCloseable gswVar;
        int i = this.c;
        if (i == 0) {
            ?? r0 = this.b;
            if (gta.u()) {
                gswVar = new gsw(3);
            } else {
                gta.r();
                gswVar = gta.u() ? new gsw(4) : new gsg((Object) ((gva) ((brn) ((cka) this.a).a).a).a(226, "GlideApp.with"), 5);
            }
            try {
                gut j = gta.j();
                try {
                    bah bahVar = (bah) r0.b();
                    j.close();
                    gswVar.close();
                    return bahVar;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    gswVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i == 1) {
            return (ggs) this.b.a(this.a);
        }
        if (i == 2) {
            return new gpc((cka) this.b, (frv) this.a);
        }
        ?? r2 = this.b;
        if (i == 3) {
            return guc.e(guc.d(((jsd) r2).b()), (guc) ((gva) this.a).c);
        }
        gup e = ((gva) this.a).e(269, "Create gRPC Service Impl ".concat(String.valueOf((String) r2.getKey())), gub.a);
        try {
            jwu jwuVar = (jwu) ((koe) r2.getValue()).b();
            e.close();
            return jwuVar;
        } catch (Throwable th3) {
            try {
                e.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public /* synthetic */ gnk(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
