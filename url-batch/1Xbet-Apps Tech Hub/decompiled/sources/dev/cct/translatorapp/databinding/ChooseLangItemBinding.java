package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ChooseLangItemBinding implements ViewBinding {
    public final ImageView langIcon;
    public final TextView langName;
    private final ConstraintLayout rootView;
    public final TextView textView;

    private ChooseLangItemBinding(ConstraintLayout rootView, ImageView langIcon, TextView langName, TextView textView) {
        this.rootView = rootView;
        this.langIcon = langIcon;
        this.langName = langName;
        this.textView = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ChooseLangItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ChooseLangItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.choose_lang_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChooseLangItemBinding bind(View rootView) {
        int i = R.id.lang_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lang_icon);
        if (imageView != null) {
            i = R.id.langName;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.langName);
            if (textView != null) {
                i = R.id.textView;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
                if (textView2 != null) {
                    return new ChooseLangItemBinding((ConstraintLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
