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
public final class ItemBandTrainingRecordSyncBinding implements ViewBinding {

    @NonNull
    public final ImageView ivHide;

    @NonNull
    public final ImageView ivSyncStatus;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvNotDisplay;

    @NonNull
    public final TextView tvTitle;

    private ItemBandTrainingRecordSyncBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.ivHide = imageView;
        this.ivSyncStatus = imageView2;
        this.tvContent = textView;
        this.tvNotDisplay = textView2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static ItemBandTrainingRecordSyncBinding bind(@NonNull View view) {
        int i8 = R.id.iv_hide;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_hide);
        if (imageView != null) {
            i8 = R.id.iv_sync_status;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sync_status);
            if (imageView2 != null) {
                i8 = R.id.tv_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                if (textView != null) {
                    i8 = R.id.tv_not_display;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_display);
                    if (textView2 != null) {
                        i8 = R.id.tv_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView3 != null) {
                            return new ItemBandTrainingRecordSyncBinding((RelativeLayout) view, imageView, imageView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandTrainingRecordSyncBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandTrainingRecordSyncBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_training_record_sync, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
