package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C20676l implements Comparable<C20676l> {
    public int A00;
    public long A01;
    public Object A02;
    public final C20857d A03;

    public C20676l(C20857d c20857d) {
        this.A03 = c20857d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C20676l c20676l) {
        if ((this.A02 == null) != (c20676l.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i = this.A00 - c20676l.A00;
        if (i != 0) {
            return i;
        }
        int comparePeriodIndex = C5C.A08(this.A01, c20676l.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
