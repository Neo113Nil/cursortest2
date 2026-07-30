package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemResponseContentBinding implements ViewBinding {

    @NonNull
    public final EditText etResponseContent;

    @NonNull
    public final ImageView ivDeleteResponse;

    @NonNull
    public final View lineResponse;

    @NonNull
    private final RelativeLayout rootView;

    private ItemResponseContentBinding(@NonNull RelativeLayout relativeLayout, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull View view) {
        this.rootView = relativeLayout;
        this.etResponseContent = editText;
        this.ivDeleteResponse = imageView;
        this.lineResponse = view;
    }

    @NonNull
    public static ItemResponseContentBinding bind(@NonNull View view) {
        int i8 = R.id.et_response_content;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_response_content);
        if (editText != null) {
            i8 = R.id.iv_delete_response;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_delete_response);
            if (imageView != null) {
                i8 = R.id.line_response;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_response);
                if (findChildViewById != null) {
                    return new ItemResponseContentBinding((RelativeLayout) view, editText, imageView, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemResponseContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemResponseContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_response_content, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
