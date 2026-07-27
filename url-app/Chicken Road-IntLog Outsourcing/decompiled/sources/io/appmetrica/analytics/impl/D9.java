package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class D9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f6670a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumSet f6671b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f6672c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumSet f6673d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumSet f6674e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumSet f6675f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumSet f6676g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumSet f6677h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f6678i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f6679j;

    static {
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC0718ib enumC0718ib2 = EnumC0718ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC0718ib enumC0718ib3 = EnumC0718ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC0718ib enumC0718ib4 = EnumC0718ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0718ib enumC0718ib5 = EnumC0718ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0718ib enumC0718ib6 = EnumC0718ib.EVENT_TYPE_ANR;
        f6670a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC0718ib enumC0718ib7 = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        EnumC0718ib enumC0718ib8 = EnumC0718ib.EVENT_TYPE_PURGE_BUFFER;
        EnumC0718ib enumC0718ib9 = EnumC0718ib.EVENT_TYPE_SEND_REFERRER;
        EnumC0718ib enumC0718ib10 = EnumC0718ib.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC0718ib enumC0718ib11 = EnumC0718ib.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC0718ib enumC0718ib12 = EnumC0718ib.EVENT_TYPE_ACTIVATION;
        EnumC0718ib enumC0718ib13 = EnumC0718ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC0718ib enumC0718ib14 = EnumC0718ib.EVENT_TYPE_SET_SESSION_EXTRA;
        f6671b = EnumSet.of(enumC0718ib7, enumC0718ib8, enumC0718ib9, enumC0718ib10, enumC0718ib11, enumC0718ib12, enumC0718ib13, enumC0718ib5, enumC0718ib14);
        EnumC0718ib enumC0718ib15 = EnumC0718ib.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC0718ib enumC0718ib16 = EnumC0718ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f6672c = EnumSet.of(enumC0718ib15, enumC0718ib4, enumC0718ib5, enumC0718ib13, enumC0718ib16);
        EnumC0718ib enumC0718ib17 = EnumC0718ib.EVENT_TYPE_REGULAR;
        f6673d = EnumSet.of(enumC0718ib4, enumC0718ib5, enumC0718ib3, enumC0718ib, enumC0718ib2, enumC0718ib16, enumC0718ib13, enumC0718ib17, EnumC0718ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC0718ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC0718ib.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC0718ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC0718ib8, EnumC0718ib.EVENT_TYPE_INIT, EnumC0718ib.EVENT_TYPE_SEND_USER_PROFILE, EnumC0718ib.EVENT_TYPE_SET_USER_PROFILE_ID, enumC0718ib9, enumC0718ib10, enumC0718ib11, EnumC0718ib.EVENT_TYPE_FIRST_ACTIVATION, EnumC0718ib.EVENT_TYPE_START, EnumC0718ib.EVENT_TYPE_APP_OPEN, EnumC0718ib.EVENT_TYPE_APP_UPDATE, enumC0718ib6);
        f6674e = EnumSet.of(enumC0718ib17);
        f6675f = EnumSet.of(enumC0718ib17);
        f6676g = EnumSet.of(enumC0718ib13);
        f6677h = EnumSet.of(EnumC0718ib.EVENT_TYPE_ALIVE, enumC0718ib8, enumC0718ib14, enumC0718ib5, enumC0718ib13);
        f6678i = Arrays.asList(0, 6145, 4097, 8224);
        f6679j = Arrays.asList(12290);
    }
}
