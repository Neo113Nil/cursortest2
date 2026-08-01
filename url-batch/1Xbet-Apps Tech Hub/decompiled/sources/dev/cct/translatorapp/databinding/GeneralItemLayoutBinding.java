package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class GeneralItemLayoutBinding implements ViewBinding {
    public final ImageView arrowIcon;
    public final CardView dropdownCard;
    public final ImageView outClipboardIcon;
    public final ImageView outSpeakerIcon;
    public final TextView outText;
    public final TextView outputLangCardTv;
    public final LinearLayout outputLinearLayout;
    public final TextView phraseTv;
    private final ConstraintLayout rootView;
    public final ImageView shareOutIcon;
    public final View view;

    private GeneralItemLayoutBinding(ConstraintLayout rootView, ImageView arrowIcon, CardView dropdownCard, ImageView outClipboardIcon, ImageView outSpeakerIcon, TextView outText, TextView outputLangCardTv, LinearLayout outputLinearLayout, TextView phraseTv, ImageView shareOutIcon, View view) {
        this.rootView = rootView;
        this.arrowIcon = arrowIcon;
        this.dropdownCard = dropdownCard;
        this.outClipboardIcon = outClipboardIcon;
        this.outSpeakerIcon = outSpeakerIcon;
        this.outText = outText;
        this.outputLangCardTv = outputLangCardTv;
        this.outputLinearLayout = outputLinearLayout;
        this.phraseTv = phraseTv;
        this.shareOutIcon = shareOutIcon;
        this.view = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static GeneralItemLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static GeneralItemLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.general_item_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static GeneralItemLayoutBinding bind(View rootView) {
        int i = R.id.arrow_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.arrow_icon);
        if (imageView != null) {
            i = R.id.dropdown_card;
            CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.dropdown_card);
            if (cardView != null) {
                i = R.id.out_clipboard_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.out_clipboard_icon);
                if (imageView2 != null) {
                    i = R.id.out_speaker_icon;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.out_speaker_icon);
                    if (imageView3 != null) {
                        i = R.id.out_text;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.out_text);
                        if (textView != null) {
                            i = R.id.output_lang_card_tv;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang_card_tv);
                            if (textView2 != null) {
                                i = R.id.output_linear_layout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.output_linear_layout);
                                if (linearLayout != null) {
                                    i = R.id.phrase_tv;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrase_tv);
                                    if (textView3 != null) {
                                        i = R.id.share_out_icon;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_out_icon);
                                        if (imageView4 != null) {
                                            i = R.id.view;
                                            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.view);
                                            if (findChildViewById != null) {
                                                return new GeneralItemLayoutBinding((ConstraintLayout) rootView, imageView, cardView, imageView2, imageView3, textView, textView2, linearLayout, textView3, imageView4, findChildViewById);
                                            }
                                        }
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
