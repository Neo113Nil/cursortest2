package com.baidu.platform.comapi.bmsdk.ui;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class BmGroupUI extends BmBaseUI {

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<BmBaseUI> f8984g;

    private BmGroupUI() {
        super(32, 0L);
        this.f8984g = new ArrayList<>();
    }

    private static native boolean nativeAddView(long j8, long j9, int i8);

    private static native boolean nativeRemoveAllViews(long j8);

    @Override // com.baidu.platform.comapi.bmsdk.ui.BmBaseUI
    public BmBaseUI a(long j8) {
        if (this.nativeInstance == j8) {
            return this;
        }
        Iterator<BmBaseUI> it = this.f8984g.iterator();
        while (it.hasNext()) {
            BmBaseUI a8 = it.next().a(j8);
            if (a8 != null) {
                return a8;
            }
        }
        return null;
    }

    public BmGroupUI(int i8, long j8) {
        super(i8, j8);
        this.f8984g = new ArrayList<>();
    }

    public boolean a(BmBaseUI bmBaseUI) {
        return a(bmBaseUI, -1);
    }

    public boolean a(BmBaseUI bmBaseUI, int i8) {
        if (bmBaseUI == null) {
            return false;
        }
        if (i8 >= 0 && i8 < this.f8984g.size()) {
            this.f8984g.add(i8, bmBaseUI);
        } else {
            this.f8984g.add(bmBaseUI);
        }
        return nativeAddView(getNativeInstance(), bmBaseUI.getNativeInstance(), i8);
    }
}
