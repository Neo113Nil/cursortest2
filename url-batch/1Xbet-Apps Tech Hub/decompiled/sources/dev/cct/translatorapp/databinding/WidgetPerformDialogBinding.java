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
public final class WidgetPerformDialogBinding implements ViewBinding {
    public final ConstraintLayout GoToPremiumBtn;
    public final ImageView crownIcon;
    public final TextView detailTxt;
    public final TextView detailvideoAdTxt;
    public final TextView premiumTxt;
    private final ConstraintLayout rootView;
    public final ImageView videoIcon;
    public final TextView watchTxt;
    public final ConstraintLayout watchVideoAdBtn;

    private WidgetPerformDialogBinding(ConstraintLayout rootView, ConstraintLayout GoToPremiumBtn, ImageView crownIcon, TextView detailTxt, TextView detailvideoAdTxt, TextView premiumTxt, ImageView videoIcon, TextView watchTxt, ConstraintLayout watchVideoAdBtn) {
        this.rootView = rootView;
        this.GoToPremiumBtn = GoToPremiumBtn;
        this.crownIcon = crownIcon;
        this.detailTxt = detailTxt;
        this.detailvideoAdTxt = detailvideoAdTxt;
        this.premiumTxt = premiumTxt;
        this.videoIcon = videoIcon;
        this.watchTxt = watchTxt;
        this.watchVideoAdBtn = watchVideoAdBtn;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static WidgetPerformDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static WidgetPerformDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.widget_perform_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static WidgetPerformDialogBinding bind(View rootView) {
        int i = R.id.GoToPremiumBtn;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.GoToPremiumBtn);
        if (constraintLayout != null) {
            i = R.id.crownIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.crownIcon);
            if (imageView != null) {
                i = R.id.detailTxt;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.detailTxt);
                if (textView != null) {
                    i = R.id.detailvideoAdTxt;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.detailvideoAdTxt);
                    if (textView2 != null) {
                        i = R.id.premiumTxt;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.premiumTxt);
                        if (textView3 != null) {
                            i = R.id.videoIcon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.videoIcon);
                            if (imageView2 != null) {
                                i = R.id.watchTxt;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.watchTxt);
                                if (textView4 != null) {
                                    i = R.id.watchVideoAdBtn;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.watchVideoAdBtn);
                                    if (constraintLayout2 != null) {
                                        return new WidgetPerformDialogBinding((ConstraintLayout) rootView, constraintLayout, imageView, textView, textView2, textView3, imageView2, textView4, constraintLayout2);
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
