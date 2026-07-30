package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.dafit.module.common.widgets.CustomRecyclerView;

/* loaded from: classes4.dex */
public final class ItemCoachActionTypeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CustomRecyclerView rvAction;

    @NonNull
    public final TextView tvTitle;

    private ItemCoachActionTypeBinding(@NonNull LinearLayout linearLayout, @NonNull CustomRecyclerView customRecyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.rvAction = customRecyclerView;
        this.tvTitle = textView;
    }

    @NonNull
    public static ItemCoachActionTypeBinding bind(@NonNull View view) {
        int i8 = R$id.rv_action;
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) ViewBindings.findChildViewById(view, i8);
        if (customRecyclerView != null) {
            i8 = R$id.tv_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
            if (textView != null) {
                return new ItemCoachActionTypeBinding((LinearLayout) view, customRecyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemCoachActionTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemCoachActionTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.item_coach_action_type, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
