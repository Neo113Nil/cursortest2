package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snovikpovik.vuevnxsj.R;
import g5.a;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public TextView f1958d;

    /* renamed from: e, reason: collision with root package name */
    public Button f1959e;

    /* renamed from: f, reason: collision with root package name */
    public int f1960f;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r.R(context, R.attr.motionEasingEmphasizedInterpolator, a.f3032b);
    }

    public final boolean a(int i, int i8, int i9) {
        boolean z3;
        if (i != getOrientation()) {
            setOrientation(i);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f1958d.getPaddingTop() == i8 && this.f1958d.getPaddingBottom() == i9) {
            return z3;
        }
        TextView textView = this.f1958d;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i8, textView.getPaddingEnd(), i9);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i8, textView.getPaddingRight(), i9);
        return true;
    }

    public Button getActionView() {
        return this.f1959e;
    }

    public TextView getMessageView() {
        return this.f1958d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1958d = (TextView) findViewById(R.id.snackbar_text);
        this.f1959e = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f1958d.getLayout();
        boolean z3 = layout != null && layout.getLineCount() > 1;
        if (!z3 || this.f1960f <= 0 || this.f1959e.getMeasuredWidth() <= this.f1960f) {
            if (!z3) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i8);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f1960f = i;
    }
}
