package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DataTitleBarBinding implements ViewBinding {

    @NonNull
    public final Button btnTitleBack;

    @NonNull
    public final Button btnTitleHistory;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RelativeLayout titleBar;

    @NonNull
    public final TextView tvTitle;

    private DataTitleBarBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.btnTitleBack = button;
        this.btnTitleHistory = button2;
        this.titleBar = relativeLayout2;
        this.tvTitle = textView;
    }

    @NonNull
    public static DataTitleBarBinding bind(@NonNull View view) {
        int i8 = R.id.btn_title_back;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_title_back);
        if (button != null) {
            i8 = R.id.btn_title_history;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_title_history);
            if (button2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i8 = R.id.tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView != null) {
                    return new DataTitleBarBinding(relativeLayout, button, button2, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DataTitleBarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DataTitleBarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.data_title_bar, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
