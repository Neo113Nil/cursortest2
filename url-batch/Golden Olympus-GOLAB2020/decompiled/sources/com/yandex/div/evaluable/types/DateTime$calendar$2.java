package com.yandex.div.evaluable.types;

import java.util.Calendar;
import java.util.SimpleTimeZone;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DateTime$calendar$2 extends s implements Function0<Calendar> {
    final /* synthetic */ DateTime this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateTime$calendar$2(DateTime dateTime) {
        super(0);
        this.this$0 = dateTime;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Calendar invoke() {
        SimpleTimeZone simpleTimeZone;
        simpleTimeZone = DateTime.utcTimezone;
        Calendar calendar = Calendar.getInstance(simpleTimeZone);
        calendar.setTimeInMillis(this.this$0.getTimestampMillis$div_evaluable());
        return calendar;
    }
}
