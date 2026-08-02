package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes9.dex */
public final class Pi2InputSelectBottomSheetBinding implements ViewBinding {
    public final FrameLayout bottomSheet;
    public final LinearLayout listContent;
    public final View listContentSeparator;
    public final ImageView navBarBackButton;
    public final RecyclerView recyclerviewInquirySelectList;
    public final FrameLayout rootView;
    public final TextInputEditText searchBarEditText;
    public final TextInputLayout searchBarTextInput;
    public final View shadow;
    public final TextView textviewInputSelectSheetTitle;

    public Pi2InputSelectBottomSheetBinding(FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout, View view, ImageView imageView, RecyclerView recyclerView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, View view2, TextView textView) {
        this.rootView = frameLayout;
        this.bottomSheet = frameLayout2;
        this.listContent = linearLayout;
        this.listContentSeparator = view;
        this.navBarBackButton = imageView;
        this.recyclerviewInquirySelectList = recyclerView;
        this.searchBarEditText = textInputEditText;
        this.searchBarTextInput = textInputLayout;
        this.shadow = view2;
        this.textviewInputSelectSheetTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
