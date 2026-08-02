package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class cbo extends ezy implements jrr {
    private ContextWrapper d;
    private volatile jqq f;
    private boolean e = false;
    private final Object aj = new Object();
    private boolean ak = false;

    private final void aH() {
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

    @Override // defpackage.ezy, defpackage.bd
    public void X(Activity activity) {
        super.X(activity);
        ContextWrapper contextWrapper = this.d;
        boolean z = true;
        if (contextWrapper != null && jqq.e(contextWrapper) != activity) {
            z = false;
        }
        iwi.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aH();
        b().f();
        aM();
    }

    @Override // defpackage.jrr
    /* renamed from: aG, reason: merged with bridge method [inline-methods] */
    public final jqq b() {
        if (this.f == null) {
            synchronized (this.aj) {
                if (this.f == null) {
                    this.f = aL();
                }
            }
        }
        return this.f;
    }

    protected jqq aL() {
        throw null;
    }

    protected final void aM() {
        if (this.ak) {
            return;
        }
        this.ak = true;
        C();
    }

    @Override // defpackage.bd
    public void e(Context context) {
        super.e(context);
        aH();
        b().f();
        aM();
    }

    @Override // defpackage.bd
    public Context x() {
        if (super.x() == null && !this.e) {
            return null;
        }
        aH();
        return this.d;
    }
}
