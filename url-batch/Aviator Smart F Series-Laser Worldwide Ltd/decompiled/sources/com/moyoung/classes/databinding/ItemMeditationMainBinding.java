package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class ItemMeditationMainBinding implements ViewBinding {

    @NonNull
    public final CardView cardMindsoothe;

    @NonNull
    public final ImageView ivCover;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvClass;

    @NonNull
    public final TextView tvTitle;

    private ItemMeditationMainBinding(@NonNull LinearLayout linearLayout, @NonNull CardView cardView, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.cardMindsoothe = cardView;
        this.ivCover = imageView;
        this.rvClass = recyclerView;
        this.tvTitle = textView;
    }

    @NonNull
    public static ItemMeditationMainBinding bind(@NonNull View view) {
        int i8 = R$id.card_mindsoothe;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i8);
        if (cardView != null) {
            i8 = R$id.iv_cover;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView != null) {
                i8 = R$id.rv_class;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
                if (recyclerView != null) {
                    i8 = R$id.tv_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                    if (textView != null) {
                        return new ItemMeditationMainBinding((LinearLayout) view, cardView, imageView, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemMeditationMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemMeditationMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.item_meditation_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
