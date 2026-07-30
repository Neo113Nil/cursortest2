package cn.hutool.core.date.format;

import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public interface c extends a {
    @Override // cn.hutool.core.date.format.a
    /* synthetic */ Locale getLocale();

    @Override // cn.hutool.core.date.format.a
    /* synthetic */ String getPattern();

    @Override // cn.hutool.core.date.format.a
    /* synthetic */ TimeZone getTimeZone();

    Date parse(String str);

    Date parse(String str, ParsePosition parsePosition);

    boolean parse(String str, ParsePosition parsePosition, Calendar calendar);

    Object parseObject(String str);

    Object parseObject(String str, ParsePosition parsePosition);
}
