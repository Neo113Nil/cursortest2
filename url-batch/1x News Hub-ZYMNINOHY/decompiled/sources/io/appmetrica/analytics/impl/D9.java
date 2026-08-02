package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class D9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5886a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumSet f5887b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f5888c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumSet f5889d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumSet f5890e;
    public static final EnumSet f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumSet f5891g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumSet f5892h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f5893i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f5894j;

    static {
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC0567ib enumC0567ib2 = EnumC0567ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC0567ib enumC0567ib3 = EnumC0567ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC0567ib enumC0567ib4 = EnumC0567ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0567ib enumC0567ib5 = EnumC0567ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0567ib enumC0567ib6 = EnumC0567ib.EVENT_TYPE_ANR;
        f5886a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC0567ib enumC0567ib7 = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        EnumC0567ib enumC0567ib8 = EnumC0567ib.EVENT_TYPE_PURGE_BUFFER;
        EnumC0567ib enumC0567ib9 = EnumC0567ib.EVENT_TYPE_SEND_REFERRER;
        EnumC0567ib enumC0567ib10 = EnumC0567ib.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC0567ib enumC0567ib11 = EnumC0567ib.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC0567ib enumC0567ib12 = EnumC0567ib.EVENT_TYPE_ACTIVATION;
        EnumC0567ib enumC0567ib13 = EnumC0567ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC0567ib enumC0567ib14 = EnumC0567ib.EVENT_TYPE_SET_SESSION_EXTRA;
        f5887b = EnumSet.of(enumC0567ib7, enumC0567ib8, enumC0567ib9, enumC0567ib10, enumC0567ib11, enumC0567ib12, enumC0567ib13, enumC0567ib5, enumC0567ib14);
        EnumC0567ib enumC0567ib15 = EnumC0567ib.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC0567ib enumC0567ib16 = EnumC0567ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f5888c = EnumSet.of(enumC0567ib15, enumC0567ib4, enumC0567ib5, enumC0567ib13, enumC0567ib16);
        EnumC0567ib enumC0567ib17 = EnumC0567ib.EVENT_TYPE_REGULAR;
        f5889d = EnumSet.of(enumC0567ib4, enumC0567ib5, enumC0567ib3, enumC0567ib, enumC0567ib2, enumC0567ib16, enumC0567ib13, enumC0567ib17, EnumC0567ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC0567ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC0567ib.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC0567ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC0567ib8, EnumC0567ib.EVENT_TYPE_INIT, EnumC0567ib.EVENT_TYPE_SEND_USER_PROFILE, EnumC0567ib.EVENT_TYPE_SET_USER_PROFILE_ID, enumC0567ib9, enumC0567ib10, enumC0567ib11, EnumC0567ib.EVENT_TYPE_FIRST_ACTIVATION, EnumC0567ib.EVENT_TYPE_START, EnumC0567ib.EVENT_TYPE_APP_OPEN, EnumC0567ib.EVENT_TYPE_APP_UPDATE, enumC0567ib6);
        f5890e = EnumSet.of(enumC0567ib17);
        f = EnumSet.of(enumC0567ib17);
        f5891g = EnumSet.of(enumC0567ib13);
        f5892h = EnumSet.of(EnumC0567ib.EVENT_TYPE_ALIVE, enumC0567ib8, enumC0567ib14, enumC0567ib5, enumC0567ib13);
        f5893i = Arrays.asList(0, 6145, 4097, 8224);
        f5894j = Arrays.asList(12290);
    }
}
