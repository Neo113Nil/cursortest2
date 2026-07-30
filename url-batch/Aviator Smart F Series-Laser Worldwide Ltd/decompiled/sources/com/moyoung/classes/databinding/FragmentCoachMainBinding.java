package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes4.dex */
public final class FragmentCoachMainBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final ShadowLayout slRefresh;

    @NonNull
    public final TextView tvNetError;

    @NonNull
    public final TextView tvRefresh;

    private FragmentCoachMainBinding(@NonNull RelativeLayout relativeLayout, @NonNull RecyclerView recyclerView, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.rv = recyclerView;
        this.slRefresh = shadowLayout;
        this.tvNetError = textView;
        this.tvRefresh = textView2;
    }

    @NonNull
    public static FragmentCoachMainBinding bind(@NonNull View view) {
        int i8 = R$id.rv;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
        if (recyclerView != null) {
            i8 = R$id.sl_refresh;
            ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, i8);
            if (shadowLayout != null) {
                i8 = R$id.tv_net_error;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView != null) {
                    i8 = R$id.tv_refresh;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                    if (textView2 != null) {
                        return new FragmentCoachMainBinding((RelativeLayout) view, recyclerView, shadowLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentCoachMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentCoachMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.fragment_coach_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
