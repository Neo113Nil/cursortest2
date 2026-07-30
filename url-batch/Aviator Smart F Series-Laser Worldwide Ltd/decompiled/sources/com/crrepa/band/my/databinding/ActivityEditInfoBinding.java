package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityEditInfoBinding implements ViewBinding {

    @NonNull
    public final Button btnEditInfoDone;

    @NonNull
    public final AppToolbarBinding editInfoBar;

    @NonNull
    public final RecyclerView rcvEditInfo;

    @NonNull
    public final RelativeLayout rlEditInfo;

    @NonNull
    private final RelativeLayout rootView;

    private ActivityEditInfoBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull AppToolbarBinding appToolbarBinding, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.btnEditInfoDone = button;
        this.editInfoBar = appToolbarBinding;
        this.rcvEditInfo = recyclerView;
        this.rlEditInfo = relativeLayout2;
    }

    @NonNull
    public static ActivityEditInfoBinding bind(@NonNull View view) {
        int i8 = R.id.btn_edit_info_done;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_edit_info_done);
        if (button != null) {
            i8 = R.id.edit_info_bar;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.edit_info_bar);
            if (findChildViewById != null) {
                AppToolbarBinding bind = AppToolbarBinding.bind(findChildViewById);
                i8 = R.id.rcv_edit_info;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_edit_info);
                if (recyclerView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new ActivityEditInfoBinding(relativeLayout, button, bind, recyclerView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityEditInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityEditInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_edit_info, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
