package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.CustomRecyclerView;

/* loaded from: classes2.dex */
public final class HeaderWatchFaceListBinding implements ViewBinding {

    @NonNull
    public final CustomRecyclerView rcvWatchFaceList;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDownloadWatchFaceEdit;

    private HeaderWatchFaceListBinding(@NonNull LinearLayout linearLayout, @NonNull CustomRecyclerView customRecyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.rcvWatchFaceList = customRecyclerView;
        this.tvDownloadWatchFaceEdit = textView;
    }

    @NonNull
    public static HeaderWatchFaceListBinding bind(@NonNull View view) {
        int i8 = R.id.rcv_watch_face_list;
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_watch_face_list);
        if (customRecyclerView != null) {
            i8 = R.id.tv_download_watch_face_edit;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_download_watch_face_edit);
            if (textView != null) {
                return new HeaderWatchFaceListBinding((LinearLayout) view, customRecyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static HeaderWatchFaceListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HeaderWatchFaceListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.header_watch_face_list, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
