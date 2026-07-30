package com.crrepa.l1;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class k extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13255a;

    public k(Boolean bool) {
        this.f13255a = com.crrepa.n1.a.a(bool);
    }

    @Override // com.crrepa.l1.h
    public BigDecimal b() {
        Object obj = this.f13255a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(this.f13255a.toString());
    }

    @Override // com.crrepa.l1.h
    public BigInteger c() {
        Object obj = this.f13255a;
        return obj instanceof BigInteger ? (BigInteger) obj : new BigInteger(this.f13255a.toString());
    }

    @Override // com.crrepa.l1.h
    public boolean d() {
        return w() ? ((Boolean) this.f13255a).booleanValue() : Boolean.parseBoolean(q());
    }

    @Override // com.crrepa.l1.h
    public byte e() {
        return x() ? o().byteValue() : Byte.parseByte(q());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f13255a == null) {
            return kVar.f13255a == null;
        }
        if (a(this) && a(kVar)) {
            return o().longValue() == kVar.o().longValue();
        }
        Object obj2 = this.f13255a;
        if (!(obj2 instanceof Number) || !(kVar.f13255a instanceof Number)) {
            return obj2.equals(kVar.f13255a);
        }
        double doubleValue = o().doubleValue();
        double doubleValue2 = kVar.o().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    @Override // com.crrepa.l1.h
    public char f() {
        return q().charAt(0);
    }

    @Override // com.crrepa.l1.h
    public double g() {
        return x() ? o().doubleValue() : Double.parseDouble(q());
    }

    @Override // com.crrepa.l1.h
    public float h() {
        return x() ? o().floatValue() : Float.parseFloat(q());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f13255a == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = o().longValue();
        } else {
            Object obj = this.f13255a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(o().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // com.crrepa.l1.h
    public int i() {
        return x() ? o().intValue() : Integer.parseInt(q());
    }

    @Override // com.crrepa.l1.h
    public long n() {
        return x() ? o().longValue() : Long.parseLong(q());
    }

    @Override // com.crrepa.l1.h
    public Number o() {
        Object obj = this.f13255a;
        return obj instanceof String ? new com.crrepa.n1.h((String) obj) : (Number) obj;
    }

    @Override // com.crrepa.l1.h
    public short p() {
        return x() ? o().shortValue() : Short.parseShort(q());
    }

    @Override // com.crrepa.l1.h
    public String q() {
        return x() ? o().toString() : w() ? ((Boolean) this.f13255a).toString() : (String) this.f13255a;
    }

    @Override // com.crrepa.l1.h
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public k a() {
        return this;
    }

    public boolean w() {
        return this.f13255a instanceof Boolean;
    }

    public boolean x() {
        return this.f13255a instanceof Number;
    }

    public boolean y() {
        return this.f13255a instanceof String;
    }

    public k(Character ch) {
        this.f13255a = ((Character) com.crrepa.n1.a.a(ch)).toString();
    }

    private static boolean a(k kVar) {
        Object obj = kVar.f13255a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public k(Number number) {
        this.f13255a = com.crrepa.n1.a.a(number);
    }

    public k(String str) {
        this.f13255a = com.crrepa.n1.a.a(str);
    }
}
