package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.SingleLineZoomTextView;

/* loaded from: classes2.dex */
public final class ItemStockSettingBinding implements ViewBinding {

    @NonNull
    public final ImageView ivSort;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvClosed;

    @NonNull
    public final TextView tvCurrency;

    @NonNull
    public final TextView tvExchange;

    @NonNull
    public final TextView tvMarkup;

    @NonNull
    public final SingleLineZoomTextView tvRegularMarketPrice;

    @NonNull
    public final SingleLineZoomTextView tvShortName;

    @NonNull
    public final TextView tvSymbol;

    private ItemStockSettingBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SingleLineZoomTextView singleLineZoomTextView, @NonNull SingleLineZoomTextView singleLineZoomTextView2, @NonNull TextView textView5) {
        this.rootView = relativeLayout;
        this.ivSort = imageView;
        this.tvClosed = textView;
        this.tvCurrency = textView2;
        this.tvExchange = textView3;
        this.tvMarkup = textView4;
        this.tvRegularMarketPrice = singleLineZoomTextView;
        this.tvShortName = singleLineZoomTextView2;
        this.tvSymbol = textView5;
    }

    @NonNull
    public static ItemStockSettingBinding bind(@NonNull View view) {
        int i8 = R.id.iv_sort;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sort);
        if (imageView != null) {
            i8 = R.id.tv_closed;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_closed);
            if (textView != null) {
                i8 = R.id.tv_currency;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_currency);
                if (textView2 != null) {
                    i8 = R.id.tv_exchange;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_exchange);
                    if (textView3 != null) {
                        i8 = R.id.tv_markup;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_markup);
                        if (textView4 != null) {
                            i8 = R.id.tv_regular_market_price;
                            SingleLineZoomTextView singleLineZoomTextView = (SingleLineZoomTextView) ViewBindings.findChildViewById(view, R.id.tv_regular_market_price);
                            if (singleLineZoomTextView != null) {
                                i8 = R.id.tv_short_name;
                                SingleLineZoomTextView singleLineZoomTextView2 = (SingleLineZoomTextView) ViewBindings.findChildViewById(view, R.id.tv_short_name);
                                if (singleLineZoomTextView2 != null) {
                                    i8 = R.id.tv_symbol;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_symbol);
                                    if (textView5 != null) {
                                        return new ItemStockSettingBinding((RelativeLayout) view, imageView, textView, textView2, textView3, textView4, singleLineZoomTextView, singleLineZoomTextView2, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemStockSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemStockSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_stock_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
