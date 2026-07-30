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
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogPrivacyBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAgree;

    @NonNull
    public final TextView tvDisagree;

    @NonNull
    public final TextView tvStatementTermsContent;

    private DialogPrivacyBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.tvAgree = textView;
        this.tvDisagree = textView2;
        this.tvStatementTermsContent = textView3;
    }

    @NonNull
    public static DialogPrivacyBinding bind(@NonNull View view) {
        int i8 = R.id.tv_agree;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_agree);
        if (textView != null) {
            i8 = R.id.tv_disagree;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_disagree);
            if (textView2 != null) {
                i8 = R.id.tv_statement_terms_content;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_statement_terms_content);
                if (textView3 != null) {
                    return new DialogPrivacyBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogPrivacyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogPrivacyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_privacy, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
