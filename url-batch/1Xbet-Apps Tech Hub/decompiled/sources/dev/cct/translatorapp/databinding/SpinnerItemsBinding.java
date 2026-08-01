package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class SpinnerItemsBinding implements ViewBinding {
    public final TextView langName;
    private final TextView rootView;

    private SpinnerItemsBinding(TextView rootView, TextView langName) {
        this.rootView = rootView;
        this.langName = langName;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static SpinnerItemsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SpinnerItemsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.spinner_items, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static SpinnerItemsBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new SpinnerItemsBinding(textView, textView);
    }
}
