package defpackage;

import java.math.BigDecimal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x91 extends Number {
    public final String m;

    public x91(String str) {
        this.m = str;
    }

    private Object writeReplace() {
        return new BigDecimal(this.m);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x91)) {
            return false;
        }
        Object obj2 = ((x91) obj).m;
        String str = this.m;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.m;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.m;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.m;
    }
}
