package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Yx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0990Yx extends AbstractC02384h {
    public static String[] A02 = {"mAEXsU", "ynqBxBOImfiaim2rOjt4gNln3IJjMmAs", "wywpOwDcOClPwSqhh8hqnS4LzA6xmBGs", "SzqLf2", "g6", "3b", "2rYsw0AU9P5CKqqKD8yWz2y811Q4TNqs", "g7NtZwf9Cfcv4ky8xJWe0WMsxKKUH5F1"};
    public boolean A00 = false;
    public final /* synthetic */ AbstractC0989Yw A01;

    public C0990Yx(AbstractC0989Yw abstractC0989Yw) {
        this.A01 = abstractC0989Yw;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02384h
    public final void A0L(ED ed, int i) {
        super.A0L(ed, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02384h
    public final void A0M(ED ed, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        String[] strArr = A02;
        if (strArr[5].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A02[1] = "WMOmT1QQvzwg3wEMb9eL1K1wBJkCMN2D";
        this.A00 = true;
    }
}
