package com.squareup.cash.work.presenters.pay;

import java.time.format.DateTimeFormatter;

/* loaded from: classes7.dex */
public abstract class PayStubNavigation {
    public static final DateTimeFormatter PAY_DATE_INPUT_FORMAT;

    static {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        dateTimeFormatter.getClass();
        PAY_DATE_INPUT_FORMAT = dateTimeFormatter;
    }
}
