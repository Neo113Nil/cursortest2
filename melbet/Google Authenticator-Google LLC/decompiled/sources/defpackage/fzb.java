package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
class fzb extends gln implements jrr {
    private ContextWrapper c;
    private volatile gmk e;
    private boolean d = false;
    private final Object f = new Object();
    private boolean aj = false;

    private final void a() {
        if (this.c == null) {
            this.c = new gmq(super.x(), this);
            this.d = iwd.a(super.x());
        }
    }

    @Override // defpackage.jrq
    public final Object C() {
        return b().C();
    }

    @Override // defpackage.bd, defpackage.aeh
    public final agh N() {
        return hnu.bm(this, super.N());
    }

    @Override // defpackage.bd
    public void X(Activity activity) {
        super.X(activity);
        ContextWrapper contextWrapper = this.c;
        boolean z = true;
        if (contextWrapper != null && jqq.e(contextWrapper) != activity) {
            z = false;
        }
        iwi.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        b().c();
        o();
    }

    protected gmk d() {
        throw null;
    }

    @Override // defpackage.gln, defpackage.bd
    public void e(Context context) {
        super.e(context);
        a();
        b().c();
        o();
    }

    @Override // defpackage.jrr
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final gmk b() {
        if (this.e == null) {
            synchronized (this.f) {
                if (this.e == null) {
                    this.e = d();
                }
            }
        }
        return this.e;
    }

    protected final void o() {
        if (this.aj) {
            return;
        }
        this.aj = true;
        C();
    }

    @Override // defpackage.bd
    public Context x() {
        if (super.x() == null && !this.d) {
            return null;
        }
        a();
        return this.c;
    }
}
