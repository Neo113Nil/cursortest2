package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
class bxs extends glo implements jrr {
    private ContextWrapper d;
    private volatile gmk f;
    private boolean e = false;
    private final Object aj = new Object();
    private boolean ak = false;

    private final void a() {
        if (this.d == null) {
            this.d = new gmq(super.x(), this);
            this.e = iwd.a(super.x());
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

    @Override // defpackage.faa, defpackage.bd
    public void X(Activity activity) {
        super.X(activity);
        ContextWrapper contextWrapper = this.d;
        boolean z = true;
        if (contextWrapper != null && jqq.e(contextWrapper) != activity) {
            z = false;
        }
        iwi.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        b().c();
        p();
    }

    @Override // defpackage.glo, defpackage.bd
    public void e(Context context) {
        super.e(context);
        a();
        b().c();
        p();
    }

    protected gmk n() {
        throw null;
    }

    @Override // defpackage.jrr
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final gmk b() {
        if (this.f == null) {
            synchronized (this.aj) {
                if (this.f == null) {
                    this.f = n();
                }
            }
        }
        return this.f;
    }

    protected final void p() {
        if (this.ak) {
            return;
        }
        this.ak = true;
        C();
    }

    @Override // defpackage.bd
    public Context x() {
        if (super.x() == null && !this.e) {
            return null;
        }
        a();
        return this.d;
    }
}
