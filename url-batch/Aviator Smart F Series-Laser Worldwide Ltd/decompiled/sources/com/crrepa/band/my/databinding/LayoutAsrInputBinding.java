package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutAsrInputBinding implements ViewBinding {

    @NonNull
    public final EditText etInput;

    @NonNull
    public final Button ivKeyboardSend;

    @NonNull
    public final Button ivSwitch2Keyboard;

    @NonNull
    public final Button ivSwitch2Voice;

    @NonNull
    public final RelativeLayout rlAsrInput;

    @NonNull
    public final RelativeLayout rlInputKeyboard;

    @NonNull
    public final RelativeLayout rlInputVoice;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvVoiceHandle;

    private LayoutAsrInputBinding(@NonNull RelativeLayout relativeLayout, @NonNull EditText editText, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.etInput = editText;
        this.ivKeyboardSend = button;
        this.ivSwitch2Keyboard = button2;
        this.ivSwitch2Voice = button3;
        this.rlAsrInput = relativeLayout2;
        this.rlInputKeyboard = relativeLayout3;
        this.rlInputVoice = relativeLayout4;
        this.tvVoiceHandle = textView;
    }

    @NonNull
    public static LayoutAsrInputBinding bind(@NonNull View view) {
        int i8 = R.id.et_input;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_input);
        if (editText != null) {
            i8 = R.id.iv_keyboard_send;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.iv_keyboard_send);
            if (button != null) {
                i8 = R.id.iv_switch_2_keyboard;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.iv_switch_2_keyboard);
                if (button2 != null) {
                    i8 = R.id.iv_switch_2_voice;
                    Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.iv_switch_2_voice);
                    if (button3 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i8 = R.id.rl_input_keyboard;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_input_keyboard);
                        if (relativeLayout2 != null) {
                            i8 = R.id.rl_input_voice;
                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_input_voice);
                            if (relativeLayout3 != null) {
                                i8 = R.id.tv_voice_handle;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_voice_handle);
                                if (textView != null) {
                                    return new LayoutAsrInputBinding(relativeLayout, editText, button, button2, button3, relativeLayout, relativeLayout2, relativeLayout3, textView);
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
    public static LayoutAsrInputBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutAsrInputBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_asr_input, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
