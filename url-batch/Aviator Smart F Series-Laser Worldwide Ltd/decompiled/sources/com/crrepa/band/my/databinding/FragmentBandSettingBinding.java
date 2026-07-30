package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentBandSettingBinding implements ViewBinding {

    @NonNull
    public final ImageView ivAdPreview;

    @NonNull
    public final NestedScrollView nsvContent;

    @NonNull
    public final RecyclerView rcvBandSettingList;

    @NonNull
    private final LinearLayout rootView;

    private FragmentBandSettingBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.ivAdPreview = imageView;
        this.nsvContent = nestedScrollView;
        this.rcvBandSettingList = recyclerView;
    }

    @NonNull
    public static FragmentBandSettingBinding bind(@NonNull View view) {
        int i8 = R.id.iv_ad_preview;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_ad_preview);
        if (imageView != null) {
            i8 = R.id.nsv_content;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.nsv_content);
            if (nestedScrollView != null) {
                i8 = R.id.rcv_band_setting_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_band_setting_list);
                if (recyclerView != null) {
                    return new FragmentBandSettingBinding((LinearLayout) view, imageView, nestedScrollView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentBandSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentBandSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_band_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
