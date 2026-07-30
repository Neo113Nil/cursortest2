package com.baidu.mapapi.map.bmsdk.ui;

import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.Overlay;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import com.baidu.platform.comapi.bmsdk.ui.BmFrameLayout;

/* loaded from: classes2.dex */
public class FrameLayout extends GroupUI {

    /* renamed from: c, reason: collision with root package name */
    private BmFrameLayout f6481c;

    public FrameLayout() {
        BmFrameLayout bmFrameLayout = new BmFrameLayout();
        this.f6481c = bmFrameLayout;
        bmFrameLayout.a(this);
    }

    @Override // com.baidu.mapapi.map.bmsdk.ui.GroupUI
    public void addView(BaseUI baseUI) {
        if (baseUI == null) {
            return;
        }
        this.f6481c.a(baseUI.getBmBaseUI());
    }

    @Override // com.baidu.mapapi.map.bmsdk.ui.GroupUI, com.baidu.mapapi.map.bmsdk.ui.BaseUI
    public BmBaseUI getBmBaseUI() {
        return this.f6481c;
    }

    public void setBackground(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            return;
        }
        this.f6481c.a(new BmBitmapResource(bitmapDescriptor.getBitmap()));
    }

    public void setBackgroundColor(int i8) {
        this.f6481c.b(i8);
    }

    public void setClickable(boolean z7) {
        this.f6481c.a(z7);
    }

    public void setGravity(int i8) {
        this.f6481c.e(i8);
    }

    public void setMargin(int i8, int i9, int i10, int i11) {
        this.f6481c.a(i8, i9, i10, i11);
    }

    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f6481c.b(i8, i9, i10, i11);
    }

    public void updateAddView(BaseUI baseUI, Overlay overlay) {
        if (baseUI == null || overlay == null || overlay.getBmLayer() == null) {
            return;
        }
        this.f6481c.a(baseUI.getBmBaseUI());
        overlay.getBmLayer().b();
    }

    public void updateBackground(BitmapDescriptor bitmapDescriptor, Overlay overlay) {
        if (bitmapDescriptor == null || overlay == null || overlay.getBmLayer() == null) {
            return;
        }
        this.f6481c.a(new BmBitmapResource(bitmapDescriptor.getBitmap()));
        overlay.getBmLayer().b();
    }

    public void updateBackgroundColor(int i8, Overlay overlay) {
        if (overlay == null || overlay.getBmLayer() == null) {
            return;
        }
        this.f6481c.b(i8);
        overlay.getBmLayer().b();
    }

    public void updateClickable(boolean z7, Overlay overlay) {
        if (overlay == null || overlay.getBmLayer() == null) {
            return;
        }
        this.f6481c.a(z7);
        overlay.getBmLayer().b();
    }

    public void updateGravity(int i8, Overlay overlay) {
        if (overlay == null || overlay.getBmLayer() == null) {
            return;
        }
        this.f6481c.e(i8);
        overlay.getBmLayer().b();
    }
}
