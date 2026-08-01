package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class SmallLayoutBinding implements ViewBinding {
    public final ImageView copyTextIcon;
    public final ImageView crossIcon;
    public final EditText editText;
    public final CardView inputCardView;
    public final TextView inputLangCardTv;
    public final Spinner inputLangSpinner;
    public final LinearLayout itemLayout;
    public final View lastView;
    public final LinearLayout linearLayout;
    public final CardView ouputCardView;
    public final Spinner ouputLangSpinner;
    public final TextView outputLangCardTv;
    public final TextView outputTxt;
    public final TextView pasteIcon;
    public final ContentLoadingProgressBar progressLoadingData;
    private final CardView rootView;
    public final ImageView shareTextIcon;
    public final ImageView speakIcon;
    public final ImageView speakTextIcon;
    public final CardView swapCardView;
    public final ImageView swapLangIcon;
    public final TextView timer;
    public final TextView translateBtn;

    private SmallLayoutBinding(CardView rootView, ImageView copyTextIcon, ImageView crossIcon, EditText editText, CardView inputCardView, TextView inputLangCardTv, Spinner inputLangSpinner, LinearLayout itemLayout, View lastView, LinearLayout linearLayout, CardView ouputCardView, Spinner ouputLangSpinner, TextView outputLangCardTv, TextView outputTxt, TextView pasteIcon, ContentLoadingProgressBar progressLoadingData, ImageView shareTextIcon, ImageView speakIcon, ImageView speakTextIcon, CardView swapCardView, ImageView swapLangIcon, TextView timer, TextView translateBtn) {
        this.rootView = rootView;
        this.copyTextIcon = copyTextIcon;
        this.crossIcon = crossIcon;
        this.editText = editText;
        this.inputCardView = inputCardView;
        this.inputLangCardTv = inputLangCardTv;
        this.inputLangSpinner = inputLangSpinner;
        this.itemLayout = itemLayout;
        this.lastView = lastView;
        this.linearLayout = linearLayout;
        this.ouputCardView = ouputCardView;
        this.ouputLangSpinner = ouputLangSpinner;
        this.outputLangCardTv = outputLangCardTv;
        this.outputTxt = outputTxt;
        this.pasteIcon = pasteIcon;
        this.progressLoadingData = progressLoadingData;
        this.shareTextIcon = shareTextIcon;
        this.speakIcon = speakIcon;
        this.speakTextIcon = speakTextIcon;
        this.swapCardView = swapCardView;
        this.swapLangIcon = swapLangIcon;
        this.timer = timer;
        this.translateBtn = translateBtn;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static SmallLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static SmallLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.small_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static SmallLayoutBinding bind(View rootView) {
        int i = R.id.copyTextIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.copyTextIcon);
        if (imageView != null) {
            i = R.id.cross_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cross_icon);
            if (imageView2 != null) {
                i = R.id.editText;
                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.editText);
                if (editText != null) {
                    i = R.id.input_card_view;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.input_card_view);
                    if (cardView != null) {
                        i = R.id.input_lang_card_tv;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang_card_tv);
                        if (textView != null) {
                            i = R.id.input_lang_spinner;
                            Spinner spinner = (Spinner) ViewBindings.findChildViewById(rootView, R.id.input_lang_spinner);
                            if (spinner != null) {
                                i = R.id.itemLayout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.itemLayout);
                                if (linearLayout != null) {
                                    i = R.id.lastView;
                                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.lastView);
                                    if (findChildViewById != null) {
                                        i = R.id.linear_layout;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linear_layout);
                                        if (linearLayout2 != null) {
                                            i = R.id.ouput_card_view;
                                            CardView cardView2 = (CardView) ViewBindings.findChildViewById(rootView, R.id.ouput_card_view);
                                            if (cardView2 != null) {
                                                i = R.id.ouputLangSpinner;
                                                Spinner spinner2 = (Spinner) ViewBindings.findChildViewById(rootView, R.id.ouputLangSpinner);
                                                if (spinner2 != null) {
                                                    i = R.id.output_lang_card_tv;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang_card_tv);
                                                    if (textView2 != null) {
                                                        i = R.id.outputTxt;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.outputTxt);
                                                        if (textView3 != null) {
                                                            i = R.id.paste_icon;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.paste_icon);
                                                            if (textView4 != null) {
                                                                i = R.id.progressLoadingData;
                                                                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) ViewBindings.findChildViewById(rootView, R.id.progressLoadingData);
                                                                if (contentLoadingProgressBar != null) {
                                                                    i = R.id.shareTextIcon;
                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.shareTextIcon);
                                                                    if (imageView3 != null) {
                                                                        i = R.id.speak_icon;
                                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speak_icon);
                                                                        if (imageView4 != null) {
                                                                            i = R.id.speakTextIcon;
                                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speakTextIcon);
                                                                            if (imageView5 != null) {
                                                                                i = R.id.swap_card_view;
                                                                                CardView cardView3 = (CardView) ViewBindings.findChildViewById(rootView, R.id.swap_card_view);
                                                                                if (cardView3 != null) {
                                                                                    i = R.id.swap_lang_icon;
                                                                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.swap_lang_icon);
                                                                                    if (imageView6 != null) {
                                                                                        i = R.id.timer;
                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.timer);
                                                                                        if (textView5 != null) {
                                                                                            i = R.id.translate_btn;
                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translate_btn);
                                                                                            if (textView6 != null) {
                                                                                                return new SmallLayoutBinding((CardView) rootView, imageView, imageView2, editText, cardView, textView, spinner, linearLayout, findChildViewById, linearLayout2, cardView2, spinner2, textView2, textView3, textView4, contentLoadingProgressBar, imageView3, imageView4, imageView5, cardView3, imageView6, textView5, textView6);
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
