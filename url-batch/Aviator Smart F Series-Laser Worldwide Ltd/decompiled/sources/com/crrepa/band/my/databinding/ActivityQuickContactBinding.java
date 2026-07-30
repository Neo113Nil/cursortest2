package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.CornerProgressBar;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* loaded from: classes2.dex */
public final class ActivityQuickContactBinding implements ViewBinding {

    @NonNull
    public final Button btnAddContact;

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    public final LinearLayout llEmptyContart;

    @NonNull
    public final CornerProgressBar pbEditContact;

    @NonNull
    public final SwipeRecyclerView rcvContactList;

    @NonNull
    public final RelativeLayout rlContactDone;

    @NonNull
    public final RelativeLayout rlContactList;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final TextView tvEditState;

    @NonNull
    public final TextView tvQuickContactHint;

    private ActivityQuickContactBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Button button, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull LinearLayout linearLayout, @NonNull CornerProgressBar cornerProgressBar, @NonNull SwipeRecyclerView swipeRecyclerView, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = coordinatorLayout;
        this.btnAddContact = button;
        this.includeTitle = bandDataAppbarBinding;
        this.llEmptyContart = linearLayout;
        this.pbEditContact = cornerProgressBar;
        this.rcvContactList = swipeRecyclerView;
        this.rlContactDone = relativeLayout;
        this.rlContactList = relativeLayout2;
        this.tvEditState = textView;
        this.tvQuickContactHint = textView2;
    }

    @NonNull
    public static ActivityQuickContactBinding bind(@NonNull View view) {
        int i8 = R.id.btn_add_contact;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_add_contact);
        if (button != null) {
            i8 = R.id.include_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
            if (findChildViewById != null) {
                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                i8 = R.id.ll_empty_contart;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_empty_contart);
                if (linearLayout != null) {
                    i8 = R.id.pb_edit_contact;
                    CornerProgressBar cornerProgressBar = (CornerProgressBar) ViewBindings.findChildViewById(view, R.id.pb_edit_contact);
                    if (cornerProgressBar != null) {
                        i8 = R.id.rcv_contact_list;
                        SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_contact_list);
                        if (swipeRecyclerView != null) {
                            i8 = R.id.rl_contact_done;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_contact_done);
                            if (relativeLayout != null) {
                                i8 = R.id.rl_contact_list;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_contact_list);
                                if (relativeLayout2 != null) {
                                    i8 = R.id.tv_edit_state;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_edit_state);
                                    if (textView != null) {
                                        i8 = R.id.tv_quick_contact_hint;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_quick_contact_hint);
                                        if (textView2 != null) {
                                            return new ActivityQuickContactBinding((CoordinatorLayout) view, button, bind, linearLayout, cornerProgressBar, swipeRecyclerView, relativeLayout, relativeLayout2, textView, textView2);
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
    public static ActivityQuickContactBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityQuickContactBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_quick_contact, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
