package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i8.m;
import k2.InterfaceC4644o;
import t2.w;

/* loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC4644o f23742n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23743u;

    /* renamed from: v, reason: collision with root package name */
    public w f23744v;

    /* renamed from: w, reason: collision with root package name */
    public ImageView.ScaleType f23745w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23746x;

    /* renamed from: y, reason: collision with root package name */
    public m f23747y;

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterfaceC4644o getMediaContent() {
        return this.f23742n;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f23746x = true;
        this.f23745w = scaleType;
        m mVar = this.f23747y;
        if (mVar != null) {
            mVar.k(scaleType);
        }
    }

    public void setMediaContent(InterfaceC4644o interfaceC4644o) {
        this.f23743u = true;
        this.f23742n = interfaceC4644o;
        w wVar = this.f23744v;
        if (wVar != null) {
            wVar.b(interfaceC4644o);
        }
    }
}
