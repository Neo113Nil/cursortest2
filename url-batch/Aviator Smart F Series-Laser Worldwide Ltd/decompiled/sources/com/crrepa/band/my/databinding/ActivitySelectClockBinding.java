package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import me.yokeyword.indexablerv.IndexableLayout;

/* loaded from: classes2.dex */
public final class ActivitySelectClockBinding implements ViewBinding {

    @NonNull
    public final IndexableLayout clockIndexableLayout;

    @NonNull
    public final EditText etInput;

    @NonNull
    public final RecyclerView rcvSearchResult;

    @NonNull
    public final RelativeLayout rlInput;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvClear;

    @NonNull
    public final TextView tvEmpty;

    @NonNull
    public final TextView tvTitle;

    private ActivitySelectClockBinding(@NonNull LinearLayout linearLayout, @NonNull IndexableLayout indexableLayout, @NonNull EditText editText, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = linearLayout;
        this.clockIndexableLayout = indexableLayout;
        this.etInput = editText;
        this.rcvSearchResult = recyclerView;
        this.rlInput = relativeLayout;
        this.tvCancel = textView;
        this.tvClear = textView2;
        this.tvEmpty = textView3;
        this.tvTitle = textView4;
    }

    @NonNull
    public static ActivitySelectClockBinding bind(@NonNull View view) {
        int i8 = R.id.clock_indexable_layout;
        IndexableLayout indexableLayout = (IndexableLayout) ViewBindings.findChildViewById(view, R.id.clock_indexable_layout);
        if (indexableLayout != null) {
            i8 = R.id.et_input;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_input);
            if (editText != null) {
                i8 = R.id.rcv_search_result;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_search_result);
                if (recyclerView != null) {
                    i8 = R.id.rl_input;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_input);
                    if (relativeLayout != null) {
                        i8 = R.id.tv_cancel;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
                        if (textView != null) {
                            i8 = R.id.tv_clear;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_clear);
                            if (textView2 != null) {
                                i8 = R.id.tv_empty;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_empty);
                                if (textView3 != null) {
                                    i8 = R.id.tv_title;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                    if (textView4 != null) {
                                        return new ActivitySelectClockBinding((LinearLayout) view, indexableLayout, editText, recyclerView, relativeLayout, textView, textView2, textView3, textView4);
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
    public static ActivitySelectClockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivitySelectClockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_select_clock, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
