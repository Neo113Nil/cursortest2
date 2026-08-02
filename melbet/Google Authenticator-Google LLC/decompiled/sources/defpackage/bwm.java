package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes2.dex */
class bwm extends ezz implements jrr {
    private ContextWrapper ak;
    private volatile gmk am;
    private boolean al = false;
    private final Object an = new Object();
    private boolean ao = false;

    private final void aF() {
        if (this.ak == null) {
            this.ak = new gmq(super.x(), this);
            this.al = iwd.a(super.x());
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

    @Override // defpackage.ezz, defpackage.bd
    public void X(Activity activity) {
        super.X(activity);
        ContextWrapper contextWrapper = this.ak;
        boolean z = true;
        if (contextWrapper != null && jqq.e(contextWrapper) != activity) {
            z = false;
        }
        iwi.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aF();
        b().c();
        aM();
    }

    protected gmk aG() {
        throw null;
    }

    @Override // defpackage.jrr
    /* renamed from: aL, reason: merged with bridge method [inline-methods] */
    public final gmk b() {
        if (this.am == null) {
            synchronized (this.an) {
                if (this.am == null) {
                    this.am = aG();
                }
            }
        }
        return this.am;
    }

    protected final void aM() {
        if (this.ao) {
            return;
        }
        this.ao = true;
        C();
    }

    @Override // defpackage.ar, defpackage.bd
    public LayoutInflater bv(Bundle bundle) {
        LayoutInflater bv = super.bv(bundle);
        return bv.cloneInContext(new gmq(bv, this));
    }

    @Override // defpackage.ar, defpackage.bd
    public void e(Context context) {
        super.e(context);
        aF();
        b().c();
        aM();
    }

    @Override // defpackage.bd
    public Context x() {
        if (super.x() == null && !this.al) {
            return null;
        }
        aF();
        return this.ak;
    }
}
