package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class CloseAppDialogLayoutBinding implements ViewBinding {
    public final FrameLayout adFrame;
    public final MaterialCardView adLayout;
    public final TextView exit;
    public final TextView loadingText;
    private final ConstraintLayout rootView;
    public final ShimmerFrameLayout shimmerViewContainer1;

    private CloseAppDialogLayoutBinding(ConstraintLayout rootView, FrameLayout adFrame, MaterialCardView adLayout, TextView exit, TextView loadingText, ShimmerFrameLayout shimmerViewContainer1) {
        this.rootView = rootView;
        this.adFrame = adFrame;
        this.adLayout = adLayout;
        this.exit = exit;
        this.loadingText = loadingText;
        this.shimmerViewContainer1 = shimmerViewContainer1;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static CloseAppDialogLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static CloseAppDialogLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.close_app_dialog_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static CloseAppDialogLayoutBinding bind(View rootView) {
        int i = R.id.adFrame;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.adFrame);
        if (frameLayout != null) {
            i = R.id.adLayout;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.adLayout);
            if (materialCardView != null) {
                i = R.id.exit;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.exit);
                if (textView != null) {
                    i = R.id.loadingText;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.loadingText);
                    if (textView2 != null) {
                        i = R.id.shimmer_view_container1;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(rootView, R.id.shimmer_view_container1);
                        if (shimmerFrameLayout != null) {
                            return new CloseAppDialogLayoutBinding((ConstraintLayout) rootView, frameLayout, materialCardView, textView, textView2, shimmerFrameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
