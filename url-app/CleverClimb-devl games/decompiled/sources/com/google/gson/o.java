package com.google.gson;

import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes2.dex */
public final class o extends j {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?>[] f6667a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b, reason: collision with root package name */
    private Object f6668b;

    public o(Boolean bool) {
        a(bool);
    }

    public o(Number number) {
        a(number);
    }

    public o(String str) {
        a(str);
    }

    o(Object obj) {
        a(obj);
    }

    void a(Object obj) {
        if (obj instanceof Character) {
            this.f6668b = String.valueOf(((Character) obj).charValue());
        } else {
            com.google.gson.internal.a.a((obj instanceof Number) || b(obj));
            this.f6668b = obj;
        }
    }

    public boolean a() {
        return this.f6668b instanceof Boolean;
    }

    @Override // com.google.gson.j
    Boolean p() {
        return (Boolean) this.f6668b;
    }

    @Override // com.google.gson.j
    public boolean h() {
        if (a()) {
            return p().booleanValue();
        }
        return Boolean.parseBoolean(c());
    }

    public boolean q() {
        return this.f6668b instanceof Number;
    }

    @Override // com.google.gson.j
    public Number b() {
        return this.f6668b instanceof String ? new com.google.gson.internal.e((String) this.f6668b) : (Number) this.f6668b;
    }

    public boolean r() {
        return this.f6668b instanceof String;
    }

    @Override // com.google.gson.j
    public String c() {
        if (q()) {
            return b().toString();
        }
        if (a()) {
            return p().toString();
        }
        return (String) this.f6668b;
    }

    @Override // com.google.gson.j
    public double d() {
        return q() ? b().doubleValue() : Double.parseDouble(c());
    }

    @Override // com.google.gson.j
    public float e() {
        return q() ? b().floatValue() : Float.parseFloat(c());
    }

    @Override // com.google.gson.j
    public long f() {
        return q() ? b().longValue() : Long.parseLong(c());
    }

    @Override // com.google.gson.j
    public int g() {
        return q() ? b().intValue() : Integer.parseInt(c());
    }

    private static boolean b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f6667a) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f6668b == null) {
            return 31;
        }
        if (a(this)) {
            long longValue = b().longValue();
            return (int) ((longValue >>> 32) ^ longValue);
        }
        if (this.f6668b instanceof Number) {
            long doubleToLongBits = Double.doubleToLongBits(b().doubleValue());
            return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
        }
        return this.f6668b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f6668b == null) {
            return oVar.f6668b == null;
        }
        if (a(this) && a(oVar)) {
            return b().longValue() == oVar.b().longValue();
        }
        if ((this.f6668b instanceof Number) && (oVar.f6668b instanceof Number)) {
            double doubleValue = b().doubleValue();
            double doubleValue2 = oVar.b().doubleValue();
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
            return true;
        }
        return this.f6668b.equals(oVar.f6668b);
    }

    private static boolean a(o oVar) {
        if (!(oVar.f6668b instanceof Number)) {
            return false;
        }
        Number number = (Number) oVar.f6668b;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }
}
