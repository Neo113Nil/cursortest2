package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import kotlin.text.Regex$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class MdocComponentKt {
    public static final LinearLayout makeView(MdocComponent mdocComponent, MarkwonImpl markwonImpl, Mdoc mdoc) {
        LinearLayout linearLayout = new LinearLayout((Context) markwonImpl.parser);
        linearLayout.setOrientation(1);
        View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.pi2_verify_with_google_wallet, (ViewGroup) linearLayout, false);
        int i = R.id.icon;
        if (((ImageView) ViewBindings.findChildViewById(inflate, R.id.icon)) != null) {
            i = R.id.overline;
            if (((TextView) ViewBindings.findChildViewById(inflate, R.id.overline)) != null) {
                i = R.id.text;
                if (((TextView) ViewBindings.findChildViewById(inflate, R.id.text)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    linearLayout.addView(constraintLayout);
                    constraintLayout.getClass();
                    ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                    if (layoutParams == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        return null;
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 17;
                    constraintLayout.setLayoutParams(layoutParams2);
                    TextView textView = new TextView(linearLayout.getContext());
                    textView.setId(R.id.pi2_government_id_nfc_scan_error_label);
                    ((LinkedList) markwonImpl.plugins).add(new Regex$$ExternalSyntheticLambda1(11, textView, mdoc));
                    linearLayout.addView(textView);
                    ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                    if (layoutParams3 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        return null;
                    }
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = (int) ExtensionsKt.getDpToPx(8.0d);
                    layoutParams4.gravity = 17;
                    textView.setLayoutParams(layoutParams4);
                    linearLayout.setTag(new MdocComponentViewHolder(constraintLayout, textView));
                    return linearLayout;
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
