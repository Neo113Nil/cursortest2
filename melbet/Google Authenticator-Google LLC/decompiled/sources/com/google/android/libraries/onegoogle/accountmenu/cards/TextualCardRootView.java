package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.chip.Chip;
import defpackage.edb;
import defpackage.efu;
import defpackage.efw;

/* compiled from: PG */
/* loaded from: classes2.dex */
class TextualCardRootView extends FrameLayout implements efw {
    private Chip a;
    private Chip b;
    private edb c;
    private edb d;
    private int e;

    public TextualCardRootView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (Chip) findViewById(R.id.og_text_card_action);
        this.b = (Chip) findViewById(R.id.og_text_card_secondary_action);
        this.c = new edb(this.a);
        this.d = new edb(this.b);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != this.e) {
            this.e = size;
            this.c.b(size);
            this.d.b(this.e);
        }
        super.onMeasure(i, i2);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // defpackage.efw
    public final void b(efu efuVar) {
    }

    @Override // defpackage.efw
    public final void e(efu efuVar) {
    }
}
