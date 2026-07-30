package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes.dex */
public class CalendarConverter extends AbstractConverter<Calendar> {
    private static final long serialVersionUID = 1;
    private String format;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Calendar convertInternal(Object obj) {
        if (obj instanceof Date) {
            return cn.hutool.core.date.a.calendar((Date) obj);
        }
        if (obj instanceof Long) {
            return cn.hutool.core.date.a.calendar(((Long) obj).longValue());
        }
        String convertToStr = convertToStr(obj);
        return cn.hutool.core.date.a.calendar(cn.hutool.core.text.l.isBlank(this.format) ? cn.hutool.core.date.z.parse(convertToStr) : cn.hutool.core.date.z.parse(convertToStr, this.format));
    }
}
