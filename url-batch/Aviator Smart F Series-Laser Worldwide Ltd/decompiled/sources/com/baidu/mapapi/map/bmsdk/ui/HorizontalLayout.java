package com.baidu.mapapi.map.bmsdk.ui;

import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import com.baidu.platform.comapi.bmsdk.ui.BmHorizontalLayout;

/* loaded from: classes2.dex */
public class HorizontalLayout extends GroupUI {

    /* renamed from: c, reason: collision with root package name */
    private final BmHorizontalLayout f6482c = new BmHorizontalLayout();

    @Override // com.baidu.mapapi.map.bmsdk.ui.GroupUI
    public void addView(BaseUI baseUI) {
        if (baseUI == null) {
            return;
        }
        this.f6482c.a(baseUI.getBmBaseUI());
    }

    @Override // com.baidu.mapapi.map.bmsdk.ui.GroupUI, com.baidu.mapapi.map.bmsdk.ui.BaseUI
    public BmBaseUI getBmBaseUI() {
        return this.f6482c;
    }

    public void setBackground(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            return;
        }
        this.f6482c.a(new BmBitmapResource(bitmapDescriptor.getBitmap()));
    }

    public void setBackgroundColor(int i8) {
        this.f6482c.b(i8);
    }

    public void setClickable(boolean z7) {
        this.f6482c.a(z7);
    }

    public void setGravity(UIGravity uIGravity) {
        this.f6482c.e(uIGravity.getNumber());
    }

    public void setMargin(int i8, int i9, int i10, int i11) {
        this.f6482c.a(i8, i9, i10, i11);
    }

    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f6482c.b(i8, i9, i10, i11);
    }
}
