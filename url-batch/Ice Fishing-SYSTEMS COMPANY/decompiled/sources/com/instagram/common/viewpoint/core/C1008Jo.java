package com.instagram.common.viewpoint.core;

import android.text.Layout;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Jo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1008Jo {
    public static final Comparator<C1008Jo> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Jn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((C1008Jo) obj2).A00, ((C1008Jo) obj).A00);
            return compare;
        }
    };
    public final int A00;
    public final C2349pT A01;

    public C1008Jo(CharSequence charSequence, Layout.Alignment alignment, float f6, int i, int i4, float f9, int i9, float f10, boolean z8, int i10, int i11) {
        C06133o cueBuilder = new C06133o().A0G(charSequence).A0F(alignment).A07(f6, i).A09(i4).A04(f9).A0A(i9).A06(f10);
        if (z8) {
            cueBuilder.A0C(i10);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i11;
    }
}
