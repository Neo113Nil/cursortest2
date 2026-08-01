package com.google.android.material.snackbar;

import a.y;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;
import o1.a;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public TextView f1005f;

    /* renamed from: g, reason: collision with root package name */
    public Button f1006g;

    /* renamed from: h, reason: collision with root package name */
    public int f1007h;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        y.S(context, R.attr.motionEasingEmphasizedInterpolator, a.f2865b);
    }

    public final boolean a(int i, int i4, int i5) {
        boolean z3;
        if (i != getOrientation()) {
            setOrientation(i);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f1005f.getPaddingTop() == i4 && this.f1005f.getPaddingBottom() == i5) {
            return z3;
        }
        TextView textView = this.f1005f;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i4, textView.getPaddingEnd(), i5);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i4, textView.getPaddingRight(), i5);
        return true;
    }

    public Button getActionView() {
        return this.f1006g;
    }

    public TextView getMessageView() {
        return this.f1005f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1005f = (TextView) findViewById(R.id.snackbar_text);
        this.f1006g = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f1005f.getLayout();
        boolean z3 = layout != null && layout.getLineCount() > 1;
        if (!z3 || this.f1007h <= 0 || this.f1006g.getMeasuredWidth() <= this.f1007h) {
            if (!z3) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i4);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f1007h = i;
    }
}
