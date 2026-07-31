package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.cg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2547cg {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f38778a;

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f38779b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f38780c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f38781d;

    static {
        HashMap hashMap = new HashMap();
        Wk wk = Wk.FOREGROUND;
        hashMap.put(wk, 0);
        Wk wk2 = Wk.BACKGROUND;
        hashMap.put(wk2, 1);
        f38778a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, wk);
        sparseArray.put(1, wk2);
        f38779b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_INIT;
        hashMap2.put(enumC3063wb, 1);
        EnumC3063wb enumC3063wb2 = EnumC3063wb.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC3063wb2, 4);
        EnumC3063wb enumC3063wb3 = EnumC3063wb.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC3063wb3, 5);
        EnumC3063wb enumC3063wb4 = EnumC3063wb.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC3063wb4, 7);
        EnumC3063wb enumC3063wb5 = EnumC3063wb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC3063wb5, 26);
        EnumC3063wb enumC3063wb6 = EnumC3063wb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC3063wb6, 26);
        EnumC3063wb enumC3063wb7 = EnumC3063wb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC3063wb7, 26);
        EnumC3063wb enumC3063wb8 = EnumC3063wb.EVENT_TYPE_ANR;
        hashMap2.put(enumC3063wb8, 25);
        EnumC3063wb enumC3063wb9 = EnumC3063wb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC3063wb9, 26);
        EnumC3063wb enumC3063wb10 = EnumC3063wb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC3063wb10, 26);
        EnumC3063wb enumC3063wb11 = EnumC3063wb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC3063wb11, 27);
        EnumC3063wb enumC3063wb12 = EnumC3063wb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC3063wb12, 27);
        EnumC3063wb enumC3063wb13 = EnumC3063wb.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC3063wb13, 13);
        EnumC3063wb enumC3063wb14 = EnumC3063wb.EVENT_TYPE_START;
        hashMap2.put(enumC3063wb14, 2);
        EnumC3063wb enumC3063wb15 = EnumC3063wb.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC3063wb15, 16);
        EnumC3063wb enumC3063wb16 = EnumC3063wb.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC3063wb16, 17);
        EnumC3063wb enumC3063wb17 = EnumC3063wb.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC3063wb17, 18);
        EnumC3063wb enumC3063wb18 = EnumC3063wb.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC3063wb18, 19);
        EnumC3063wb enumC3063wb19 = EnumC3063wb.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC3063wb19, 20);
        EnumC3063wb enumC3063wb20 = EnumC3063wb.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC3063wb20, 21);
        EnumC3063wb enumC3063wb21 = EnumC3063wb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC3063wb21, 40);
        EnumC3063wb enumC3063wb22 = EnumC3063wb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC3063wb22, 35);
        hashMap2.put(EnumC3063wb.EVENT_TYPE_CLEANUP, 29);
        EnumC3063wb enumC3063wb23 = EnumC3063wb.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC3063wb23, 38);
        EnumC3063wb enumC3063wb24 = EnumC3063wb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC3063wb24, 42);
        f38780c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        P8 p8 = new P8();
        V8 v8 = new V8(new C2486a9());
        Q8 q8 = new Q8();
        C3107y3 c3107y3 = new C3107y3(new C2486a9());
        Mn mn = new Mn(new C2486a9());
        Yf yf = new Yf();
        C2854o9 a4 = C2880p9.a();
        a4.f39561b = yf;
        a4.f39562c = yf;
        C2880p9 c2880p9 = new C2880p9(a4);
        C2854o9 a5 = C2880p9.a();
        a5.f39561b = v8;
        C2880p9 c2880p92 = new C2880p9(a5);
        C2854o9 a6 = C2880p9.a();
        a6.f39561b = c3107y3;
        C2880p9 c2880p93 = new C2880p9(a6);
        C2854o9 a7 = C2880p9.a();
        a7.f39561b = mn;
        C2880p9 c2880p94 = new C2880p9(a7);
        C2854o9 a8 = C2880p9.a();
        a8.f39560a = p8;
        C2880p9 c2880p95 = new C2880p9(a8);
        C2854o9 a9 = C2880p9.a();
        a9.f39561b = new C2946ro(new V8());
        C2880p9 c2880p96 = new C2880p9(a9);
        hashMap3.put(enumC3063wb2, c2880p92);
        C2854o9 a10 = C2880p9.a();
        a10.f39561b = new C2493ag();
        hashMap3.put(enumC3063wb3, new C2880p9(a10));
        C2854o9 a11 = C2880p9.a();
        a11.f39560a = p8;
        a11.f39561b = q8;
        a11.f39564e = new C2905q8();
        a11.f39565f = new C2930r8();
        hashMap3.put(enumC3063wb4, new C2880p9(a11));
        hashMap3.put(enumC3063wb9, c2880p9);
        hashMap3.put(enumC3063wb10, c2880p9);
        hashMap3.put(enumC3063wb11, c2880p93);
        hashMap3.put(enumC3063wb12, c2880p93);
        hashMap3.put(enumC3063wb5, c2880p93);
        hashMap3.put(enumC3063wb6, c2880p93);
        hashMap3.put(enumC3063wb7, c2880p93);
        hashMap3.put(enumC3063wb8, c2880p93);
        C2854o9 a12 = C2880p9.a();
        a12.f39560a = new P8();
        a12.f39561b = c3107y3;
        hashMap3.put(enumC3063wb14, new C2880p9(a12));
        EnumC3063wb enumC3063wb25 = EnumC3063wb.EVENT_TYPE_CUSTOM_EVENT;
        C2854o9 a13 = C2880p9.a();
        a13.f39563d = new C2520bg();
        hashMap3.put(enumC3063wb25, new C2880p9(a13));
        hashMap3.put(enumC3063wb15, c2880p92);
        hashMap3.put(enumC3063wb17, c2880p95);
        hashMap3.put(enumC3063wb18, c2880p95);
        hashMap3.put(enumC3063wb19, c2880p93);
        hashMap3.put(enumC3063wb20, c2880p93);
        hashMap3.put(enumC3063wb21, c2880p93);
        hashMap3.put(enumC3063wb22, c2880p94);
        hashMap3.put(enumC3063wb, c2880p96);
        hashMap3.put(enumC3063wb16, c2880p96);
        hashMap3.put(enumC3063wb13, c2880p92);
        hashMap3.put(enumC3063wb23, c2880p92);
        hashMap3.put(enumC3063wb24, c2880p93);
        f38781d = Collections.unmodifiableMap(hashMap3);
    }

    public static D9 a(Long l4, Long l5, Boolean bool) {
        D9 d9 = new D9();
        if (l4 != null) {
            d9.f37353a = l4.longValue();
            d9.f37354b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l4.longValue() * 1000) / 1000;
        }
        if (l5 != null) {
            d9.f37355c = l5.longValue();
        }
        if (bool != null) {
            d9.f37356d = bool.booleanValue();
        }
        return d9;
    }

    public static void a(B9 b9) {
        C3139z9[] c3139z9Arr = b9.f37233c;
        if (c3139z9Arr != null) {
            for (C3139z9 c3139z9 : c3139z9Arr) {
            }
        }
    }
}
