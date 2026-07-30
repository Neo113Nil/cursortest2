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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityDownloadWatchFaceEditBinding implements ViewBinding {

    @NonNull
    public final Button btnAddWatchFace;

    @NonNull
    public final RecyclerView rcvDownloadWatchFace;

    @NonNull
    public final RelativeLayout rlWatchFaceEmpty;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvDone;

    @NonNull
    public final TextView tvEmpty;

    private ActivityDownloadWatchFaceEditBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.btnAddWatchFace = button;
        this.rcvDownloadWatchFace = recyclerView;
        this.rlWatchFaceEmpty = relativeLayout;
        this.tvCancel = textView;
        this.tvDone = textView2;
        this.tvEmpty = textView3;
    }

    @NonNull
    public static ActivityDownloadWatchFaceEditBinding bind(@NonNull View view) {
        int i8 = R.id.btn_add_watch_face;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_add_watch_face);
        if (button != null) {
            i8 = R.id.rcv_download_watch_face;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_download_watch_face);
            if (recyclerView != null) {
                i8 = R.id.rl_watch_face_empty;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_watch_face_empty);
                if (relativeLayout != null) {
                    i8 = R.id.tv_cancel;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
                    if (textView != null) {
                        i8 = R.id.tv_done;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_done);
                        if (textView2 != null) {
                            i8 = R.id.tv_empty;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_empty);
                            if (textView3 != null) {
                                return new ActivityDownloadWatchFaceEditBinding((LinearLayout) view, button, recyclerView, relativeLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityDownloadWatchFaceEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityDownloadWatchFaceEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_download_watch_face_edit, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
