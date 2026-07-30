package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityAiChatBinding implements ViewBinding {

    @NonNull
    public final View debugView;

    @NonNull
    public final LayoutAsrInputBinding includeAsrInput;

    @NonNull
    public final ImageView ivTitleArrow;

    @NonNull
    public final RelativeLayout rlRootView;

    @NonNull
    public final RelativeLayout rlTitle;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rvRecords;

    @NonNull
    public final TextView tvBack;

    @NonNull
    public final TextView tvNewTopic;

    @NonNull
    public final TextView tvTitle;

    private ActivityAiChatBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull LayoutAsrInputBinding layoutAsrInputBinding, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.debugView = view;
        this.includeAsrInput = layoutAsrInputBinding;
        this.ivTitleArrow = imageView;
        this.rlRootView = relativeLayout2;
        this.rlTitle = relativeLayout3;
        this.rvRecords = recyclerView;
        this.tvBack = textView;
        this.tvNewTopic = textView2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static ActivityAiChatBinding bind(@NonNull View view) {
        int i8 = R.id.debug_view;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.debug_view);
        if (findChildViewById != null) {
            i8 = R.id.include_asr_input;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_asr_input);
            if (findChildViewById2 != null) {
                LayoutAsrInputBinding bind = LayoutAsrInputBinding.bind(findChildViewById2);
                i8 = R.id.iv_title_arrow;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_arrow);
                if (imageView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i8 = R.id.rl_title;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_title);
                    if (relativeLayout2 != null) {
                        i8 = R.id.rv_records;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_records);
                        if (recyclerView != null) {
                            i8 = R.id.tv_back;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_back);
                            if (textView != null) {
                                i8 = R.id.tv_new_topic;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_new_topic);
                                if (textView2 != null) {
                                    i8 = R.id.tv_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                    if (textView3 != null) {
                                        return new ActivityAiChatBinding(relativeLayout, findChildViewById, bind, imageView, relativeLayout, relativeLayout2, recyclerView, textView, textView2, textView3);
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
    public static ActivityAiChatBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityAiChatBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_ai_chat, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
