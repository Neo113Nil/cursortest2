package io.appmetrica.analytics.impl;

import androidx.fragment.app.FragmentTransaction;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0624x9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f1563a;
    public static final EnumSet b;
    public static final EnumSet c;
    public static final EnumSet d;
    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public static final EnumSet h;
    public static final List i;
    public static final List j;

    static {
        EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC0095cb enumC0095cb2 = EnumC0095cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC0095cb enumC0095cb3 = EnumC0095cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC0095cb enumC0095cb4 = EnumC0095cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0095cb enumC0095cb5 = EnumC0095cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0095cb enumC0095cb6 = EnumC0095cb.EVENT_TYPE_ANR;
        f1563a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC0095cb enumC0095cb7 = EnumC0095cb.EVENT_TYPE_UNDEFINED;
        EnumC0095cb enumC0095cb8 = EnumC0095cb.EVENT_TYPE_PURGE_BUFFER;
        EnumC0095cb enumC0095cb9 = EnumC0095cb.EVENT_TYPE_SEND_REFERRER;
        EnumC0095cb enumC0095cb10 = EnumC0095cb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC0095cb enumC0095cb11 = EnumC0095cb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC0095cb enumC0095cb12 = EnumC0095cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC0095cb enumC0095cb13 = EnumC0095cb.EVENT_TYPE_SET_SESSION_EXTRA;
        b = EnumSet.of(enumC0095cb7, enumC0095cb8, enumC0095cb9, enumC0095cb10, enumC0095cb11, EnumC0095cb.EVENT_TYPE_ACTIVATION, enumC0095cb12, enumC0095cb5, enumC0095cb13);
        EnumC0095cb enumC0095cb14 = EnumC0095cb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC0095cb enumC0095cb15 = EnumC0095cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        c = EnumSet.of(enumC0095cb14, enumC0095cb4, enumC0095cb5, enumC0095cb12, enumC0095cb15);
        EnumC0095cb enumC0095cb16 = EnumC0095cb.EVENT_TYPE_REGULAR;
        d = EnumSet.of(enumC0095cb4, enumC0095cb5, enumC0095cb3, enumC0095cb, enumC0095cb2, enumC0095cb15, enumC0095cb12, enumC0095cb16, EnumC0095cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC0095cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC0095cb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC0095cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC0095cb8, EnumC0095cb.EVENT_TYPE_INIT, EnumC0095cb.EVENT_TYPE_SEND_USER_PROFILE, EnumC0095cb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC0095cb9, enumC0095cb10, enumC0095cb11, EnumC0095cb.EVENT_TYPE_FIRST_ACTIVATION, EnumC0095cb.EVENT_TYPE_START, EnumC0095cb.EVENT_TYPE_APP_OPEN, EnumC0095cb.EVENT_TYPE_APP_UPDATE, enumC0095cb6);
        e = EnumSet.of(enumC0095cb16);
        f = EnumSet.of(enumC0095cb16);
        g = EnumSet.of(enumC0095cb12);
        h = EnumSet.of(EnumC0095cb.EVENT_TYPE_ALIVE, enumC0095cb8, enumC0095cb13, enumC0095cb5, enumC0095cb12);
        i = Arrays.asList(0, 6145, Integer.valueOf(FragmentTransaction.TRANSIT_FRAGMENT_OPEN), 8224);
        EnumC0095cb enumC0095cb17 = EnumC0095cb.EVENT_TYPE_UNDEFINED;
        j = Arrays.asList(12290);
    }
}
