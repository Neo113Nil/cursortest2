package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityPhrasebookBinding implements ViewBinding {
    public final ConstraintLayout admobBannerContainer;
    public final ImageView backFromPhrasebookIcon;
    public final ImageView backFromSearchIcon;
    public final ConstraintLayout bannerContainer;
    public final ImageView crossIcon;
    public final ConstraintLayout fbBannerContainer;
    public final TextView inputLangTv;
    public final MaterialCardView inputLanguageLayout;
    public final TextView outputLangTv;
    public final MaterialCardView outputLanguageLayout;
    public final RecyclerView phrasebookRecycler;
    public final TextView phrasebookTv;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final EditText searchCategory;
    public final MaterialCardView searchLayout;
    public final ImageView searchPhrasebookIcon;
    public final BannerLayoutBinding smallBannerLayout;
    public final FbBannerLayoutBinding smallFbBannerLayout;
    public final ImageView swapLangIcon;
    public final MaterialCardView topBar;

    private ActivityPhrasebookBinding(ConstraintLayout rootView, ConstraintLayout admobBannerContainer, ImageView backFromPhrasebookIcon, ImageView backFromSearchIcon, ConstraintLayout bannerContainer, ImageView crossIcon, ConstraintLayout fbBannerContainer, TextView inputLangTv, MaterialCardView inputLanguageLayout, TextView outputLangTv, MaterialCardView outputLanguageLayout, RecyclerView phrasebookRecycler, TextView phrasebookTv, ProgressBar progressBar, EditText searchCategory, MaterialCardView searchLayout, ImageView searchPhrasebookIcon, BannerLayoutBinding smallBannerLayout, FbBannerLayoutBinding smallFbBannerLayout, ImageView swapLangIcon, MaterialCardView topBar) {
        this.rootView = rootView;
        this.admobBannerContainer = admobBannerContainer;
        this.backFromPhrasebookIcon = backFromPhrasebookIcon;
        this.backFromSearchIcon = backFromSearchIcon;
        this.bannerContainer = bannerContainer;
        this.crossIcon = crossIcon;
        this.fbBannerContainer = fbBannerContainer;
        this.inputLangTv = inputLangTv;
        this.inputLanguageLayout = inputLanguageLayout;
        this.outputLangTv = outputLangTv;
        this.outputLanguageLayout = outputLanguageLayout;
        this.phrasebookRecycler = phrasebookRecycler;
        this.phrasebookTv = phrasebookTv;
        this.progressBar = progressBar;
        this.searchCategory = searchCategory;
        this.searchLayout = searchLayout;
        this.searchPhrasebookIcon = searchPhrasebookIcon;
        this.smallBannerLayout = smallBannerLayout;
        this.smallFbBannerLayout = smallFbBannerLayout;
        this.swapLangIcon = swapLangIcon;
        this.topBar = topBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPhrasebookBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityPhrasebookBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_phrasebook, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPhrasebookBinding bind(View rootView) {
        int i = R.id.admob_banner_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.admob_banner_container);
        if (constraintLayout != null) {
            i = R.id.back_from_phrasebook_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_from_phrasebook_icon);
            if (imageView != null) {
                i = R.id.back_from_search_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_from_search_icon);
                if (imageView2 != null) {
                    i = R.id.banner_container;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.banner_container);
                    if (constraintLayout2 != null) {
                        i = R.id.cross_icon;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cross_icon);
                        if (imageView3 != null) {
                            i = R.id.fb_banner_container;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.fb_banner_container);
                            if (constraintLayout3 != null) {
                                i = R.id.input_lang_tv;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_lang_tv);
                                if (textView != null) {
                                    i = R.id.inputLanguageLayout;
                                    MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.inputLanguageLayout);
                                    if (materialCardView != null) {
                                        i = R.id.output_lang_tv;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_lang_tv);
                                        if (textView2 != null) {
                                            i = R.id.outputLanguageLayout;
                                            MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.outputLanguageLayout);
                                            if (materialCardView2 != null) {
                                                i = R.id.phrasebook_recycler;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.phrasebook_recycler);
                                                if (recyclerView != null) {
                                                    i = R.id.phrasebook_tv;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.phrasebook_tv);
                                                    if (textView3 != null) {
                                                        i = R.id.progress_bar;
                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                                                        if (progressBar != null) {
                                                            i = R.id.search_category;
                                                            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.search_category);
                                                            if (editText != null) {
                                                                i = R.id.searchLayout;
                                                                MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.searchLayout);
                                                                if (materialCardView3 != null) {
                                                                    i = R.id.search_phrasebook_icon;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.search_phrasebook_icon);
                                                                    if (imageView4 != null) {
                                                                        i = R.id.small_banner_layout;
                                                                        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.small_banner_layout);
                                                                        if (findChildViewById != null) {
                                                                            BannerLayoutBinding bind = BannerLayoutBinding.bind(findChildViewById);
                                                                            i = R.id.small_fb_banner_layout;
                                                                            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.small_fb_banner_layout);
                                                                            if (findChildViewById2 != null) {
                                                                                FbBannerLayoutBinding bind2 = FbBannerLayoutBinding.bind(findChildViewById2);
                                                                                i = R.id.swap_lang_icon;
                                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.swap_lang_icon);
                                                                                if (imageView5 != null) {
                                                                                    i = R.id.top_bar;
                                                                                    MaterialCardView materialCardView4 = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                                                                                    if (materialCardView4 != null) {
                                                                                        return new ActivityPhrasebookBinding((ConstraintLayout) rootView, constraintLayout, imageView, imageView2, constraintLayout2, imageView3, constraintLayout3, textView, materialCardView, textView2, materialCardView2, recyclerView, textView3, progressBar, editText, materialCardView3, imageView4, bind, bind2, imageView5, materialCardView4);
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
