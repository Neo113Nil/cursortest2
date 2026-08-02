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
    public static final Map f6759a;

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f6760b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f6761c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f6762d;

    static {
        HashMap hashMap = new HashMap();
        EnumC0370al enumC0370al = EnumC0370al.FOREGROUND;
        hashMap.put(enumC0370al, 0);
        EnumC0370al enumC0370al2 = EnumC0370al.BACKGROUND;
        hashMap.put(enumC0370al2, 1);
        f6759a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC0370al);
        sparseArray.put(1, enumC0370al2);
        f6760b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_INIT;
        hashMap2.put(enumC0567ib, 1);
        EnumC0567ib enumC0567ib2 = EnumC0567ib.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC0567ib2, 4);
        EnumC0567ib enumC0567ib3 = EnumC0567ib.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC0567ib3, 5);
        EnumC0567ib enumC0567ib4 = EnumC0567ib.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC0567ib4, 7);
        EnumC0567ib enumC0567ib5 = EnumC0567ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC0567ib5, 26);
        EnumC0567ib enumC0567ib6 = EnumC0567ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0567ib6, 26);
        EnumC0567ib enumC0567ib7 = EnumC0567ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0567ib7, 26);
        EnumC0567ib enumC0567ib8 = EnumC0567ib.EVENT_TYPE_ANR;
        hashMap2.put(enumC0567ib8, 25);
        EnumC0567ib enumC0567ib9 = EnumC0567ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0567ib9, 26);
        EnumC0567ib enumC0567ib10 = EnumC0567ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0567ib10, 26);
        EnumC0567ib enumC0567ib11 = EnumC0567ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC0567ib11, 27);
        EnumC0567ib enumC0567ib12 = EnumC0567ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC0567ib12, 27);
        EnumC0567ib enumC0567ib13 = EnumC0567ib.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC0567ib13, 13);
        EnumC0567ib enumC0567ib14 = EnumC0567ib.EVENT_TYPE_START;
        hashMap2.put(enumC0567ib14, 2);
        EnumC0567ib enumC0567ib15 = EnumC0567ib.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC0567ib15, 16);
        EnumC0567ib enumC0567ib16 = EnumC0567ib.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC0567ib16, 17);
        EnumC0567ib enumC0567ib17 = EnumC0567ib.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC0567ib17, 18);
        EnumC0567ib enumC0567ib18 = EnumC0567ib.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC0567ib18, 19);
        EnumC0567ib enumC0567ib19 = EnumC0567ib.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC0567ib19, 20);
        EnumC0567ib enumC0567ib20 = EnumC0567ib.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC0567ib20, 21);
        EnumC0567ib enumC0567ib21 = EnumC0567ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC0567ib21, 40);
        EnumC0567ib enumC0567ib22 = EnumC0567ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC0567ib22, 35);
        hashMap2.put(EnumC0567ib.EVENT_TYPE_CLEANUP, 29);
        EnumC0567ib enumC0567ib23 = EnumC0567ib.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC0567ib23, 38);
        EnumC0567ib enumC0567ib24 = EnumC0567ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC0567ib24, 42);
        f6761c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        B8 b8 = new B8();
        H8 h8 = new H8(new M8());
        C8 c8 = new C8();
        C0610k3 c0610k3 = new C0610k3(new M8());
        Rn rn = new Rn(new M8());
        Qf qf = new Qf();
        C0358a9 a3 = C0384b9.a();
        a3.f6992b = qf;
        a3.f6993c = qf;
        C0384b9 c0384b9 = new C0384b9(a3);
        C0358a9 a4 = C0384b9.a();
        a4.f6992b = h8;
        C0384b9 c0384b92 = new C0384b9(a4);
        C0358a9 a5 = C0384b9.a();
        a5.f6992b = c0610k3;
        C0384b9 c0384b93 = new C0384b9(a5);
        C0358a9 a6 = C0384b9.a();
        a6.f6992b = rn;
        C0384b9 c0384b94 = new C0384b9(a6);
        C0358a9 a7 = C0384b9.a();
        a7.f6991a = b8;
        C0384b9 c0384b95 = new C0384b9(a7);
        C0358a9 a8 = C0384b9.a();
        a8.f6992b = new C0942wo(new H8());
        C0384b9 c0384b96 = new C0384b9(a8);
        hashMap3.put(enumC0567ib2, c0384b92);
        C0358a9 a9 = C0384b9.a();
        a9.f6992b = new Sf();
        hashMap3.put(enumC0567ib3, new C0384b9(a9));
        C0358a9 a10 = C0384b9.a();
        a10.f6991a = b8;
        a10.f6992b = c8;
        a10.f6995e = new C0409c8();
        a10.f = new C0435d8();
        hashMap3.put(enumC0567ib4, new C0384b9(a10));
        hashMap3.put(enumC0567ib9, c0384b9);
        hashMap3.put(enumC0567ib10, c0384b9);
        hashMap3.put(enumC0567ib11, c0384b93);
        hashMap3.put(enumC0567ib12, c0384b93);
        hashMap3.put(enumC0567ib5, c0384b93);
        hashMap3.put(enumC0567ib6, c0384b93);
        hashMap3.put(enumC0567ib7, c0384b93);
        hashMap3.put(enumC0567ib8, c0384b93);
        C0358a9 a11 = C0384b9.a();
        a11.f6991a = new B8();
        a11.f6992b = c0610k3;
        hashMap3.put(enumC0567ib14, new C0384b9(a11));
        EnumC0567ib enumC0567ib25 = EnumC0567ib.EVENT_TYPE_CUSTOM_EVENT;
        C0358a9 a12 = C0384b9.a();
        a12.f6994d = new Tf();
        hashMap3.put(enumC0567ib25, new C0384b9(a12));
        hashMap3.put(enumC0567ib15, c0384b92);
        hashMap3.put(enumC0567ib17, c0384b95);
        hashMap3.put(enumC0567ib18, c0384b95);
        hashMap3.put(enumC0567ib19, c0384b93);
        hashMap3.put(enumC0567ib20, c0384b93);
        hashMap3.put(enumC0567ib21, c0384b93);
        hashMap3.put(enumC0567ib22, c0384b94);
        hashMap3.put(enumC0567ib, c0384b96);
        hashMap3.put(enumC0567ib16, c0384b96);
        hashMap3.put(enumC0567ib13, c0384b92);
        hashMap3.put(enumC0567ib23, c0384b92);
        hashMap3.put(enumC0567ib24, c0384b93);
        f6762d = Collections.unmodifiableMap(hashMap3);
    }

    public static C0746p9 a(Long l3, Long l4, Boolean bool) {
        C0746p9 c0746p9 = new C0746p9();
        if (l3 != null) {
            c0746p9.f8072a = l3.longValue();
            c0746p9.f8073b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l3.longValue() * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        }
        if (l4 != null) {
            c0746p9.f8074c = l4.longValue();
        }
        if (bool != null) {
            c0746p9.f8075d = bool.booleanValue();
        }
        return c0746p9;
    }

    public static void a(C0694n9 c0694n9) {
        C0642l9[] c0642l9Arr = c0694n9.f7945c;
        if (c0642l9Arr != null) {
            for (C0642l9 c0642l9 : c0642l9Arr) {
            }
        }
    }
}
