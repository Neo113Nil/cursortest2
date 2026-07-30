package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Objects;
import java.util.Set;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class WO {

    /* renamed from: d, reason: collision with root package name */
    public static final WO f28388d;

    /* renamed from: a, reason: collision with root package name */
    public final int f28389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28390b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2917aC f28391c;

    static {
        WO wo;
        if (Build.VERSION.SDK_INT >= 33) {
            ZB zb = new ZB(4);
            for (int i = 1; i <= 10; i++) {
                zb.f(Integer.valueOf(AbstractC3548lu.e(i)));
            }
            wo = new WO(2, zb.h());
        } else {
            wo = new WO(2, 10);
        }
        f28388d = wo;
    }

    public WO(int i, int i4) {
        this.f28389a = i;
        this.f28390b = i4;
        this.f28391c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WO)) {
            return false;
        }
        WO wo = (WO) obj;
        return this.f28389a == wo.f28389a && this.f28390b == wo.f28390b && Objects.equals(this.f28391c, wo.f28391c);
    }

    public final int hashCode() {
        AbstractC2917aC abstractC2917aC = this.f28391c;
        return (((this.f28389a * 31) + this.f28390b) * 31) + (abstractC2917aC == null ? 0 : abstractC2917aC.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f28391c);
        int i = this.f28389a;
        int length = String.valueOf(i).length();
        int i4 = this.f28390b;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i4).length() + 15 + valueOf.length() + 1);
        AbstractC5051n.i(sb, "AudioProfile[format=", i, ", maxChannelCount=", i4);
        return D.y.o(sb, ", channelMasks=", valueOf, "]");
    }

    public WO(int i, Set set) {
        this.f28389a = i;
        AbstractC2917aC k6 = AbstractC2917aC.k(set);
        this.f28391c = k6;
        CC a9 = k6.a();
        int i4 = 0;
        while (a9.hasNext()) {
            i4 = Math.max(i4, Integer.bitCount(((Integer) a9.next()).intValue()));
        }
        this.f28390b = i4;
    }
}
