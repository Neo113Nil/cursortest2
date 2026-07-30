package j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* loaded from: classes.dex */
public interface f extends a, b {
    @Override // j.a
    BigDecimal getBigDecimal(Object obj);

    /* synthetic */ BigDecimal getBigDecimal(Object obj, BigDecimal bigDecimal);

    @Override // j.a
    BigInteger getBigInteger(Object obj);

    /* synthetic */ BigInteger getBigInteger(Object obj, BigInteger bigInteger);

    @Override // j.a
    Boolean getBool(Object obj);

    /* synthetic */ Boolean getBool(Object obj, Boolean bool);

    @Override // j.a
    Byte getByte(Object obj);

    /* synthetic */ Byte getByte(Object obj, Byte b8);

    @Override // j.a
    Character getChar(Object obj);

    /* synthetic */ Character getChar(Object obj, Character ch);

    @Override // j.a
    Date getDate(Object obj);

    /* synthetic */ Date getDate(Object obj, Date date);

    @Override // j.a
    Double getDouble(Object obj);

    /* synthetic */ Double getDouble(Object obj, Double d8);

    @Override // j.a
    <E extends Enum<E>> E getEnum(Class<E> cls, Object obj);

    /* synthetic */ Enum getEnum(Class cls, Object obj, Enum r32);

    @Override // j.a
    Float getFloat(Object obj);

    /* synthetic */ Float getFloat(Object obj, Float f8);

    @Override // j.a
    Integer getInt(Object obj);

    /* synthetic */ Integer getInt(Object obj, Integer num);

    @Override // j.a
    Long getLong(Object obj);

    /* synthetic */ Long getLong(Object obj, Long l8);

    @Override // j.a
    Object getObj(Object obj);

    /* synthetic */ Object getObj(Object obj, Object obj2);

    @Override // j.a
    Short getShort(Object obj);

    /* synthetic */ Short getShort(Object obj, Short sh);

    @Override // j.a
    String getStr(Object obj);

    /* synthetic */ String getStr(Object obj, String str);
}
