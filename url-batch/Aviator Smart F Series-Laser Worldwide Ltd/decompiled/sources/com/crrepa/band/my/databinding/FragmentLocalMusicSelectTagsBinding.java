package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentLocalMusicSelectTagsBinding implements ViewBinding {

    @NonNull
    public final FragmentContainerView fragmentContainer;

    @NonNull
    public final IncludeLocalMusicSelectEmptyBinding includeNoData;

    @NonNull
    public final IncludeLocalMusicSearchBinding includeSearch;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rv;

    private FragmentLocalMusicSelectTagsBinding(@NonNull RelativeLayout relativeLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull IncludeLocalMusicSelectEmptyBinding includeLocalMusicSelectEmptyBinding, @NonNull IncludeLocalMusicSearchBinding includeLocalMusicSearchBinding, @NonNull RecyclerView recyclerView) {
        this.rootView = relativeLayout;
        this.fragmentContainer = fragmentContainerView;
        this.includeNoData = includeLocalMusicSelectEmptyBinding;
        this.includeSearch = includeLocalMusicSearchBinding;
        this.rv = recyclerView;
    }

    @NonNull
    public static FragmentLocalMusicSelectTagsBinding bind(@NonNull View view) {
        int i8 = R.id.fragmentContainer;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, R.id.fragmentContainer);
        if (fragmentContainerView != null) {
            i8 = R.id.include_no_data;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_no_data);
            if (findChildViewById != null) {
                IncludeLocalMusicSelectEmptyBinding bind = IncludeLocalMusicSelectEmptyBinding.bind(findChildViewById);
                i8 = R.id.include_search;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_search);
                if (findChildViewById2 != null) {
                    IncludeLocalMusicSearchBinding bind2 = IncludeLocalMusicSearchBinding.bind(findChildViewById2);
                    i8 = R.id.rv;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv);
                    if (recyclerView != null) {
                        return new FragmentLocalMusicSelectTagsBinding((RelativeLayout) view, fragmentContainerView, bind, bind2, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentLocalMusicSelectTagsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentLocalMusicSelectTagsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_local_music_select_tags, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
