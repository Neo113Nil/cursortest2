package com.google.android.material.snackbar;

import H1.l;
import K.Q;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fortunequest.neontrack.R;
import java.util.WeakHashMap;
import y0.AbstractC0395a;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f2357a;

    /* renamed from: b, reason: collision with root package name */
    public Button f2358b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f2359c;
    public int d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2359c = l.c0(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0395a.f4571b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z2;
        if (i != getOrientation()) {
            setOrientation(i);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f2357a.getPaddingTop() == i2 && this.f2357a.getPaddingBottom() == i3) {
            return z2;
        }
        TextView textView = this.f2357a;
        WeakHashMap weakHashMap = Q.f578a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f2358b;
    }

    public TextView getMessageView() {
        return this.f2357a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2357a = (TextView) findViewById(R.id.snackbar_text);
        this.f2358b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f2357a.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.d <= 0 || this.f2358b.getMeasuredWidth() <= this.d) {
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
        this.d = i;
    }
}
