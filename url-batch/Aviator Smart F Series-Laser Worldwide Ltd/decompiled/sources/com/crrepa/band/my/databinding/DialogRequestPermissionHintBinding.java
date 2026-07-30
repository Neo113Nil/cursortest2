package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogRequestPermissionHintBinding implements ViewBinding {

    @NonNull
    public final LinearLayout ll;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvTitle;

    private DialogRequestPermissionHintBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = frameLayout;
        this.ll = linearLayout;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static DialogRequestPermissionHintBinding bind(@NonNull View view) {
        int i8 = R.id.ll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll);
        if (linearLayout != null) {
            i8 = R.id.tv_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
            if (textView != null) {
                i8 = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView2 != null) {
                    return new DialogRequestPermissionHintBinding((FrameLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogRequestPermissionHintBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogRequestPermissionHintBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_request_permission_hint, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
