package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.SingleLineZoomTextView;

/* loaded from: classes2.dex */
public final class ItemStockSearchBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCurrency;

    @NonNull
    public final TextView tvIsAdded;

    @NonNull
    public final SingleLineZoomTextView tvShortName;

    @NonNull
    public final TextView tvSymbol;

    private ItemStockSearchBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SingleLineZoomTextView singleLineZoomTextView, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.tvCurrency = textView;
        this.tvIsAdded = textView2;
        this.tvShortName = singleLineZoomTextView;
        this.tvSymbol = textView3;
    }

    @NonNull
    public static ItemStockSearchBinding bind(@NonNull View view) {
        int i8 = R.id.tv_currency;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_currency);
        if (textView != null) {
            i8 = R.id.tv_is_added;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_is_added);
            if (textView2 != null) {
                i8 = R.id.tv_short_name;
                SingleLineZoomTextView singleLineZoomTextView = (SingleLineZoomTextView) ViewBindings.findChildViewById(view, R.id.tv_short_name);
                if (singleLineZoomTextView != null) {
                    i8 = R.id.tv_symbol;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_symbol);
                    if (textView3 != null) {
                        return new ItemStockSearchBinding((RelativeLayout) view, textView, textView2, singleLineZoomTextView, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemStockSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemStockSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_stock_search, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
