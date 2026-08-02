package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gub extends guc implements gua {
    public static final guc a = new gub(null, new qy(0)).f();
    static final guc b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        gua b2 = guc.b();
        b2.a(guc.e, true);
        b = ((guc) b2).f();
    }

    @Override // defpackage.gua
    public final void a(hoq hoqVar, Object obj) {
        hoq.I(!this.d, "Can't mutate after handing to trace");
        obj.getClass();
        hoq.I(!i(hoqVar), "Key already present");
        this.c.put(hoqVar, obj);
    }
}
