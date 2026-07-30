package com.moyoung.dafit.module.common.baseui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.moyoung.dafit.module.common.R$id;
import com.moyoung.dafit.module.common.R$layout;

/* loaded from: classes4.dex */
public class r {
    private View noDataView;
    private final View viewRoot;

    public r(View view) {
        this.viewRoot = view;
    }

    public void hide() {
        View view = this.noDataView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void show() {
        show(null);
    }

    public void show(String str) {
        View view = this.noDataView;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        View view2 = this.viewRoot;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            View inflate = LayoutInflater.from(view2.getContext()).inflate(R$layout.no_data_view, viewGroup, false);
            this.noDataView = inflate;
            viewGroup.addView(inflate);
            if (str != null) {
                ((TextView) this.noDataView.findViewById(R$id.tv_tips)).setText(str);
            }
        }
    }
}
