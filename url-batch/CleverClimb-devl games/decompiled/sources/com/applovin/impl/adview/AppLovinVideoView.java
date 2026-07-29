package com.applovin.impl.adview;

import android.content.Context;
import android.widget.VideoView;

/* loaded from: classes.dex */
public class AppLovinVideoView extends VideoView implements r {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f2461a;

    /* renamed from: b, reason: collision with root package name */
    private int f2462b;

    /* renamed from: c, reason: collision with root package name */
    private int f2463c;

    /* renamed from: d, reason: collision with root package name */
    private float f2464d;

    public AppLovinVideoView(Context context, com.applovin.impl.sdk.j jVar) {
        super(context, null, 0);
        this.f2462b = 0;
        this.f2463c = 0;
        this.f2464d = 0.0f;
        this.f2461a = jVar;
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f2462b <= 0 || this.f2463c <= 0 || ((Boolean) this.f2461a.a(com.applovin.impl.sdk.b.b.fc)).booleanValue()) {
            super.onMeasure(i, i2);
            return;
        }
        int defaultSize = getDefaultSize(this.f2462b, i);
        int defaultSize2 = getDefaultSize(this.f2463c, i2);
        int i3 = (int) (defaultSize / this.f2464d);
        if (defaultSize2 > i3) {
            defaultSize2 = i3;
        }
        int i4 = (int) (defaultSize2 * this.f2464d);
        if (defaultSize > i4) {
            defaultSize = i4;
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override // com.applovin.impl.adview.r
    public void setVideoSize(int i, int i2) {
        this.f2462b = i;
        this.f2463c = i2;
        this.f2464d = this.f2462b / this.f2463c;
        try {
            getHolder().setFixedSize(i, i2);
            requestLayout();
            invalidate();
        } catch (Exception unused) {
        }
    }
}
