package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bsm extends ezx implements jrr {
    private volatile jqi q;
    private final Object r = new Object();
    public boolean o = false;

    public bsm() {
        s(new dh((di) this, 13));
    }

    protected jqi A() {
        throw null;
    }

    @Override // defpackage.jrq
    public final Object C() {
        return b().C();
    }

    @Override // defpackage.ng, defpackage.aeh
    public final agh N() {
        return iwg.a(this, super.N());
    }

    @Override // defpackage.ezx, defpackage.bg, defpackage.ng, defpackage.cp, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b().e();
    }

    @Override // defpackage.ezx, defpackage.di, defpackage.bg, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        b().d();
    }

    @Override // defpackage.jrr
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final jqi b() {
        if (this.q == null) {
            synchronized (this.r) {
                if (this.q == null) {
                    this.q = A();
                }
            }
        }
        return this.q;
    }
}
