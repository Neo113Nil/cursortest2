package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.fla;
import defpackage.flb;
import defpackage.flc;
import defpackage.fln;
import defpackage.flp;
import defpackage.flx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CircularProgressIndicator extends fla {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        flc flcVar = new flc((fln) this.a);
        setIndeterminateDrawable(flx.a(getContext(), (fln) this.a, flcVar));
        setProgressDrawable(new flp(getContext(), (fln) this.a, flcVar));
        this.f = true;
    }

    @Override // defpackage.fla
    public final /* synthetic */ flb a(Context context, AttributeSet attributeSet) {
        return new fln(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
