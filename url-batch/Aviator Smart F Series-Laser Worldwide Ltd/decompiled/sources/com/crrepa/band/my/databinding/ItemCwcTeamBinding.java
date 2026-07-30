package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemCwcTeamBinding implements ViewBinding {

    @NonNull
    public final View border;

    @NonNull
    public final CheckBox cbSelect;

    @NonNull
    public final ImageView ivFlag;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvTeamName;

    private ItemCwcTeamBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull CheckBox checkBox, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.border = view;
        this.cbSelect = checkBox;
        this.ivFlag = imageView;
        this.tvTeamName = textView;
    }

    @NonNull
    public static ItemCwcTeamBinding bind(@NonNull View view) {
        int i8 = R.id.border;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.border);
        if (findChildViewById != null) {
            i8 = R.id.cb_select;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_select);
            if (checkBox != null) {
                i8 = R.id.iv_flag;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_flag);
                if (imageView != null) {
                    i8 = R.id.tv_team_name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_team_name);
                    if (textView != null) {
                        return new ItemCwcTeamBinding((RelativeLayout) view, findChildViewById, checkBox, imageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemCwcTeamBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemCwcTeamBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_cwc_team, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
