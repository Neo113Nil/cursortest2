package com.baidu.mapapi.map;

import android.graphics.Typeface;
import com.baidu.platform.comapi.bmsdk.style.BmTextStyle;

/* loaded from: classes2.dex */
public class TextStyle {

    /* renamed from: a, reason: collision with root package name */
    private BmTextStyle f6332a;

    public TextStyle() {
        if (!OverlayUtil.isOverlayUpgrade()) {
            throw new NullPointerException("BDMapSDKException: TextStyle must be used in Overlay2.0");
        }
        this.f6332a = new BmTextStyle();
    }

    public BmTextStyle getBmTextStyle() {
        return this.f6332a;
    }

    public void setBorderColor(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6332a.a(i8);
        }
    }

    public void setBorderWidth(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6332a.b(i8);
        }
    }

    public void setFontOption(Typeface typeface) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6332a.c(typeface.getStyle());
        }
    }

    public void setTextColor(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6332a.d(i8);
        }
    }

    public void setTextSize(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f6332a.e(i8);
        }
    }
}
