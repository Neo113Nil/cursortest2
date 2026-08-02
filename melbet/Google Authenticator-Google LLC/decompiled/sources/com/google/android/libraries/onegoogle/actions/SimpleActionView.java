package com.google.android.libraries.onegoogle.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.efu;
import defpackage.efw;
import defpackage.gyf;
import defpackage.gzp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SimpleActionView extends LinearLayout implements efw {
    public gzp a;

    public SimpleActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = gyf.a;
    }

    @Override // defpackage.efw
    public final void b(efu efuVar) {
        if (this.a.f()) {
            efuVar.c(this, ((Integer) this.a.b()).intValue());
        }
    }

    @Override // defpackage.efw
    public final void e(efu efuVar) {
        if (this.a.f()) {
            efuVar.e(this);
        }
    }

    public SimpleActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleActionView(Context context) {
        this(context, null);
    }
}
