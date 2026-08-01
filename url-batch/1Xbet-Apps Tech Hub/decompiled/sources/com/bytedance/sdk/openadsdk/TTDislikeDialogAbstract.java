package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class TTDislikeDialogAbstract extends Dialog {
    private String Jd;
    private String icD;
    private View pvs;
    private List<FilterWord> vG;

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    public abstract int[] getTTDislikeListViewIds();

    public TTDislikeDialogAbstract(Context context) {
        super(context);
    }

    public TTDislikeDialogAbstract(Context context, int i, String str) {
        super(context, i);
        this.Jd = str;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View layoutView = getLayoutView();
        this.pvs = layoutView;
        if (layoutView == null) {
            throw new IllegalArgumentException("getLayoutView,layout  may be abnormal, please check");
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.pvs;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
        pvs();
    }

    private void pvs() {
        if (this.vG == null || this.pvs == null) {
            return;
        }
        int[] tTDislikeListViewIds = getTTDislikeListViewIds();
        if (tTDislikeListViewIds == null || tTDislikeListViewIds.length <= 0) {
            throw new IllegalArgumentException("The options list of dislike is empty, please set TTDislikeListView");
        }
        for (int i : tTDislikeListViewIds) {
            View findViewById = this.pvs.findViewById(i);
            if (findViewById == null) {
                throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id,please check");
            }
            if (!(findViewById instanceof TTDislikeListView)) {
                throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id , please check");
            }
            TTDislikeListView tTDislikeListView = (TTDislikeListView) findViewById;
            tTDislikeListView.setMaterialMeta(this.icD);
            tTDislikeListView.setDislikeSource(this.Jd);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.icD = str;
        this.vG = list;
        pvs();
    }
}
