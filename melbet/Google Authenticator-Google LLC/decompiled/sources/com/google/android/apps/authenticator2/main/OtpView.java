package com.google.android.apps.authenticator2.main;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.bvw;
import defpackage.bvx;
import defpackage.bwl;
import defpackage.gjg;
import defpackage.gkc;
import defpackage.glp;
import defpackage.glx;
import defpackage.hnu;
import defpackage.hoq;
import defpackage.jrg;
import defpackage.jrq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OtpView extends bwl implements gjg {
    private bvw a;
    private Context b;

    @Deprecated
    public OtpView(Context context) {
        super(context);
        e();
    }

    private final void e() {
        if (this.a == null) {
            this.a = ((bvx) hnu.bh(this, bvx.class)).c();
            Context context = getContext();
            while ((context instanceof ContextWrapper) && !(context instanceof jrq) && !(context instanceof jrg) && !(context instanceof glx)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof glp) {
                return;
            }
            throw new IllegalStateException("TikTok View " + getClass().toString() + ", cannot be attached to a non-TikTok Fragment");
        }
    }

    @Override // defpackage.gjg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bvw z() {
        bvw bvwVar = this.a;
        if (bvwVar != null) {
            return bvwVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (hnu.be(getContext())) {
            Context bf = hnu.bf(this);
            Context context = this.b;
            if (context == null) {
                this.b = bf;
                return;
            }
            boolean z = true;
            if (context != bf && !hnu.bg(context)) {
                z = false;
            }
            hoq.I(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    public OtpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OtpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OtpView(gkc gkcVar) {
        super(gkcVar);
        e();
    }
}
