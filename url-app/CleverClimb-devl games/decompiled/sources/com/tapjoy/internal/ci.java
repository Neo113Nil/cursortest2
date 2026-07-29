package com.tapjoy.internal;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class ci extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f7886a;

    public ci(String str) {
        this.f7886a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (number instanceof Integer) {
            return intValue() == number.intValue();
        }
        if (number instanceof Long) {
            return longValue() == number.longValue();
        }
        if (number instanceof Float) {
            return floatValue() == number.floatValue();
        }
        if (number instanceof Double) {
            return doubleValue() == number.doubleValue();
        }
        return this.f7886a.equals(number.toString());
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f7886a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f7886a);
            }
        } catch (NumberFormatException unused2) {
            return new BigInteger(this.f7886a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f7886a);
        } catch (NumberFormatException unused) {
            return new BigInteger(this.f7886a).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f7886a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f7886a);
    }

    public final String toString() {
        return this.f7886a;
    }
}
