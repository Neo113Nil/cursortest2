package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
class brw extends glo implements jrr {
    private ContextWrapper d;
    private volatile jqq f;
    private boolean e = false;
    private final Object aj = new Object();
    private boolean ak = false;

    private final void n() {
        if (this.d == null) {
            this.d = new jrg(super.x(), this);
            this.e = iwd.a(super.x());
        }
    }

    @Override // defpackage.jrq
    public final Object C() {
        return b().C();
    }

    @Override // defpackage.bd, defpackage.aeh
    public final agh N() {
        return iwg.b(this, super.N());
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
        n();
        b().f();
        p();
    }

    @Override // defpackage.jrr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jqq b() {
        if (this.f == null) {
            synchronized (this.aj) {
                if (this.f == null) {
                    this.f = d();
                }
            }
        }
        return this.f;
    }

    protected jqq d() {
        throw null;
    }

    @Override // defpackage.glo, defpackage.bd
    public void e(Context context) {
        super.e(context);
        n();
        b().f();
        p();
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
        n();
        return this.d;
    }
}
