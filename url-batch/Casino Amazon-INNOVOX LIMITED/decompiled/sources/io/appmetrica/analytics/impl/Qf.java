package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class Qf {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f1016a;
    public static final SparseArray b;
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        Wk wk = Wk.FOREGROUND;
        hashMap.put(wk, 0);
        Wk wk2 = Wk.BACKGROUND;
        hashMap.put(wk2, 1);
        f1016a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, wk);
        sparseArray.put(1, wk2);
        b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_INIT;
        hashMap2.put(enumC0095cb, 1);
        EnumC0095cb enumC0095cb2 = EnumC0095cb.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC0095cb2, 4);
        EnumC0095cb enumC0095cb3 = EnumC0095cb.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC0095cb3, 5);
        EnumC0095cb enumC0095cb4 = EnumC0095cb.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC0095cb4, 7);
        EnumC0095cb enumC0095cb5 = EnumC0095cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC0095cb5, 26);
        EnumC0095cb enumC0095cb6 = EnumC0095cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0095cb6, 26);
        EnumC0095cb enumC0095cb7 = EnumC0095cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0095cb7, 26);
        EnumC0095cb enumC0095cb8 = EnumC0095cb.EVENT_TYPE_ANR;
        hashMap2.put(enumC0095cb8, 25);
        EnumC0095cb enumC0095cb9 = EnumC0095cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0095cb9, 26);
        EnumC0095cb enumC0095cb10 = EnumC0095cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0095cb10, 26);
        EnumC0095cb enumC0095cb11 = EnumC0095cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC0095cb11, 27);
        EnumC0095cb enumC0095cb12 = EnumC0095cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC0095cb12, 27);
        EnumC0095cb enumC0095cb13 = EnumC0095cb.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC0095cb13, 13);
        EnumC0095cb enumC0095cb14 = EnumC0095cb.EVENT_TYPE_START;
        hashMap2.put(enumC0095cb14, 2);
        EnumC0095cb enumC0095cb15 = EnumC0095cb.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC0095cb15, 16);
        EnumC0095cb enumC0095cb16 = EnumC0095cb.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC0095cb16, 17);
        EnumC0095cb enumC0095cb17 = EnumC0095cb.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC0095cb17, 18);
        EnumC0095cb enumC0095cb18 = EnumC0095cb.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC0095cb18, 19);
        EnumC0095cb enumC0095cb19 = EnumC0095cb.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC0095cb19, 20);
        EnumC0095cb enumC0095cb20 = EnumC0095cb.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC0095cb20, 21);
        EnumC0095cb enumC0095cb21 = EnumC0095cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC0095cb21, 40);
        EnumC0095cb enumC0095cb22 = EnumC0095cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC0095cb22, 35);
        hashMap2.put(EnumC0095cb.EVENT_TYPE_CLEANUP, 29);
        EnumC0095cb enumC0095cb23 = EnumC0095cb.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC0095cb23, 38);
        EnumC0095cb enumC0095cb24 = EnumC0095cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC0095cb24, 42);
        c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        C0623x8 c0623x8 = new C0623x8();
        D8 d8 = new D8(new I8());
        C0648y8 c0648y8 = new C0648y8();
        C0113d3 c0113d3 = new C0113d3(new I8());
        Qn qn = new Qn(new I8());
        Mf mf = new Mf();
        U8 a2 = V8.a();
        a2.b = mf;
        a2.c = mf;
        V8 v8 = new V8(a2);
        U8 a3 = V8.a();
        a3.b = d8;
        V8 v82 = new V8(a3);
        U8 a4 = V8.a();
        a4.b = c0113d3;
        V8 v83 = new V8(a4);
        U8 a5 = V8.a();
        a5.b = qn;
        V8 v84 = new V8(a5);
        U8 a6 = V8.a();
        a6.f1073a = c0623x8;
        V8 v85 = new V8(a6);
        U8 a7 = V8.a();
        a7.b = new vo(new D8());
        V8 v86 = new V8(a7);
        hashMap3.put(enumC0095cb2, v82);
        U8 a8 = V8.a();
        a8.b = new Of();
        hashMap3.put(enumC0095cb3, new V8(a8));
        U8 a9 = V8.a();
        a9.f1073a = c0623x8;
        a9.b = c0648y8;
        a9.e = new X7();
        a9.f = new Y7();
        hashMap3.put(enumC0095cb4, new V8(a9));
        hashMap3.put(enumC0095cb9, v8);
        hashMap3.put(enumC0095cb10, v8);
        hashMap3.put(enumC0095cb11, v83);
        hashMap3.put(enumC0095cb12, v83);
        hashMap3.put(enumC0095cb5, v83);
        hashMap3.put(enumC0095cb6, v83);
        hashMap3.put(enumC0095cb7, v83);
        hashMap3.put(enumC0095cb8, v83);
        U8 a10 = V8.a();
        a10.f1073a = new C0623x8();
        a10.b = c0113d3;
        hashMap3.put(enumC0095cb14, new V8(a10));
        EnumC0095cb enumC0095cb25 = EnumC0095cb.EVENT_TYPE_CUSTOM_EVENT;
        U8 a11 = V8.a();
        a11.d = new Pf();
        hashMap3.put(enumC0095cb25, new V8(a11));
        hashMap3.put(enumC0095cb15, v82);
        hashMap3.put(enumC0095cb17, v85);
        hashMap3.put(enumC0095cb18, v85);
        hashMap3.put(enumC0095cb19, v83);
        hashMap3.put(enumC0095cb20, v83);
        hashMap3.put(enumC0095cb21, v83);
        hashMap3.put(enumC0095cb22, v84);
        hashMap3.put(enumC0095cb, v86);
        hashMap3.put(enumC0095cb16, v86);
        hashMap3.put(enumC0095cb13, v82);
        hashMap3.put(enumC0095cb23, v82);
        hashMap3.put(enumC0095cb24, v83);
        d = Collections.unmodifiableMap(hashMap3);
    }

    public static C0273j9 a(Long l, Long l2, Boolean bool) {
        C0273j9 c0273j9 = new C0273j9();
        if (l != null) {
            c0273j9.f1319a = l.longValue();
            c0273j9.b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l.longValue() * 1000) / 1000;
        }
        if (l2 != null) {
            c0273j9.c = l2.longValue();
        }
        if (bool != null) {
            c0273j9.d = bool.booleanValue();
        }
        return c0273j9;
    }

    public static void a(C0222h9 c0222h9) {
        C0170f9[] c0170f9Arr = c0222h9.c;
        if (c0170f9Arr != null) {
            for (C0170f9 c0170f9 : c0170f9Arr) {
            }
        }
    }
}
