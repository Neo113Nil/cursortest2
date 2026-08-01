package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gglhk.bofio.fortunetiger.R;
import k3.m;
import m1.a;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public TextView f1389f;
    public Button g;
    public Button h;

    /* renamed from: i, reason: collision with root package name */
    public int f1390i;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.R(context, R.attr.motionEasingEmphasizedInterpolator, a.f2906b);
    }

    public final boolean a(int i4, int i5, int i6) {
        boolean z3;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f1389f.getPaddingTop() == i5 && this.f1389f.getPaddingBottom() == i6) {
            return z3;
        }
        TextView textView = this.f1389f;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i5, textView.getPaddingEnd(), i6);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i5, textView.getPaddingRight(), i6);
        return true;
    }

    public Button getActionView() {
        return this.g;
    }

    public Button getCloseView() {
        return this.h;
    }

    public TextView getMessageView() {
        return this.f1389f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1389f = (TextView) findViewById(R.id.snackbar_text);
        this.g = (Button) findViewById(R.id.snackbar_action);
        this.h = (Button) findViewById(R.id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f1389f.getLayout();
        boolean z3 = layout != null && layout.getLineCount() > 1;
        if (!z3 || this.f1390i <= 0 || this.g.getMeasuredWidth() <= this.f1390i) {
            if (!z3) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i4, i5);
    }

    public void setMaxInlineActionWidth(int i4) {
        this.f1390i = i4;
    }
}
