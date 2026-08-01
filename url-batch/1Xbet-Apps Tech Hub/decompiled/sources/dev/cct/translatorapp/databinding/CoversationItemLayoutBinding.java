package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class CoversationItemLayoutBinding implements ViewBinding {
    public final ImageView checkbox;
    public final MaterialCardView conversationCardView;
    public final TextView inputText;
    public final TextView outputText;
    private final ConstraintLayout rootView;
    public final ImageView speakIcon;
    public final View view1;

    private CoversationItemLayoutBinding(ConstraintLayout rootView, ImageView checkbox, MaterialCardView conversationCardView, TextView inputText, TextView outputText, ImageView speakIcon, View view1) {
        this.rootView = rootView;
        this.checkbox = checkbox;
        this.conversationCardView = conversationCardView;
        this.inputText = inputText;
        this.outputText = outputText;
        this.speakIcon = speakIcon;
        this.view1 = view1;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static CoversationItemLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static CoversationItemLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.coversation_item_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static CoversationItemLayoutBinding bind(View rootView) {
        int i = R.id.checkbox;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.checkbox);
        if (imageView != null) {
            i = R.id.conversation_card_view;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.conversation_card_view);
            if (materialCardView != null) {
                i = R.id.input_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.input_text);
                if (textView != null) {
                    i = R.id.output_text;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.output_text);
                    if (textView2 != null) {
                        i = R.id.speak_icon;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.speak_icon);
                        if (imageView2 != null) {
                            i = R.id.view1;
                            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.view1);
                            if (findChildViewById != null) {
                                return new CoversationItemLayoutBinding((ConstraintLayout) rootView, imageView, materialCardView, textView, textView2, imageView2, findChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
