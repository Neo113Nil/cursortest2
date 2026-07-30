package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogGomoreSportTipsBinding implements ViewBinding {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvTitle;

    private DialogGomoreSportTipsBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = frameLayout;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static DialogGomoreSportTipsBinding bind(@NonNull View view) {
        int i8 = R.id.tv_description;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
        if (textView != null) {
            i8 = R.id.tv_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
            if (textView2 != null) {
                return new DialogGomoreSportTipsBinding((FrameLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogGomoreSportTipsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogGomoreSportTipsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_gomore_sport_tips, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
