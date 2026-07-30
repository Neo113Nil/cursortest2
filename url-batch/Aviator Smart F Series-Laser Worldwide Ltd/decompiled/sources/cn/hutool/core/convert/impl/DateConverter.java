package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConvertException;
import cn.hutool.core.date.DateTime;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes.dex */
public class DateConverter extends AbstractConverter<Date> {
    private static final long serialVersionUID = 1;
    private String format;
    private final Class<? extends Date> targetType;

    public DateConverter(Class<? extends Date> cls) {
        this.targetType = cls;
    }

    private Date wrap(DateTime dateTime) {
        Class<? extends Date> cls = this.targetType;
        if (Date.class == cls) {
            return dateTime.toJdkDate();
        }
        if (DateTime.class == cls) {
            return dateTime;
        }
        if (java.sql.Date.class == cls) {
            return dateTime.toSqlDate();
        }
        if (Time.class == cls) {
            return new Time(dateTime.getTime());
        }
        if (Timestamp.class == cls) {
            return dateTime.toTimestamp();
        }
        throw new UnsupportedOperationException(cn.hutool.core.text.l.format("Unsupported target Date type: {}", this.targetType.getName()));
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    public String getFormat() {
        return this.format;
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<Date> getTargetType() {
        return this.targetType;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public DateConverter(Class<? extends Date> cls, String str) {
        this.targetType = cls;
        this.format = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Date convertInternal(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof CharSequence) && cn.hutool.core.text.l.isBlank(obj.toString())) {
            return null;
        }
        if (b.a(obj)) {
            return wrap(cn.hutool.core.date.z.date(c.a(obj)));
        }
        if (obj instanceof Calendar) {
            return wrap(cn.hutool.core.date.z.date((Calendar) obj));
        }
        if (obj instanceof Number) {
            return wrap(((Number) obj).longValue());
        }
        String convertToStr = convertToStr(obj);
        DateTime parse = cn.hutool.core.text.l.isBlank(this.format) ? cn.hutool.core.date.z.parse(convertToStr) : cn.hutool.core.date.z.parse(convertToStr, this.format);
        if (parse != null) {
            return wrap(parse);
        }
        throw new ConvertException("Can not convert {}:[{}] to {}", obj.getClass().getName(), obj, this.targetType.getName());
    }

    private Date wrap(long j8) {
        if (cn.hutool.core.date.format.o.FORMAT_SECONDS.equals(this.format)) {
            return cn.hutool.core.date.z.date(j8 * 1000);
        }
        Class<? extends Date> cls = this.targetType;
        if (Date.class == cls) {
            return new Date(j8);
        }
        if (DateTime.class == cls) {
            return cn.hutool.core.date.z.date(j8);
        }
        if (java.sql.Date.class == cls) {
            return new java.sql.Date(j8);
        }
        if (Time.class == cls) {
            return new Time(j8);
        }
        if (Timestamp.class == cls) {
            return new Timestamp(j8);
        }
        throw new UnsupportedOperationException(cn.hutool.core.text.l.format("Unsupported target Date type: {}", this.targetType.getName()));
    }
}
