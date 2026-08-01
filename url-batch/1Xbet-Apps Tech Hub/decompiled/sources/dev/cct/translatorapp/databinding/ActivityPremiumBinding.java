package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityPremiumBinding implements ViewBinding {
    public final TextView cancel;
    public final ImageView crossPremium;
    public final TextView freeTrialTv;
    public final ImageView imageView3;
    public final ConstraintLayout monthlyLayout;
    public final TextView monthlyPriceTv;
    public final TextView monthlyTv;
    public final TextView premiumTv;
    public final ConstraintLayout quarterlyLayout;
    public final TextView quarterlyPriceTv;
    public final TextView quarterlyTv;
    private final ConstraintLayout rootView;
    public final ImageView selectMonthly;
    public final ImageView selectQuarterly;
    public final ImageView selectWeekly;
    public final AppCompatButton subBtn;
    public final TextView textView12;
    public final TextView textView2;
    public final TextView textView3;
    public final TextView textView4;
    public final TextView textview1;
    public final ConstraintLayout weeklyLayout;
    public final TextView weeklyPriceTv;
    public final TextView weeklyTv;

    private ActivityPremiumBinding(ConstraintLayout rootView, TextView cancel, ImageView crossPremium, TextView freeTrialTv, ImageView imageView3, ConstraintLayout monthlyLayout, TextView monthlyPriceTv, TextView monthlyTv, TextView premiumTv, ConstraintLayout quarterlyLayout, TextView quarterlyPriceTv, TextView quarterlyTv, ImageView selectMonthly, ImageView selectQuarterly, ImageView selectWeekly, AppCompatButton subBtn, TextView textView12, TextView textView2, TextView textView3, TextView textView4, TextView textview1, ConstraintLayout weeklyLayout, TextView weeklyPriceTv, TextView weeklyTv) {
        this.rootView = rootView;
        this.cancel = cancel;
        this.crossPremium = crossPremium;
        this.freeTrialTv = freeTrialTv;
        this.imageView3 = imageView3;
        this.monthlyLayout = monthlyLayout;
        this.monthlyPriceTv = monthlyPriceTv;
        this.monthlyTv = monthlyTv;
        this.premiumTv = premiumTv;
        this.quarterlyLayout = quarterlyLayout;
        this.quarterlyPriceTv = quarterlyPriceTv;
        this.quarterlyTv = quarterlyTv;
        this.selectMonthly = selectMonthly;
        this.selectQuarterly = selectQuarterly;
        this.selectWeekly = selectWeekly;
        this.subBtn = subBtn;
        this.textView12 = textView12;
        this.textView2 = textView2;
        this.textView3 = textView3;
        this.textView4 = textView4;
        this.textview1 = textview1;
        this.weeklyLayout = weeklyLayout;
        this.weeklyPriceTv = weeklyPriceTv;
        this.weeklyTv = weeklyTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPremiumBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityPremiumBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_premium, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPremiumBinding bind(View rootView) {
        int i = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (textView != null) {
            i = R.id.cross_premium;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.cross_premium);
            if (imageView != null) {
                i = R.id.free_trial_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.free_trial_tv);
                if (textView2 != null) {
                    i = R.id.imageView3;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView3);
                    if (imageView2 != null) {
                        i = R.id.monthly_layout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.monthly_layout);
                        if (constraintLayout != null) {
                            i = R.id.monthly_price_tv;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.monthly_price_tv);
                            if (textView3 != null) {
                                i = R.id.monthly_tv;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.monthly_tv);
                                if (textView4 != null) {
                                    i = R.id.premium_tv;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.premium_tv);
                                    if (textView5 != null) {
                                        i = R.id.quarterly_layout;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.quarterly_layout);
                                        if (constraintLayout2 != null) {
                                            i = R.id.quarterly_price_tv;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quarterly_price_tv);
                                            if (textView6 != null) {
                                                i = R.id.quarterly_tv;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.quarterly_tv);
                                                if (textView7 != null) {
                                                    i = R.id.select_monthly;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.select_monthly);
                                                    if (imageView3 != null) {
                                                        i = R.id.select_quarterly;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.select_quarterly);
                                                        if (imageView4 != null) {
                                                            i = R.id.select_weekly;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.select_weekly);
                                                            if (imageView5 != null) {
                                                                i = R.id.sub_btn;
                                                                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.sub_btn);
                                                                if (appCompatButton != null) {
                                                                    i = R.id.textView12;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView12);
                                                                    if (textView8 != null) {
                                                                        i = R.id.textView2;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView2);
                                                                        if (textView9 != null) {
                                                                            i = R.id.textView3;
                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView3);
                                                                            if (textView10 != null) {
                                                                                i = R.id.textView4;
                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView4);
                                                                                if (textView11 != null) {
                                                                                    i = R.id.textview_1;
                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textview_1);
                                                                                    if (textView12 != null) {
                                                                                        i = R.id.weekly_layout;
                                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.weekly_layout);
                                                                                        if (constraintLayout3 != null) {
                                                                                            i = R.id.weekly_price_tv;
                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weekly_price_tv);
                                                                                            if (textView13 != null) {
                                                                                                i = R.id.weekly_tv;
                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weekly_tv);
                                                                                                if (textView14 != null) {
                                                                                                    return new ActivityPremiumBinding((ConstraintLayout) rootView, textView, imageView, textView2, imageView2, constraintLayout, textView3, textView4, textView5, constraintLayout2, textView6, textView7, imageView3, imageView4, imageView5, appCompatButton, textView8, textView9, textView10, textView11, textView12, constraintLayout3, textView13, textView14);
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
