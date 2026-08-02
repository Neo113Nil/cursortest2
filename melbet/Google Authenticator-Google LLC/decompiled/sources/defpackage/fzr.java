package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes2.dex */
class fzr extends ar implements jrr {
    private ContextWrapper aj;
    private volatile jqq al;
    private boolean ak = false;
    private final Object am = new Object();
    private boolean an = false;

    private final void aF() {
        if (this.aj == null) {
            this.aj = new jrg(super.x(), this);
            this.ak = iwd.a(super.x());
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

    @Override // defpackage.bd
    public void X(Activity activity) {
        super.X(activity);
        ContextWrapper contextWrapper = this.aj;
        boolean z = true;
        if (contextWrapper != null && jqq.e(contextWrapper) != activity) {
            z = false;
        }
        iwi.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aF();
        b().f();
        aM();
    }

    protected jqq aG() {
        throw null;
    }

    @Override // defpackage.jrr
    /* renamed from: aL, reason: merged with bridge method [inline-methods] */
    public final jqq b() {
        if (this.al == null) {
            synchronized (this.am) {
                if (this.al == null) {
                    this.al = aG();
                }
            }
        }
        return this.al;
    }

    protected final void aM() {
        if (this.an) {
            return;
        }
        this.an = true;
        C();
    }

    @Override // defpackage.ar, defpackage.bd
    public LayoutInflater bv(Bundle bundle) {
        LayoutInflater bv = super.bv(bundle);
        return bv.cloneInContext(new jrg(bv, this));
    }

    @Override // defpackage.ar, defpackage.bd
    public void e(Context context) {
        super.e(context);
        aF();
        b().f();
        aM();
    }

    @Override // defpackage.bd
    public Context x() {
        if (super.x() == null && !this.ak) {
            return null;
        }
        aF();
        return this.aj;
    }
}
