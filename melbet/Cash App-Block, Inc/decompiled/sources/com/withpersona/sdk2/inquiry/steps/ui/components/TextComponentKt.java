package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiTextBinding;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import kotlin.text.Regex$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class TextComponentKt {
    public static final PersonaTextView makeView(TextComponent textComponent, MarkwonImpl markwonImpl, Text text) {
        View inflate = ((LayoutInflater) markwonImpl.visitorFactory).inflate(R.layout.pi2_ui_text, (ViewGroup) null, false);
        if (inflate == null) {
            a$$ExternalSyntheticBUOutline0.m$2("rootView");
            return null;
        }
        PersonaTextView personaTextView = (PersonaTextView) inflate;
        Pi2UiTextBinding pi2UiTextBinding = new Pi2UiTextBinding(personaTextView, personaTextView, 0);
        Text.Attributes attributes = text.getAttributes();
        if (attributes != null) {
            ExtensionsKt.setMarkdown(personaTextView, attributes.getText());
            ((LinkedList) markwonImpl.plugins).add(new Regex$$ExternalSyntheticLambda1(15, text, pi2UiTextBinding));
        }
        return personaTextView;
    }
}
