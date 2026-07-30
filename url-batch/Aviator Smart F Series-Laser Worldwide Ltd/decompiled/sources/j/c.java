package j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static String A(d dVar, Object obj, String str) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? str : cn.hutool.core.convert.d.toStr(obj2, str);
    }

    public static BigDecimal b(d dVar, Object obj, BigDecimal bigDecimal) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? bigDecimal : cn.hutool.core.convert.d.toBigDecimal(obj2, bigDecimal);
    }

    public static BigInteger d(d dVar, Object obj, BigInteger bigInteger) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? bigInteger : cn.hutool.core.convert.d.toBigInteger(obj2, bigInteger);
    }

    public static Boolean f(d dVar, Object obj, Boolean bool) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? bool : cn.hutool.core.convert.d.toBool(obj2, bool);
    }

    public static Byte h(d dVar, Object obj, Byte b8) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? b8 : cn.hutool.core.convert.d.toByte(obj2, b8);
    }

    public static Character j(d dVar, Object obj, Character ch) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? ch : cn.hutool.core.convert.d.toChar(obj2, ch);
    }

    public static Date l(d dVar, Object obj, Date date) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? date : cn.hutool.core.convert.d.toDate(obj2, date);
    }

    public static Double n(d dVar, Object obj, Double d8) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? d8 : cn.hutool.core.convert.d.toDouble(obj2, d8);
    }

    public static Enum p(d dVar, Class cls, Object obj, Enum r32) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? r32 : cn.hutool.core.convert.d.toEnum(cls, obj2, r32);
    }

    public static Float r(d dVar, Object obj, Float f8) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? f8 : cn.hutool.core.convert.d.toFloat(obj2, f8);
    }

    public static Integer t(d dVar, Object obj, Integer num) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? num : cn.hutool.core.convert.d.toInt(obj2, num);
    }

    public static Long v(d dVar, Object obj, Long l8) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? l8 : cn.hutool.core.convert.d.toLong(obj2, l8);
    }

    public static Short y(d dVar, Object obj, Short sh) {
        Object obj2 = dVar.getObj(obj);
        return obj2 == null ? sh : cn.hutool.core.convert.d.toShort(obj2, sh);
    }
}
