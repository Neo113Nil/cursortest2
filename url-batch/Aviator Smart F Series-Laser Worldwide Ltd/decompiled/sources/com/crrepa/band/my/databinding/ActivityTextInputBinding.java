package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityTextInputBinding implements ViewBinding {

    @NonNull
    public final EditText etTextInput;

    @NonNull
    public final RelativeLayout rlTextInputContent;

    @NonNull
    public final RelativeLayout rlTextInputTop;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvTextInputCancel;

    @NonNull
    public final TextView tvTextInputSave;

    @NonNull
    public final TextView tvTextInputSize;

    @NonNull
    public final TextView tvTextInputTitle;

    private ActivityTextInputBinding(@NonNull RelativeLayout relativeLayout, @NonNull EditText editText, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.etTextInput = editText;
        this.rlTextInputContent = relativeLayout2;
        this.rlTextInputTop = relativeLayout3;
        this.tvTextInputCancel = textView;
        this.tvTextInputSave = textView2;
        this.tvTextInputSize = textView3;
        this.tvTextInputTitle = textView4;
    }

    @NonNull
    public static ActivityTextInputBinding bind(@NonNull View view) {
        int i8 = R.id.et_text_input;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_text_input);
        if (editText != null) {
            i8 = R.id.rl_text_input_content;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_text_input_content);
            if (relativeLayout != null) {
                i8 = R.id.rl_text_input_top;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_text_input_top);
                if (relativeLayout2 != null) {
                    i8 = R.id.tv_text_input_cancel;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_text_input_cancel);
                    if (textView != null) {
                        i8 = R.id.tv_text_input_save;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_text_input_save);
                        if (textView2 != null) {
                            i8 = R.id.tv_text_input_size;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_text_input_size);
                            if (textView3 != null) {
                                i8 = R.id.tv_text_input_title;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_text_input_title);
                                if (textView4 != null) {
                                    return new ActivityTextInputBinding((RelativeLayout) view, editText, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4);
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
    public static ActivityTextInputBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTextInputBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_text_input, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
