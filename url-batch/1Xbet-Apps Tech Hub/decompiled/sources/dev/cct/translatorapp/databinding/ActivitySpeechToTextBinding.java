package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivitySpeechToTextBinding implements ViewBinding {
    public final ImageView backBtn;
    public final FrameLayout collapsableBannerAd;
    public final ImageView copyIcon;
    public final ImageView deleteIcon;
    public final TextView editText;
    public final MaterialCardView inputCardView;
    public final TextView inputLangCardTv;
    public final CardView micIcon;
    private final ConstraintLayout rootView;
    public final ImageView speakIcon;
    public final Button speechLangBtn;
    public final ImageView textShareIcon;
    public final TextView textView;
    public final MaterialCardView topBar;

    private ActivitySpeechToTextBinding(ConstraintLayout rootView, ImageView backBtn, FrameLayout collapsableBannerAd, ImageView copyIcon, ImageView deleteIcon, TextView editText, MaterialCardView inputCardView, TextView inputLangCardTv, CardView micIcon, ImageView speakIcon, Button speechLangBtn, ImageView textShareIcon, TextView textView, MaterialCardView topBar) {
        this.rootView = rootView;
        this.backBtn = backBtn;
        this.collapsableBannerAd = collapsableBannerAd;
        this.copyIcon = copyIcon;
        this.deleteIcon = deleteIcon;
        this.editText = editText;
        this.inputCardView = inputCardView;
        this.inputLangCardTv = inputLangCardTv;
        this.micIcon = micIcon;
        this.speakIcon = speakIcon;
        this.speechLangBtn = speechLangBtn;
        this.textShareIcon = textShareIcon;
        this.textView = textView;
        this.topBar = topBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySpeechToTextBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivitySpeechToTextBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_speech_to_text, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySpeechToTextBinding bind(View rootView) {
        int i = R.id.backBtn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.backBtn);
        if (imageView != null) {
            i = R.id.collapsableBannerAd;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.collapsableBannerAd);
            if (frameLayout != null) {
                i = R.id.copy_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.copy_icon);
                if (imageView2 != null) {
                    i = R.id.delete_icon;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.delete_icon);
                    if (imageView3 != null) {
                        i = R.id.editText;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.editText);
                        if (textView != null) {
                            i = R.id.input_card_view;
                            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.input_card_view);
                            if (materialCardView != null) {
                                i = R.id.input_lang_card_tv;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang_card_tv);
                                if (textView2 != null) {
                                    i = R.id.mic_icon;
                                    CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.mic_icon);
                                    if (cardView != null) {
                                        i = R.id.speak_icon;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speak_icon);
                                        if (imageView4 != null) {
                                            i = R.id.speech_lang_btn;
                                            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.speech_lang_btn);
                                            if (button != null) {
                                                i = R.id.text_share_icon;
                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.text_share_icon);
                                                if (imageView5 != null) {
                                                    i = R.id.textView;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
                                                    if (textView3 != null) {
                                                        i = R.id.top_bar;
                                                        MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                                                        if (materialCardView2 != null) {
                                                            return new ActivitySpeechToTextBinding((ConstraintLayout) rootView, imageView, frameLayout, imageView2, imageView3, textView, materialCardView, textView2, cardView, imageView4, button, imageView5, textView3, materialCardView2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
