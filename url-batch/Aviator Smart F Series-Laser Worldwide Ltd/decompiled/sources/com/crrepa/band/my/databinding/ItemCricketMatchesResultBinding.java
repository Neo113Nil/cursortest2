package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemCricketMatchesResultBinding implements ViewBinding {

    @NonNull
    public final View border;

    @NonNull
    public final Button btnReserve;

    @NonNull
    public final ImageView ivFirstTeam;

    @NonNull
    public final ImageView ivSecondTeam;

    @NonNull
    public final LinearLayout llMatchTime;

    @NonNull
    public final RelativeLayout rlMatchState;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvFirstPoints;

    @NonNull
    public final TextView tvFirstTeamName;

    @NonNull
    public final TextView tvMatchEnd;

    @NonNull
    public final TextView tvMatchSchedule;

    @NonNull
    public final TextView tvMatchTime;

    @NonNull
    public final TextView tvSecondPoints;

    @NonNull
    public final TextView tvSecondTeamName;

    private ItemCricketMatchesResultBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull Button button, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.rootView = relativeLayout;
        this.border = view;
        this.btnReserve = button;
        this.ivFirstTeam = imageView;
        this.ivSecondTeam = imageView2;
        this.llMatchTime = linearLayout;
        this.rlMatchState = relativeLayout2;
        this.tvFirstPoints = textView;
        this.tvFirstTeamName = textView2;
        this.tvMatchEnd = textView3;
        this.tvMatchSchedule = textView4;
        this.tvMatchTime = textView5;
        this.tvSecondPoints = textView6;
        this.tvSecondTeamName = textView7;
    }

    @NonNull
    public static ItemCricketMatchesResultBinding bind(@NonNull View view) {
        int i8 = R.id.border;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.border);
        if (findChildViewById != null) {
            i8 = R.id.btn_reserve;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_reserve);
            if (button != null) {
                i8 = R.id.iv_first_team;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_first_team);
                if (imageView != null) {
                    i8 = R.id.iv_second_team;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_second_team);
                    if (imageView2 != null) {
                        i8 = R.id.ll_match_time;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_match_time);
                        if (linearLayout != null) {
                            i8 = R.id.rl_match_state;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_match_state);
                            if (relativeLayout != null) {
                                i8 = R.id.tv_first_points;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_first_points);
                                if (textView != null) {
                                    i8 = R.id.tv_first_team_name;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_first_team_name);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_match_end;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_match_end);
                                        if (textView3 != null) {
                                            i8 = R.id.tv_match_schedule;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_match_schedule);
                                            if (textView4 != null) {
                                                i8 = R.id.tv_match_time;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_match_time);
                                                if (textView5 != null) {
                                                    i8 = R.id.tv_second_points;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_second_points);
                                                    if (textView6 != null) {
                                                        i8 = R.id.tv_second_team_name;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_second_team_name);
                                                        if (textView7 != null) {
                                                            return new ItemCricketMatchesResultBinding((RelativeLayout) view, findChildViewById, button, imageView, imageView2, linearLayout, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemCricketMatchesResultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemCricketMatchesResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_cricket_matches_result, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
