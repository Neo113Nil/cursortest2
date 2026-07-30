package defpackage;

import java.io.Serializable;
import java.math.BigInteger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y61 extends t61 {
    public final Serializable m;

    public y61(Boolean bool) {
        bool.getClass();
        this.m = bool;
    }

    public static boolean c(y61 y61Var) {
        Serializable serializable = y61Var.m;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number a() {
        Serializable serializable = this.m;
        return serializable instanceof String ? new x91((String) serializable) : (Number) serializable;
    }

    public final String b() {
        Serializable serializable = this.m;
        return serializable instanceof Number ? a().toString() : serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y61.class != obj.getClass()) {
            return false;
        }
        y61 y61Var = (y61) obj;
        Serializable serializable = y61Var.m;
        Serializable serializable2 = this.m;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (c(this) && c(y61Var)) {
            return a().longValue() == y61Var.a().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        double doubleValue = a().doubleValue();
        double doubleValue2 = y61Var.a().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.m;
        if (serializable == null) {
            return 31;
        }
        if (c(this)) {
            doubleToLongBits = a().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public y61(Number number) {
        number.getClass();
        this.m = number;
    }

    public y61(String str) {
        str.getClass();
        this.m = str;
    }
}
