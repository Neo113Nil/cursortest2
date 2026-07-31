package com.linecorp.linesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import androidx.databinding.o;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.openchat.ui.OpenChatInfoViewModel;

/* loaded from: classes2.dex */
public abstract class OpenChatInfoFragmentBinding extends o {

    @NonNull
    public final View categoryDivider;

    @NonNull
    public final TextView categoryGuide;

    @NonNull
    public final TextView categoryLabelTextView;

    @NonNull
    public final TextView categoryTitle;

    @NonNull
    public final TextView descriptionDetail;

    @NonNull
    public final View descriptionDivider;

    @NonNull
    public final EditText descriptionEditText;

    @NonNull
    public final TextView descriptionMaxTextView;
    protected OpenChatInfoViewModel mViewModel;

    @NonNull
    public final View nameDivider;

    @NonNull
    public final EditText nameEditText;

    @NonNull
    public final TextView nameMaxTextView;

    @NonNull
    public final TextView searchDescription;

    @NonNull
    public final CheckBox searchIncludedCheckBox;

    @NonNull
    public final ConstraintLayout searchIncludedContainer;

    @NonNull
    public final TextView searchTitle;

    protected OpenChatInfoFragmentBinding(Object obj, View view, int i4, View view2, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view3, EditText editText, TextView textView5, View view4, EditText editText2, TextView textView6, TextView textView7, CheckBox checkBox, ConstraintLayout constraintLayout, TextView textView8) {
        super(obj, view, i4);
        this.categoryDivider = view2;
        this.categoryGuide = textView;
        this.categoryLabelTextView = textView2;
        this.categoryTitle = textView3;
        this.descriptionDetail = textView4;
        this.descriptionDivider = view3;
        this.descriptionEditText = editText;
        this.descriptionMaxTextView = textView5;
        this.nameDivider = view4;
        this.nameEditText = editText2;
        this.nameMaxTextView = textView6;
        this.searchDescription = textView7;
        this.searchIncludedCheckBox = checkBox;
        this.searchIncludedContainer = constraintLayout;
        this.searchTitle = textView8;
    }

    public static OpenChatInfoFragmentBinding bind(@NonNull View view) {
        return bind(view, f.d());
    }

    @NonNull
    public static OpenChatInfoFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        return inflate(layoutInflater, viewGroup, z4, f.d());
    }

    public OpenChatInfoViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(OpenChatInfoViewModel openChatInfoViewModel);

    @Deprecated
    public static OpenChatInfoFragmentBinding bind(@NonNull View view, Object obj) {
        return (OpenChatInfoFragmentBinding) o.bind(obj, view, R.layout.open_chat_info_fragment);
    }

    @NonNull
    @Deprecated
    public static OpenChatInfoFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (OpenChatInfoFragmentBinding) o.inflateInternal(layoutInflater, R.layout.open_chat_info_fragment, viewGroup, z4, obj);
    }

    @NonNull
    public static OpenChatInfoFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, f.d());
    }

    @NonNull
    @Deprecated
    public static OpenChatInfoFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, Object obj) {
        return (OpenChatInfoFragmentBinding) o.inflateInternal(layoutInflater, R.layout.open_chat_info_fragment, null, false, obj);
    }
}
