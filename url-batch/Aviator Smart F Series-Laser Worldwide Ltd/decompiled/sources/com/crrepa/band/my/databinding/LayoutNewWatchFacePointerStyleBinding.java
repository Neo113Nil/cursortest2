package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutNewWatchFacePointerStyleBinding implements ViewBinding {

    @NonNull
    public final LayoutNewWatchFaceLabelColorPickerBinding includeColorPicker;

    @NonNull
    public final LayoutNewWatchFacePointStyleWidgetPickerBinding includeLabel0;

    @NonNull
    public final LayoutNewWatchFacePointStyleWidgetPickerBinding includeLabel1;

    @NonNull
    public final LayoutNewWatchFacePointStyleWidgetPickerBinding includeLabel2;

    @NonNull
    public final LayoutNewWatchFacePointStyleWidgetPickerBinding includeLabel3;

    @NonNull
    public final LinearLayout llRoot;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvPoint;

    @NonNull
    public final TextView tvPointStyleTitle;

    private LayoutNewWatchFacePointerStyleBinding(@NonNull LinearLayout linearLayout, @NonNull LayoutNewWatchFaceLabelColorPickerBinding layoutNewWatchFaceLabelColorPickerBinding, @NonNull LayoutNewWatchFacePointStyleWidgetPickerBinding layoutNewWatchFacePointStyleWidgetPickerBinding, @NonNull LayoutNewWatchFacePointStyleWidgetPickerBinding layoutNewWatchFacePointStyleWidgetPickerBinding2, @NonNull LayoutNewWatchFacePointStyleWidgetPickerBinding layoutNewWatchFacePointStyleWidgetPickerBinding3, @NonNull LayoutNewWatchFacePointStyleWidgetPickerBinding layoutNewWatchFacePointStyleWidgetPickerBinding4, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.includeColorPicker = layoutNewWatchFaceLabelColorPickerBinding;
        this.includeLabel0 = layoutNewWatchFacePointStyleWidgetPickerBinding;
        this.includeLabel1 = layoutNewWatchFacePointStyleWidgetPickerBinding2;
        this.includeLabel2 = layoutNewWatchFacePointStyleWidgetPickerBinding3;
        this.includeLabel3 = layoutNewWatchFacePointStyleWidgetPickerBinding4;
        this.llRoot = linearLayout2;
        this.rvPoint = recyclerView;
        this.tvPointStyleTitle = textView;
    }

    @NonNull
    public static LayoutNewWatchFacePointerStyleBinding bind(@NonNull View view) {
        int i8 = R.id.include_color_picker;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_color_picker);
        if (findChildViewById != null) {
            LayoutNewWatchFaceLabelColorPickerBinding bind = LayoutNewWatchFaceLabelColorPickerBinding.bind(findChildViewById);
            i8 = R.id.include_label_0;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_label_0);
            if (findChildViewById2 != null) {
                LayoutNewWatchFacePointStyleWidgetPickerBinding bind2 = LayoutNewWatchFacePointStyleWidgetPickerBinding.bind(findChildViewById2);
                i8 = R.id.include_label_1;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_label_1);
                if (findChildViewById3 != null) {
                    LayoutNewWatchFacePointStyleWidgetPickerBinding bind3 = LayoutNewWatchFacePointStyleWidgetPickerBinding.bind(findChildViewById3);
                    i8 = R.id.include_label_2;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_label_2);
                    if (findChildViewById4 != null) {
                        LayoutNewWatchFacePointStyleWidgetPickerBinding bind4 = LayoutNewWatchFacePointStyleWidgetPickerBinding.bind(findChildViewById4);
                        i8 = R.id.include_label_3;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.include_label_3);
                        if (findChildViewById5 != null) {
                            LayoutNewWatchFacePointStyleWidgetPickerBinding bind5 = LayoutNewWatchFacePointStyleWidgetPickerBinding.bind(findChildViewById5);
                            LinearLayout linearLayout = (LinearLayout) view;
                            i8 = R.id.rv_point;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_point);
                            if (recyclerView != null) {
                                i8 = R.id.tv_point_style_title;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_point_style_title);
                                if (textView != null) {
                                    return new LayoutNewWatchFacePointerStyleBinding(linearLayout, bind, bind2, bind3, bind4, bind5, linearLayout, recyclerView, textView);
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
    public static LayoutNewWatchFacePointerStyleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFacePointerStyleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_pointer_style, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
