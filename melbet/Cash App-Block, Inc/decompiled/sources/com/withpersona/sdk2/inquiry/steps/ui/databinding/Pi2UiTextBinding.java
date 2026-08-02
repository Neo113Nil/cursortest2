package com.withpersona.sdk2.inquiry.steps.ui.databinding;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView;

/* loaded from: classes9.dex */
public final class Pi2UiTextBinding implements ViewBinding {
    public final /* synthetic */ int $r8$classId;
    public final PersonaTextView rootView;
    public final PersonaTextView textView;

    public /* synthetic */ Pi2UiTextBinding(PersonaTextView personaTextView, PersonaTextView personaTextView2, int i) {
        this.$r8$classId = i;
        this.rootView = personaTextView;
        this.textView = personaTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        int i = this.$r8$classId;
        return this.rootView;
    }
}
