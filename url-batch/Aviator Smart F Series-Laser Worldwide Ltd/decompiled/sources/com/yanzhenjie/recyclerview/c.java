package com.yanzhenjie.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;

/* loaded from: classes4.dex */
abstract class c {
    private int direction;
    protected a mChecker = new a();
    private View menuView;

    public static final class a {
        public boolean shouldResetSwipe;

        /* renamed from: x, reason: collision with root package name */
        public int f16618x;

        /* renamed from: y, reason: collision with root package name */
        public int f16619y;
    }

    public c(int i8, View view) {
        this.direction = i8;
        this.menuView = view;
    }

    public abstract void autoCloseMenu(OverScroller overScroller, int i8, int i9);

    public abstract void autoOpenMenu(OverScroller overScroller, int i8, int i9);

    public boolean canSwipe() {
        View view = this.menuView;
        return (view instanceof ViewGroup) && ((ViewGroup) view).getChildCount() > 0;
    }

    public abstract a checkXY(int i8, int i9);

    public int getDirection() {
        return this.direction;
    }

    public View getMenuView() {
        return this.menuView;
    }

    public int getMenuWidth() {
        return this.menuView.getWidth();
    }

    public abstract boolean isClickOnContentView(int i8, float f8);

    public boolean isCompleteClose(int i8) {
        return i8 == 0 && (-getMenuView().getWidth()) * getDirection() != 0;
    }

    public abstract boolean isMenuOpen(int i8);

    public abstract boolean isMenuOpenNotEqual(int i8);
}
