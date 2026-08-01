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
public final class LanguageItemSelBinding implements ViewBinding {
    public final TextView codeCategoryTv;
    public final ConstraintLayout itemLayout;
    public final ImageView langFlag;
    public final ImageView langIcon;
    public final TextView phCategoryTv;
    private final ConstraintLayout rootView;

    private LanguageItemSelBinding(ConstraintLayout rootView, TextView codeCategoryTv, ConstraintLayout itemLayout, ImageView langFlag, ImageView langIcon, TextView phCategoryTv) {
        this.rootView = rootView;
        this.codeCategoryTv = codeCategoryTv;
        this.itemLayout = itemLayout;
        this.langFlag = langFlag;
        this.langIcon = langIcon;
        this.phCategoryTv = phCategoryTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LanguageItemSelBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static LanguageItemSelBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.language_item_sel, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static LanguageItemSelBinding bind(View rootView) {
        int i = R.id.code_category_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.code_category_tv);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            i = R.id.lang_flag;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lang_flag);
            if (imageView != null) {
                i = R.id.lang_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.lang_icon);
                if (imageView2 != null) {
                    i = R.id.ph_category_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ph_category_tv);
                    if (textView2 != null) {
                        return new LanguageItemSelBinding(constraintLayout, textView, constraintLayout, imageView, imageView2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
