package com.facebook.ads.internal.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.util.CrashUtils;

/* loaded from: classes.dex */
public class r extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f5921a;

    /* renamed from: b, reason: collision with root package name */
    private float f5922b;

    /* renamed from: c, reason: collision with root package name */
    private float f5923c;

    public r(Context context, int i) {
        super(context);
        this.f5923c = 8.0f;
        setMaxLines(i);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.setMaxLines(this.f5921a + 1);
        super.setTextSize(this.f5922b);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        measure(View.MeasureSpec.makeMeasureSpec(i5, CrashUtils.ErrorDialogData.SUPPRESSED), View.MeasureSpec.makeMeasureSpec(i6, 0));
        if (getMeasuredHeight() > i6) {
            float f = this.f5922b;
            while (f > this.f5923c) {
                f -= 0.5f;
                super.setTextSize(f);
                measure(View.MeasureSpec.makeMeasureSpec(i5, CrashUtils.ErrorDialogData.SUPPRESSED), 0);
                if (getMeasuredHeight() <= i6 && getLineCount() <= this.f5921a) {
                    break;
                }
            }
        }
        super.setMaxLines(this.f5921a);
        setMeasuredDimension(i5, i6);
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        this.f5921a = i;
        super.setMaxLines(i);
    }

    public void setMinTextSize(float f) {
        this.f5923c = f;
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        this.f5922b = f;
        super.setTextSize(f);
    }
}
