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
public final class ItemEditInfoBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout rlEditInfo;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvEditDataText;

    @NonNull
    public final TextView tvEditTitle;

    private ItemEditInfoBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.rlEditInfo = relativeLayout2;
        this.tvEditDataText = textView;
        this.tvEditTitle = textView2;
    }

    @NonNull
    public static ItemEditInfoBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i8 = R.id.tv_edit_data_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_edit_data_text);
        if (textView != null) {
            i8 = R.id.tv_edit_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_edit_title);
            if (textView2 != null) {
                return new ItemEditInfoBinding(relativeLayout, relativeLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemEditInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemEditInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_edit_info, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
