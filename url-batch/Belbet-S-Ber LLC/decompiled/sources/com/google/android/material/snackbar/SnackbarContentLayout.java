package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b4.l;
import com.gdmhkmf.belbet.R;
import r1.a;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public TextView f1196f;

    /* renamed from: g, reason: collision with root package name */
    public Button f1197g;
    public Button h;
    public int i;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.W(context, R.attr.motionEasingEmphasizedInterpolator, a.f3206b);
    }

    public final boolean a(int i, int i4, int i5) {
        boolean z4;
        if (i != getOrientation()) {
            setOrientation(i);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f1196f.getPaddingTop() == i4 && this.f1196f.getPaddingBottom() == i5) {
            return z4;
        }
        TextView textView = this.f1196f;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i4, textView.getPaddingEnd(), i5);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i4, textView.getPaddingRight(), i5);
        return true;
    }

    public Button getActionView() {
        return this.f1197g;
    }

    public Button getCloseView() {
        return this.h;
    }

    public TextView getMessageView() {
        return this.f1196f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1196f = (TextView) findViewById(R.id.snackbar_text);
        this.f1197g = (Button) findViewById(R.id.snackbar_action);
        this.h = (Button) findViewById(R.id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f1196f.getLayout();
        boolean z4 = layout != null && layout.getLineCount() > 1;
        if (!z4 || this.i <= 0 || this.f1197g.getMeasuredWidth() <= this.i) {
            if (!z4) {
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
        this.i = i;
    }
}
