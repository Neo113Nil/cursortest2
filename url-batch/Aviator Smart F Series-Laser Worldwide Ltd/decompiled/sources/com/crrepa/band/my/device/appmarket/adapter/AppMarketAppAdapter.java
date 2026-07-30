package com.crrepa.band.my.device.appmarket.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.baidu.mapapi.http.HttpClient;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.appmarket.AppMarketAppDetailActivity;
import com.crrepa.band.my.device.appmarket.model.AppMarketAppBean;
import com.crrepa.band.my.device.appmarket.model.AppMarketAppVersionBean;
import com.moyoung.dafit.module.common.utils.o;
import com.squareup.picasso.Picasso;

/* loaded from: classes2.dex */
public class AppMarketAppAdapter extends BaseQuickAdapter<AppMarketAppBean, BaseViewHolder> {
    private boolean fromTagAdapter;

    public AppMarketAppAdapter() {
        super(R.layout.item_app_market_app);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$0(AppMarketAppBean appMarketAppBean, View view) {
        AppMarketAppDetailActivity.start(getContext(), appMarketAppBean.version.id);
    }

    private void resizeLayoutWidth(BaseViewHolder baseViewHolder) {
        if (this.fromTagAdapter) {
            ViewGroup viewGroup = (ViewGroup) baseViewHolder.getView(R.id.ll_content);
            viewGroup.getLayoutParams().width = o.dp2px(viewGroup.getContext(), 208.0f);
        }
    }

    public AppMarketAppAdapter(boolean z7) {
        super(R.layout.item_app_market_app);
        this.fromTagAdapter = z7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, final AppMarketAppBean appMarketAppBean) {
        baseViewHolder.setText(R.id.tv_title, appMarketAppBean.name);
        baseViewHolder.setText(R.id.tv_description, appMarketAppBean.description);
        AppMarketAppVersionBean appMarketAppVersionBean = appMarketAppBean.version;
        baseViewHolder.setText(R.id.tv_size, appMarketAppVersionBean == null ? HttpClient.ENDFLAG : appMarketAppVersionBean.getBinSizeWithUnit());
        Picasso.get().load(appMarketAppBean.logo).resize(o.dp2px(getContext(), 50.0f), o.dp2px(getContext(), 50.0f)).centerCrop().placeholder(R.drawable.shape_net_img_placeholder).into((ImageView) baseViewHolder.getView(R.id.iv_logo));
        resizeLayoutWidth(baseViewHolder);
        baseViewHolder.getView(R.id.ll_content).setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.appmarket.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMarketAppAdapter.this.lambda$convert$0(appMarketAppBean, view);
            }
        });
    }
}
