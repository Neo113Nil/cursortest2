package j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* loaded from: classes.dex */
public interface b {
    BigDecimal getBigDecimal(Object obj, BigDecimal bigDecimal);

    BigInteger getBigInteger(Object obj, BigInteger bigInteger);

    Boolean getBool(Object obj, Boolean bool);

    Byte getByte(Object obj, Byte b8);

    Character getChar(Object obj, Character ch);

    Date getDate(Object obj, Date date);

    Double getDouble(Object obj, Double d8);

    <E extends Enum<E>> E getEnum(Class<E> cls, Object obj, E e8);

    Float getFloat(Object obj, Float f8);

    Integer getInt(Object obj, Integer num);

    Long getLong(Object obj, Long l8);

    Object getObj(Object obj, Object obj2);

    Short getShort(Object obj, Short sh);

    String getStr(Object obj, String str);
}
