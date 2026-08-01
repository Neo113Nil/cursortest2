package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class PermissionDialogBinding implements ViewBinding {
    public final MaterialButton acceptBtn;
    public final MaterialButton cancelBtn;
    public final ConstraintLayout constraintLayout;
    public final TextView permissionTv;
    private final ConstraintLayout rootView;
    public final ImageView selectIcon;
    public final TextView textView10;
    public final TextView textView11;
    public final TextView textView13;
    public final TextView textView14;
    public final TextView textView6;
    public final TextView translateAnywhereTv;
    public final ImageView translatorIcon;
    public final TextView widgetTv;

    private PermissionDialogBinding(ConstraintLayout rootView, MaterialButton acceptBtn, MaterialButton cancelBtn, ConstraintLayout constraintLayout, TextView permissionTv, ImageView selectIcon, TextView textView10, TextView textView11, TextView textView13, TextView textView14, TextView textView6, TextView translateAnywhereTv, ImageView translatorIcon, TextView widgetTv) {
        this.rootView = rootView;
        this.acceptBtn = acceptBtn;
        this.cancelBtn = cancelBtn;
        this.constraintLayout = constraintLayout;
        this.permissionTv = permissionTv;
        this.selectIcon = selectIcon;
        this.textView10 = textView10;
        this.textView11 = textView11;
        this.textView13 = textView13;
        this.textView14 = textView14;
        this.textView6 = textView6;
        this.translateAnywhereTv = translateAnywhereTv;
        this.translatorIcon = translatorIcon;
        this.widgetTv = widgetTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static PermissionDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static PermissionDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.permission_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static PermissionDialogBinding bind(View rootView) {
        int i = R.id.accept_btn;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(rootView, R.id.accept_btn);
        if (materialButton != null) {
            i = R.id.cancel_btn;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(rootView, R.id.cancel_btn);
            if (materialButton2 != null) {
                i = R.id.constraintLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.constraintLayout);
                if (constraintLayout != null) {
                    i = R.id.permission_tv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.permission_tv);
                    if (textView != null) {
                        i = R.id.select_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.select_icon);
                        if (imageView != null) {
                            i = R.id.textView10;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView10);
                            if (textView2 != null) {
                                i = R.id.textView11;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView11);
                                if (textView3 != null) {
                                    i = R.id.textView13;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView13);
                                    if (textView4 != null) {
                                        i = R.id.textView14;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView14);
                                        if (textView5 != null) {
                                            i = R.id.textView6;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView6);
                                            if (textView6 != null) {
                                                i = R.id.translate_anywhere_tv;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.translate_anywhere_tv);
                                                if (textView7 != null) {
                                                    i = R.id.translator_icon;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.translator_icon);
                                                    if (imageView2 != null) {
                                                        i = R.id.widget_tv;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.widget_tv);
                                                        if (textView8 != null) {
                                                            return new PermissionDialogBinding((ConstraintLayout) rootView, materialButton, materialButton2, constraintLayout, textView, imageView, textView2, textView3, textView4, textView5, textView6, textView7, imageView2, textView8);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
