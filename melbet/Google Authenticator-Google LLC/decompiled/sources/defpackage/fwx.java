package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwx implements jrw {
    private final jsb a;

    public fwx(jsb jsbVar) {
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gpm b() {
        Executor executor = (Executor) this.a.b();
        gpl a = gpm.a();
        a.a = "TikTokAccountStoreMigration";
        a.d(fxe.a);
        a.c = executor;
        return a.a();
    }
}
