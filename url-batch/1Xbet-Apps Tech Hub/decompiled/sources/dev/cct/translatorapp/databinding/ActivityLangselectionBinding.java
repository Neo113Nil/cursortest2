package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityLangselectionBinding implements ViewBinding {
    public final TextView allLangTv;
    public final ImageView backBtn;
    public final ConstraintLayout bannerContainer;
    public final TextView chooseLangTv;
    public final ImageView exitSearchIcon;
    public final RecyclerView langRec;
    private final ConstraintLayout rootView;
    public final EditText search;
    public final ImageView searchLang;
    public final MaterialCardView searchLanguageCardview;
    public final FbBannerLayoutBinding smallBannerLayout;

    private ActivityLangselectionBinding(ConstraintLayout rootView, TextView allLangTv, ImageView backBtn, ConstraintLayout bannerContainer, TextView chooseLangTv, ImageView exitSearchIcon, RecyclerView langRec, EditText search, ImageView searchLang, MaterialCardView searchLanguageCardview, FbBannerLayoutBinding smallBannerLayout) {
        this.rootView = rootView;
        this.allLangTv = allLangTv;
        this.backBtn = backBtn;
        this.bannerContainer = bannerContainer;
        this.chooseLangTv = chooseLangTv;
        this.exitSearchIcon = exitSearchIcon;
        this.langRec = langRec;
        this.search = search;
        this.searchLang = searchLang;
        this.searchLanguageCardview = searchLanguageCardview;
        this.smallBannerLayout = smallBannerLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityLangselectionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityLangselectionBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_langselection, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityLangselectionBinding bind(View rootView) {
        int i = R.id.all_lang_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.all_lang_tv);
        if (textView != null) {
            i = R.id.back_btn;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_btn);
            if (imageView != null) {
                i = R.id.banner_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.banner_container);
                if (constraintLayout != null) {
                    i = R.id.choose_lang_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.choose_lang_tv);
                    if (textView2 != null) {
                        i = R.id.exit_search_icon;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.exit_search_icon);
                        if (imageView2 != null) {
                            i = R.id.lang_rec;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.lang_rec);
                            if (recyclerView != null) {
                                i = R.id.search;
                                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.search);
                                if (editText != null) {
                                    i = R.id.search_lang;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.search_lang);
                                    if (imageView3 != null) {
                                        i = R.id.search_language_cardview;
                                        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.search_language_cardview);
                                        if (materialCardView != null) {
                                            i = R.id.small_banner_layout;
                                            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.small_banner_layout);
                                            if (findChildViewById != null) {
                                                return new ActivityLangselectionBinding((ConstraintLayout) rootView, textView, imageView, constraintLayout, textView2, imageView2, recyclerView, editText, imageView3, materialCardView, FbBannerLayoutBinding.bind(findChildViewById));
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
