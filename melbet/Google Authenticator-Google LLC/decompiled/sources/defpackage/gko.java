package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gko implements jrq {
    public static final hkh a = hkh.l("com/google/apps/tiktok/inject/account/ScreenAccountRetainedComponentManager");
    private final frv b;
    private final agl c;
    private final Object d;

    public gko(frv frvVar, gld gldVar, Object obj) {
        this.b = frvVar;
        this.c = gldVar;
        this.d = obj;
    }

    public final gkl a() {
        agj agjVar = new agj(this.c, new jqd(this, 1));
        frv frvVar = this.b;
        return (gkl) agjVar.c("tt_screen_account_retained:".concat((frvVar == null ? "null" : Integer.valueOf(frvVar.a)).toString()), gkl.class);
    }

    @Override // defpackage.jrq
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final glt C() {
        glt gltVar;
        Object c = c();
        gkl a2 = a();
        synchronized (a2.d) {
            if (a2.e == null) {
                a2.a = c;
                bnx b = ((gkk) imq.a(c, gkk.class)).b();
                b.a = (jqw) a2.f.b;
                jrm jrmVar = a2.b;
                jrmVar.getClass();
                b.b = jrmVar;
                b.c = a2.c;
                iwm.a(b.a, jqw.class);
                iwm.a(b.b, jrm.class);
                iwm.a(b.c, jrn.class);
                a2.e = new bng();
            } else if (a2.a != c) {
                ((hkf) ((hkf) a.f()).i("com/google/apps/tiktok/inject/account/ScreenAccountRetainedComponentManager$ScreenAccountRetainedComponentViewModel", "component", 242, "ScreenAccountRetainedComponentManager.java")).s("ScreenAccountRetainedComponent already created with a different ActivityAccountRetainedComponent");
            }
            gltVar = a2.e;
        }
        return gltVar;
    }

    public final Object c() {
        return ((gkn) imq.a(this.d, gkn.class)).d().b(this.b);
    }
}
