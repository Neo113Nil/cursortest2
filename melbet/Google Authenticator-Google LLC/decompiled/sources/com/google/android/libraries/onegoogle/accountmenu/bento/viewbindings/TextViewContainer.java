package com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.edb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TextViewContainer extends FrameLayout {
    private edb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewContainer(Context context) {
        super(context);
        context.getClass();
    }

    public final edb a(TextView textView) {
        if (this.a != null) {
            throw new IllegalStateException("TextViewContainer is already initialized");
        }
        edb edbVar = new edb(textView);
        edbVar.b(getWidth());
        this.a = edbVar;
        return edbVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        edb edbVar = this.a;
        if (edbVar != null) {
            edbVar.b(size);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
