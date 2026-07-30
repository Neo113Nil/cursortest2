package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogCommonConfirmBinding implements ViewBinding {

    @NonNull
    public final Button btnCancel;

    @NonNull
    public final Button btnOk;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvTitle;

    private DialogCommonConfirmBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.btnCancel = button;
        this.btnOk = button2;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static DialogCommonConfirmBinding bind(@NonNull View view) {
        int i8 = R.id.btn_cancel;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_cancel);
        if (button != null) {
            i8 = R.id.btn_Ok;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_Ok);
            if (button2 != null) {
                i8 = R.id.tv_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                if (textView != null) {
                    i8 = R.id.tv_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView2 != null) {
                        return new DialogCommonConfirmBinding((RelativeLayout) view, button, button2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogCommonConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogCommonConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_common_confirm, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
