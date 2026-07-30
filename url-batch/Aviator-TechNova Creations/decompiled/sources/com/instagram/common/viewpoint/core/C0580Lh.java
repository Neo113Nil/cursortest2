package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0580Lh {
    public static final C0580Lh A02 = new C0580Lh();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C0580Lh)) {
            return false;
        }
        C0580Lh c0580Lh = (C0580Lh) obj;
        return this.A00 == c0580Lh.A00 && this.A01 == c0580Lh.A01;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }
}
