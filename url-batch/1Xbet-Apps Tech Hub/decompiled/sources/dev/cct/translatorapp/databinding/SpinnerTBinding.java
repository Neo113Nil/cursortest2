package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class SpinnerTBinding implements ViewBinding {
    private final TextView rootView;
    public final TextView txtSpinner;

    private SpinnerTBinding(TextView rootView, TextView txtSpinner) {
        this.rootView = rootView;
        this.txtSpinner = txtSpinner;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static SpinnerTBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SpinnerTBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.spinner_t, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static SpinnerTBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new SpinnerTBinding(textView, textView);
    }
}
