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
public final class DialogRemindAgreePrivacyPolicyBinding implements ViewBinding {

    @NonNull
    public final TextView btnAgree;

    @NonNull
    public final TextView btnDisagree;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvTitle;

    private DialogRemindAgreePrivacyPolicyBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = frameLayout;
        this.btnAgree = textView;
        this.btnDisagree = textView2;
        this.tvContent = textView3;
        this.tvTitle = textView4;
    }

    @NonNull
    public static DialogRemindAgreePrivacyPolicyBinding bind(@NonNull View view) {
        int i8 = R.id.btn_agree;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btn_agree);
        if (textView != null) {
            i8 = R.id.btn_disagree;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.btn_disagree);
            if (textView2 != null) {
                i8 = R.id.tv_content;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                if (textView3 != null) {
                    i8 = R.id.tv_title;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView4 != null) {
                        return new DialogRemindAgreePrivacyPolicyBinding((FrameLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogRemindAgreePrivacyPolicyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogRemindAgreePrivacyPolicyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_remind_agree_privacy_policy, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
