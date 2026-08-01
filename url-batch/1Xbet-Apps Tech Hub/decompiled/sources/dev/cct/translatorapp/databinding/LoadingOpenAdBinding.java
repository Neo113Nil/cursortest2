package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class LoadingOpenAdBinding implements ViewBinding {
    private final LinearLayout rootView;

    private LoadingOpenAdBinding(LinearLayout rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LoadingOpenAdBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static LoadingOpenAdBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.loading_open_ad, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static LoadingOpenAdBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        return new LoadingOpenAdBinding((LinearLayout) rootView);
    }
}
