package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.crrepa.band.aviator.R;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class ActivityLocalMusicSelectBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tab;

    @NonNull
    public final TextView tvBack;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvSave;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final ViewPager vp;

    private ActivityLocalMusicSelectBinding(@NonNull LinearLayout linearLayout, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ViewPager viewPager) {
        this.rootView = linearLayout;
        this.tab = tabLayout;
        this.tvBack = textView;
        this.tvDescription = textView2;
        this.tvSave = textView3;
        this.tvTitle = textView4;
        this.vp = viewPager;
    }

    @NonNull
    public static ActivityLocalMusicSelectBinding bind(@NonNull View view) {
        int i8 = R.id.tab;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tab);
        if (tabLayout != null) {
            i8 = R.id.tv_back;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_back);
            if (textView != null) {
                i8 = R.id.tv_description;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                if (textView2 != null) {
                    i8 = R.id.tv_save;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_save);
                    if (textView3 != null) {
                        i8 = R.id.tv_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView4 != null) {
                            i8 = R.id.vp;
                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.vp);
                            if (viewPager != null) {
                                return new ActivityLocalMusicSelectBinding((LinearLayout) view, tabLayout, textView, textView2, textView3, textView4, viewPager);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityLocalMusicSelectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityLocalMusicSelectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_local_music_select, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
