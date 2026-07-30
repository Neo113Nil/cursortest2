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
public final class DialogPairingCodeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvPair;

    @NonNull
    public final TextView tvPairingCode;

    @NonNull
    public final TextView tvPairingHint;

    private DialogPairingCodeBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = linearLayout;
        this.tvCancel = textView;
        this.tvPair = textView2;
        this.tvPairingCode = textView3;
        this.tvPairingHint = textView4;
    }

    @NonNull
    public static DialogPairingCodeBinding bind(@NonNull View view) {
        int i8 = R.id.tv_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
        if (textView != null) {
            i8 = R.id.tv_pair;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pair);
            if (textView2 != null) {
                i8 = R.id.tv_pairing_code;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pairing_code);
                if (textView3 != null) {
                    i8 = R.id.tv_pairing_hint;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pairing_hint);
                    if (textView4 != null) {
                        return new DialogPairingCodeBinding((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogPairingCodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogPairingCodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_pairing_code, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
