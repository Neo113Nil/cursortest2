package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Function;

/* loaded from: classes.dex */
public class NumberConverter extends AbstractConverter<Number> {
    private static final long serialVersionUID = 1;
    private final Class<? extends Number> targetType;

    public NumberConverter() {
        this.targetType = Number.class;
    }

    protected static Number convert(Object obj, Class<? extends Number> cls, Function<Object, String> function) {
        Object apply;
        Object apply2;
        Object apply3;
        Object apply4;
        long epochMilli;
        Object apply5;
        long epochMilli2;
        Object apply6;
        Object apply7;
        if (obj instanceof Enum) {
            return convert(Integer.valueOf(((Enum) obj).ordinal()), cls, function);
        }
        if (obj instanceof byte[]) {
            return cn.hutool.core.util.j.bytesToNumber((byte[]) obj, cls, cn.hutool.core.util.j.DEFAULT_ORDER);
        }
        if (Byte.class == cls) {
            if (obj instanceof Number) {
                return Byte.valueOf(((Number) obj).byteValue());
            }
            if (obj instanceof Boolean) {
                return cn.hutool.core.util.i.toByteObj(((Boolean) obj).booleanValue());
            }
            apply7 = function.apply(obj);
            String str = (String) apply7;
            try {
                if (cn.hutool.core.text.l.isBlank(str)) {
                    return null;
                }
                return Byte.valueOf(str);
            } catch (NumberFormatException unused) {
                return Byte.valueOf(cn.hutool.core.util.d0.parseNumber(str).byteValue());
            }
        }
        if (Short.class == cls) {
            if (obj instanceof Number) {
                return Short.valueOf(((Number) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                return cn.hutool.core.util.i.toShortObj(((Boolean) obj).booleanValue());
            }
            apply6 = function.apply(obj);
            String str2 = (String) apply6;
            try {
                if (cn.hutool.core.text.l.isBlank(str2)) {
                    return null;
                }
                return Short.valueOf(str2);
            } catch (NumberFormatException unused2) {
                return Short.valueOf(cn.hutool.core.util.d0.parseNumber(str2).shortValue());
            }
        }
        if (Integer.class == cls) {
            if (obj instanceof Number) {
                return Integer.valueOf(((Number) obj).intValue());
            }
            if (obj instanceof Boolean) {
                return cn.hutool.core.util.i.toInteger(((Boolean) obj).booleanValue());
            }
            if (obj instanceof Date) {
                return Integer.valueOf((int) ((Date) obj).getTime());
            }
            if (obj instanceof Calendar) {
                return Integer.valueOf((int) ((Calendar) obj).getTimeInMillis());
            }
            if (b.a(obj)) {
                epochMilli2 = cn.hutool.core.date.z.toInstant(c.a(obj)).toEpochMilli();
                return Integer.valueOf((int) epochMilli2);
            }
            apply5 = function.apply(obj);
            String str3 = (String) apply5;
            if (cn.hutool.core.text.l.isBlank(str3)) {
                return null;
            }
            return Integer.valueOf(cn.hutool.core.util.d0.parseInt(str3));
        }
        if (AtomicInteger.class == cls) {
            Number convert = convert(obj, Integer.class, function);
            if (convert != null) {
                return new AtomicInteger(convert.intValue());
            }
        } else {
            if (Long.class == cls) {
                if (obj instanceof Number) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                if (obj instanceof Boolean) {
                    return cn.hutool.core.util.i.toLongObj(((Boolean) obj).booleanValue());
                }
                if (obj instanceof Date) {
                    return Long.valueOf(((Date) obj).getTime());
                }
                if (obj instanceof Calendar) {
                    return Long.valueOf(((Calendar) obj).getTimeInMillis());
                }
                if (b.a(obj)) {
                    epochMilli = cn.hutool.core.date.z.toInstant(c.a(obj)).toEpochMilli();
                    return Long.valueOf(epochMilli);
                }
                apply4 = function.apply(obj);
                String str4 = (String) apply4;
                if (cn.hutool.core.text.l.isBlank(str4)) {
                    return null;
                }
                return Long.valueOf(cn.hutool.core.util.d0.parseLong(str4));
            }
            if (AtomicLong.class == cls) {
                Number convert2 = convert(obj, Long.class, function);
                if (convert2 != null) {
                    return new AtomicLong(convert2.longValue());
                }
            } else if (cn.hutool.core.convert.g.a() == cls) {
                Number convert3 = convert(obj, Long.class, function);
                if (convert3 != null) {
                    LongAdder a8 = x.a();
                    a8.add(convert3.longValue());
                    return a8;
                }
            } else {
                if (Float.class == cls) {
                    if (obj instanceof Number) {
                        return Float.valueOf(((Number) obj).floatValue());
                    }
                    if (obj instanceof Boolean) {
                        return cn.hutool.core.util.i.toFloatObj(((Boolean) obj).booleanValue());
                    }
                    apply3 = function.apply(obj);
                    String str5 = (String) apply3;
                    if (cn.hutool.core.text.l.isBlank(str5)) {
                        return null;
                    }
                    return Float.valueOf(cn.hutool.core.util.d0.parseFloat(str5));
                }
                if (Double.class == cls) {
                    if (obj instanceof Number) {
                        return Double.valueOf(cn.hutool.core.util.d0.toDouble((Number) obj));
                    }
                    if (obj instanceof Boolean) {
                        return cn.hutool.core.util.i.toDoubleObj(((Boolean) obj).booleanValue());
                    }
                    apply2 = function.apply(obj);
                    String str6 = (String) apply2;
                    if (cn.hutool.core.text.l.isBlank(str6)) {
                        return null;
                    }
                    return Double.valueOf(cn.hutool.core.util.d0.parseDouble(str6));
                }
                if (cn.hutool.core.convert.k.a() == cls) {
                    Number convert4 = convert(obj, Double.class, function);
                    if (convert4 != null) {
                        DoubleAdder a9 = y.a();
                        a9.add(convert4.doubleValue());
                        return a9;
                    }
                } else {
                    if (BigDecimal.class == cls) {
                        return toBigDecimal(obj, function);
                    }
                    if (BigInteger.class == cls) {
                        return toBigInteger(obj, function);
                    }
                    if (Number.class == cls) {
                        if (obj instanceof Number) {
                            return (Number) obj;
                        }
                        if (obj instanceof Boolean) {
                            return cn.hutool.core.util.i.toInteger(((Boolean) obj).booleanValue());
                        }
                        apply = function.apply(obj);
                        String str7 = (String) apply;
                        if (cn.hutool.core.text.l.isBlank(str7)) {
                            return null;
                        }
                        return cn.hutool.core.util.d0.parseNumber(str7);
                    }
                }
            }
        }
        throw new UnsupportedOperationException(cn.hutool.core.text.l.format("Unsupport Number type: {}", cls.getName()));
    }

    private static BigDecimal toBigDecimal(Object obj, Function<Object, String> function) {
        Object apply;
        if (obj instanceof Number) {
            return cn.hutool.core.util.d0.toBigDecimal((Number) obj);
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
        }
        apply = function.apply(obj);
        return cn.hutool.core.util.d0.toBigDecimal((String) apply);
    }

    private static BigInteger toBigInteger(Object obj, Function<Object, String> function) {
        Object apply;
        if (obj instanceof Long) {
            return BigInteger.valueOf(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? BigInteger.ONE : BigInteger.ZERO;
        }
        apply = function.apply(obj);
        return cn.hutool.core.util.d0.toBigInteger((String) apply);
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    protected String convertToStr(Object obj) {
        String trim = cn.hutool.core.text.l.trim(super.convertToStr(obj));
        if (trim == null || trim.length() <= 1) {
            return trim;
        }
        char upperCase = Character.toUpperCase(trim.charAt(trim.length() - 1));
        return (upperCase == 'D' || upperCase == 'L' || upperCase == 'F') ? cn.hutool.core.text.l.subPre(trim, -1) : trim;
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<Number> getTargetType() {
        return this.targetType;
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<? extends java.lang.Number>, code=java.lang.Class, for r1v0, types: [java.lang.Class<? extends java.lang.Number>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NumberConverter(Class cls) {
        this.targetType = cls == null ? Number.class : cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Number convertInternal(Object obj) {
        return convert(obj, this.targetType, new Function() { // from class: cn.hutool.core.convert.impl.z
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return NumberConverter.this.convertToStr(obj2);
            }
        });
    }
}
