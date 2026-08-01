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
public final class ActivityGeneralBinding implements ViewBinding {
    public final ImageView backFromPhrasebookIcon;
    public final ImageView backFromSearchIcon;
    public final TextView categoryTv;
    public final ImageView crossIcon;
    public final RecyclerView generalRec;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final ImageView searchGeneral;
    public final EditText searchPhrases;
    public final MaterialCardView topBar;

    private ActivityGeneralBinding(ConstraintLayout rootView, ImageView backFromPhrasebookIcon, ImageView backFromSearchIcon, TextView categoryTv, ImageView crossIcon, RecyclerView generalRec, ProgressBar progressBar, ImageView searchGeneral, EditText searchPhrases, MaterialCardView topBar) {
        this.rootView = rootView;
        this.backFromPhrasebookIcon = backFromPhrasebookIcon;
        this.backFromSearchIcon = backFromSearchIcon;
        this.categoryTv = categoryTv;
        this.crossIcon = crossIcon;
        this.generalRec = generalRec;
        this.progressBar = progressBar;
        this.searchGeneral = searchGeneral;
        this.searchPhrases = searchPhrases;
        this.topBar = topBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGeneralBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityGeneralBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_general, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGeneralBinding bind(View rootView) {
        int i = R.id.back_from_phrasebook_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_from_phrasebook_icon);
        if (imageView != null) {
            i = R.id.back_from_search_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_from_search_icon);
            if (imageView2 != null) {
                i = R.id.category_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.category_tv);
                if (textView != null) {
                    i = R.id.cross_icon;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cross_icon);
                    if (imageView3 != null) {
                        i = R.id.general_rec;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.general_rec);
                        if (recyclerView != null) {
                            i = R.id.progress_bar;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                            if (progressBar != null) {
                                i = R.id.search_general;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.search_general);
                                if (imageView4 != null) {
                                    i = R.id.search_phrases;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.search_phrases);
                                    if (editText != null) {
                                        i = R.id.top_bar;
                                        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                                        if (materialCardView != null) {
                                            return new ActivityGeneralBinding((ConstraintLayout) rootView, imageView, imageView2, textView, imageView3, recyclerView, progressBar, imageView4, editText, materialCardView);
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
