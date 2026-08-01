package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityTranslateInputBinding implements ViewBinding {
    public final ImageView crossIcon;
    public final EditText editText;
    public final MaterialCardView inputCardView;
    public final TextView inputLangCardTv;
    public final LinearLayout linearLayout;
    public final ImageView micIcon;
    public final ImageView pasteIcon;
    private final ConstraintLayout rootView;
    public final ImageView speakIcon;
    public final Button translateBtn;

    private ActivityTranslateInputBinding(ConstraintLayout rootView, ImageView crossIcon, EditText editText, MaterialCardView inputCardView, TextView inputLangCardTv, LinearLayout linearLayout, ImageView micIcon, ImageView pasteIcon, ImageView speakIcon, Button translateBtn) {
        this.rootView = rootView;
        this.crossIcon = crossIcon;
        this.editText = editText;
        this.inputCardView = inputCardView;
        this.inputLangCardTv = inputLangCardTv;
        this.linearLayout = linearLayout;
        this.micIcon = micIcon;
        this.pasteIcon = pasteIcon;
        this.speakIcon = speakIcon;
        this.translateBtn = translateBtn;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTranslateInputBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityTranslateInputBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_translate_input, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityTranslateInputBinding bind(View rootView) {
        int i = R.id.cross_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cross_icon);
        if (imageView != null) {
            i = R.id.editText;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.editText);
            if (editText != null) {
                i = R.id.input_card_view;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.input_card_view);
                if (materialCardView != null) {
                    i = R.id.input_lang_card_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang_card_tv);
                    if (textView != null) {
                        i = R.id.linear_layout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linear_layout);
                        if (linearLayout != null) {
                            i = R.id.mic_icon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.mic_icon);
                            if (imageView2 != null) {
                                i = R.id.paste_icon;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.paste_icon);
                                if (imageView3 != null) {
                                    i = R.id.speak_icon;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speak_icon);
                                    if (imageView4 != null) {
                                        i = R.id.translate_btn;
                                        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.translate_btn);
                                        if (button != null) {
                                            return new ActivityTranslateInputBinding((ConstraintLayout) rootView, imageView, editText, materialCardView, textView, linearLayout, imageView2, imageView3, imageView4, button);
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
