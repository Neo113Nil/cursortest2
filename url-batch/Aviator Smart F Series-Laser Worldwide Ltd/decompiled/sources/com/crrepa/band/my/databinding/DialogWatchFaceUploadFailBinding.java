package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogWatchFaceUploadFailBinding implements ViewBinding {

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final LinearLayout ll;

    @NonNull
    public final LinearLayout llOperation;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvContentOnly;

    @NonNull
    public final TextView tvOk;

    private DialogWatchFaceUploadFailBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = frameLayout;
        this.ivIcon = imageView;
        this.ll = linearLayout;
        this.llOperation = linearLayout2;
        this.tvContent = textView;
        this.tvContentOnly = textView2;
        this.tvOk = textView3;
    }

    @NonNull
    public static DialogWatchFaceUploadFailBinding bind(@NonNull View view) {
        int i8 = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon);
        if (imageView != null) {
            i8 = R.id.ll;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll);
            if (linearLayout != null) {
                i8 = R.id.ll_operation;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_operation);
                if (linearLayout2 != null) {
                    i8 = R.id.tv_content;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                    if (textView != null) {
                        i8 = R.id.tv_content_only;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content_only);
                        if (textView2 != null) {
                            i8 = R.id.tv_ok;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ok);
                            if (textView3 != null) {
                                return new DialogWatchFaceUploadFailBinding((FrameLayout) view, imageView, linearLayout, linearLayout2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogWatchFaceUploadFailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogWatchFaceUploadFailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_watch_face_upload_fail, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
