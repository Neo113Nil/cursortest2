package com.facebook.ads.internal.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.util.CrashUtils;

/* loaded from: classes.dex */
public class s extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private float f5924a;

    /* renamed from: b, reason: collision with root package name */
    private float f5925b;

    public s(Context context) {
        super(context);
        this.f5925b = 8.0f;
        super.setSingleLine();
        super.setMaxLines(1);
        this.f5924a = getTextSize() / com.facebook.ads.internal.q.a.v.f5438b;
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        for (float f = this.f5924a; f >= this.f5925b; f -= 0.5f) {
            super.setTextSize(f);
            measure(0, 0);
            if (getMeasuredWidth() <= i5) {
                break;
            }
        }
        if (getMeasuredWidth() > i5) {
            measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CrashUtils.ErrorDialogData.SUPPRESSED), View.MeasureSpec.makeMeasureSpec(measuredHeight, CrashUtils.ErrorDialogData.SUPPRESSED));
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
    }

    public void setMinTextSize(float f) {
        if (f <= this.f5924a) {
            this.f5925b = f;
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        this.f5924a = f;
        super.setTextSize(f);
    }
}
