package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class brt extends di implements jrr {
    private volatile jqi p;
    private final Object q = new Object();
    public boolean o = false;

    public brt() {
        s(new dh((di) this, 10));
    }

    @Override // defpackage.jrr
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final jqi b() {
        if (this.p == null) {
            synchronized (this.q) {
                if (this.p == null) {
                    this.p = y();
                }
            }
        }
        return this.p;
    }

    @Override // defpackage.jrq
    public final Object C() {
        return b().C();
    }

    @Override // defpackage.ng, defpackage.aeh
    public final agh N() {
        return iwg.a(this, super.N());
    }

    @Override // defpackage.bg, defpackage.ng, defpackage.cp, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b().e();
    }

    @Override // defpackage.di, defpackage.bg, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        b().d();
    }

    protected jqi y() {
        throw null;
    }
}
