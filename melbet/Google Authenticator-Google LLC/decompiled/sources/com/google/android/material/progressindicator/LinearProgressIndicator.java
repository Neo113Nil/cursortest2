package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.fla;
import defpackage.flb;
import defpackage.flp;
import defpackage.flx;
import defpackage.fly;
import defpackage.fmb;
import defpackage.fmf;
import defpackage.fmg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LinearProgressIndicator extends fla {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        fly flyVar = new fly((fmg) this.a);
        Context context2 = getContext();
        fmg fmgVar = (fmg) this.a;
        setIndeterminateDrawable(new flx(context2, fmgVar, flyVar, fmgVar.q == 0 ? new fmb(fmgVar) : new fmf(context2, fmgVar)));
        setProgressDrawable(new flp(getContext(), (fmg) this.a, flyVar));
        this.f = true;
    }

    @Override // defpackage.fla
    public final /* synthetic */ flb a(Context context, AttributeSet attributeSet) {
        return new fmg(context, attributeSet);
    }

    @Override // defpackage.fla
    public final void g(int i) {
        flb flbVar = this.a;
        if (flbVar != null && ((fmg) flbVar).q == 0 && isIndeterminate()) {
            return;
        }
        super.g(i);
    }

    @Override // defpackage.fla, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fmg fmgVar = (fmg) this.a;
        int i5 = fmgVar.r;
        boolean z2 = true;
        if (i5 != 1 && ((getLayoutDirection() != 1 || i5 != 2) && (getLayoutDirection() != 0 || i5 != 3))) {
            z2 = false;
        }
        fmgVar.s = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        flx indeterminateDrawable = getIndeterminateDrawable();
        int i5 = i - paddingLeft;
        int i6 = i2 - paddingTop;
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, i5, i6);
        }
        flp progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, i5, i6);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}
