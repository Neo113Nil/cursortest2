package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1869pf {
    public final InterfaceC1874pk A00;
    public final String A01;
    public final Collection<C1883pu> A02;
    public final Collection<C1883pu> A03;
    public final List<Rect> A04;

    public C1869pf(String str, InterfaceC1874pk interfaceC1874pk, List<Rect> rects, Collection<C1883pu> collection, Collection<C1883pu> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1874pk;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
