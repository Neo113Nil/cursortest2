package com.google.android.apps.authenticator2.editotp;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.bop;
import defpackage.bqb;
import defpackage.bqc;
import defpackage.bqd;
import defpackage.bqe;
import defpackage.bra;
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
public final class AccountView extends bra implements gjg {
    private bqd a;
    private Context b;

    @Deprecated
    public AccountView(Context context) {
        super(context);
        e();
    }

    private final void e() {
        if (this.a == null) {
            this.a = ((bqe) hnu.bh(this, bqe.class)).a();
            hoq.ae(this);
            bqd bqdVar = this.a;
            hoq.Y(R.id.tiktok_event_view_listeners, this, bqb.class, new bop(bqdVar, 2));
            hoq.Y(R.id.tiktok_event_view_listeners, this, bqc.class, new bop(bqdVar, 3));
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
    public final bqd z() {
        bqd bqdVar = this.a;
        if (bqdVar != null) {
            return bqdVar;
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

    public AccountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AccountView(gkc gkcVar) {
        super(gkcVar);
        e();
    }
}
