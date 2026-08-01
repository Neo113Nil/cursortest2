package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityFavoriteBinding implements ViewBinding {
    public final ImageView backBtn;
    public final RecyclerView favoriteRecy;
    public final ImageView noDataImg;
    public final TextView noDataTv;
    public final LinearLayout noFavoriteLayout;
    private final ConstraintLayout rootView;
    public final TextView textView;
    public final MaterialCardView topBar;

    private ActivityFavoriteBinding(ConstraintLayout rootView, ImageView backBtn, RecyclerView favoriteRecy, ImageView noDataImg, TextView noDataTv, LinearLayout noFavoriteLayout, TextView textView, MaterialCardView topBar) {
        this.rootView = rootView;
        this.backBtn = backBtn;
        this.favoriteRecy = favoriteRecy;
        this.noDataImg = noDataImg;
        this.noDataTv = noDataTv;
        this.noFavoriteLayout = noFavoriteLayout;
        this.textView = textView;
        this.topBar = topBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFavoriteBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityFavoriteBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_favorite, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityFavoriteBinding bind(View rootView) {
        int i = R.id.back_btn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_btn);
        if (imageView != null) {
            i = R.id.favorite_recy;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.favorite_recy);
            if (recyclerView != null) {
                i = R.id.no_data_img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.no_data_img);
                if (imageView2 != null) {
                    i = R.id.no_data_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.no_data_tv);
                    if (textView != null) {
                        i = R.id.no_favorite_layout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.no_favorite_layout);
                        if (linearLayout != null) {
                            i = R.id.textView;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
                            if (textView2 != null) {
                                i = R.id.top_bar;
                                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                                if (materialCardView != null) {
                                    return new ActivityFavoriteBinding((ConstraintLayout) rootView, imageView, recyclerView, imageView2, textView, linearLayout, textView2, materialCardView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
