package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxo implements gpu {
    public static final hkh a = hkh.l("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet");
    public static final long b;
    public final fuy c;
    public final fuq d;
    public final hvl e;
    public final hvl f;
    public final fwm g;
    public final ikm h;
    private final hum i;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        b = 2592000000L;
    }

    public fxo(fwm fwmVar, fuy fuyVar, fuq fuqVar, hvl hvlVar, hvl hvlVar2, ikm ikmVar, hum humVar) {
        this.g = fwmVar;
        this.c = fuyVar;
        this.d = fuqVar;
        this.e = hvlVar;
        this.f = hvlVar2;
        this.h = ikmVar;
        this.i = humVar;
    }

    public final hvi a() {
        return this.i.a(gvx.b(new fxs(this, 1)), this.f);
    }

    @Override // defpackage.gpu
    public final hvi b() {
        htq b2 = gvx.b(new cbc(this, 20));
        hvl hvlVar = this.e;
        return hso.f(hnu.aN(b2, hvlVar), Throwable.class, gvx.a(new fxn(1)), hvlVar);
    }
}
