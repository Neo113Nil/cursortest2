package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class IncludeMeditationMindsootheCardBinding implements ViewBinding {

    @NonNull
    public final CardView cardMindsoothe;

    @NonNull
    public final ImageView ivMindsootheBg;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final TextView tvMindsootheContent;

    @NonNull
    public final TextView tvMindsootheTitle;

    private IncludeMeditationMindsootheCardBinding(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = cardView;
        this.cardMindsoothe = cardView2;
        this.ivMindsootheBg = imageView;
        this.tvMindsootheContent = textView;
        this.tvMindsootheTitle = textView2;
    }

    @NonNull
    public static IncludeMeditationMindsootheCardBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i8 = R$id.iv_mindsoothe_bg;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.tv_mindsoothe_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
            if (textView != null) {
                i8 = R$id.tv_mindsoothe_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView2 != null) {
                    return new IncludeMeditationMindsootheCardBinding(cardView, cardView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static IncludeMeditationMindsootheCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeMeditationMindsootheCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.include_meditation_mindsoothe_card, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
