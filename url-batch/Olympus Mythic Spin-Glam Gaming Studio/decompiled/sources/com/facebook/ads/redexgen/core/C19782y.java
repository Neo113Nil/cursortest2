package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.2y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C19782y {
    public final Uri A00;
    public final List<Integer> A01;

    @Deprecated
    public final List<Integer> A02;
    public final Map<String, String> A03;

    @Deprecated
    public final Map<String, String> A04;
    public final UUID A05;

    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C19782y(C19772x c19772x) {
        boolean z;
        boolean z2;
        UUID uuid;
        Uri uri;
        Map<String, String> map;
        Map<String, String> map2;
        boolean z3;
        boolean z4;
        boolean z5;
        List<Integer> list;
        List<Integer> list2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        Uri uri2;
        z = c19772x.A04;
        if (z) {
            uri2 = c19772x.A00;
            if (uri2 == null) {
                z2 = false;
                AbstractC20023y.A08(z2);
                uuid = c19772x.A03;
                this.A05 = (UUID) AbstractC20023y.A01(uuid);
                this.A06 = this.A05;
                uri = c19772x.A00;
                this.A00 = uri;
                map = c19772x.A02;
                this.A04 = map;
                map2 = c19772x.A02;
                this.A03 = map2;
                z3 = c19772x.A05;
                this.A08 = z3;
                z4 = c19772x.A04;
                this.A07 = z4;
                z5 = c19772x.A06;
                this.A09 = z5;
                list = c19772x.A01;
                this.A02 = list;
                list2 = c19772x.A01;
                this.A01 = list2;
                bArr = c19772x.A07;
                if (bArr == null) {
                    bArr3 = c19772x.A07;
                    bArr4 = c19772x.A07;
                    bArr2 = Arrays.copyOf(bArr3, bArr4.length);
                } else {
                    bArr2 = null;
                }
                this.A0A = bArr2;
            }
        }
        z2 = true;
        AbstractC20023y.A08(z2);
        uuid = c19772x.A03;
        this.A05 = (UUID) AbstractC20023y.A01(uuid);
        this.A06 = this.A05;
        uri = c19772x.A00;
        this.A00 = uri;
        map = c19772x.A02;
        this.A04 = map;
        map2 = c19772x.A02;
        this.A03 = map2;
        z3 = c19772x.A05;
        this.A08 = z3;
        z4 = c19772x.A04;
        this.A07 = z4;
        z5 = c19772x.A06;
        this.A09 = z5;
        list = c19772x.A01;
        this.A02 = list;
        list2 = c19772x.A01;
        this.A01 = list2;
        bArr = c19772x.A07;
        if (bArr == null) {
        }
        this.A0A = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19782y)) {
            return false;
        }
        C19782y c19782y = (C19782y) obj;
        if (this.A05.equals(c19782y.A05) && C5C.A1E(this.A00, c19782y.A00) && C5C.A1E(this.A03, c19782y.A03) && this.A08 == c19782y.A08 && this.A07 == c19782y.A07 && this.A09 == c19782y.A09 && this.A01.equals(c19782y.A01) && Arrays.equals(this.A0A, c19782y.A0A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A05.hashCode() * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A0A);
    }
}
