package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogPermissionRequestHintBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llChoice;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvPermit;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvTitleHint;

    private DialogPermissionRequestHintBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = constraintLayout;
        this.llChoice = linearLayout;
        this.tvCancel = textView;
        this.tvPermit = textView2;
        this.tvTitle = textView3;
        this.tvTitleHint = textView4;
    }

    @NonNull
    public static DialogPermissionRequestHintBinding bind(@NonNull View view) {
        int i8 = R.id.ll_choice;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_choice);
        if (linearLayout != null) {
            i8 = R.id.tv_cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
            if (textView != null) {
                i8 = R.id.tv_permit;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_permit);
                if (textView2 != null) {
                    i8 = R.id.tv_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView3 != null) {
                        i8 = R.id.tv_title_hint;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_hint);
                        if (textView4 != null) {
                            return new DialogPermissionRequestHintBinding((ConstraintLayout) view, linearLayout, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogPermissionRequestHintBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogPermissionRequestHintBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_permission_request_hint, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
