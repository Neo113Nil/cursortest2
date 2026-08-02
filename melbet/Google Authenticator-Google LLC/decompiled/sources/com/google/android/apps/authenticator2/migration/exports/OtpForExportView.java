package com.google.android.apps.authenticator2.migration.exports;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.bvn;
import defpackage.byl;
import defpackage.bym;
import defpackage.byo;
import defpackage.byp;
import defpackage.byy;
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
public final class OtpForExportView extends byy implements gjg {
    private byo a;
    private Context b;

    @Deprecated
    public OtpForExportView(Context context) {
        super(context);
        e();
    }

    private final void e() {
        if (this.a == null) {
            this.a = ((byp) hnu.bh(this, byp.class)).d();
            hoq.ae(this);
            byo byoVar = this.a;
            hoq.Y(R.id.tiktok_event_view_listeners, this, bym.class, new bvn(byoVar, 9));
            hoq.Y(R.id.tiktok_event_view_listeners, this, byl.class, new bvn(byoVar, 10));
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
    public final byo z() {
        byo byoVar = this.a;
        if (byoVar != null) {
            return byoVar;
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

    public OtpForExportView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OtpForExportView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OtpForExportView(gkc gkcVar) {
        super(gkcVar);
        e();
    }
}
