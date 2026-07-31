package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class R9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f38186a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumSet f38187b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f38188c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumSet f38189d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumSet f38190e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumSet f38191f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumSet f38192g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumSet f38193h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f38194i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f38195j;

    static {
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC3063wb enumC3063wb2 = EnumC3063wb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC3063wb enumC3063wb3 = EnumC3063wb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC3063wb enumC3063wb4 = EnumC3063wb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC3063wb enumC3063wb5 = EnumC3063wb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC3063wb enumC3063wb6 = EnumC3063wb.EVENT_TYPE_ANR;
        f38186a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC3063wb enumC3063wb7 = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        EnumC3063wb enumC3063wb8 = EnumC3063wb.EVENT_TYPE_PURGE_BUFFER;
        EnumC3063wb enumC3063wb9 = EnumC3063wb.EVENT_TYPE_SEND_REFERRER;
        EnumC3063wb enumC3063wb10 = EnumC3063wb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC3063wb enumC3063wb11 = EnumC3063wb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC3063wb enumC3063wb12 = EnumC3063wb.EVENT_TYPE_ACTIVATION;
        EnumC3063wb enumC3063wb13 = EnumC3063wb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC3063wb enumC3063wb14 = EnumC3063wb.EVENT_TYPE_SET_SESSION_EXTRA;
        f38187b = EnumSet.of(enumC3063wb7, enumC3063wb8, enumC3063wb9, enumC3063wb10, enumC3063wb11, enumC3063wb12, enumC3063wb13, enumC3063wb5, enumC3063wb14);
        EnumC3063wb enumC3063wb15 = EnumC3063wb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC3063wb enumC3063wb16 = EnumC3063wb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f38188c = EnumSet.of(enumC3063wb15, enumC3063wb4, enumC3063wb5, enumC3063wb13, enumC3063wb16);
        EnumC3063wb enumC3063wb17 = EnumC3063wb.EVENT_TYPE_REGULAR;
        f38189d = EnumSet.of(enumC3063wb4, enumC3063wb5, enumC3063wb3, enumC3063wb, enumC3063wb2, enumC3063wb16, enumC3063wb13, enumC3063wb17, EnumC3063wb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC3063wb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC3063wb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC3063wb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC3063wb8, EnumC3063wb.EVENT_TYPE_INIT, EnumC3063wb.EVENT_TYPE_SEND_USER_PROFILE, EnumC3063wb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC3063wb9, enumC3063wb10, enumC3063wb11, EnumC3063wb.EVENT_TYPE_FIRST_ACTIVATION, EnumC3063wb.EVENT_TYPE_START, EnumC3063wb.EVENT_TYPE_APP_OPEN, EnumC3063wb.EVENT_TYPE_APP_UPDATE, enumC3063wb6);
        f38190e = EnumSet.of(enumC3063wb17);
        f38191f = EnumSet.of(enumC3063wb17);
        f38192g = EnumSet.of(enumC3063wb13);
        f38193h = EnumSet.of(EnumC3063wb.EVENT_TYPE_ALIVE, enumC3063wb8, enumC3063wb14, enumC3063wb5, enumC3063wb13);
        f38194i = Arrays.asList(0, 6145, 4097, 8224);
        f38195j = Arrays.asList(12290);
    }
}
