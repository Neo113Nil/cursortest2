package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class IncludeLocalMusicSearchBinding implements ViewBinding {

    @NonNull
    public final EditText etInput;

    @NonNull
    public final RelativeLayout rlSearch;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvClear;

    private IncludeLocalMusicSearchBinding(@NonNull RelativeLayout relativeLayout, @NonNull EditText editText, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.etInput = editText;
        this.rlSearch = relativeLayout2;
        this.tvClear = textView;
    }

    @NonNull
    public static IncludeLocalMusicSearchBinding bind(@NonNull View view) {
        int i8 = R.id.et_input;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_input);
        if (editText != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_clear);
            if (textView != null) {
                return new IncludeLocalMusicSearchBinding(relativeLayout, editText, relativeLayout, textView);
            }
            i8 = R.id.tv_clear;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static IncludeLocalMusicSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeLocalMusicSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.include_local_music_search, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
