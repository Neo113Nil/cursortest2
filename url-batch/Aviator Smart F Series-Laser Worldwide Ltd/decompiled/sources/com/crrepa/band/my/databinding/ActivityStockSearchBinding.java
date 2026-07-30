package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityStockSearchBinding implements ViewBinding {

    @NonNull
    public final EditText etInput;

    @NonNull
    public final RelativeLayout rlInput;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rvStock;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvClear;

    private ActivityStockSearchBinding(@NonNull RelativeLayout relativeLayout, @NonNull EditText editText, @NonNull RelativeLayout relativeLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.etInput = editText;
        this.rlInput = relativeLayout2;
        this.rvStock = recyclerView;
        this.tvCancel = textView;
        this.tvClear = textView2;
    }

    @NonNull
    public static ActivityStockSearchBinding bind(@NonNull View view) {
        int i8 = R.id.et_input;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_input);
        if (editText != null) {
            i8 = R.id.rl_input;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_input);
            if (relativeLayout != null) {
                i8 = R.id.rv_stock;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_stock);
                if (recyclerView != null) {
                    i8 = R.id.tv_cancel;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
                    if (textView != null) {
                        i8 = R.id.tv_clear;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_clear);
                        if (textView2 != null) {
                            return new ActivityStockSearchBinding((RelativeLayout) view, editText, relativeLayout, recyclerView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityStockSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityStockSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_stock_search, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
