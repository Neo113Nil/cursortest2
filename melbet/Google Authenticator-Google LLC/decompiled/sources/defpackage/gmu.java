package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gmu implements jrw {
    private final jsb a;

    public gmu(jsb jsbVar) {
        this.a = jsbVar;
    }

    public static void c(frv frvVar) {
        hoq.I(frvVar != null, "Null propagated AccountId! Check that you have included one of the following modules:\n\t//java/com/google/apps/tiktok/account:module\n\t//java/com/google/apps/tiktok/account/testing:module");
        frvVar.getClass();
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final frv b() {
        frv frvVar = (frv) ((jrx) this.a).a;
        c(frvVar);
        return frvVar;
    }
}
