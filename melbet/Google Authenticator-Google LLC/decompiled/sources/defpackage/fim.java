package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fim extends wv {
    final /* synthetic */ CheckableImageButton a;

    public fim(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.wv
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.wv
    public final void c(View view, aah aahVar) {
        super.c(view, aahVar);
        CheckableImageButton checkableImageButton = this.a;
        aahVar.n(checkableImageButton.b);
        aahVar.a.setChecked(checkableImageButton.a);
    }
}
