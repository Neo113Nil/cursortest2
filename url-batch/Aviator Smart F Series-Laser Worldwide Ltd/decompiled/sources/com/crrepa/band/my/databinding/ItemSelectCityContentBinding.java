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

/* loaded from: classes2.dex */
public final class ItemSelectCityContentBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvName;

    @NonNull
    public final View viewLine;

    private ItemSelectCityContentBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull View view) {
        this.rootView = relativeLayout;
        this.tvName = textView;
        this.viewLine = view;
    }

    @NonNull
    public static ItemSelectCityContentBinding bind(@NonNull View view) {
        int i8 = R.id.tv_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
        if (textView != null) {
            i8 = R.id.view_line;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.view_line);
            if (findChildViewById != null) {
                return new ItemSelectCityContentBinding((RelativeLayout) view, textView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemSelectCityContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemSelectCityContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_select_city_content, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
