package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogSleepNapTipsBinding implements ViewBinding {

    @NonNull
    public final View ivClose;

    @NonNull
    public final View line;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvTitle;

    private DialogSleepNapTipsBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.ivClose = view;
        this.line = view2;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static DialogSleepNapTipsBinding bind(@NonNull View view) {
        int i8 = R.id.iv_close;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.iv_close);
        if (findChildViewById != null) {
            i8 = R.id.line;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.line);
            if (findChildViewById2 != null) {
                i8 = R.id.tv_description;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                if (textView != null) {
                    i8 = R.id.tv_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView2 != null) {
                        return new DialogSleepNapTipsBinding((RelativeLayout) view, findChildViewById, findChildViewById2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogSleepNapTipsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogSleepNapTipsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_sleep_nap_tips, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
