package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Pf {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f10817a;

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f10818b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f10819c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f10820d;

    static {
        HashMap hashMap = new HashMap();
        Vk vk = Vk.FOREGROUND;
        hashMap.put(vk, 0);
        Vk vk2 = Vk.BACKGROUND;
        hashMap.put(vk2, 1);
        f10817a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, vk);
        sparseArray.put(1, vk2);
        f10818b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_INIT;
        hashMap2.put(enumC0508bb, 1);
        EnumC0508bb enumC0508bb2 = EnumC0508bb.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC0508bb2, 4);
        EnumC0508bb enumC0508bb3 = EnumC0508bb.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC0508bb3, 5);
        EnumC0508bb enumC0508bb4 = EnumC0508bb.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC0508bb4, 7);
        EnumC0508bb enumC0508bb5 = EnumC0508bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC0508bb5, 26);
        EnumC0508bb enumC0508bb6 = EnumC0508bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0508bb6, 26);
        EnumC0508bb enumC0508bb7 = EnumC0508bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0508bb7, 26);
        EnumC0508bb enumC0508bb8 = EnumC0508bb.EVENT_TYPE_ANR;
        hashMap2.put(enumC0508bb8, 25);
        EnumC0508bb enumC0508bb9 = EnumC0508bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0508bb9, 26);
        EnumC0508bb enumC0508bb10 = EnumC0508bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0508bb10, 26);
        EnumC0508bb enumC0508bb11 = EnumC0508bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC0508bb11, 27);
        EnumC0508bb enumC0508bb12 = EnumC0508bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC0508bb12, 27);
        EnumC0508bb enumC0508bb13 = EnumC0508bb.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC0508bb13, 13);
        EnumC0508bb enumC0508bb14 = EnumC0508bb.EVENT_TYPE_START;
        hashMap2.put(enumC0508bb14, 2);
        EnumC0508bb enumC0508bb15 = EnumC0508bb.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC0508bb15, 16);
        EnumC0508bb enumC0508bb16 = EnumC0508bb.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC0508bb16, 17);
        EnumC0508bb enumC0508bb17 = EnumC0508bb.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC0508bb17, 18);
        EnumC0508bb enumC0508bb18 = EnumC0508bb.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC0508bb18, 19);
        EnumC0508bb enumC0508bb19 = EnumC0508bb.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC0508bb19, 20);
        EnumC0508bb enumC0508bb20 = EnumC0508bb.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC0508bb20, 21);
        EnumC0508bb enumC0508bb21 = EnumC0508bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC0508bb21, 40);
        EnumC0508bb enumC0508bb22 = EnumC0508bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC0508bb22, 35);
        hashMap2.put(EnumC0508bb.EVENT_TYPE_CLEANUP, 29);
        EnumC0508bb enumC0508bb23 = EnumC0508bb.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC0508bb23, 38);
        EnumC0508bb enumC0508bb24 = EnumC0508bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC0508bb24, 42);
        f10819c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        C1048w8 c1048w8 = new C1048w8();
        C8 c8 = new C8(new H8());
        C1074x8 c1074x8 = new C1074x8();
        C0526c3 c0526c3 = new C0526c3(new H8());
        Pn pn = new Pn(new H8());
        Lf lf = new Lf();
        T8 a3 = U8.a();
        a3.f10982b = lf;
        a3.f10983c = lf;
        U8 u8 = new U8(a3);
        T8 a4 = U8.a();
        a4.f10982b = c8;
        U8 u82 = new U8(a4);
        T8 a5 = U8.a();
        a5.f10982b = c0526c3;
        U8 u83 = new U8(a5);
        T8 a6 = U8.a();
        a6.f10982b = pn;
        U8 u84 = new U8(a6);
        T8 a7 = U8.a();
        a7.f10981a = c1048w8;
        U8 u85 = new U8(a7);
        T8 a8 = U8.a();
        a8.f10982b = new C1012uo(new C8());
        U8 u86 = new U8(a8);
        hashMap3.put(enumC0508bb2, u82);
        T8 a9 = U8.a();
        a9.f10982b = new Nf();
        hashMap3.put(enumC0508bb3, new U8(a9));
        T8 a10 = U8.a();
        a10.f10981a = c1048w8;
        a10.f10982b = c1074x8;
        a10.f10985e = new W7();
        a10.f10986f = new X7();
        hashMap3.put(enumC0508bb4, new U8(a10));
        hashMap3.put(enumC0508bb9, u8);
        hashMap3.put(enumC0508bb10, u8);
        hashMap3.put(enumC0508bb11, u83);
        hashMap3.put(enumC0508bb12, u83);
        hashMap3.put(enumC0508bb5, u83);
        hashMap3.put(enumC0508bb6, u83);
        hashMap3.put(enumC0508bb7, u83);
        hashMap3.put(enumC0508bb8, u83);
        T8 a11 = U8.a();
        a11.f10981a = new C1048w8();
        a11.f10982b = c0526c3;
        hashMap3.put(enumC0508bb14, new U8(a11));
        EnumC0508bb enumC0508bb25 = EnumC0508bb.EVENT_TYPE_CUSTOM_EVENT;
        T8 a12 = U8.a();
        a12.f10984d = new Of();
        hashMap3.put(enumC0508bb25, new U8(a12));
        hashMap3.put(enumC0508bb15, u82);
        hashMap3.put(enumC0508bb17, u85);
        hashMap3.put(enumC0508bb18, u85);
        hashMap3.put(enumC0508bb19, u83);
        hashMap3.put(enumC0508bb20, u83);
        hashMap3.put(enumC0508bb21, u83);
        hashMap3.put(enumC0508bb22, u84);
        hashMap3.put(enumC0508bb, u86);
        hashMap3.put(enumC0508bb16, u86);
        hashMap3.put(enumC0508bb13, u82);
        hashMap3.put(enumC0508bb23, u82);
        hashMap3.put(enumC0508bb24, u83);
        f10820d = Collections.unmodifiableMap(hashMap3);
    }

    public static C0687i9 a(Long l4, Long l5, Boolean bool) {
        C0687i9 c0687i9 = new C0687i9();
        if (l4 != null) {
            c0687i9.f12033a = l4.longValue();
            c0687i9.f12034b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l4.longValue() * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        }
        if (l5 != null) {
            c0687i9.f12035c = l5.longValue();
        }
        if (bool != null) {
            c0687i9.f12036d = bool.booleanValue();
        }
        return c0687i9;
    }

    public static void a(C0635g9 c0635g9) {
        C0583e9[] c0583e9Arr = c0635g9.f11927c;
        if (c0583e9Arr != null) {
            for (C0583e9 c0583e9 : c0583e9Arr) {
            }
        }
    }
}
