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
public final class PhrasebookItemLayoutBinding implements ViewBinding {
    public final ImageView downIcon;
    public final ImageView phCategoryIcon;
    public final TextView phCategoryTv;
    private final ConstraintLayout rootView;

    private PhrasebookItemLayoutBinding(ConstraintLayout rootView, ImageView downIcon, ImageView phCategoryIcon, TextView phCategoryTv) {
        this.rootView = rootView;
        this.downIcon = downIcon;
        this.phCategoryIcon = phCategoryIcon;
        this.phCategoryTv = phCategoryTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static PhrasebookItemLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static PhrasebookItemLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.phrasebook_item_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static PhrasebookItemLayoutBinding bind(View rootView) {
        int i = R.id.down_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.down_icon);
        if (imageView != null) {
            i = R.id.ph_category_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ph_category_icon);
            if (imageView2 != null) {
                i = R.id.ph_category_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ph_category_tv);
                if (textView != null) {
                    return new PhrasebookItemLayoutBinding((ConstraintLayout) rootView, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
