package com.chad.library.adapter.base.loadmore;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.R$id;
import com.chad.library.R$layout;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class SimpleLoadMoreView extends BaseLoadMoreView {
    @Override // com.chad.library.adapter.base.loadmore.BaseLoadMoreView
    public View getLoadComplete(BaseViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
        return holder.getView(R$id.load_more_load_complete_view);
    }

    @Override // com.chad.library.adapter.base.loadmore.BaseLoadMoreView
    public View getLoadEndView(BaseViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
        return holder.getView(R$id.load_more_load_end_view);
    }

    @Override // com.chad.library.adapter.base.loadmore.BaseLoadMoreView
    public View getLoadFailView(BaseViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
        return holder.getView(R$id.load_more_load_fail_view);
    }

    @Override // com.chad.library.adapter.base.loadmore.BaseLoadMoreView
    public View getLoadingView(BaseViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
        return holder.getView(R$id.load_more_loading_view);
    }

    @Override // com.chad.library.adapter.base.loadmore.BaseLoadMoreView
    public View getRootView(ViewGroup parent) {
        s.checkNotNullParameter(parent, "parent");
        return AdapterUtilsKt.getItemView(parent, R$layout.brvah_quick_view_load_more);
    }
}
