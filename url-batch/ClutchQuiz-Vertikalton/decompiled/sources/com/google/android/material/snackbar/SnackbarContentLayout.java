package com.google.android.material.snackbar;

import A.c;
import K.S;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clutchquizarena.app.R;
import java.util.WeakHashMap;
import v0.AbstractC0372a;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f1960a;

    /* renamed from: b, reason: collision with root package name */
    public Button f1961b;

    /* renamed from: c, reason: collision with root package name */
    public int f1962c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c.x0(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0372a.f3982b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z2;
        if (i != getOrientation()) {
            setOrientation(i);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f1960a.getPaddingTop() == i2 && this.f1960a.getPaddingBottom() == i3) {
            return z2;
        }
        TextView textView = this.f1960a;
        WeakHashMap weakHashMap = S.f365a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f1961b;
    }

    public TextView getMessageView() {
        return this.f1960a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1960a = (TextView) findViewById(R.id.snackbar_text);
        this.f1961b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f1960a.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f1962c <= 0 || this.f1961b.getMeasuredWidth() <= this.f1962c) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f1962c = i;
    }
}
