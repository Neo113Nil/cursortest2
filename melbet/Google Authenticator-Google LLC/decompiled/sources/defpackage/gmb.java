package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gmb extends jqq {
    private final bd a;

    public gmb(bd bdVar) {
        super(bdVar);
        this.a = bdVar;
    }

    public static final void b(bd bdVar, jll jllVar) {
        jqq.g(bdVar);
        Bundle bundle = bdVar.n;
        jllVar.getClass();
        imi.d(bundle, "TIKTOK_FRAGMENT_ARGUMENT", jllVar);
    }

    public static final void c(bd bdVar, String str) {
        jqq.g(bdVar);
        Bundle bundle = bdVar.n;
        str.getClass();
        bundle.putString("TIKTOK_FRAGMENT_ARGUMENT", str);
    }

    @Override // defpackage.jqq
    protected final Object a() {
        gty aA = hoq.aA(196, this.a.getClass(), "TTFCM#Component");
        try {
            Object a = super.a();
            aA.close();
            return a;
        } catch (Throwable th) {
            try {
                aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.jqq
    protected final void d(bd bdVar) {
        Class<?> cls = bdVar.getClass();
        bg D = bdVar.D();
        cls.getSimpleName();
        D.getClass();
        hoq.M(bdVar.D() instanceof glp, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", bdVar.getClass().getSimpleName(), bdVar.D().getClass().getSimpleName());
    }
}
