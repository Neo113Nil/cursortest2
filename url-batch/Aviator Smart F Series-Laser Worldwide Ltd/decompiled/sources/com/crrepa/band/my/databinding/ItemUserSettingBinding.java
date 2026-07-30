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
public final class ItemUserSettingBinding implements ViewBinding {

    @NonNull
    public final ImageView ivContinue;

    @NonNull
    public final ImageView ivSettingIcon;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvSettingContent;

    @NonNull
    public final TextView tvSettingHint;

    @NonNull
    public final TextView tvSettingName;

    @NonNull
    public final TextView tvUnreadNews;

    private ItemUserSettingBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.ivContinue = imageView;
        this.ivSettingIcon = imageView2;
        this.tvSettingContent = textView;
        this.tvSettingHint = textView2;
        this.tvSettingName = textView3;
        this.tvUnreadNews = textView4;
    }

    @NonNull
    public static ItemUserSettingBinding bind(@NonNull View view) {
        int i8 = R.id.iv_continue;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_continue);
        if (imageView != null) {
            i8 = R.id.iv_setting_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_setting_icon);
            if (imageView2 != null) {
                i8 = R.id.tv_setting_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_setting_content);
                if (textView != null) {
                    i8 = R.id.tv_setting_hint;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_setting_hint);
                    if (textView2 != null) {
                        i8 = R.id.tv_setting_name;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_setting_name);
                        if (textView3 != null) {
                            i8 = R.id.tv_unread_news;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_unread_news);
                            if (textView4 != null) {
                                return new ItemUserSettingBinding((RelativeLayout) view, imageView, imageView2, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemUserSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemUserSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_user_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
