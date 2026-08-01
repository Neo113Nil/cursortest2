package com.bykv.vk.openvk.preload.a.b;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes.dex */
public final class g extends Number {
    private final String a;

    public g(String str) {
        this.a = str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.a).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.a);
    }

    public final String toString() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.a;
        String str2 = ((g) obj).a;
        return str == str2 || str.equals(str2);
    }
}
