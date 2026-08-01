package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1099bR {
    public final InterfaceC1103bV A00;
    public final String A01;
    public final Collection<C1114bg> A02;
    public final Collection<C1114bg> A03;
    public final List<Rect> A04;

    public C1099bR(String str, InterfaceC1103bV interfaceC1103bV, List<Rect> rects, Collection<C1114bg> collection, Collection<C1114bg> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1103bV;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
