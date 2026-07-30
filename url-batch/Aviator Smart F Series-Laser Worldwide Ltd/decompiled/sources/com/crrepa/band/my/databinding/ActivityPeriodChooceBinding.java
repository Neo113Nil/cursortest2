package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityPeriodChooceBinding implements ViewBinding {

    @NonNull
    public final ContinueArrowBinding displayEndTime;

    @NonNull
    public final ContinueArrowBinding displayStartTime;

    @NonNull
    public final RelativeLayout endTime;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RelativeLayout startTime;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvDoNotDisturbHint;

    @NonNull
    public final TextView tvEndTime;

    @NonNull
    public final TextView tvSave;

    @NonNull
    public final TextView tvStartTime;

    @NonNull
    public final TextView tvTitle;

    private ActivityPeriodChooceBinding(@NonNull LinearLayout linearLayout, @NonNull ContinueArrowBinding continueArrowBinding, @NonNull ContinueArrowBinding continueArrowBinding2, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.rootView = linearLayout;
        this.displayEndTime = continueArrowBinding;
        this.displayStartTime = continueArrowBinding2;
        this.endTime = relativeLayout;
        this.startTime = relativeLayout2;
        this.tvCancel = textView;
        this.tvDoNotDisturbHint = textView2;
        this.tvEndTime = textView3;
        this.tvSave = textView4;
        this.tvStartTime = textView5;
        this.tvTitle = textView6;
    }

    @NonNull
    public static ActivityPeriodChooceBinding bind(@NonNull View view) {
        int i8 = R.id.display_end_time;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.display_end_time);
        if (findChildViewById != null) {
            ContinueArrowBinding bind = ContinueArrowBinding.bind(findChildViewById);
            i8 = R.id.display_start_time;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.display_start_time);
            if (findChildViewById2 != null) {
                ContinueArrowBinding bind2 = ContinueArrowBinding.bind(findChildViewById2);
                i8 = R.id.end_time;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.end_time);
                if (relativeLayout != null) {
                    i8 = R.id.start_time;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.start_time);
                    if (relativeLayout2 != null) {
                        i8 = R.id.tv_cancel;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
                        if (textView != null) {
                            i8 = R.id.tv_do_not_disturb_hint;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_do_not_disturb_hint);
                            if (textView2 != null) {
                                i8 = R.id.tv_end_time;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_end_time);
                                if (textView3 != null) {
                                    i8 = R.id.tv_save;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_save);
                                    if (textView4 != null) {
                                        i8 = R.id.tv_start_time;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_time);
                                        if (textView5 != null) {
                                            i8 = R.id.tv_title;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                            if (textView6 != null) {
                                                return new ActivityPeriodChooceBinding((LinearLayout) view, bind, bind2, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityPeriodChooceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityPeriodChooceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_period_chooce, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
