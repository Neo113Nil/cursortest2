package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentLocalMusicSelectSongsBinding implements ViewBinding {

    @NonNull
    public final IncludeLocalMusicSelectEmptyBinding includeNoData;

    @NonNull
    public final IncludeLocalMusicSearchBinding includeSearch;

    @NonNull
    public final View lineSelectedTagTitle;

    @NonNull
    public final LinearLayout llSongs;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final TextView tvSelectedTagTitle;

    private FragmentLocalMusicSelectSongsBinding(@NonNull RelativeLayout relativeLayout, @NonNull IncludeLocalMusicSelectEmptyBinding includeLocalMusicSelectEmptyBinding, @NonNull IncludeLocalMusicSearchBinding includeLocalMusicSearchBinding, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.includeNoData = includeLocalMusicSelectEmptyBinding;
        this.includeSearch = includeLocalMusicSearchBinding;
        this.lineSelectedTagTitle = view;
        this.llSongs = linearLayout;
        this.rv = recyclerView;
        this.tvSelectedTagTitle = textView;
    }

    @NonNull
    public static FragmentLocalMusicSelectSongsBinding bind(@NonNull View view) {
        int i8 = R.id.include_no_data;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_no_data);
        if (findChildViewById != null) {
            IncludeLocalMusicSelectEmptyBinding bind = IncludeLocalMusicSelectEmptyBinding.bind(findChildViewById);
            i8 = R.id.include_search;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_search);
            if (findChildViewById2 != null) {
                IncludeLocalMusicSearchBinding bind2 = IncludeLocalMusicSearchBinding.bind(findChildViewById2);
                i8 = R.id.line_selected_tag_title;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.line_selected_tag_title);
                if (findChildViewById3 != null) {
                    i8 = R.id.ll_songs;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_songs);
                    if (linearLayout != null) {
                        i8 = R.id.rv;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv);
                        if (recyclerView != null) {
                            i8 = R.id.tv_selected_tag_title;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_selected_tag_title);
                            if (textView != null) {
                                return new FragmentLocalMusicSelectSongsBinding((RelativeLayout) view, bind, bind2, findChildViewById3, linearLayout, recyclerView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentLocalMusicSelectSongsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentLocalMusicSelectSongsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_local_music_select_songs, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
