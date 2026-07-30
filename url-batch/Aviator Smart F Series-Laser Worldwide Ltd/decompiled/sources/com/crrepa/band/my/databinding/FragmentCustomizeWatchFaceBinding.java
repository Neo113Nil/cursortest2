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
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* loaded from: classes2.dex */
public final class FragmentCustomizeWatchFaceBinding implements ViewBinding {

    @NonNull
    public final SwipeRecyclerView rcvWatchFaceList;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvEditWatchFaceHint;

    private FragmentCustomizeWatchFaceBinding(@NonNull LinearLayout linearLayout, @NonNull SwipeRecyclerView swipeRecyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.rcvWatchFaceList = swipeRecyclerView;
        this.tvEditWatchFaceHint = textView;
    }

    @NonNull
    public static FragmentCustomizeWatchFaceBinding bind(@NonNull View view) {
        int i8 = R.id.rcv_watch_face_list;
        SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_watch_face_list);
        if (swipeRecyclerView != null) {
            i8 = R.id.tv_edit_watch_face_hint;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_edit_watch_face_hint);
            if (textView != null) {
                return new FragmentCustomizeWatchFaceBinding((LinearLayout) view, swipeRecyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentCustomizeWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentCustomizeWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_customize_watch_face, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
