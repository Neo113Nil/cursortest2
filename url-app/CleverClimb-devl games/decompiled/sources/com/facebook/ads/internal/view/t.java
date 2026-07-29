package com.facebook.ads.internal.view;

import android.content.Context;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class t extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f5926a;

    /* renamed from: b, reason: collision with root package name */
    private int f5927b;

    public t(Context context) {
        super(context);
        this.f5926a = 0;
        this.f5927b = 0;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f5927b > 0 && getMeasuredWidth() > this.f5927b) {
            i3 = this.f5927b;
        } else if (getMeasuredWidth() >= this.f5926a) {
            return;
        } else {
            i3 = this.f5926a;
        }
        setMeasuredDimension(i3, getMeasuredHeight());
    }

    public void setMaxWidth(int i) {
        this.f5927b = i;
    }

    public void setMinWidth(int i) {
        this.f5926a = i;
    }
}
