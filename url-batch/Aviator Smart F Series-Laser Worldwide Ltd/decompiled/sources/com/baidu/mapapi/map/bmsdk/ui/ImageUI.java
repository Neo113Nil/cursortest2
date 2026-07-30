package com.baidu.mapapi.map.bmsdk.ui;

import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import com.baidu.platform.comapi.bmsdk.ui.BmImageUI;

/* loaded from: classes2.dex */
public class ImageUI extends BaseUI {

    /* renamed from: c, reason: collision with root package name */
    private BmImageUI f6483c;

    public ImageUI() {
        BmImageUI bmImageUI = new BmImageUI();
        this.f6483c = bmImageUI;
        bmImageUI.a(this);
    }

    @Override // com.baidu.mapapi.map.bmsdk.ui.BaseUI
    public BmBaseUI getBmBaseUI() {
        return this.f6483c;
    }

    public void setClickable(boolean z7) {
        this.f6483c.a(z7);
    }

    public void setColor(int i8) {
        this.f6483c.j(i8);
    }

    public void setDrawableResource(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            return;
        }
        this.f6483c.b(new BmBitmapResource(bitmapDescriptor.getBitmap()));
    }

    public void setHeight(int i8) {
        this.f6483c.f(i8);
    }

    public void setMargin(int i8, int i9, int i10, int i11) {
        this.f6483c.a(i8, i9, i10, i11);
    }

    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f6483c.b(i8, i9, i10, i11);
    }

    public void setWidth(int i8) {
        this.f6483c.i(i8);
    }
}
