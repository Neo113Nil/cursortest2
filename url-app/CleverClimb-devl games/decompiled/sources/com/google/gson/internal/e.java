package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes2.dex */
public final class e extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f6639a;

    public e(String str) {
        this.f6639a = str;
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f6639a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f6639a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f6639a).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f6639a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f6639a).longValue();
        }
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f6639a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f6639a);
    }

    public String toString() {
        return this.f6639a;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f6639a);
    }

    public int hashCode() {
        return this.f6639a.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f6639a == eVar.f6639a || this.f6639a.equals(eVar.f6639a);
    }
}
