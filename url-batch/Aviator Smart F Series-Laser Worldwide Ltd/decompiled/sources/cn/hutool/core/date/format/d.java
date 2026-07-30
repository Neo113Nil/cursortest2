package cn.hutool.core.date.format;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public interface d extends a {
    <B extends Appendable> B format(long j8, B b8);

    <B extends Appendable> B format(Calendar calendar, B b8);

    <B extends Appendable> B format(Date date, B b8);

    String format(long j8);

    String format(Calendar calendar);

    String format(Date date);

    @Override // cn.hutool.core.date.format.a
    /* synthetic */ Locale getLocale();

    @Override // cn.hutool.core.date.format.a
    /* synthetic */ String getPattern();

    @Override // cn.hutool.core.date.format.a
    /* synthetic */ TimeZone getTimeZone();
}
