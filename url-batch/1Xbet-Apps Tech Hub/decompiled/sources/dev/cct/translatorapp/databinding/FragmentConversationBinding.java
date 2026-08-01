package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class FragmentConversationBinding implements ViewBinding {
    public final FrameLayout adFrame;
    public final MaterialCardView adLayout;
    public final TextView loadingAdTxt;
    private final ConstraintLayout rootView;

    private FragmentConversationBinding(ConstraintLayout rootView, FrameLayout adFrame, MaterialCardView adLayout, TextView loadingAdTxt) {
        this.rootView = rootView;
        this.adFrame = adFrame;
        this.adLayout = adLayout;
        this.loadingAdTxt = loadingAdTxt;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentConversationBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentConversationBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_conversation, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentConversationBinding bind(View rootView) {
        int i = R.id.adFrame;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.adFrame);
        if (frameLayout != null) {
            i = R.id.adLayout;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.adLayout);
            if (materialCardView != null) {
                i = R.id.loadingAdTxt;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.loadingAdTxt);
                if (textView != null) {
                    return new FragmentConversationBinding((ConstraintLayout) rootView, frameLayout, materialCardView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
