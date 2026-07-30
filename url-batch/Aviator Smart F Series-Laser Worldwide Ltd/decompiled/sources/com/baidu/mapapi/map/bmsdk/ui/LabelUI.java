package com.baidu.mapapi.map.bmsdk.ui;

import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.TextStyle;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import com.baidu.platform.comapi.bmsdk.ui.BmLabelUI;

/* loaded from: classes2.dex */
public class LabelUI extends BaseUI {

    /* renamed from: c, reason: collision with root package name */
    private BmLabelUI f6484c;

    /* renamed from: d, reason: collision with root package name */
    private TextStyle f6485d;

    public LabelUI() {
        BmLabelUI bmLabelUI = new BmLabelUI();
        this.f6484c = bmLabelUI;
        bmLabelUI.a(this);
    }

    @Override // com.baidu.mapapi.map.bmsdk.ui.BaseUI
    public BmBaseUI getBmBaseUI() {
        return this.f6484c;
    }

    public TextStyle getStyle() {
        return this.f6485d;
    }

    public String getText() {
        return this.f6484c.b();
    }

    public void setBackground(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            return;
        }
        this.f6484c.a(new BmBitmapResource(bitmapDescriptor.getBitmap()));
    }

    public void setBackgroundColor(int i8) {
        this.f6484c.b(i8);
    }

    public void setClickable(boolean z7) {
        this.f6484c.a(z7);
    }

    public void setGravity(UIGravity uIGravity) {
        this.f6484c.e(uIGravity.getNumber());
    }

    public void setHeight(int i8) {
        this.f6484c.f(i8);
    }

    public void setMargin(int i8, int i9, int i10, int i11) {
        this.f6484c.a(i8, i9, i10, i11);
    }

    public void setMaxLines(int i8) {
        this.f6484c.j(i8);
    }

    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f6484c.b(i8, i9, i10, i11);
    }

    public void setText(String str) {
        this.f6484c.b(str);
    }

    public void setTextStyle(TextStyle textStyle) {
        if (textStyle != null) {
            this.f6485d = textStyle;
            this.f6484c.a(textStyle.getBmTextStyle());
        }
    }

    public void setWidth(int i8) {
        this.f6484c.i(i8);
    }
}
