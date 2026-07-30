package j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* loaded from: classes.dex */
public interface a {
    BigDecimal getBigDecimal(Object obj);

    BigInteger getBigInteger(Object obj);

    Boolean getBool(Object obj);

    Byte getByte(Object obj);

    Character getChar(Object obj);

    Date getDate(Object obj);

    Double getDouble(Object obj);

    <E extends Enum<E>> E getEnum(Class<E> cls, Object obj);

    Float getFloat(Object obj);

    Integer getInt(Object obj);

    Long getLong(Object obj);

    Object getObj(Object obj);

    Short getShort(Object obj);

    String getStr(Object obj);
}
