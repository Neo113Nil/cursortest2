package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityTranslatorResultViewBinding implements ViewBinding {
    public final ImageView back;
    public final ImageView backToResultView;
    public final TextView outputTextResult;
    private final ConstraintLayout rootView;
    public final ImageView speakIcon;

    private ActivityTranslatorResultViewBinding(ConstraintLayout rootView, ImageView back, ImageView backToResultView, TextView outputTextResult, ImageView speakIcon) {
        this.rootView = rootView;
        this.back = back;
        this.backToResultView = backToResultView;
        this.outputTextResult = outputTextResult;
        this.speakIcon = speakIcon;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTranslatorResultViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityTranslatorResultViewBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_translator_result_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityTranslatorResultViewBinding bind(View rootView) {
        int i = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back);
        if (imageView != null) {
            i = R.id.backToResultView;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.backToResultView);
            if (imageView2 != null) {
                i = R.id.outputTextResult;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.outputTextResult);
                if (textView != null) {
                    i = R.id.speak_icon;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speak_icon);
                    if (imageView3 != null) {
                        return new ActivityTranslatorResultViewBinding((ConstraintLayout) rootView, imageView, imageView2, textView, imageView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
