package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityDictionaryBinding implements ViewBinding {
    public final MaterialCardView SearchBtn;
    public final TextView SearchBtn2;
    public final ConstraintLayout admobBannerContainer;
    public final ImageView backFromDictionaryBtn;
    public final ConstraintLayout bannerContainer;
    public final ImageView copyIcon;
    public final TextView defHeadingTv;
    public final TextView defTv;
    public final MaterialCardView delete;
    public final ImageView deleteSearchBtn;
    public final EditText editText;
    public final TextView exclaimTv;
    public final TextView expHeadingTv;
    public final TextView expTv;
    public final ConstraintLayout fbBannerContainer;
    public final ImageView imageView2;
    public final MaterialCardView resultCardView;
    private final ConstraintLayout rootView;
    public final MaterialCardView searchDictionaryCardView;
    public final ImageView shareIcon;
    public final BannerLayoutBinding smallBannerLayout;
    public final FbBannerLayoutBinding smallFbBannerLayout;
    public final ImageView speakIcon;
    public final TextView synHeadingTv;
    public final TextView synTv;
    public final TextView textView;
    public final MaterialCardView topBar;

    private ActivityDictionaryBinding(ConstraintLayout rootView, MaterialCardView SearchBtn, TextView SearchBtn2, ConstraintLayout admobBannerContainer, ImageView backFromDictionaryBtn, ConstraintLayout bannerContainer, ImageView copyIcon, TextView defHeadingTv, TextView defTv, MaterialCardView delete, ImageView deleteSearchBtn, EditText editText, TextView exclaimTv, TextView expHeadingTv, TextView expTv, ConstraintLayout fbBannerContainer, ImageView imageView2, MaterialCardView resultCardView, MaterialCardView searchDictionaryCardView, ImageView shareIcon, BannerLayoutBinding smallBannerLayout, FbBannerLayoutBinding smallFbBannerLayout, ImageView speakIcon, TextView synHeadingTv, TextView synTv, TextView textView, MaterialCardView topBar) {
        this.rootView = rootView;
        this.SearchBtn = SearchBtn;
        this.SearchBtn2 = SearchBtn2;
        this.admobBannerContainer = admobBannerContainer;
        this.backFromDictionaryBtn = backFromDictionaryBtn;
        this.bannerContainer = bannerContainer;
        this.copyIcon = copyIcon;
        this.defHeadingTv = defHeadingTv;
        this.defTv = defTv;
        this.delete = delete;
        this.deleteSearchBtn = deleteSearchBtn;
        this.editText = editText;
        this.exclaimTv = exclaimTv;
        this.expHeadingTv = expHeadingTv;
        this.expTv = expTv;
        this.fbBannerContainer = fbBannerContainer;
        this.imageView2 = imageView2;
        this.resultCardView = resultCardView;
        this.searchDictionaryCardView = searchDictionaryCardView;
        this.shareIcon = shareIcon;
        this.smallBannerLayout = smallBannerLayout;
        this.smallFbBannerLayout = smallFbBannerLayout;
        this.speakIcon = speakIcon;
        this.synHeadingTv = synHeadingTv;
        this.synTv = synTv;
        this.textView = textView;
        this.topBar = topBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDictionaryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityDictionaryBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_dictionary, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDictionaryBinding bind(View rootView) {
        int i = R.id.Search_btn;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.Search_btn);
        if (materialCardView != null) {
            i = R.id.Search_btn2;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.Search_btn2);
            if (textView != null) {
                i = R.id.admob_banner_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.admob_banner_container);
                if (constraintLayout != null) {
                    i = R.id.back_from_dictionary_btn;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_from_dictionary_btn);
                    if (imageView != null) {
                        i = R.id.banner_container;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.banner_container);
                        if (constraintLayout2 != null) {
                            i = R.id.copy_icon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.copy_icon);
                            if (imageView2 != null) {
                                i = R.id.def_heading_tv;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.def_heading_tv);
                                if (textView2 != null) {
                                    i = R.id.def_tv;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.def_tv);
                                    if (textView3 != null) {
                                        i = R.id.delete;
                                        MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.delete);
                                        if (materialCardView2 != null) {
                                            i = R.id.delete_search_btn;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.delete_search_btn);
                                            if (imageView3 != null) {
                                                i = R.id.edit_Text;
                                                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edit_Text);
                                                if (editText != null) {
                                                    i = R.id.exclaim_tv;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exclaim_tv);
                                                    if (textView4 != null) {
                                                        i = R.id.exp_heading_tv;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exp_heading_tv);
                                                        if (textView5 != null) {
                                                            i = R.id.exp_tv;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.exp_tv);
                                                            if (textView6 != null) {
                                                                i = R.id.fb_banner_container;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.fb_banner_container);
                                                                if (constraintLayout3 != null) {
                                                                    i = R.id.imageView2;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView2);
                                                                    if (imageView4 != null) {
                                                                        i = R.id.result_card_view;
                                                                        MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.result_card_view);
                                                                        if (materialCardView3 != null) {
                                                                            i = R.id.search_dictionary_cardView;
                                                                            MaterialCardView materialCardView4 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.search_dictionary_cardView);
                                                                            if (materialCardView4 != null) {
                                                                                i = R.id.share_icon;
                                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_icon);
                                                                                if (imageView5 != null) {
                                                                                    i = R.id.small_banner_layout;
                                                                                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.small_banner_layout);
                                                                                    if (findChildViewById != null) {
                                                                                        BannerLayoutBinding bind = BannerLayoutBinding.bind(findChildViewById);
                                                                                        i = R.id.small_fb_banner_layout;
                                                                                        View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.small_fb_banner_layout);
                                                                                        if (findChildViewById2 != null) {
                                                                                            FbBannerLayoutBinding bind2 = FbBannerLayoutBinding.bind(findChildViewById2);
                                                                                            i = R.id.speak_icon;
                                                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speak_icon);
                                                                                            if (imageView6 != null) {
                                                                                                i = R.id.syn_heading_tv;
                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.syn_heading_tv);
                                                                                                if (textView7 != null) {
                                                                                                    i = R.id.syn_tv;
                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.syn_tv);
                                                                                                    if (textView8 != null) {
                                                                                                        i = R.id.textView;
                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
                                                                                                        if (textView9 != null) {
                                                                                                            i = R.id.top_bar;
                                                                                                            MaterialCardView materialCardView5 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                                                                                                            if (materialCardView5 != null) {
                                                                                                                return new ActivityDictionaryBinding((ConstraintLayout) rootView, materialCardView, textView, constraintLayout, imageView, constraintLayout2, imageView2, textView2, textView3, materialCardView2, imageView3, editText, textView4, textView5, textView6, constraintLayout3, imageView4, materialCardView3, materialCardView4, imageView5, bind, bind2, imageView6, textView7, textView8, textView9, materialCardView5);
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
