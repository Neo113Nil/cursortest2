package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class FavoriteItemLayoutBinding implements ViewBinding {
    public final ImageView checkbox;
    public final ImageView favoriteIcon;
    public final MaterialCardView historyCardView;
    public final TextView inputLangCode;
    public final TextView inputText;
    public final LinearLayout langSwapLayout;
    public final TextView outputLangCode;
    public final TextView outputText;
    private final MaterialCardView rootView;
    public final View view1;

    private FavoriteItemLayoutBinding(MaterialCardView rootView, ImageView checkbox, ImageView favoriteIcon, MaterialCardView historyCardView, TextView inputLangCode, TextView inputText, LinearLayout langSwapLayout, TextView outputLangCode, TextView outputText, View view1) {
        this.rootView = rootView;
        this.checkbox = checkbox;
        this.favoriteIcon = favoriteIcon;
        this.historyCardView = historyCardView;
        this.inputLangCode = inputLangCode;
        this.inputText = inputText;
        this.langSwapLayout = langSwapLayout;
        this.outputLangCode = outputLangCode;
        this.outputText = outputText;
        this.view1 = view1;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MaterialCardView getRoot() {
        return this.rootView;
    }

    public static FavoriteItemLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FavoriteItemLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.favorite_item_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FavoriteItemLayoutBinding bind(View rootView) {
        int i = R.id.checkbox;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.checkbox);
        if (imageView != null) {
            i = R.id.favorite_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.favorite_icon);
            if (imageView2 != null) {
                MaterialCardView materialCardView = (MaterialCardView) rootView;
                i = R.id.input_lang_code;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang_code);
                if (textView != null) {
                    i = R.id.input_text;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_text);
                    if (textView2 != null) {
                        i = R.id.lang_swap_layout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.lang_swap_layout);
                        if (linearLayout != null) {
                            i = R.id.output_lang_code;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang_code);
                            if (textView3 != null) {
                                i = R.id.output_text;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_text);
                                if (textView4 != null) {
                                    i = R.id.view1;
                                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.view1);
                                    if (findChildViewById != null) {
                                        return new FavoriteItemLayoutBinding(materialCardView, imageView, imageView2, materialCardView, textView, textView2, linearLayout, textView3, textView4, findChildViewById);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
