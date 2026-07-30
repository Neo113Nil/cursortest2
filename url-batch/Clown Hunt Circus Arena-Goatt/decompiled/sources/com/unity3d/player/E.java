package com.unity3d.player;

import android.content.Context;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class E extends AbstractC0200x {
    public DialogC0204z h;

    @Override // com.unity3d.player.AbstractC0200x, com.unity3d.player.a.r
    public final void setHideInputField(boolean z) {
        this.d = z;
        this.h.a(z);
    }

    public E(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
    }

    @Override // com.unity3d.player.AbstractC0200x, com.unity3d.player.a.r
    public final void a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        DialogC0204z dialogC0204z = new DialogC0204z(this.a, this.b);
        this.h = dialogC0204z;
        dialogC0204z.a(this, z5, z6);
        this.h.setOnDismissListener(new com.unity3d.player.a.H(this));
        this.e = z6;
        setupTextInput(str, i, z, z2, z3, z4, str2, i2);
        setHideInputField(z5);
        this.b.getFrameLayout().getViewTreeObserver().addOnGlobalLayoutListener(new com.unity3d.player.a.I(this));
        this.c.requestFocus();
        this.h.setOnCancelListener(new com.unity3d.player.a.J(this));
    }

    public void reportSoftInputArea() {
        if (this.h.isShowing()) {
            this.b.reportSoftInputArea(this.h.a());
        }
    }

    @Override // com.unity3d.player.a.r
    public final void a() {
        this.h.show();
    }

    @Override // com.unity3d.player.a.r
    public final void hide() {
        this.h.dismiss();
    }

    @Override // com.unity3d.player.AbstractC0200x
    public EditText createEditText(AbstractC0200x abstractC0200x) {
        return new D(this, this.a, abstractC0200x);
    }
}
