package com.moyoung.dafit.module.common.baseui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moyoung.dafit.module.common.R$layout;

/* loaded from: classes4.dex */
public class s {
    private View progressBarView;
    private final View viewRoot;

    public s(View view) {
        this.viewRoot = view;
    }

    public void hide() {
        View view = this.progressBarView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void show() {
        View view = this.progressBarView;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        View view2 = this.viewRoot;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            View inflate = LayoutInflater.from(view2.getContext()).inflate(R$layout.page_loading_view, viewGroup, false);
            this.progressBarView = inflate;
            viewGroup.addView(inflate);
            this.progressBarView.setClickable(true);
        }
    }
}
