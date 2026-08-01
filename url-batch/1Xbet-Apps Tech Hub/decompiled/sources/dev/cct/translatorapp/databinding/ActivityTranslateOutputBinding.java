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
public final class ActivityTranslateOutputBinding implements ViewBinding {
    public final ImageView backBtn;
    public final ImageView outClipboardIcon;
    public final ImageView outSpeakerIcon;
    public final CardView outputCardView;
    public final TextView outputLangCardTv;
    public final LinearLayout outputLinearLayout;
    public final TextView outputText;
    private final ConstraintLayout rootView;
    public final ImageView shareOutIcon;

    private ActivityTranslateOutputBinding(ConstraintLayout rootView, ImageView backBtn, ImageView outClipboardIcon, ImageView outSpeakerIcon, CardView outputCardView, TextView outputLangCardTv, LinearLayout outputLinearLayout, TextView outputText, ImageView shareOutIcon) {
        this.rootView = rootView;
        this.backBtn = backBtn;
        this.outClipboardIcon = outClipboardIcon;
        this.outSpeakerIcon = outSpeakerIcon;
        this.outputCardView = outputCardView;
        this.outputLangCardTv = outputLangCardTv;
        this.outputLinearLayout = outputLinearLayout;
        this.outputText = outputText;
        this.shareOutIcon = shareOutIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTranslateOutputBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityTranslateOutputBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_translate_output, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityTranslateOutputBinding bind(View rootView) {
        int i = R.id.back_btn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_btn);
        if (imageView != null) {
            i = R.id.out_clipboard_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.out_clipboard_icon);
            if (imageView2 != null) {
                i = R.id.out_speaker_icon;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.out_speaker_icon);
                if (imageView3 != null) {
                    i = R.id.output_card_view;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.output_card_view);
                    if (cardView != null) {
                        i = R.id.output_lang_card_tv;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang_card_tv);
                        if (textView != null) {
                            i = R.id.output_linear_layout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.output_linear_layout);
                            if (linearLayout != null) {
                                i = R.id.output_text;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_text);
                                if (textView2 != null) {
                                    i = R.id.share_out_icon;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_out_icon);
                                    if (imageView4 != null) {
                                        return new ActivityTranslateOutputBinding((ConstraintLayout) rootView, imageView, imageView2, imageView3, cardView, textView, linearLayout, textView2, imageView4);
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
