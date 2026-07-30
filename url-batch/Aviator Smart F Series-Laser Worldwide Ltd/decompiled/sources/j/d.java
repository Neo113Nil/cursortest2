package j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* loaded from: classes.dex */
public interface d extends f {
    @Override // j.f, j.a
    /* bridge */ /* synthetic */ BigDecimal getBigDecimal(Object obj);

    @Override // j.f, j.b
    BigDecimal getBigDecimal(Object obj, BigDecimal bigDecimal);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ BigInteger getBigInteger(Object obj);

    @Override // j.f, j.b
    BigInteger getBigInteger(Object obj, BigInteger bigInteger);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ Boolean getBool(Object obj);

    @Override // j.f, j.b
    Boolean getBool(Object obj, Boolean bool);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ Byte getByte(Object obj);

    @Override // j.f, j.b
    Byte getByte(Object obj, Byte b8);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ Character getChar(Object obj);

    @Override // j.f, j.b
    Character getChar(Object obj, Character ch);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ Date getDate(Object obj);

    @Override // j.f, j.b
    Date getDate(Object obj, Date date);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ Double getDouble(Object obj);

    @Override // j.f, j.b
    Double getDouble(Object obj, Double d8);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ Enum getEnum(Class cls, Object obj);

    @Override // j.f, j.b
    <E extends Enum<E>> E getEnum(Class<E> cls, Object obj, E e8);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ Float getFloat(Object obj);

    @Override // j.f, j.b
    Float getFloat(Object obj, Float f8);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ Integer getInt(Object obj);

    @Override // j.f, j.b
    Integer getInt(Object obj, Integer num);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ Long getLong(Object obj);

    @Override // j.f, j.b
    Long getLong(Object obj, Long l8);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ Object getObj(Object obj);

    @Override // j.f, j.b
    /* synthetic */ Object getObj(Object obj, Object obj2);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ Short getShort(Object obj);

    @Override // j.f, j.b
    Short getShort(Object obj, Short sh);

    @Override // j.f, j.a
    /* bridge */ /* synthetic */ String getStr(Object obj);

    @Override // j.f, j.b
    String getStr(Object obj, String str);
}
