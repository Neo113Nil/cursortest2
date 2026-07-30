package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemLocalMusicSelectTagBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ImageView tvContinue;

    @NonNull
    public final TextView tvCount;

    @NonNull
    public final TextView tvTitle;

    private ItemLocalMusicSelectTagBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.tvContinue = imageView;
        this.tvCount = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static ItemLocalMusicSelectTagBinding bind(@NonNull View view) {
        int i8 = R.id.tv_continue;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.tv_continue);
        if (imageView != null) {
            i8 = R.id.tv_count;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_count);
            if (textView != null) {
                i8 = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView2 != null) {
                    return new ItemLocalMusicSelectTagBinding((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemLocalMusicSelectTagBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemLocalMusicSelectTagBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_local_music_select_tag, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
