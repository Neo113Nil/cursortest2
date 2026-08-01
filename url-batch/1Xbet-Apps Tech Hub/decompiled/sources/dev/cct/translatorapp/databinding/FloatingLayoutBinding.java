package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class FloatingLayoutBinding implements ViewBinding {
    public final Button buttonMaximize;
    public final EditText descEditText;
    private final ConstraintLayout rootView;
    public final Button saveBtn;
    public final TextView titleText;

    private FloatingLayoutBinding(ConstraintLayout rootView, Button buttonMaximize, EditText descEditText, Button saveBtn, TextView titleText) {
        this.rootView = rootView;
        this.buttonMaximize = buttonMaximize;
        this.descEditText = descEditText;
        this.saveBtn = saveBtn;
        this.titleText = titleText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FloatingLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FloatingLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.floating_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FloatingLayoutBinding bind(View rootView) {
        int i = R.id.buttonMaximize;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.buttonMaximize);
        if (button != null) {
            i = R.id.descEditText;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.descEditText);
            if (editText != null) {
                i = R.id.saveBtn;
                Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.saveBtn);
                if (button2 != null) {
                    i = R.id.titleText;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.titleText);
                    if (textView != null) {
                        return new FloatingLayoutBinding((ConstraintLayout) rootView, button, editText, button2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
