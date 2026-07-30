package com.crrepa.band.my.device.stock.adapter;

import android.widget.TextView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.stock.model.StockDetailBean;
import com.moyoung.dafit.module.common.utils.u;
import java.math.BigDecimal;
import java.util.Locale;
import t1.a;

/* loaded from: classes2.dex */
public class StockSettingAdapter extends BaseQuickAdapter<StockDetailBean, BaseViewHolder> {
    public static String languageCode = "en";

    public StockSettingAdapter() {
        super(R.layout.item_stock_setting);
        languageCode = Locale.getDefault().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, StockDetailBean stockDetailBean) {
        baseViewHolder.setText(R.id.tv_symbol, stockDetailBean.getSymbol());
        baseViewHolder.setText(R.id.tv_short_name, stockDetailBean.getShortName());
        baseViewHolder.setText(R.id.tv_exchange, stockDetailBean.getExchange());
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_regular_market_price);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_currency);
        TextView textView3 = (TextView) baseViewHolder.getView(R.id.tv_markup);
        TextView textView4 = (TextView) baseViewHolder.getView(R.id.tv_closed);
        if (stockDetailBean.isStockClosed()) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            textView4.setVisibility(0);
            return;
        }
        textView.setVisibility(0);
        textView2.setVisibility(0);
        textView3.setVisibility(0);
        textView4.setVisibility(8);
        textView.setText(a.getMoneyString(new BigDecimal(Double.toString(stockDetailBean.getRegularMarketPrice()))));
        textView2.setText(stockDetailBean.getCurrency());
        textView3.setText(a.getMoneyString(stockDetailBean.getMarkup()));
        boolean equalsIgnoreCase = "zh".equalsIgnoreCase(languageCode);
        int i8 = R.drawable.shape_stock_markup_rise_bg;
        if (equalsIgnoreCase || u.LANGUAGE_JA.equalsIgnoreCase(languageCode) ? !stockDetailBean.isRise() : stockDetailBean.isRise()) {
            i8 = R.drawable.shape_stock_markup_fall_bg;
        }
        textView3.setBackgroundResource(i8);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int i8) {
        super.onBindViewHolder((StockSettingAdapter) baseViewHolder, i8);
    }
}
