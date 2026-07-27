package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Uf {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f7591a;

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f7592b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f7593c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f7594d;

    static {
        HashMap hashMap = new HashMap();
        EnumC0521al enumC0521al = EnumC0521al.FOREGROUND;
        hashMap.put(enumC0521al, 0);
        EnumC0521al enumC0521al2 = EnumC0521al.BACKGROUND;
        hashMap.put(enumC0521al2, 1);
        f7591a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC0521al);
        sparseArray.put(1, enumC0521al2);
        f7592b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_INIT;
        hashMap2.put(enumC0718ib, 1);
        EnumC0718ib enumC0718ib2 = EnumC0718ib.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC0718ib2, 4);
        EnumC0718ib enumC0718ib3 = EnumC0718ib.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC0718ib3, 5);
        EnumC0718ib enumC0718ib4 = EnumC0718ib.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC0718ib4, 7);
        EnumC0718ib enumC0718ib5 = EnumC0718ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC0718ib5, 26);
        EnumC0718ib enumC0718ib6 = EnumC0718ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0718ib6, 26);
        EnumC0718ib enumC0718ib7 = EnumC0718ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0718ib7, 26);
        EnumC0718ib enumC0718ib8 = EnumC0718ib.EVENT_TYPE_ANR;
        hashMap2.put(enumC0718ib8, 25);
        EnumC0718ib enumC0718ib9 = EnumC0718ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0718ib9, 26);
        EnumC0718ib enumC0718ib10 = EnumC0718ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0718ib10, 26);
        EnumC0718ib enumC0718ib11 = EnumC0718ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC0718ib11, 27);
        EnumC0718ib enumC0718ib12 = EnumC0718ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC0718ib12, 27);
        EnumC0718ib enumC0718ib13 = EnumC0718ib.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC0718ib13, 13);
        EnumC0718ib enumC0718ib14 = EnumC0718ib.EVENT_TYPE_START;
        hashMap2.put(enumC0718ib14, 2);
        EnumC0718ib enumC0718ib15 = EnumC0718ib.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC0718ib15, 16);
        EnumC0718ib enumC0718ib16 = EnumC0718ib.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC0718ib16, 17);
        EnumC0718ib enumC0718ib17 = EnumC0718ib.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC0718ib17, 18);
        EnumC0718ib enumC0718ib18 = EnumC0718ib.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC0718ib18, 19);
        EnumC0718ib enumC0718ib19 = EnumC0718ib.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC0718ib19, 20);
        EnumC0718ib enumC0718ib20 = EnumC0718ib.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC0718ib20, 21);
        EnumC0718ib enumC0718ib21 = EnumC0718ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC0718ib21, 40);
        EnumC0718ib enumC0718ib22 = EnumC0718ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC0718ib22, 35);
        hashMap2.put(EnumC0718ib.EVENT_TYPE_CLEANUP, 29);
        EnumC0718ib enumC0718ib23 = EnumC0718ib.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC0718ib23, 38);
        EnumC0718ib enumC0718ib24 = EnumC0718ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC0718ib24, 42);
        f7593c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        B8 b8 = new B8();
        H8 h8 = new H8(new M8());
        C8 c8 = new C8();
        C0761k3 c0761k3 = new C0761k3(new M8());
        Rn rn = new Rn(new M8());
        Qf qf = new Qf();
        C0509a9 a6 = C0535b9.a();
        a6.f7835b = qf;
        a6.f7836c = qf;
        C0535b9 c0535b9 = new C0535b9(a6);
        C0509a9 a7 = C0535b9.a();
        a7.f7835b = h8;
        C0535b9 c0535b92 = new C0535b9(a7);
        C0509a9 a8 = C0535b9.a();
        a8.f7835b = c0761k3;
        C0535b9 c0535b93 = new C0535b9(a8);
        C0509a9 a9 = C0535b9.a();
        a9.f7835b = rn;
        C0535b9 c0535b94 = new C0535b9(a9);
        C0509a9 a10 = C0535b9.a();
        a10.f7834a = b8;
        C0535b9 c0535b95 = new C0535b9(a10);
        C0509a9 a11 = C0535b9.a();
        a11.f7835b = new C1093wo(new H8());
        C0535b9 c0535b96 = new C0535b9(a11);
        hashMap3.put(enumC0718ib2, c0535b92);
        C0509a9 a12 = C0535b9.a();
        a12.f7835b = new Sf();
        hashMap3.put(enumC0718ib3, new C0535b9(a12));
        C0509a9 a13 = C0535b9.a();
        a13.f7834a = b8;
        a13.f7835b = c8;
        a13.f7838e = new C0560c8();
        a13.f7839f = new C0586d8();
        hashMap3.put(enumC0718ib4, new C0535b9(a13));
        hashMap3.put(enumC0718ib9, c0535b9);
        hashMap3.put(enumC0718ib10, c0535b9);
        hashMap3.put(enumC0718ib11, c0535b93);
        hashMap3.put(enumC0718ib12, c0535b93);
        hashMap3.put(enumC0718ib5, c0535b93);
        hashMap3.put(enumC0718ib6, c0535b93);
        hashMap3.put(enumC0718ib7, c0535b93);
        hashMap3.put(enumC0718ib8, c0535b93);
        C0509a9 a14 = C0535b9.a();
        a14.f7834a = new B8();
        a14.f7835b = c0761k3;
        hashMap3.put(enumC0718ib14, new C0535b9(a14));
        EnumC0718ib enumC0718ib25 = EnumC0718ib.EVENT_TYPE_CUSTOM_EVENT;
        C0509a9 a15 = C0535b9.a();
        a15.f7837d = new Tf();
        hashMap3.put(enumC0718ib25, new C0535b9(a15));
        hashMap3.put(enumC0718ib15, c0535b92);
        hashMap3.put(enumC0718ib17, c0535b95);
        hashMap3.put(enumC0718ib18, c0535b95);
        hashMap3.put(enumC0718ib19, c0535b93);
        hashMap3.put(enumC0718ib20, c0535b93);
        hashMap3.put(enumC0718ib21, c0535b93);
        hashMap3.put(enumC0718ib22, c0535b94);
        hashMap3.put(enumC0718ib, c0535b96);
        hashMap3.put(enumC0718ib16, c0535b96);
        hashMap3.put(enumC0718ib13, c0535b92);
        hashMap3.put(enumC0718ib23, c0535b92);
        hashMap3.put(enumC0718ib24, c0535b93);
        f7594d = Collections.unmodifiableMap(hashMap3);
    }

    public static C0897p9 a(Long l2, Long l6, Boolean bool) {
        C0897p9 c0897p9 = new C0897p9();
        if (l2 != null) {
            c0897p9.f8997a = l2.longValue();
            c0897p9.f8998b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l2.longValue() * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        }
        if (l6 != null) {
            c0897p9.f8999c = l6.longValue();
        }
        if (bool != null) {
            c0897p9.f9000d = bool.booleanValue();
        }
        return c0897p9;
    }

    public static void a(C0845n9 c0845n9) {
        C0793l9[] c0793l9Arr = c0845n9.f8862c;
        if (c0793l9Arr != null) {
            for (C0793l9 c0793l9 : c0793l9Arr) {
            }
        }
    }
}
