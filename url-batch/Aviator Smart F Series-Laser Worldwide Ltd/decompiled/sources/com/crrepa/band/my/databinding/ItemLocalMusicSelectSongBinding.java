package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemLocalMusicSelectSongBinding implements ViewBinding {

    @NonNull
    public final CheckBox cbSelect;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvArtist;

    @NonNull
    public final TextView tvTitle;

    private ItemLocalMusicSelectSongBinding(@NonNull RelativeLayout relativeLayout, @NonNull CheckBox checkBox, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.cbSelect = checkBox;
        this.tvArtist = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static ItemLocalMusicSelectSongBinding bind(@NonNull View view) {
        int i8 = R.id.cb_select;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_select);
        if (checkBox != null) {
            i8 = R.id.tv_artist;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_artist);
            if (textView != null) {
                i8 = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView2 != null) {
                    return new ItemLocalMusicSelectSongBinding((RelativeLayout) view, checkBox, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemLocalMusicSelectSongBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemLocalMusicSelectSongBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_local_music_select_song, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
