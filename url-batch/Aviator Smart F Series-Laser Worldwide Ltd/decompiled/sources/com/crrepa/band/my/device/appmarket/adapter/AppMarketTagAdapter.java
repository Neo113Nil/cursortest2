package com.crrepa.band.my.device.appmarket.adapter;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.appmarket.model.AppMarketMixResp;
import java.util.Collection;

/* loaded from: classes2.dex */
public class AppMarketTagAdapter extends BaseQuickAdapter<AppMarketMixResp.Tag, BaseViewHolder> {
    public AppMarketTagAdapter() {
        super(R.layout.item_app_market_tag);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, AppMarketMixResp.Tag tag) {
        baseViewHolder.setText(R.id.tv_name, tag.name);
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R.id.rv_app);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, 0, false));
        AppMarketAppAdapter appMarketAppAdapter = new AppMarketAppAdapter(true);
        recyclerView.setAdapter(appMarketAppAdapter);
        appMarketAppAdapter.addData((Collection) tag.apps);
    }
}
