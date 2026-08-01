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
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityTextTranslationBinding implements ViewBinding {
    public final ConstraintLayout admobBannerContainer;
    public final ConstraintLayout bannerContainer;
    public final ConstraintLayout bgLayout;
    public final ImageView clearIconBtn;
    public final ImageView copy;
    public final ImageView copyInput;
    public final EditText editText;
    public final ExtendedFloatingActionButton extFloatingActionButton;
    public final ImageView favInput;
    public final ConstraintLayout fbBannerContainer;
    public final ConstraintLayout homeLayout;
    public final TextView inputLangTv;
    public final MaterialCardView inputLanguageLayout;
    public final ImageView landScapeView;
    public final LinearLayout linearIconLayout;
    public final LinearLayout linearIconLayoutInput;
    public final ImageView micIcon;
    public final ImageView openSetting;
    public final TextView outputLangTv;
    public final MaterialCardView outputLanguageLayout;
    public final TextView outputText;
    public final MaterialCardView pasteIcon;
    public final TextView pasteIcon1;
    public final ImageView pasteIcon11;
    public final ImageView premiumIcon;
    private final ConstraintLayout rootView;
    public final NestedScrollView scrollable;
    public final ImageView share;
    public final BannerLayoutBinding smallBannerLayout;
    public final FbBannerLayoutBinding smallFbBannerLayout;
    public final ImageView speaker;
    public final ImageView speakerInput;
    public final ImageView swapLangIcon;
    public final TextView textView;
    public final MaterialCardView topBar;
    public final Button translateBtn;
    public final View viewColorLine;

    private ActivityTextTranslationBinding(ConstraintLayout rootView, ConstraintLayout admobBannerContainer, ConstraintLayout bannerContainer, ConstraintLayout bgLayout, ImageView clearIconBtn, ImageView copy, ImageView copyInput, EditText editText, ExtendedFloatingActionButton extFloatingActionButton, ImageView favInput, ConstraintLayout fbBannerContainer, ConstraintLayout homeLayout, TextView inputLangTv, MaterialCardView inputLanguageLayout, ImageView landScapeView, LinearLayout linearIconLayout, LinearLayout linearIconLayoutInput, ImageView micIcon, ImageView openSetting, TextView outputLangTv, MaterialCardView outputLanguageLayout, TextView outputText, MaterialCardView pasteIcon, TextView pasteIcon1, ImageView pasteIcon11, ImageView premiumIcon, NestedScrollView scrollable, ImageView share, BannerLayoutBinding smallBannerLayout, FbBannerLayoutBinding smallFbBannerLayout, ImageView speaker, ImageView speakerInput, ImageView swapLangIcon, TextView textView, MaterialCardView topBar, Button translateBtn, View viewColorLine) {
        this.rootView = rootView;
        this.admobBannerContainer = admobBannerContainer;
        this.bannerContainer = bannerContainer;
        this.bgLayout = bgLayout;
        this.clearIconBtn = clearIconBtn;
        this.copy = copy;
        this.copyInput = copyInput;
        this.editText = editText;
        this.extFloatingActionButton = extFloatingActionButton;
        this.favInput = favInput;
        this.fbBannerContainer = fbBannerContainer;
        this.homeLayout = homeLayout;
        this.inputLangTv = inputLangTv;
        this.inputLanguageLayout = inputLanguageLayout;
        this.landScapeView = landScapeView;
        this.linearIconLayout = linearIconLayout;
        this.linearIconLayoutInput = linearIconLayoutInput;
        this.micIcon = micIcon;
        this.openSetting = openSetting;
        this.outputLangTv = outputLangTv;
        this.outputLanguageLayout = outputLanguageLayout;
        this.outputText = outputText;
        this.pasteIcon = pasteIcon;
        this.pasteIcon1 = pasteIcon1;
        this.pasteIcon11 = pasteIcon11;
        this.premiumIcon = premiumIcon;
        this.scrollable = scrollable;
        this.share = share;
        this.smallBannerLayout = smallBannerLayout;
        this.smallFbBannerLayout = smallFbBannerLayout;
        this.speaker = speaker;
        this.speakerInput = speakerInput;
        this.swapLangIcon = swapLangIcon;
        this.textView = textView;
        this.topBar = topBar;
        this.translateBtn = translateBtn;
        this.viewColorLine = viewColorLine;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTextTranslationBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityTextTranslationBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_text_translation, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityTextTranslationBinding bind(View rootView) {
        int i = R.id.admob_banner_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.admob_banner_container);
        if (constraintLayout != null) {
            i = R.id.banner_container;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.banner_container);
            if (constraintLayout2 != null) {
                i = R.id.bg_layout;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.bg_layout);
                if (constraintLayout3 != null) {
                    i = R.id.clearIconBtn;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.clearIconBtn);
                    if (imageView != null) {
                        i = R.id.copy;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.copy);
                        if (imageView2 != null) {
                            i = R.id.copyInput;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.copyInput);
                            if (imageView3 != null) {
                                i = R.id.editText;
                                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.editText);
                                if (editText != null) {
                                    i = R.id.extFloatingActionButton;
                                    ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.extFloatingActionButton);
                                    if (extendedFloatingActionButton != null) {
                                        i = R.id.favInput;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.favInput);
                                        if (imageView4 != null) {
                                            i = R.id.fb_banner_container;
                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.fb_banner_container);
                                            if (constraintLayout4 != null) {
                                                i = R.id.homeLayout;
                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.homeLayout);
                                                if (constraintLayout5 != null) {
                                                    i = R.id.input_lang_tv;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang_tv);
                                                    if (textView != null) {
                                                        i = R.id.inputLanguageLayout;
                                                        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.inputLanguageLayout);
                                                        if (materialCardView != null) {
                                                            i = R.id.landScapeView;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.landScapeView);
                                                            if (imageView5 != null) {
                                                                i = R.id.linearIconLayout;
                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linearIconLayout);
                                                                if (linearLayout != null) {
                                                                    i = R.id.linearIconLayoutInput;
                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linearIconLayoutInput);
                                                                    if (linearLayout2 != null) {
                                                                        i = R.id.mic_icon;
                                                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.mic_icon);
                                                                        if (imageView6 != null) {
                                                                            i = R.id.open_setting;
                                                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.open_setting);
                                                                            if (imageView7 != null) {
                                                                                i = R.id.output_lang_tv;
                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang_tv);
                                                                                if (textView2 != null) {
                                                                                    i = R.id.outputLanguageLayout;
                                                                                    MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.outputLanguageLayout);
                                                                                    if (materialCardView2 != null) {
                                                                                        i = R.id.outputText;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.outputText);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.paste_icon;
                                                                                            MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.paste_icon);
                                                                                            if (materialCardView3 != null) {
                                                                                                i = R.id.paste_icon1;
                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.paste_icon1);
                                                                                                if (textView4 != null) {
                                                                                                    i = R.id.pasteIcon11;
                                                                                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pasteIcon11);
                                                                                                    if (imageView8 != null) {
                                                                                                        i = R.id.premium_icon;
                                                                                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.premium_icon);
                                                                                                        if (imageView9 != null) {
                                                                                                            i = R.id.scrollable;
                                                                                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollable);
                                                                                                            if (nestedScrollView != null) {
                                                                                                                i = R.id.share;
                                                                                                                ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share);
                                                                                                                if (imageView10 != null) {
                                                                                                                    i = R.id.small_banner_layout;
                                                                                                                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.small_banner_layout);
                                                                                                                    if (findChildViewById != null) {
                                                                                                                        BannerLayoutBinding bind = BannerLayoutBinding.bind(findChildViewById);
                                                                                                                        i = R.id.small_fb_banner_layout;
                                                                                                                        View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.small_fb_banner_layout);
                                                                                                                        if (findChildViewById2 != null) {
                                                                                                                            FbBannerLayoutBinding bind2 = FbBannerLayoutBinding.bind(findChildViewById2);
                                                                                                                            i = R.id.speaker;
                                                                                                                            ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speaker);
                                                                                                                            if (imageView11 != null) {
                                                                                                                                i = R.id.speakerInput;
                                                                                                                                ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speakerInput);
                                                                                                                                if (imageView12 != null) {
                                                                                                                                    i = R.id.swap_lang_icon;
                                                                                                                                    ImageView imageView13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.swap_lang_icon);
                                                                                                                                    if (imageView13 != null) {
                                                                                                                                        i = R.id.textView;
                                                                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
                                                                                                                                        if (textView5 != null) {
                                                                                                                                            i = R.id.top_bar;
                                                                                                                                            MaterialCardView materialCardView4 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                                                                                                                                            if (materialCardView4 != null) {
                                                                                                                                                i = R.id.translate_btn;
                                                                                                                                                Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.translate_btn);
                                                                                                                                                if (button != null) {
                                                                                                                                                    i = R.id.viewColorLine;
                                                                                                                                                    View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.viewColorLine);
                                                                                                                                                    if (findChildViewById3 != null) {
                                                                                                                                                        return new ActivityTextTranslationBinding((ConstraintLayout) rootView, constraintLayout, constraintLayout2, constraintLayout3, imageView, imageView2, imageView3, editText, extendedFloatingActionButton, imageView4, constraintLayout4, constraintLayout5, textView, materialCardView, imageView5, linearLayout, linearLayout2, imageView6, imageView7, textView2, materialCardView2, textView3, materialCardView3, textView4, imageView8, imageView9, nestedScrollView, imageView10, bind, bind2, imageView11, imageView12, imageView13, textView5, materialCardView4, button, findChildViewById3);
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
