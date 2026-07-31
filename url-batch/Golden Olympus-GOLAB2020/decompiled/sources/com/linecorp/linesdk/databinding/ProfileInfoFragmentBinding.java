package com.linecorp.linesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.f;
import androidx.databinding.o;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.openchat.ui.OpenChatInfoViewModel;

/* loaded from: classes2.dex */
public abstract class ProfileInfoFragmentBinding extends o {

    @NonNull
    public final EditText displayNameEditText;

    @NonNull
    public final TextView displayNameGuide;
    protected OpenChatInfoViewModel mViewModel;

    protected ProfileInfoFragmentBinding(Object obj, View view, int i4, EditText editText, TextView textView) {
        super(obj, view, i4);
        this.displayNameEditText = editText;
        this.displayNameGuide = textView;
    }

    public static ProfileInfoFragmentBinding bind(@NonNull View view) {
        return bind(view, f.d());
    }

    @NonNull
    public static ProfileInfoFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        return inflate(layoutInflater, viewGroup, z4, f.d());
    }

    public OpenChatInfoViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(OpenChatInfoViewModel openChatInfoViewModel);

    @Deprecated
    public static ProfileInfoFragmentBinding bind(@NonNull View view, Object obj) {
        return (ProfileInfoFragmentBinding) o.bind(obj, view, R.layout.profile_info_fragment);
    }

    @NonNull
    @Deprecated
    public static ProfileInfoFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (ProfileInfoFragmentBinding) o.inflateInternal(layoutInflater, R.layout.profile_info_fragment, viewGroup, z4, obj);
    }

    @NonNull
    public static ProfileInfoFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, f.d());
    }

    @NonNull
    @Deprecated
    public static ProfileInfoFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, Object obj) {
        return (ProfileInfoFragmentBinding) o.inflateInternal(layoutInflater, R.layout.profile_info_fragment, null, false, obj);
    }
}
