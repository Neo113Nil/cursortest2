package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemCricketRankingBinding implements ViewBinding {

    @NonNull
    public final ImageView ivFlag;

    @NonNull
    public final LinearLayout rlItemCricketRanking;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvLose;

    @NonNull
    public final TextView tvPl;

    @NonNull
    public final TextView tvPts;

    @NonNull
    public final TextView tvRank;

    @NonNull
    public final TextView tvTeamName;

    @NonNull
    public final TextView tvWin;

    private ItemCricketRankingBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.rootView = linearLayout;
        this.ivFlag = imageView;
        this.rlItemCricketRanking = linearLayout2;
        this.tvLose = textView;
        this.tvPl = textView2;
        this.tvPts = textView3;
        this.tvRank = textView4;
        this.tvTeamName = textView5;
        this.tvWin = textView6;
    }

    @NonNull
    public static ItemCricketRankingBinding bind(@NonNull View view) {
        int i8 = R.id.iv_flag;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_flag);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.tv_lose;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_lose);
            if (textView != null) {
                i8 = R.id.tv_pl;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pl);
                if (textView2 != null) {
                    i8 = R.id.tv_pts;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pts);
                    if (textView3 != null) {
                        i8 = R.id.tv_rank;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_rank);
                        if (textView4 != null) {
                            i8 = R.id.tv_team_name;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_team_name);
                            if (textView5 != null) {
                                i8 = R.id.tv_win;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_win);
                                if (textView6 != null) {
                                    return new ItemCricketRankingBinding(linearLayout, imageView, linearLayout, textView, textView2, textView3, textView4, textView5, textView6);
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
    public static ItemCricketRankingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemCricketRankingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_cricket_ranking, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
