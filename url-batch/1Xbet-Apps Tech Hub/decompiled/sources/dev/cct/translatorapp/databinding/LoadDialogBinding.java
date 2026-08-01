package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class LoadDialogBinding implements ViewBinding {
    public final TextView loadingTextView;
    public final ProgressBar progressL;
    private final ConstraintLayout rootView;

    private LoadDialogBinding(ConstraintLayout rootView, TextView loadingTextView, ProgressBar progressL) {
        this.rootView = rootView;
        this.loadingTextView = loadingTextView;
        this.progressL = progressL;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LoadDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static LoadDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.load_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static LoadDialogBinding bind(View rootView) {
        int i = R.id.loadingTextView;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.loadingTextView);
        if (textView != null) {
            i = R.id.progressL;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressL);
            if (progressBar != null) {
                return new LoadDialogBinding((ConstraintLayout) rootView, textView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
