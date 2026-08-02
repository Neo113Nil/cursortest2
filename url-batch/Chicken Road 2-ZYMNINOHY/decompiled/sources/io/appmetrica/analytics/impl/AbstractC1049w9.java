package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1049w9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f12924a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumSet f12925b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f12926c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumSet f12927d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumSet f12928e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumSet f12929f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumSet f12930g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumSet f12931h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f12932i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f12933j;

    static {
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC0508bb enumC0508bb2 = EnumC0508bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC0508bb enumC0508bb3 = EnumC0508bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC0508bb enumC0508bb4 = EnumC0508bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0508bb enumC0508bb5 = EnumC0508bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0508bb enumC0508bb6 = EnumC0508bb.EVENT_TYPE_ANR;
        f12924a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC0508bb enumC0508bb7 = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        EnumC0508bb enumC0508bb8 = EnumC0508bb.EVENT_TYPE_PURGE_BUFFER;
        EnumC0508bb enumC0508bb9 = EnumC0508bb.EVENT_TYPE_SEND_REFERRER;
        EnumC0508bb enumC0508bb10 = EnumC0508bb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC0508bb enumC0508bb11 = EnumC0508bb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC0508bb enumC0508bb12 = EnumC0508bb.EVENT_TYPE_ACTIVATION;
        EnumC0508bb enumC0508bb13 = EnumC0508bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC0508bb enumC0508bb14 = EnumC0508bb.EVENT_TYPE_SET_SESSION_EXTRA;
        f12925b = EnumSet.of(enumC0508bb7, enumC0508bb8, enumC0508bb9, enumC0508bb10, enumC0508bb11, enumC0508bb12, enumC0508bb13, enumC0508bb5, enumC0508bb14);
        EnumC0508bb enumC0508bb15 = EnumC0508bb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC0508bb enumC0508bb16 = EnumC0508bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f12926c = EnumSet.of(enumC0508bb15, enumC0508bb4, enumC0508bb5, enumC0508bb13, enumC0508bb16);
        EnumC0508bb enumC0508bb17 = EnumC0508bb.EVENT_TYPE_REGULAR;
        f12927d = EnumSet.of(enumC0508bb4, enumC0508bb5, enumC0508bb3, enumC0508bb, enumC0508bb2, enumC0508bb16, enumC0508bb13, enumC0508bb17, EnumC0508bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC0508bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC0508bb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC0508bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC0508bb8, EnumC0508bb.EVENT_TYPE_INIT, EnumC0508bb.EVENT_TYPE_SEND_USER_PROFILE, EnumC0508bb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC0508bb9, enumC0508bb10, enumC0508bb11, EnumC0508bb.EVENT_TYPE_FIRST_ACTIVATION, EnumC0508bb.EVENT_TYPE_START, EnumC0508bb.EVENT_TYPE_APP_OPEN, EnumC0508bb.EVENT_TYPE_APP_UPDATE, enumC0508bb6);
        f12928e = EnumSet.of(enumC0508bb17);
        f12929f = EnumSet.of(enumC0508bb17);
        f12930g = EnumSet.of(enumC0508bb13);
        f12931h = EnumSet.of(EnumC0508bb.EVENT_TYPE_ALIVE, enumC0508bb8, enumC0508bb14, enumC0508bb5, enumC0508bb13);
        f12932i = Arrays.asList(0, 6145, 4097, 8224);
        f12933j = Arrays.asList(12290);
    }
}
