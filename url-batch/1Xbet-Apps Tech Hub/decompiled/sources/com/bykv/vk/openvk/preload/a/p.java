package com.bykv.vk.openvk.preload.a;

import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes.dex */
public final class p extends k {
    public final Object a;

    public p(Boolean bool) {
        this.a = com.bykv.vk.openvk.preload.a.b.a.a(bool);
    }

    public p(Number number) {
        this.a = com.bykv.vk.openvk.preload.a.b.a.a(number);
    }

    public p(String str) {
        this.a = com.bykv.vk.openvk.preload.a.b.a.a(str);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final Number a() {
        Object obj = this.a;
        return obj instanceof String ? new com.bykv.vk.openvk.preload.a.b.g((String) this.a) : (Number) obj;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = a().longValue();
        } else {
            Object obj = this.a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a == null) {
            return pVar.a == null;
        }
        if (a(this) && a(pVar)) {
            return a().longValue() == pVar.a().longValue();
        }
        Object obj2 = this.a;
        if ((obj2 instanceof Number) && (pVar.a instanceof Number)) {
            double doubleValue = a().doubleValue();
            double doubleValue2 = pVar.a().doubleValue();
            return doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2));
        }
        return obj2.equals(pVar.a);
    }

    private static boolean a(p pVar) {
        Object obj = pVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final boolean f() {
        Object obj = this.a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final String b() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return a().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final double c() {
        return this.a instanceof Number ? a().doubleValue() : Double.parseDouble(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final long d() {
        return this.a instanceof Number ? a().longValue() : Long.parseLong(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final int e() {
        return this.a instanceof Number ? a().intValue() : Integer.parseInt(b());
    }
}
