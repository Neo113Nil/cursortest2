package com.unity3d.player;

import android.content.Context;
import android.widget.EditText;

/* renamed from: com.unity3d.player.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0173y extends AbstractC0167s {
    public DialogC0169u h;

    @Override // com.unity3d.player.AbstractC0167s
    public final void a(boolean z) {
        this.d = z;
        this.h.a(z);
    }

    public C0173y(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
    }

    @Override // com.unity3d.player.AbstractC0167s
    public final void a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        DialogC0169u dialogC0169u = new DialogC0169u(this.a, this.b);
        this.h = dialogC0169u;
        dialogC0169u.a(this, z5, z6);
        this.h.setOnDismissListener(new com.unity3d.player.a.G(this));
        this.e = z6;
        setupTextInput(str, i, z, z2, z3, z4, str2, i2);
        a(z5);
        this.b.getFrameLayout().getViewTreeObserver().addOnGlobalLayoutListener(new com.unity3d.player.a.H(this));
        this.c.requestFocus();
        this.h.setOnCancelListener(new com.unity3d.player.a.I(this));
    }

    public void reportSoftInputArea() {
        if (this.h.isShowing()) {
            this.b.reportSoftInputArea(this.h.a());
        }
    }

    @Override // com.unity3d.player.AbstractC0167s
    public final void d() {
        this.h.show();
    }

    @Override // com.unity3d.player.AbstractC0167s
    public final void b() {
        this.h.dismiss();
    }

    @Override // com.unity3d.player.AbstractC0167s
    public EditText createEditText(AbstractC0167s abstractC0167s) {
        return new com.unity3d.player.a.J(this, this.a, abstractC0167s);
    }
}
