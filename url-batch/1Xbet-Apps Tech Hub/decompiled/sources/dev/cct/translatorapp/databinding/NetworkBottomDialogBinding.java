package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class NetworkBottomDialogBinding implements ViewBinding {
    public final TextView connectionDetail;
    public final CardView okBtn;
    private final ConstraintLayout rootView;
    public final TextView textView;

    private NetworkBottomDialogBinding(ConstraintLayout rootView, TextView connectionDetail, CardView okBtn, TextView textView) {
        this.rootView = rootView;
        this.connectionDetail = connectionDetail;
        this.okBtn = okBtn;
        this.textView = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static NetworkBottomDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static NetworkBottomDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.network_bottom_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static NetworkBottomDialogBinding bind(View rootView) {
        int i = R.id.connectionDetail;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.connectionDetail);
        if (textView != null) {
            i = R.id.okBtn;
            CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.okBtn);
            if (cardView != null) {
                i = R.id.textView;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
                if (textView2 != null) {
                    return new NetworkBottomDialogBinding((ConstraintLayout) rootView, textView, cardView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
