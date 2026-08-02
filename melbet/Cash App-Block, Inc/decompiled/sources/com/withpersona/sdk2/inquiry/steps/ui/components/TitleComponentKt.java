package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiTextBinding;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import kotlin.text.Regex$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class TitleComponentKt {
    public static final PersonaTextView makeView(TitleComponent titleComponent, MarkwonImpl markwonImpl, Title title) {
        View inflate = ((LayoutInflater) markwonImpl.visitorFactory).inflate(R.layout.pi2_ui_title, (ViewGroup) null, false);
        if (inflate == null) {
            a$$ExternalSyntheticBUOutline0.m$2("rootView");
            return null;
        }
        PersonaTextView personaTextView = (PersonaTextView) inflate;
        Pi2UiTextBinding pi2UiTextBinding = new Pi2UiTextBinding(personaTextView, personaTextView, 2);
        Title.Attributes attributes = title.getAttributes();
        if (attributes != null) {
            ExtensionsKt.setMarkdown(personaTextView, attributes.getText());
            ((LinkedList) markwonImpl.plugins).add(new Regex$$ExternalSyntheticLambda1(16, title, pi2UiTextBinding));
        }
        return personaTextView;
    }
}
