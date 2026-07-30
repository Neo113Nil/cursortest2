package com.crrepa.band.my.device.stock.adapter;

import android.text.TextUtils;
import android.widget.TextView;
import com.baidu.ar.util.SystemInfoUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.stock.model.StockModel;
import com.crrepa.band.my.device.stock.model.StockSearchBean;

/* loaded from: classes2.dex */
public class StockSearchAdapter extends BaseQuickAdapter<StockSearchBean, BaseViewHolder> {
    private String[] symbolArray;

    public StockSearchAdapter(String str) {
        super(R.layout.item_stock_search);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.symbolArray = str.split(SystemInfoUtil.COMMA);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, StockSearchBean stockSearchBean) {
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_symbol);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_short_name);
        TextView textView3 = (TextView) baseViewHolder.getView(R.id.tv_currency);
        TextView textView4 = (TextView) baseViewHolder.getView(R.id.tv_is_added);
        textView.setText(stockSearchBean.getSymbol());
        textView2.setText(stockSearchBean.getShortName());
        textView3.setText(stockSearchBean.getExchange());
        if (StockModel.isAddedSymbol(this.symbolArray, stockSearchBean.getSymbol())) {
            textView.setTextColor(getContext().getResources().getColor(R.color.assist_4_ED));
            textView2.setTextColor(getContext().getResources().getColor(R.color.assist_4_ED));
            textView3.setTextColor(getContext().getResources().getColor(R.color.assist_4_ED));
            textView4.setVisibility(0);
            return;
        }
        textView.setTextColor(getContext().getResources().getColor(R.color.assist_11_33));
        textView2.setTextColor(getContext().getResources().getColor(R.color.assist_11_33));
        textView3.setTextColor(getContext().getResources().getColor(R.color.assist_7_B3));
        textView4.setVisibility(8);
    }
}
