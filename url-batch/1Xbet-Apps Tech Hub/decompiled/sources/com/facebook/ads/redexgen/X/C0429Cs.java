package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Cs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0429Cs {
    public final int A00;
    public final String A01;
    public final List<C0428Cr> A02;
    public final byte[] A03;

    public C0429Cs(int i, String str, List<C0428Cr> list, byte[] bArr) {
        List<C0428Cr> unmodifiableList;
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}
