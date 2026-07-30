package cn.hutool.core.convert;

import cn.hutool.core.convert.impl.ArrayConverter;
import cn.hutool.core.convert.impl.AtomicBooleanConverter;
import cn.hutool.core.convert.impl.AtomicIntegerArrayConverter;
import cn.hutool.core.convert.impl.AtomicLongArrayConverter;
import cn.hutool.core.convert.impl.AtomicReferenceConverter;
import cn.hutool.core.convert.impl.BeanConverter;
import cn.hutool.core.convert.impl.BooleanConverter;
import cn.hutool.core.convert.impl.CalendarConverter;
import cn.hutool.core.convert.impl.CharacterConverter;
import cn.hutool.core.convert.impl.CharsetConverter;
import cn.hutool.core.convert.impl.ClassConverter;
import cn.hutool.core.convert.impl.CurrencyConverter;
import cn.hutool.core.convert.impl.DateConverter;
import cn.hutool.core.convert.impl.DurationConverter;
import cn.hutool.core.convert.impl.EntryConverter;
import cn.hutool.core.convert.impl.EnumConverter;
import cn.hutool.core.convert.impl.LocaleConverter;
import cn.hutool.core.convert.impl.MapConverter;
import cn.hutool.core.convert.impl.NumberConverter;
import cn.hutool.core.convert.impl.OptConverter;
import cn.hutool.core.convert.impl.OptionalConverter;
import cn.hutool.core.convert.impl.PairConverter;
import cn.hutool.core.convert.impl.PathConverter;
import cn.hutool.core.convert.impl.PeriodConverter;
import cn.hutool.core.convert.impl.PrimitiveConverter;
import cn.hutool.core.convert.impl.ReferenceConverter;
import cn.hutool.core.convert.impl.StackTraceElementConverter;
import cn.hutool.core.convert.impl.StringConverter;
import cn.hutool.core.convert.impl.TemporalAccessorConverter;
import cn.hutool.core.convert.impl.TimeZoneConverter;
import cn.hutool.core.convert.impl.URIConverter;
import cn.hutool.core.convert.impl.URLConverter;
import cn.hutool.core.convert.impl.UUIDConverter;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.Pair;
import cn.hutool.core.lang.l0;
import cn.hutool.core.lang.y0;
import cn.hutool.core.map.SafeConcurrentHashMap;
import cn.hutool.core.util.b1;
import cn.hutool.core.util.e0;
import cn.hutool.core.util.e1;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class ConverterRegistry implements Serializable {
    private static final long serialVersionUID = 1;
    private volatile Map<Type, f> customConverterMap;
    private Map<Class<?>, f> defaultConverterMap;

    private static class a {
        private static final ConverterRegistry INSTANCE = new ConverterRegistry();

        private a() {
        }
    }

    public ConverterRegistry() {
        defaultConverter();
        putCustomBySpi();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T convertSpecial(Type type, Class<T> cls, Object obj, T t7) {
        if (cls == null) {
            return null;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            return (T) new cn.hutool.core.convert.impl.a(type).convert(obj, (Collection<?>) t7);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (T) new MapConverter(type).convert(obj, (Map) t7);
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            return (T) new EntryConverter(type).convert(obj, (Map.Entry) t7);
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (cls.isEnum()) {
            return (T) new EnumConverter(cls).convert(obj, t7);
        }
        if (cls.isArray()) {
            return (T) new ArrayConverter(cls).convert(obj, t7);
        }
        if ("java.lang.Class".equals(cls.getName())) {
            return (T) new ClassConverter().convert(obj, (Class) t7);
        }
        return null;
    }

    private ConverterRegistry defaultConverter() {
        SafeConcurrentHashMap safeConcurrentHashMap = new SafeConcurrentHashMap();
        this.defaultConverterMap = safeConcurrentHashMap;
        Class cls = Integer.TYPE;
        safeConcurrentHashMap.put(cls, new PrimitiveConverter(cls));
        Map<Class<?>, f> map = this.defaultConverterMap;
        Class<?> cls2 = Long.TYPE;
        map.put(cls2, new PrimitiveConverter(cls2));
        Map<Class<?>, f> map2 = this.defaultConverterMap;
        Class<?> cls3 = Byte.TYPE;
        map2.put(cls3, new PrimitiveConverter(cls3));
        Map<Class<?>, f> map3 = this.defaultConverterMap;
        Class<?> cls4 = Short.TYPE;
        map3.put(cls4, new PrimitiveConverter(cls4));
        Map<Class<?>, f> map4 = this.defaultConverterMap;
        Class<?> cls5 = Float.TYPE;
        map4.put(cls5, new PrimitiveConverter(cls5));
        Map<Class<?>, f> map5 = this.defaultConverterMap;
        Class<?> cls6 = Double.TYPE;
        map5.put(cls6, new PrimitiveConverter(cls6));
        Map<Class<?>, f> map6 = this.defaultConverterMap;
        Class<?> cls7 = Character.TYPE;
        map6.put(cls7, new PrimitiveConverter(cls7));
        Map<Class<?>, f> map7 = this.defaultConverterMap;
        Class<?> cls8 = Boolean.TYPE;
        map7.put(cls8, new PrimitiveConverter(cls8));
        this.defaultConverterMap.put(Number.class, new NumberConverter());
        this.defaultConverterMap.put(Integer.class, new NumberConverter(Integer.class));
        this.defaultConverterMap.put(AtomicInteger.class, new NumberConverter(AtomicInteger.class));
        this.defaultConverterMap.put(Long.class, new NumberConverter(Long.class));
        this.defaultConverterMap.put(g.a(), new NumberConverter(g.a()));
        this.defaultConverterMap.put(AtomicLong.class, new NumberConverter(AtomicLong.class));
        this.defaultConverterMap.put(Byte.class, new NumberConverter(Byte.class));
        this.defaultConverterMap.put(Short.class, new NumberConverter(Short.class));
        this.defaultConverterMap.put(Float.class, new NumberConverter(Float.class));
        this.defaultConverterMap.put(Double.class, new NumberConverter(Double.class));
        this.defaultConverterMap.put(k.a(), new NumberConverter(k.a()));
        this.defaultConverterMap.put(Character.class, new CharacterConverter());
        this.defaultConverterMap.put(Boolean.class, new BooleanConverter());
        this.defaultConverterMap.put(AtomicBoolean.class, new AtomicBooleanConverter());
        this.defaultConverterMap.put(BigDecimal.class, new NumberConverter(BigDecimal.class));
        this.defaultConverterMap.put(BigInteger.class, new NumberConverter(BigInteger.class));
        this.defaultConverterMap.put(CharSequence.class, new StringConverter());
        this.defaultConverterMap.put(String.class, new StringConverter());
        this.defaultConverterMap.put(URI.class, new URIConverter());
        this.defaultConverterMap.put(URL.class, new URLConverter());
        this.defaultConverterMap.put(Calendar.class, new CalendarConverter());
        this.defaultConverterMap.put(Date.class, new DateConverter(Date.class));
        this.defaultConverterMap.put(DateTime.class, new DateConverter(DateTime.class));
        this.defaultConverterMap.put(java.sql.Date.class, new DateConverter(java.sql.Date.class));
        this.defaultConverterMap.put(Time.class, new DateConverter(Time.class));
        this.defaultConverterMap.put(Timestamp.class, new DateConverter(Timestamp.class));
        this.defaultConverterMap.put(l.a(), new TemporalAccessorConverter(c.a()));
        this.defaultConverterMap.put(c.a(), new TemporalAccessorConverter(c.a()));
        this.defaultConverterMap.put(cn.hutool.core.convert.a.a(), new TemporalAccessorConverter(cn.hutool.core.convert.a.a()));
        this.defaultConverterMap.put(p.a(), new TemporalAccessorConverter(p.a()));
        this.defaultConverterMap.put(q.a(), new TemporalAccessorConverter(q.a()));
        this.defaultConverterMap.put(r.a(), new TemporalAccessorConverter(r.a()));
        this.defaultConverterMap.put(s.a(), new TemporalAccessorConverter(s.a()));
        this.defaultConverterMap.put(t.a(), new TemporalAccessorConverter(t.a()));
        this.defaultConverterMap.put(u.a(), new TemporalAccessorConverter(u.a()));
        this.defaultConverterMap.put(v.a(), new TemporalAccessorConverter(v.a()));
        this.defaultConverterMap.put(w.a(), new TemporalAccessorConverter(w.a()));
        this.defaultConverterMap.put(x.a(), new PeriodConverter());
        this.defaultConverterMap.put(h.a(), new DurationConverter());
        this.defaultConverterMap.put(WeakReference.class, new ReferenceConverter(WeakReference.class));
        this.defaultConverterMap.put(SoftReference.class, new ReferenceConverter(SoftReference.class));
        this.defaultConverterMap.put(AtomicReference.class, new AtomicReferenceConverter());
        this.defaultConverterMap.put(AtomicIntegerArray.class, new AtomicIntegerArrayConverter());
        this.defaultConverterMap.put(AtomicLongArray.class, new AtomicLongArrayConverter());
        this.defaultConverterMap.put(TimeZone.class, new TimeZoneConverter());
        this.defaultConverterMap.put(Locale.class, new LocaleConverter());
        this.defaultConverterMap.put(Charset.class, new CharsetConverter());
        this.defaultConverterMap.put(i.a(), new PathConverter());
        this.defaultConverterMap.put(Currency.class, new CurrencyConverter());
        this.defaultConverterMap.put(UUID.class, new UUIDConverter());
        this.defaultConverterMap.put(StackTraceElement.class, new StackTraceElementConverter());
        this.defaultConverterMap.put(j.a(), new OptionalConverter());
        this.defaultConverterMap.put(l0.class, new OptConverter());
        this.defaultConverterMap.put(Pair.class, new PairConverter(Pair.class));
        return this;
    }

    public static ConverterRegistry getInstance() {
        return a.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putCustomBySpi$0(f fVar) {
        try {
            Type typeArgument = e1.getTypeArgument(cn.hutool.core.util.p.getClass(fVar));
            if (typeArgument != null) {
                putCustom(typeArgument, fVar);
            }
        } catch (Exception unused) {
        }
    }

    private void putCustomBySpi() {
        b1.load(f.class).forEach(new Consumer() { // from class: cn.hutool.core.convert.y
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ConverterRegistry.this.lambda$putCustomBySpi$0((f) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T convert(Type type, Object obj, T t7, boolean z7) {
        String typeName;
        Object orElse;
        if (e1.isUnknown(type) && t7 == null) {
            return obj;
        }
        if (e0.isNull(obj)) {
            return t7;
        }
        if (e1.isUnknown(type)) {
            type = t7.getClass();
        }
        boolean z8 = obj instanceof l0;
        b0 b0Var = obj;
        if (z8) {
            b0 b0Var2 = (T) ((l0) obj).get();
            boolean isNull = e0.isNull(b0Var2);
            b0Var = b0Var2;
            if (isNull) {
                return t7;
            }
        }
        boolean a8 = m.a(b0Var);
        b0 b0Var3 = b0Var;
        if (a8) {
            orElse = n.a(b0Var).orElse(null);
            b0 b0Var4 = (T) orElse;
            boolean isNull2 = e0.isNull(b0Var4);
            b0Var3 = b0Var4;
            if (isNull2) {
                return t7;
            }
        }
        if (type instanceof y0) {
            type = ((y0) type).getType();
        }
        if (b0Var3 instanceof b0) {
            return (T) e0.defaultIfNull(b0Var3.convert(type, b0Var3), t7);
        }
        f converter = getConverter(type, z7);
        if (converter != null) {
            return (T) converter.convert(b0Var3, t7);
        }
        Class<?> cls = e1.getClass(type);
        if (cls == null) {
            if (t7 == null) {
                return (T) b0Var3;
            }
            cls = t7.getClass();
        }
        T t8 = (T) convertSpecial(type, cls, b0Var3, t7);
        if (t8 != null) {
            return t8;
        }
        if (cn.hutool.core.bean.q.isBean(cls)) {
            return new BeanConverter(type).convert(b0Var3, t7);
        }
        typeName = type.getTypeName();
        throw new ConvertException("Can not Converter from [{}] to [{}]", b0Var3.getClass().getName(), typeName);
    }

    public <T> f getConverter(Type type, boolean z7) {
        if (z7) {
            f customConverter = getCustomConverter(type);
            return customConverter == null ? getDefaultConverter(type) : customConverter;
        }
        f defaultConverter = getDefaultConverter(type);
        return defaultConverter == null ? getCustomConverter(type) : defaultConverter;
    }

    public <T> f getCustomConverter(Type type) {
        if (this.customConverterMap == null) {
            return null;
        }
        return this.customConverterMap.get(type);
    }

    public <T> f getDefaultConverter(Type type) {
        Map<Class<?>, f> map = this.defaultConverterMap;
        if (map == null) {
            return null;
        }
        return map.get(e1.getClass(type));
    }

    public ConverterRegistry putCustom(Type type, Class<? extends f> cls) {
        return putCustom(type, (f) cn.hutool.core.util.y0.newInstance(cls, new Object[0]));
    }

    public ConverterRegistry putCustom(Type type, f fVar) {
        if (this.customConverterMap == null) {
            synchronized (this) {
                try {
                    if (this.customConverterMap == null) {
                        this.customConverterMap = new SafeConcurrentHashMap();
                    }
                } finally {
                }
            }
        }
        this.customConverterMap.put(type, fVar);
        return this;
    }

    public <T> T convert(Type type, Object obj, T t7) {
        return (T) convert(type, obj, t7, true);
    }

    public <T> T convert(Type type, Object obj) {
        return (T) convert(type, obj, null);
    }
}
