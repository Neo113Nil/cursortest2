package com.unity3d.player;

import android.content.Context;
import android.widget.EditText;
import h1.DialogInterfaceOnCancelListenerC2448i;
import h1.DialogInterfaceOnDismissListenerC2446g;
import h1.ViewTreeObserverOnGlobalLayoutListenerC2447h;

/* loaded from: classes2.dex */
public final class D extends AbstractC1782w {

    /* renamed from: h, reason: collision with root package name */
    public DialogC1786y f22004h;

    public D(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
    }

    @Override // com.unity3d.player.AbstractC1782w, h1.Q
    public final void a(String str, int i4, boolean z4, boolean z5, boolean z6, boolean z7, String str2, int i5, boolean z8, boolean z9) {
        DialogC1786y dialogC1786y = new DialogC1786y(this.f22263a, this.f22264b);
        this.f22004h = dialogC1786y;
        dialogC1786y.a(this, z8, z9);
        this.f22004h.setOnDismissListener(new DialogInterfaceOnDismissListenerC2446g(this));
        this.f22267e = z9;
        setupTextInput(str, i4, z4, z5, z6, z7, str2, i5);
        setHideInputField(z8);
        this.f22264b.getFrameLayout().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2447h(this));
        this.f22265c.requestFocus();
        this.f22004h.setOnCancelListener(new DialogInterfaceOnCancelListenerC2448i(this));
    }

    @Override // com.unity3d.player.AbstractC1782w
    public EditText createEditText(AbstractC1782w abstractC1782w) {
        return new C(this, this.f22263a, abstractC1782w);
    }

    @Override // com.unity3d.player.AbstractC1782w, h1.Q
    public final void hide() {
        this.f22004h.dismiss();
    }

    public void reportSoftInputArea() {
        if (this.f22004h.isShowing()) {
            this.f22264b.reportSoftInputArea(this.f22004h.a());
        }
    }

    @Override // com.unity3d.player.AbstractC1782w, h1.Q
    public final void setHideInputField(boolean z4) {
        this.f22266d = z4;
        this.f22004h.a(z4);
    }

    @Override // com.unity3d.player.AbstractC1782w, h1.Q
    public final void a() {
        this.f22004h.show();
    }
}
