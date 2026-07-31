package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2409Kk implements Comparable<C2409Kk> {
    public final int A00;
    public final C2400Kb A01;

    public C2409Kk(int i, C2400Kb c2400Kb) {
        this.A00 = i;
        this.A01 = c2400Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2409Kk c2409Kk) {
        return Integer.compare(this.A00, c2409Kk.A00);
    }
}
