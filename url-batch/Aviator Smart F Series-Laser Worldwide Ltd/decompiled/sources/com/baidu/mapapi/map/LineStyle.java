package com.baidu.mapapi.map;

import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;

/* loaded from: classes2.dex */
public class LineStyle {

    /* renamed from: a, reason: collision with root package name */
    BmLineStyle f5925a;

    /* renamed from: b, reason: collision with root package name */
    int f5926b;

    /* renamed from: c, reason: collision with root package name */
    int f5927c;

    /* renamed from: d, reason: collision with root package name */
    TextureOption f5928d;

    public LineStyle() {
        if (!OverlayUtil.isOverlayUpgrade()) {
            throw new NullPointerException("BDMapSDKException: LineStyle must be used in Overlay2.0");
        }
        this.f5925a = new BmLineStyle();
    }

    public void setBitmapResource(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null && OverlayUtil.isOverlayUpgrade()) {
            this.f5925a.a(new BmBitmapResource(bitmapDescriptor.getBitmap()));
        }
    }

    public void setColor(int i8) {
        this.f5926b = i8;
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f5925a.a(i8);
        }
    }

    public void setTextureOption(TextureOption textureOption) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f5928d = textureOption;
            this.f5925a.c(textureOption.ordinal());
        }
    }

    public void setWidth(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f5927c = i8 / 2;
            this.f5925a.a(i8);
        }
    }
}
