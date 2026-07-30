package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class ActivityGameListBinding implements ViewBinding {
    public final ImageView btnBack;
    public final ImageView ivBackground;
    public final RelativeLayout main;
    public final RelativeLayout rlNativeAd;
    public final RelativeLayout rlToolbar;
    private final RelativeLayout rootView;
    public final RecyclerView rvGameList;
    public final TextView tvCategoryTitle;
    public final TextView tvNativeAd;

    private ActivityGameListBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.btnBack = imageView;
        this.ivBackground = imageView2;
        this.main = relativeLayout2;
        this.rlNativeAd = relativeLayout3;
        this.rlToolbar = relativeLayout4;
        this.rvGameList = recyclerView;
        this.tvCategoryTitle = textView;
        this.tvNativeAd = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGameListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGameListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_game_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGameListBinding bind(View view) {
        int i = R.id.btnBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivBackground;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = R.id.rlNativeAd;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout2 != null) {
                    i = R.id.rlToolbar;
                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout3 != null) {
                        i = R.id.rvGameList;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.tvCategoryTitle;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tvNativeAd;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new ActivityGameListBinding(relativeLayout, imageView, imageView2, relativeLayout, relativeLayout2, relativeLayout3, recyclerView, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
