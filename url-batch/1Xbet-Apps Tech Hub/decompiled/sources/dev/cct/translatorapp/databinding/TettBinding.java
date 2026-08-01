package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class TettBinding implements ViewBinding {
    public final FrameLayout adFrame;
    public final BottomNavigationView bottomNavigationView;
    public final ImageView crossIcon;
    public final EditText editText;
    public final ImageView expandIcon;
    public final ImageView expandTextView;
    public final FrameLayout fragmentContainer;
    public final RecyclerView historyRecy;
    public final TextView historyTv;
    public final ConstraintLayout homeLayout;
    public final MaterialCardView inputCardView;
    public final TextView inputLangCardTv;
    public final TextView inputLangTv;
    public final LinearLayout linearLayout;
    public final ConstraintLayout loadingLayout;
    public final ImageView micIcon;
    public final MaterialCardView nativeAdView;
    public final ImageView openSetting;
    public final ImageView outClipboardIcon;
    public final ImageView outSpeakerIcon;
    public final CardView outputCardView;
    public final TextView outputLangCardTv;
    public final TextView outputLangTv;
    public final LinearLayout outputLinearLayout;
    public final TextView outputText;
    public final ImageView pasteIcon;
    public final ImageView premiumIcon;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView2;
    public final TextView seeMoreBtn;
    public final ImageView shareOutIcon;
    public final ImageView speakIcon;
    public final MaterialCardView swapCardView;
    public final ImageView swapLangIcon;
    public final TextView textView;
    public final TextView textView14;
    public final MaterialCardView topBar;
    public final Button translateBtn;

    private TettBinding(ConstraintLayout rootView, FrameLayout adFrame, BottomNavigationView bottomNavigationView, ImageView crossIcon, EditText editText, ImageView expandIcon, ImageView expandTextView, FrameLayout fragmentContainer, RecyclerView historyRecy, TextView historyTv, ConstraintLayout homeLayout, MaterialCardView inputCardView, TextView inputLangCardTv, TextView inputLangTv, LinearLayout linearLayout, ConstraintLayout loadingLayout, ImageView micIcon, MaterialCardView nativeAdView, ImageView openSetting, ImageView outClipboardIcon, ImageView outSpeakerIcon, CardView outputCardView, TextView outputLangCardTv, TextView outputLangTv, LinearLayout outputLinearLayout, TextView outputText, ImageView pasteIcon, ImageView premiumIcon, ScrollView scrollView2, TextView seeMoreBtn, ImageView shareOutIcon, ImageView speakIcon, MaterialCardView swapCardView, ImageView swapLangIcon, TextView textView, TextView textView14, MaterialCardView topBar, Button translateBtn) {
        this.rootView = rootView;
        this.adFrame = adFrame;
        this.bottomNavigationView = bottomNavigationView;
        this.crossIcon = crossIcon;
        this.editText = editText;
        this.expandIcon = expandIcon;
        this.expandTextView = expandTextView;
        this.fragmentContainer = fragmentContainer;
        this.historyRecy = historyRecy;
        this.historyTv = historyTv;
        this.homeLayout = homeLayout;
        this.inputCardView = inputCardView;
        this.inputLangCardTv = inputLangCardTv;
        this.inputLangTv = inputLangTv;
        this.linearLayout = linearLayout;
        this.loadingLayout = loadingLayout;
        this.micIcon = micIcon;
        this.nativeAdView = nativeAdView;
        this.openSetting = openSetting;
        this.outClipboardIcon = outClipboardIcon;
        this.outSpeakerIcon = outSpeakerIcon;
        this.outputCardView = outputCardView;
        this.outputLangCardTv = outputLangCardTv;
        this.outputLangTv = outputLangTv;
        this.outputLinearLayout = outputLinearLayout;
        this.outputText = outputText;
        this.pasteIcon = pasteIcon;
        this.premiumIcon = premiumIcon;
        this.scrollView2 = scrollView2;
        this.seeMoreBtn = seeMoreBtn;
        this.shareOutIcon = shareOutIcon;
        this.speakIcon = speakIcon;
        this.swapCardView = swapCardView;
        this.swapLangIcon = swapLangIcon;
        this.textView = textView;
        this.textView14 = textView14;
        this.topBar = topBar;
        this.translateBtn = translateBtn;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static TettBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static TettBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.tett, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static TettBinding bind(View rootView) {
        int i = R.id.adFrame;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.adFrame);
        if (frameLayout != null) {
            i = R.id.bottomNavigationView;
            BottomNavigationView bottomNavigationView = (BottomNavigationView) ViewBindings.findChildViewById(rootView, R.id.bottomNavigationView);
            if (bottomNavigationView != null) {
                i = R.id.cross_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cross_icon);
                if (imageView != null) {
                    i = R.id.editText;
                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.editText);
                    if (editText != null) {
                        i = R.id.expand_icon;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.expand_icon);
                        if (imageView2 != null) {
                            i = R.id.expandTextView;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.expandTextView);
                            if (imageView3 != null) {
                                i = R.id.fragmentContainer;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fragmentContainer);
                                if (frameLayout2 != null) {
                                    i = R.id.history_recy;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.history_recy);
                                    if (recyclerView != null) {
                                        i = R.id.history_tv;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.history_tv);
                                        if (textView != null) {
                                            i = R.id.homeLayout;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.homeLayout);
                                            if (constraintLayout != null) {
                                                i = R.id.input_card_view;
                                                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.input_card_view);
                                                if (materialCardView != null) {
                                                    i = R.id.input_lang_card_tv;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang_card_tv);
                                                    if (textView2 != null) {
                                                        i = R.id.input_lang_tv;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang_tv);
                                                        if (textView3 != null) {
                                                            i = R.id.linear_layout;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linear_layout);
                                                            if (linearLayout != null) {
                                                                i = R.id.loadingLayout;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.loadingLayout);
                                                                if (constraintLayout2 != null) {
                                                                    i = R.id.mic_icon;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.mic_icon);
                                                                    if (imageView4 != null) {
                                                                        i = R.id.nativeAdView;
                                                                        MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.nativeAdView);
                                                                        if (materialCardView2 != null) {
                                                                            i = R.id.open_setting;
                                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.open_setting);
                                                                            if (imageView5 != null) {
                                                                                i = R.id.out_clipboard_icon;
                                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.out_clipboard_icon);
                                                                                if (imageView6 != null) {
                                                                                    i = R.id.out_speaker_icon;
                                                                                    ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.out_speaker_icon);
                                                                                    if (imageView7 != null) {
                                                                                        i = R.id.output_card_view;
                                                                                        CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.output_card_view);
                                                                                        if (cardView != null) {
                                                                                            i = R.id.output_lang_card_tv;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang_card_tv);
                                                                                            if (textView4 != null) {
                                                                                                i = R.id.output_lang_tv;
                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang_tv);
                                                                                                if (textView5 != null) {
                                                                                                    i = R.id.output_linear_layout;
                                                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.output_linear_layout);
                                                                                                    if (linearLayout2 != null) {
                                                                                                        i = R.id.output_text;
                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_text);
                                                                                                        if (textView6 != null) {
                                                                                                            i = R.id.paste_icon;
                                                                                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.paste_icon);
                                                                                                            if (imageView8 != null) {
                                                                                                                i = R.id.premium_icon;
                                                                                                                ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.premium_icon);
                                                                                                                if (imageView9 != null) {
                                                                                                                    i = R.id.scrollView2;
                                                                                                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView2);
                                                                                                                    if (scrollView != null) {
                                                                                                                        i = R.id.see_more_btn;
                                                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.see_more_btn);
                                                                                                                        if (textView7 != null) {
                                                                                                                            i = R.id.share_out_icon;
                                                                                                                            ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_out_icon);
                                                                                                                            if (imageView10 != null) {
                                                                                                                                i = R.id.speak_icon;
                                                                                                                                ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speak_icon);
                                                                                                                                if (imageView11 != null) {
                                                                                                                                    i = R.id.swap_card_view;
                                                                                                                                    MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.swap_card_view);
                                                                                                                                    if (materialCardView3 != null) {
                                                                                                                                        i = R.id.swap_lang_icon;
                                                                                                                                        ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.swap_lang_icon);
                                                                                                                                        if (imageView12 != null) {
                                                                                                                                            i = R.id.textView;
                                                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
                                                                                                                                            if (textView8 != null) {
                                                                                                                                                i = R.id.textView14;
                                                                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView14);
                                                                                                                                                if (textView9 != null) {
                                                                                                                                                    i = R.id.top_bar;
                                                                                                                                                    MaterialCardView materialCardView4 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                                                                                                                                                    if (materialCardView4 != null) {
                                                                                                                                                        i = R.id.translate_btn;
                                                                                                                                                        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.translate_btn);
                                                                                                                                                        if (button != null) {
                                                                                                                                                            return new TettBinding((ConstraintLayout) rootView, frameLayout, bottomNavigationView, imageView, editText, imageView2, imageView3, frameLayout2, recyclerView, textView, constraintLayout, materialCardView, textView2, textView3, linearLayout, constraintLayout2, imageView4, materialCardView2, imageView5, imageView6, imageView7, cardView, textView4, textView5, linearLayout2, textView6, imageView8, imageView9, scrollView, textView7, imageView10, imageView11, materialCardView3, imageView12, textView8, textView9, materialCardView4, button);
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
