package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class DialogCoachActionTypeBinding implements ViewBinding {

    @NonNull
    public final View line1;

    @NonNull
    public final View line2;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final RecyclerView rvType;

    @NonNull
    public final TextView tvDuration;

    @NonNull
    public final TextView tvDurationUnit;

    @NonNull
    public final TextView tvKcal;

    @NonNull
    public final TextView tvKcalUnit;

    @NonNull
    public final TextView tvLevel;

    @NonNull
    public final TextView tvMoves;

    @NonNull
    public final TextView tvMovesUnit;

    @NonNull
    public final TextView tvTitle;

    private DialogCoachActionTypeBinding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull View view2, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.rootView = frameLayout;
        this.line1 = view;
        this.line2 = view2;
        this.rvType = recyclerView;
        this.tvDuration = textView;
        this.tvDurationUnit = textView2;
        this.tvKcal = textView3;
        this.tvKcalUnit = textView4;
        this.tvLevel = textView5;
        this.tvMoves = textView6;
        this.tvMovesUnit = textView7;
        this.tvTitle = textView8;
    }

    @NonNull
    public static DialogCoachActionTypeBinding bind(@NonNull View view) {
        View findChildViewById;
        int i8 = R$id.line1;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i8);
        if (findChildViewById2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.line2))) != null) {
            i8 = R$id.rv_type;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
            if (recyclerView != null) {
                i8 = R$id.tv_duration;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView != null) {
                    i8 = R$id.tv_duration_unit;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                    if (textView2 != null) {
                        i8 = R$id.tv_kcal;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView3 != null) {
                            i8 = R$id.tv_kcal_unit;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                            if (textView4 != null) {
                                i8 = R$id.tv_level;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i8);
                                if (textView5 != null) {
                                    i8 = R$id.tv_moves;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i8);
                                    if (textView6 != null) {
                                        i8 = R$id.tv_moves_unit;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i8);
                                        if (textView7 != null) {
                                            i8 = R$id.tv_title;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i8);
                                            if (textView8 != null) {
                                                return new DialogCoachActionTypeBinding((FrameLayout) view, findChildViewById2, findChildViewById, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static DialogCoachActionTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogCoachActionTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.dialog_coach_action_type, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
