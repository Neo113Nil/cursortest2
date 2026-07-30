package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public final class ActivityQuickResponseSettingBinding implements ViewBinding {

    @NonNull
    public final Button btnResetResponseList;

    @NonNull
    public final CardView cardResponseList;

    @NonNull
    public final BandHistoryTitleBinding includedTitle;

    @NonNull
    public final RecyclerView rcvResponseList;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SwitchButton sbtnQuickResponse;

    @NonNull
    public final TextView tvQuickResponseSettingDesc;

    private ActivityQuickResponseSettingBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull CardView cardView, @NonNull BandHistoryTitleBinding bandHistoryTitleBinding, @NonNull RecyclerView recyclerView, @NonNull SwitchButton switchButton, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.btnResetResponseList = button;
        this.cardResponseList = cardView;
        this.includedTitle = bandHistoryTitleBinding;
        this.rcvResponseList = recyclerView;
        this.sbtnQuickResponse = switchButton;
        this.tvQuickResponseSettingDesc = textView;
    }

    @NonNull
    public static ActivityQuickResponseSettingBinding bind(@NonNull View view) {
        int i8 = R.id.btn_reset_response_list;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_reset_response_list);
        if (button != null) {
            i8 = R.id.card_response_list;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_response_list);
            if (cardView != null) {
                i8 = R.id.included_title;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.included_title);
                if (findChildViewById != null) {
                    BandHistoryTitleBinding bind = BandHistoryTitleBinding.bind(findChildViewById);
                    i8 = R.id.rcv_response_list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_response_list);
                    if (recyclerView != null) {
                        i8 = R.id.sbtn_quick_response;
                        SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_quick_response);
                        if (switchButton != null) {
                            i8 = R.id.tv_quick_response_setting_desc;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_quick_response_setting_desc);
                            if (textView != null) {
                                return new ActivityQuickResponseSettingBinding((LinearLayout) view, button, cardView, bind, recyclerView, switchButton, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityQuickResponseSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityQuickResponseSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_quick_response_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
