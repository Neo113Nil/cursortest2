package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.iA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1926iA implements InterfaceC1142Ot {
    public Drawable A00;
    public final /* synthetic */ C1141Os A01;

    public C1926iA(C1141Os c1141Os) {
        this.A01 = c1141Os;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1142Ot
    public final Drawable A7E() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1142Ot
    public final C1141Os A7F() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1142Ot
    public final boolean A8q() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1142Ot
    public final boolean A9R() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1142Ot
    public final void AJK(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1142Ot
    public final void AJl(int i, int i4, int i9, int i10) {
        this.A01.A05.set(i, i4, i9, i10);
        super/*android.widget.FrameLayout*/.setPadding(this.A01.A04.left + i, this.A01.A04.top + i4, this.A01.A04.right + i9, this.A01.A04.bottom + i10);
    }
}
