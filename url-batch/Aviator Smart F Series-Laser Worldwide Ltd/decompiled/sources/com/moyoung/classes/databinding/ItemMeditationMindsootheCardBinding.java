package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class ItemMeditationMindsootheCardBinding implements ViewBinding {

    @NonNull
    public final ImageView ivCover;

    @NonNull
    private final CardView rootView;

    private ItemMeditationMindsootheCardBinding(@NonNull CardView cardView, @NonNull ImageView imageView) {
        this.rootView = cardView;
        this.ivCover = imageView;
    }

    @NonNull
    public static ItemMeditationMindsootheCardBinding bind(@NonNull View view) {
        int i8 = R$id.iv_cover;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            return new ItemMeditationMindsootheCardBinding((CardView) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemMeditationMindsootheCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemMeditationMindsootheCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.item_meditation_mindsoothe_card, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
