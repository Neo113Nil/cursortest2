package com.google.android.apps.authenticator2.main;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.btt;
import defpackage.btu;
import defpackage.bwj;
import defpackage.fhq;
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
public final class CountdownIndicatorView extends bwj implements gjg {
    private btt a;
    private Context b;

    @Deprecated
    public CountdownIndicatorView(Context context) {
        super(context);
        f();
    }

    private final btt e() {
        f();
        return this.a;
    }

    private final void f() {
        if (this.a == null) {
            this.a = ((btu) hnu.bh(this, btu.class)).b();
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
    public final btt z() {
        btt bttVar = this.a;
        if (bttVar != null) {
            return bttVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.View
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
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        btt e = e();
        double d = e.c.a * 360.0d;
        Paint paint = e.a;
        paint.setColor(fhq.d(e.b, R.attr.colorPrimary, -16776961));
        float f = (float) d;
        canvas.drawArc(e.d, 270.0f - f, f, true, paint);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e().d = new RectF(1.0f, 1.0f, i - 1, i2 - 1);
    }

    public CountdownIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CountdownIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CountdownIndicatorView(gkc gkcVar) {
        super(gkcVar);
        f();
    }
}
