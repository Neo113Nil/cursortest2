package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class DeleteDialogBinding implements ViewBinding {
    public final MaterialButton cancelBtn;
    public final Button deleteBtn;
    public final ImageView imageView;
    private final ConstraintLayout rootView;
    public final TextView textView3;
    public final TextView textView5;

    private DeleteDialogBinding(ConstraintLayout rootView, MaterialButton cancelBtn, Button deleteBtn, ImageView imageView, TextView textView3, TextView textView5) {
        this.rootView = rootView;
        this.cancelBtn = cancelBtn;
        this.deleteBtn = deleteBtn;
        this.imageView = imageView;
        this.textView3 = textView3;
        this.textView5 = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DeleteDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DeleteDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.delete_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DeleteDialogBinding bind(View rootView) {
        int i = R.id.cancel_btn;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(rootView, R.id.cancel_btn);
        if (materialButton != null) {
            i = R.id.delete_btn;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.delete_btn);
            if (button != null) {
                i = R.id.imageView;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
                if (imageView != null) {
                    i = R.id.textView3;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView3);
                    if (textView != null) {
                        i = R.id.textView5;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView5);
                        if (textView2 != null) {
                            return new DeleteDialogBinding((ConstraintLayout) rootView, materialButton, button, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
