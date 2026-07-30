package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class FragmentMeditationMainBinding implements ViewBinding {

    @NonNull
    public final IncludeMeditationMindsootheCardBinding includeMindsoothe;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final TextView tvNetError;

    private FragmentMeditationMainBinding(@NonNull RelativeLayout relativeLayout, @NonNull IncludeMeditationMindsootheCardBinding includeMeditationMindsootheCardBinding, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.includeMindsoothe = includeMeditationMindsootheCardBinding;
        this.rv = recyclerView;
        this.tvNetError = textView;
    }

    @NonNull
    public static FragmentMeditationMainBinding bind(@NonNull View view) {
        int i8 = R$id.include_mindsoothe;
        View findChildViewById = ViewBindings.findChildViewById(view, i8);
        if (findChildViewById != null) {
            IncludeMeditationMindsootheCardBinding bind = IncludeMeditationMindsootheCardBinding.bind(findChildViewById);
            int i9 = R$id.rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i9);
            if (recyclerView != null) {
                i9 = R$id.tv_net_error;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i9);
                if (textView != null) {
                    return new FragmentMeditationMainBinding((RelativeLayout) view, bind, recyclerView, textView);
                }
            }
            i8 = i9;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentMeditationMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentMeditationMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.fragment_meditation_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
