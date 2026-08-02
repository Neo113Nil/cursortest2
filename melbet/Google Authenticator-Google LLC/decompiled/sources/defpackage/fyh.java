package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyh implements gdn {
    public final gzp a;
    public final Executor b;
    private final fwm c;

    public fyh(fwm fwmVar, gzp gzpVar, Executor executor) {
        this.c = fwmVar;
        this.a = gzpVar;
        this.b = executor;
    }

    @Override // defpackage.gdn
    public final htz a() {
        fwm fwmVar = this.c;
        fuy fuyVar = (fuy) fwmVar.b;
        hvi d = fuyVar.d();
        fvr fvrVar = new fvr(fwmVar, 1);
        huf hufVar = huf.a;
        hvi au = hoq.au(d, fvrVar, hufVar);
        hvi at = hoq.at(fuyVar.d(), new esh(12), hufVar);
        return new htz(hnu.aY(au, at).b(gvx.b(new cap(this, au, at, 11)), this.b));
    }

    @Override // defpackage.gdn
    public final hvi b() {
        return ((fuy) this.c.b).a();
    }
}
