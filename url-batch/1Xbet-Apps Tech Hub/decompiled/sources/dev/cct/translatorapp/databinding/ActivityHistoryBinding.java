package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityHistoryBinding implements ViewBinding {
    public final ImageView backBtn;
    public final AppCompatButton deleteBtn;
    public final ImageView deleteHistoryIcon;
    public final RecyclerView historyRecy;
    public final ImageView noDataImg;
    public final TextView noDataTv;
    public final LinearLayout noHistoryLayout;
    private final ConstraintLayout rootView;
    public final ImageView selectAllCheckbox;
    public final LinearLayout selectAllLayout;
    public final TextView textView;
    public final MaterialCardView topBar;

    private ActivityHistoryBinding(ConstraintLayout rootView, ImageView backBtn, AppCompatButton deleteBtn, ImageView deleteHistoryIcon, RecyclerView historyRecy, ImageView noDataImg, TextView noDataTv, LinearLayout noHistoryLayout, ImageView selectAllCheckbox, LinearLayout selectAllLayout, TextView textView, MaterialCardView topBar) {
        this.rootView = rootView;
        this.backBtn = backBtn;
        this.deleteBtn = deleteBtn;
        this.deleteHistoryIcon = deleteHistoryIcon;
        this.historyRecy = historyRecy;
        this.noDataImg = noDataImg;
        this.noDataTv = noDataTv;
        this.noHistoryLayout = noHistoryLayout;
        this.selectAllCheckbox = selectAllCheckbox;
        this.selectAllLayout = selectAllLayout;
        this.textView = textView;
        this.topBar = topBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityHistoryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityHistoryBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_history, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityHistoryBinding bind(View rootView) {
        int i = R.id.back_btn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_btn);
        if (imageView != null) {
            i = R.id.delete_btn;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.delete_btn);
            if (appCompatButton != null) {
                i = R.id.delete_history_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.delete_history_icon);
                if (imageView2 != null) {
                    i = R.id.history_recy;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.history_recy);
                    if (recyclerView != null) {
                        i = R.id.no_data_img;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.no_data_img);
                        if (imageView3 != null) {
                            i = R.id.no_data_tv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.no_data_tv);
                            if (textView != null) {
                                i = R.id.no_history_layout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.no_history_layout);
                                if (linearLayout != null) {
                                    i = R.id.select_all_checkbox;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.select_all_checkbox);
                                    if (imageView4 != null) {
                                        i = R.id.select_all_layout;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.select_all_layout);
                                        if (linearLayout2 != null) {
                                            i = R.id.textView;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
                                            if (textView2 != null) {
                                                i = R.id.top_bar;
                                                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                                                if (materialCardView != null) {
                                                    return new ActivityHistoryBinding((ConstraintLayout) rootView, imageView, appCompatButton, imageView2, recyclerView, imageView3, textView, linearLayout, imageView4, linearLayout2, textView2, materialCardView);
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
