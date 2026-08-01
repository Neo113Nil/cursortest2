package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.skyfishjy.library.RippleBackground;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityConversationBinding implements ViewBinding {
    public final FrameLayout adFrame;
    public final MaterialCardView adLayout;
    public final ImageView backBtn;
    public final ConstraintLayout bottomCardView;
    public final LinearLayout conversation;
    public final ConstraintLayout conversationCardView;
    public final ImageView conversationPic;
    public final TextView conversationText;
    public final ImageView crossIcon;
    public final AppCompatButton deleteBtn;
    public final ImageView deleteIcon;
    public final ImageView emptyDataImg;
    public final TextView inputLang;
    public final LinearLayout inputLangLayout;
    public final TextView inputLangTv;
    public final MaterialCardView inputLanguageLayout;
    public final FloatingActionButton inputMicIcon;
    public final TextView inputText;
    public final TextView loadingText;
    public final TextView outputLang;
    public final LinearLayout outputLangLayout;
    public final TextView outputLangTv;
    public final MaterialCardView outputLanguageLayout;
    public final FloatingActionButton outputMicIcon;
    public final TextView outputText;
    public final RecyclerView recyclerView;
    public final RippleBackground rippleInputMic;
    public final RippleBackground rippleOutputMic;
    private final ConstraintLayout rootView;
    public final ScrollView scrollableConversation;
    public final ImageView selectAllCheckbox;
    public final LinearLayout selectAllLayout;
    public final ShimmerFrameLayout shimmerViewContainer1;
    public final ImageView speakIcon;
    public final ImageView swapLangIcon;
    public final TextView tapToSpeakText;
    public final TextView textView;
    public final MaterialCardView topBar;
    public final TextView view1;

    private ActivityConversationBinding(ConstraintLayout rootView, FrameLayout adFrame, MaterialCardView adLayout, ImageView backBtn, ConstraintLayout bottomCardView, LinearLayout conversation, ConstraintLayout conversationCardView, ImageView conversationPic, TextView conversationText, ImageView crossIcon, AppCompatButton deleteBtn, ImageView deleteIcon, ImageView emptyDataImg, TextView inputLang, LinearLayout inputLangLayout, TextView inputLangTv, MaterialCardView inputLanguageLayout, FloatingActionButton inputMicIcon, TextView inputText, TextView loadingText, TextView outputLang, LinearLayout outputLangLayout, TextView outputLangTv, MaterialCardView outputLanguageLayout, FloatingActionButton outputMicIcon, TextView outputText, RecyclerView recyclerView, RippleBackground rippleInputMic, RippleBackground rippleOutputMic, ScrollView scrollableConversation, ImageView selectAllCheckbox, LinearLayout selectAllLayout, ShimmerFrameLayout shimmerViewContainer1, ImageView speakIcon, ImageView swapLangIcon, TextView tapToSpeakText, TextView textView, MaterialCardView topBar, TextView view1) {
        this.rootView = rootView;
        this.adFrame = adFrame;
        this.adLayout = adLayout;
        this.backBtn = backBtn;
        this.bottomCardView = bottomCardView;
        this.conversation = conversation;
        this.conversationCardView = conversationCardView;
        this.conversationPic = conversationPic;
        this.conversationText = conversationText;
        this.crossIcon = crossIcon;
        this.deleteBtn = deleteBtn;
        this.deleteIcon = deleteIcon;
        this.emptyDataImg = emptyDataImg;
        this.inputLang = inputLang;
        this.inputLangLayout = inputLangLayout;
        this.inputLangTv = inputLangTv;
        this.inputLanguageLayout = inputLanguageLayout;
        this.inputMicIcon = inputMicIcon;
        this.inputText = inputText;
        this.loadingText = loadingText;
        this.outputLang = outputLang;
        this.outputLangLayout = outputLangLayout;
        this.outputLangTv = outputLangTv;
        this.outputLanguageLayout = outputLanguageLayout;
        this.outputMicIcon = outputMicIcon;
        this.outputText = outputText;
        this.recyclerView = recyclerView;
        this.rippleInputMic = rippleInputMic;
        this.rippleOutputMic = rippleOutputMic;
        this.scrollableConversation = scrollableConversation;
        this.selectAllCheckbox = selectAllCheckbox;
        this.selectAllLayout = selectAllLayout;
        this.shimmerViewContainer1 = shimmerViewContainer1;
        this.speakIcon = speakIcon;
        this.swapLangIcon = swapLangIcon;
        this.tapToSpeakText = tapToSpeakText;
        this.textView = textView;
        this.topBar = topBar;
        this.view1 = view1;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityConversationBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityConversationBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_conversation, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityConversationBinding bind(View rootView) {
        int i = R.id.adFrame;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.adFrame);
        if (frameLayout != null) {
            i = R.id.adLayout;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.adLayout);
            if (materialCardView != null) {
                i = R.id.back_btn;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_btn);
                if (imageView != null) {
                    i = R.id.bottom_card_view;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.bottom_card_view);
                    if (constraintLayout != null) {
                        i = R.id.conversation;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.conversation);
                        if (linearLayout != null) {
                            i = R.id.conversation_card_view;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.conversation_card_view);
                            if (constraintLayout2 != null) {
                                i = R.id.conversation_pic;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.conversation_pic);
                                if (imageView2 != null) {
                                    i = R.id.conversation_text;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.conversation_text);
                                    if (textView != null) {
                                        i = R.id.cross_icon;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cross_icon);
                                        if (imageView3 != null) {
                                            i = R.id.delete_btn;
                                            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.delete_btn);
                                            if (appCompatButton != null) {
                                                i = R.id.delete_icon;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.delete_icon);
                                                if (imageView4 != null) {
                                                    i = R.id.emptyDataImg;
                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.emptyDataImg);
                                                    if (imageView5 != null) {
                                                        i = R.id.input_lang;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang);
                                                        if (textView2 != null) {
                                                            i = R.id.input_lang_layout;
                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.input_lang_layout);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.input_lang_tv;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang_tv);
                                                                if (textView3 != null) {
                                                                    i = R.id.inputLanguageLayout;
                                                                    MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.inputLanguageLayout);
                                                                    if (materialCardView2 != null) {
                                                                        i = R.id.input_mic_icon;
                                                                        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.input_mic_icon);
                                                                        if (floatingActionButton != null) {
                                                                            i = R.id.inputText;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.inputText);
                                                                            if (textView4 != null) {
                                                                                i = R.id.loadingText;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.loadingText);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.output_lang;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.output_lang_layout;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.output_lang_layout);
                                                                                        if (linearLayout3 != null) {
                                                                                            i = R.id.output_lang_tv;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang_tv);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.outputLanguageLayout;
                                                                                                MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.outputLanguageLayout);
                                                                                                if (materialCardView3 != null) {
                                                                                                    i = R.id.output_mic_icon;
                                                                                                    FloatingActionButton floatingActionButton2 = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.output_mic_icon);
                                                                                                    if (floatingActionButton2 != null) {
                                                                                                        i = R.id.outputText;
                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.outputText);
                                                                                                        if (textView8 != null) {
                                                                                                            i = R.id.recyclerView;
                                                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
                                                                                                            if (recyclerView != null) {
                                                                                                                i = R.id.rippleInputMic;
                                                                                                                RippleBackground rippleBackground = (RippleBackground) ViewBindings.findChildViewById(rootView, R.id.rippleInputMic);
                                                                                                                if (rippleBackground != null) {
                                                                                                                    i = R.id.rippleOutputMic;
                                                                                                                    RippleBackground rippleBackground2 = (RippleBackground) ViewBindings.findChildViewById(rootView, R.id.rippleOutputMic);
                                                                                                                    if (rippleBackground2 != null) {
                                                                                                                        i = R.id.scrollableConversation;
                                                                                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollableConversation);
                                                                                                                        if (scrollView != null) {
                                                                                                                            i = R.id.select_all_checkbox;
                                                                                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.select_all_checkbox);
                                                                                                                            if (imageView6 != null) {
                                                                                                                                i = R.id.select_all_layout;
                                                                                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.select_all_layout);
                                                                                                                                if (linearLayout4 != null) {
                                                                                                                                    i = R.id.shimmer_view_container1;
                                                                                                                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(rootView, R.id.shimmer_view_container1);
                                                                                                                                    if (shimmerFrameLayout != null) {
                                                                                                                                        i = R.id.speak_icon;
                                                                                                                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speak_icon);
                                                                                                                                        if (imageView7 != null) {
                                                                                                                                            i = R.id.swap_lang_icon;
                                                                                                                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.swap_lang_icon);
                                                                                                                                            if (imageView8 != null) {
                                                                                                                                                i = R.id.tapToSpeakText;
                                                                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tapToSpeakText);
                                                                                                                                                if (textView9 != null) {
                                                                                                                                                    i = R.id.textView;
                                                                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
                                                                                                                                                    if (textView10 != null) {
                                                                                                                                                        i = R.id.top_bar;
                                                                                                                                                        MaterialCardView materialCardView4 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                                                                                                                                                        if (materialCardView4 != null) {
                                                                                                                                                            i = R.id.view1;
                                                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.view1);
                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                return new ActivityConversationBinding((ConstraintLayout) rootView, frameLayout, materialCardView, imageView, constraintLayout, linearLayout, constraintLayout2, imageView2, textView, imageView3, appCompatButton, imageView4, imageView5, textView2, linearLayout2, textView3, materialCardView2, floatingActionButton, textView4, textView5, textView6, linearLayout3, textView7, materialCardView3, floatingActionButton2, textView8, recyclerView, rippleBackground, rippleBackground2, scrollView, imageView6, linearLayout4, shimmerFrameLayout, imageView7, imageView8, textView9, textView10, materialCardView4, textView11);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
