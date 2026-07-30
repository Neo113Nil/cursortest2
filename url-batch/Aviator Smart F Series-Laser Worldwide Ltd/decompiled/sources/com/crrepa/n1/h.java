package com.crrepa.n1;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class h extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f13430a;

    public h(String str) {
        this.f13430a = str;
    }

    private Object a() {
        return new BigDecimal(this.f13430a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f13430a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        String str = this.f13430a;
        String str2 = ((h) obj).f13430a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f13430a);
    }

    public int hashCode() {
        return this.f13430a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f13430a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f13430a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f13430a).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f13430a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f13430a).longValue();
        }
    }

    public String toString() {
        return this.f13430a;
    }

    private void a(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }
}
