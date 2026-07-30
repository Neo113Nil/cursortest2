package com.yanzhenjie.recyclerview;

import android.view.View;
import android.widget.OverScroller;
import com.yanzhenjie.recyclerview.c;

/* loaded from: classes4.dex */
class d extends c {
    public d(View view) {
        super(1, view);
    }

    @Override // com.yanzhenjie.recyclerview.c
    public void autoCloseMenu(OverScroller overScroller, int i8, int i9) {
        overScroller.startScroll(-Math.abs(i8), 0, Math.abs(i8), 0, i9);
    }

    @Override // com.yanzhenjie.recyclerview.c
    public void autoOpenMenu(OverScroller overScroller, int i8, int i9) {
        overScroller.startScroll(Math.abs(i8), 0, getMenuView().getWidth() - Math.abs(i8), 0, i9);
    }

    @Override // com.yanzhenjie.recyclerview.c
    public c.a checkXY(int i8, int i9) {
        c.a aVar = this.mChecker;
        aVar.f16618x = i8;
        aVar.f16619y = i9;
        aVar.shouldResetSwipe = false;
        if (i8 == 0) {
            aVar.shouldResetSwipe = true;
        }
        if (i8 >= 0) {
            aVar.f16618x = 0;
        }
        if (aVar.f16618x <= (-getMenuView().getWidth())) {
            this.mChecker.f16618x = -getMenuView().getWidth();
        }
        return this.mChecker;
    }

    @Override // com.yanzhenjie.recyclerview.c
    public boolean isClickOnContentView(int i8, float f8) {
        return f8 > ((float) getMenuView().getWidth());
    }

    @Override // com.yanzhenjie.recyclerview.c
    public boolean isMenuOpen(int i8) {
        int direction = (-getMenuView().getWidth()) * getDirection();
        return i8 <= direction && direction != 0;
    }

    @Override // com.yanzhenjie.recyclerview.c
    public boolean isMenuOpenNotEqual(int i8) {
        return i8 < (-getMenuView().getWidth()) * getDirection();
    }
}
