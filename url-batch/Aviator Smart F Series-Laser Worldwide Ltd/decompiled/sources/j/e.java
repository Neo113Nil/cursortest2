package j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static BigDecimal a(f fVar, Object obj) {
        return fVar.getBigDecimal(obj, null);
    }

    public static BigInteger b(f fVar, Object obj) {
        return fVar.getBigInteger(obj, null);
    }

    public static Boolean c(f fVar, Object obj) {
        return fVar.getBool(obj, null);
    }

    public static Byte d(f fVar, Object obj) {
        return fVar.getByte(obj, null);
    }

    public static Character e(f fVar, Object obj) {
        return fVar.getChar(obj, null);
    }

    public static Date f(f fVar, Object obj) {
        return fVar.getDate(obj, null);
    }

    public static Double g(f fVar, Object obj) {
        return fVar.getDouble(obj, null);
    }

    public static Enum h(f fVar, Class cls, Object obj) {
        return fVar.getEnum(cls, obj, null);
    }

    public static Float i(f fVar, Object obj) {
        return fVar.getFloat(obj, null);
    }

    public static Integer j(f fVar, Object obj) {
        return fVar.getInt(obj, null);
    }

    public static Long k(f fVar, Object obj) {
        return fVar.getLong(obj, null);
    }

    public static Object l(f fVar, Object obj) {
        return fVar.getObj(obj, null);
    }

    public static Short m(f fVar, Object obj) {
        return fVar.getShort(obj, null);
    }

    public static String n(f fVar, Object obj) {
        return fVar.getStr(obj, null);
    }
}
