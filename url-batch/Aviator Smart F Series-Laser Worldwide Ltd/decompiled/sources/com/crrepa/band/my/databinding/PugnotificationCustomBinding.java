package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class PugnotificationCustomBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout notificationContentInformation;

    @NonNull
    public final FrameLayout notificationContentMain;

    @NonNull
    public final ImageView notificationImgBackground;

    @NonNull
    public final ImageView notificationImgIcon;

    @NonNull
    public final TextView notificationTextMessage;

    @NonNull
    public final TextView notificationTextTitle;

    @NonNull
    private final FrameLayout rootView;

    private PugnotificationCustomBinding(@NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = frameLayout;
        this.notificationContentInformation = relativeLayout;
        this.notificationContentMain = frameLayout2;
        this.notificationImgBackground = imageView;
        this.notificationImgIcon = imageView2;
        this.notificationTextMessage = textView;
        this.notificationTextTitle = textView2;
    }

    @NonNull
    public static PugnotificationCustomBinding bind(@NonNull View view) {
        int i8 = R.id.notification_content_information;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.notification_content_information);
        if (relativeLayout != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i8 = R.id.notification_img_background;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.notification_img_background);
            if (imageView != null) {
                i8 = R.id.notification_img_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.notification_img_icon);
                if (imageView2 != null) {
                    i8 = R.id.notification_text_message;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.notification_text_message);
                    if (textView != null) {
                        i8 = R.id.notification_text_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.notification_text_title);
                        if (textView2 != null) {
                            return new PugnotificationCustomBinding(frameLayout, relativeLayout, frameLayout, imageView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static PugnotificationCustomBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static PugnotificationCustomBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.pugnotification_custom, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
