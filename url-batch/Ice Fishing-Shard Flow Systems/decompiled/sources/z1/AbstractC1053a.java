package z1;

import C4.h;
import C4.i;
import C4.m;
import C4.n;
import C4.o;
import D6.k;
import E6.e;
import K1.p;
import P1.g;
import S1.r;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.datastore.preferences.protobuf.C0194j;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import e5.j;
import e5.l;
import f2.C0396c;
import f2.InterfaceC0397d;
import g0.AbstractC0440t;
import g0.C0409B;
import g0.C0435o;
import g0.C0441u;
import j6.C0588e;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import k2.C0598d;
import k2.EnumC0596b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l2.c;
import m6.C0693a;
import m6.C0694b;
import m6.d;
import m6.f;
import n.w1;
import r1.InterfaceC0844c;
import t1.u;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1053a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f8712a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f8713b;

    public static void A(String str, Bundle bundle) {
        try {
            g.e();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e7) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e7);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e8) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e8);
                }
            }
            String str2 = c.B(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            if (g.e().c(Q1.a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b8, code lost:
    
        if (r8 == r23.length()) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        if (r23.charAt(r8) != 'S') goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c2, code lost:
    
        r2 = (r13 * 1000000000) + r14;
        r4 = r10;
        r13 = m6.d.f6592l;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d2, code lost:
    
        switch(r13.ordinal()) {
            case 0: goto L133;
            case 1: goto L132;
            case 2: goto L131;
            case 3: goto L130;
            case 4: goto L129;
            case 5: goto L128;
            case 6: goto L127;
            default: goto L213;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ed, code lost:
    
        r13 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0216, code lost:
    
        r2 = r2 * r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021b, code lost:
    
        if (java.lang.Double.isNaN(r2) != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021d, code lost:
    
        r13 = java.lang.Math.round(r2) * r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x022b, code lost:
    
        throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01f3, code lost:
    
        r13 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01f9, code lost:
    
        r13 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01ff, code lost:
    
        r13 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0205, code lost:
    
        r13 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x020b, code lost:
    
        r13 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0211, code lost:
    
        r13 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01ec, code lost:
    
        throw new java.lang.IllegalStateException(("Unknown unit: " + r13).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0104, code lost:
    
        throw new java.lang.IllegalArgumentException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x00f1, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        if (r8 >= r23.length()) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        r4 = r23.charAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        if ('0' > r4) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (r4 >= ':') goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (r8 == r23.length()) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        if (r3 == '+') goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
    
        if (r3 == '-') goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f5, code lost:
    
        if (r8 == (r20 + r3)) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f7, code lost:
    
        r6 = r7.f6599a;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157 A[LOOP:5: B:75:0x0155->B:76:0x0157, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0194 A[LOOP:7: B:88:0x0192->B:89:0x0194, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long B(String str) {
        int i2;
        int i5;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int i11;
        int i12;
        int min;
        int i13;
        int i14;
        int i15;
        char charAt;
        char charAt2;
        int i16;
        int i17;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        char charAt3 = str.charAt(0);
        char c7 = '-';
        char c8 = '+';
        if (charAt3 != '+') {
            i5 = charAt3 != '-' ? 0 : 1;
            i2 = i5;
        } else {
            i2 = 0;
            i5 = 1;
        }
        if (str.length() <= i5) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i5) != 'P') {
            throw new IllegalArgumentException("");
        }
        int i18 = i5 + 1;
        if (i18 == str.length()) {
            throw new IllegalArgumentException("");
        }
        boolean z7 = false;
        d dVar = null;
        long j7 = 0;
        long j8 = 0;
        while (i18 < str.length()) {
            char charAt4 = str.charAt(i18);
            if (charAt4 != 'T') {
                m6.g gVar = m6.g.f6598e;
                if (gVar.f6600b) {
                    char charAt5 = str.charAt(i18);
                    if (charAt5 == c8) {
                        i7 = i18 + 1;
                        i8 = 1;
                        while (i7 < str.length()) {
                            i7++;
                        }
                        j = 0;
                        while (true) {
                            if (i7 < str.length()) {
                            }
                            j = (j << 3) + (j << 1) + i17;
                            i7++;
                            i2 = i10;
                            i18 = i9;
                        }
                        i10 = i2;
                        if (i7 != str.length()) {
                        }
                        throw new IllegalArgumentException("");
                    }
                    if (charAt5 == c7) {
                        i7 = i18 + 1;
                        i8 = -1;
                        while (i7 < str.length() && str.charAt(i7) == '0') {
                            i7++;
                        }
                        j = 0;
                        while (true) {
                            if (i7 < str.length()) {
                                char charAt6 = str.charAt(i7);
                                i9 = i18;
                                if ('0' <= charAt6 && charAt6 < ':') {
                                    i17 = charAt6 - '0';
                                    i10 = i2;
                                    long j9 = gVar.f6601c;
                                    if (j <= j9 && (j != j9 || i17 <= gVar.f6602d)) {
                                        j = (j << 3) + (j << 1) + i17;
                                        i7++;
                                        i2 = i10;
                                        i18 = i9;
                                    }
                                }
                            } else {
                                i9 = i18;
                            }
                        }
                        i10 = i2;
                        if (i7 != str.length()) {
                            if (i7 != i9 + ((charAt4 == '+' || charAt4 == '-') ? 1 : 0)) {
                                long j10 = j;
                                if (str.charAt(i7) == '.') {
                                    int i19 = i7 + 1;
                                    int min2 = Math.min(i7 + 7, str.length());
                                    int i20 = 0;
                                    for (int i21 = i19; i21 < min2; i21++) {
                                        char charAt7 = str.charAt(i21);
                                        if ('0' <= charAt7 && charAt7 < ':') {
                                            i20 = (charAt7 - '0') + (i20 << 3) + (i20 << 1);
                                        }
                                        for (i12 = 0; i12 < 6 - (i21 - i19); i12++) {
                                            i20 = (i20 << 1) + (i20 << 3);
                                        }
                                        min = Math.min(i21 + 9, str.length());
                                        i13 = i21;
                                        i14 = 0;
                                        while (true) {
                                            i11 = i10;
                                            if (i13 >= min) {
                                                charAt2 = str.charAt(i13);
                                                i16 = min;
                                                if ('0' <= charAt2 && charAt2 < ':') {
                                                    i14 = (charAt2 - '0') + (i14 << 3) + (i14 << 1);
                                                    i13++;
                                                    i10 = i11;
                                                    min = i16;
                                                }
                                            }
                                        }
                                        for (i15 = 0; i15 < 9 - (i13 - i21); i15++) {
                                            i14 = (i14 << 1) + (i14 << 3);
                                        }
                                        i7 = i13;
                                        while (i7 < str.length() && '0' <= (charAt = str.charAt(i7)) && charAt < ':') {
                                            i7++;
                                        }
                                        throw new IllegalArgumentException("");
                                    }
                                    while (i12 < 6 - (i21 - i19)) {
                                    }
                                    min = Math.min(i21 + 9, str.length());
                                    i13 = i21;
                                    i14 = 0;
                                    while (true) {
                                        i11 = i10;
                                        if (i13 >= min) {
                                        }
                                        i14 = (charAt2 - '0') + (i14 << 3) + (i14 << 1);
                                        i13++;
                                        i10 = i11;
                                        min = i16;
                                    }
                                    while (i15 < 9 - (i13 - i21)) {
                                    }
                                    i7 = i13;
                                    while (i7 < str.length()) {
                                        i7++;
                                    }
                                    throw new IllegalArgumentException("");
                                }
                                i11 = i10;
                                char charAt8 = str.charAt(i7);
                                d dVar2 = charAt8 != 'D' ? charAt8 != 'H' ? charAt8 != 'M' ? charAt8 != 'S' ? null : d.f6592l : d.f6593m : d.f6594n : d.f6595o;
                                if (dVar2 == null) {
                                    throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i7));
                                }
                                if (dVar != null && dVar.compareTo(dVar2) <= 0) {
                                    throw new IllegalArgumentException("Unexpected order of duration components");
                                }
                                if (dVar2 == d.f6595o) {
                                    if (z7) {
                                        throw new IllegalArgumentException("");
                                    }
                                    j7 = f.b(j10, dVar2) * i8;
                                } else {
                                    if (!z7) {
                                        throw new IllegalArgumentException("");
                                    }
                                    long b7 = b(j7, f.b(j10, dVar2) * i8);
                                    if (b7 == 9223372036854759646L) {
                                        throw new IllegalArgumentException("");
                                    }
                                    j7 = b7;
                                }
                                d dVar3 = dVar2;
                                i18 = i7 + 1;
                                dVar = dVar3;
                                i2 = i11;
                                c7 = '-';
                                c8 = '+';
                            }
                        }
                        throw new IllegalArgumentException("");
                    }
                }
                i7 = i18;
                i8 = 1;
                while (i7 < str.length()) {
                }
                j = 0;
                while (true) {
                    if (i7 < str.length()) {
                    }
                    j = (j << 3) + (j << 1) + i17;
                    i7++;
                    i2 = i10;
                    i18 = i9;
                }
                i10 = i2;
                if (i7 != str.length()) {
                }
                throw new IllegalArgumentException("");
            }
            if (z7 || (i18 = i18 + 1) == str.length()) {
                throw new IllegalArgumentException("");
            }
            z7 = true;
        }
        int i22 = i2;
        long e7 = C0694b.e(G(j7, d.f6591i), G(j8, d.f6590e));
        if (i22 == 0) {
            return e7;
        }
        C0693a c0693a = C0694b.f6584e;
        c0693a.getClass();
        if (e7 == C0694b.f6587m) {
            return e7;
        }
        long j11 = ((-(e7 >> 1)) << 1) + (((int) e7) & 1);
        c0693a.getClass();
        int i23 = m6.c.f6589a;
        return j11;
    }

    public static long C(int i2, String str) {
        int m2 = m(str, 0, i2, false);
        Matcher matcher = k.f526n.matcher(str);
        int i5 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        while (m2 < i2) {
            int m7 = m(str, m2 + 1, i2, true);
            matcher.region(m2, m7);
            if (i7 == -1 && matcher.usePattern(k.f526n).matches()) {
                String group = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group, "group(...)");
                i7 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(group2, "group(...)");
                i10 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                Intrinsics.checkNotNullExpressionValue(group3, "group(...)");
                i11 = Integer.parseInt(group3);
            } else if (i8 == -1 && matcher.usePattern(k.f525m).matches()) {
                String group4 = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group4, "group(...)");
                i8 = Integer.parseInt(group4);
            } else {
                if (i9 == -1) {
                    Pattern pattern = k.f524l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(group5, "group(...)");
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        String pattern2 = pattern.pattern();
                        Intrinsics.checkNotNullExpressionValue(pattern2, "pattern(...)");
                        i9 = StringsKt.y(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i5 == -1 && matcher.usePattern(k.f523k).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group6, "group(...)");
                    i5 = Integer.parseInt(group6);
                }
            }
            m2 = m(str, m7 + 1, i2, false);
        }
        if (70 <= i5 && i5 < 100) {
            i5 += 1900;
        }
        if (i5 >= 0 && i5 < 70) {
            i5 += 2000;
        }
        if (i5 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i8 || i8 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i10 < 0 || i10 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < 0 || i11 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(e.f712a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i5);
        gregorianCalendar.set(2, i9 - 1);
        gregorianCalendar.set(5, i8);
        gregorianCalendar.set(11, i7);
        gregorianCalendar.set(12, i10);
        gregorianCalendar.set(13, i11);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static C4.b D(List list) {
        C4.d dVar = new C4.d(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            String str = jVar.f4733i;
            e5.b bVar = jVar.f4734l;
            String str2 = bVar.f4713i;
            Double d7 = bVar.f4716n;
            Long l7 = bVar.f4715m;
            Boolean bool = bVar.f4714l;
            C4.e eVar = C4.e.f301d;
            if (str2 != null) {
                dVar.e(H4.e.a(eVar, str), bVar.f4713i);
            } else if (bool != null) {
                dVar.e(H4.e.a(C4.e.f302e, str), bool);
            } else if (l7 != null) {
                dVar.e(H4.e.a(C4.e.f303i, str), l7);
            } else if (d7 != null) {
                dVar.e(H4.e.a(C4.e.f304l, str), d7);
            } else {
                e5.d dVar2 = bVar.f4717o;
                if (dVar2 != null) {
                    List list2 = dVar2.f4721i;
                    e5.b bVar2 = (e5.b) list2.get(0);
                    if (bVar2.f4713i != null) {
                        H4.e a7 = H4.e.a(C4.e.f305m, str);
                        ArrayList arrayList = new ArrayList(list2.size());
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((e5.b) it2.next()).f4713i);
                        }
                        dVar.e(a7, arrayList);
                    } else if (bVar2.f4714l != null) {
                        H4.e a8 = H4.e.a(C4.e.f306n, str);
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((e5.b) it3.next()).f4714l);
                        }
                        dVar.e(a8, arrayList2);
                    } else if (bVar2.f4715m != null) {
                        H4.e a9 = H4.e.a(C4.e.f307o, str);
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((e5.b) it4.next()).f4715m);
                        }
                        dVar.e(a9, arrayList3);
                    } else {
                        if (bVar2.f4716n == null) {
                            throw new UnsupportedOperationException();
                        }
                        H4.e a10 = H4.e.a(C4.e.f308p, str);
                        ArrayList arrayList4 = new ArrayList(list2.size());
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(((e5.b) it5.next()).f4716n);
                        }
                        dVar.e(a10, arrayList4);
                    }
                } else {
                    dVar.e(H4.e.a(eVar, str), "");
                }
            }
        }
        return dVar.b();
    }

    public static void E(Window window, boolean z7) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            C.c.e(window, z7);
        } else {
            if (i2 >= 30) {
                C.c.d(window, z7);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static boolean F(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final long G(long j, d sourceUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "unit");
        d dVar = d.f6590e;
        long a7 = m6.e.a(4611686018426999999L, dVar, sourceUnit);
        if ((-a7) <= j && j <= a7) {
            return t(m6.e.a(j, sourceUnit, dVar));
        }
        d targetUnit = d.f6591i;
        if (sourceUnit.compareTo(targetUnit) < 0) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return s(C0588e.a(targetUnit.f6597d.convert(j, sourceUnit.f6597d)));
        }
        long signum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return s(f.b(Math.abs(j), sourceUnit) * signum);
    }

    public static void H(Parcel parcel, int i2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int Q = Q(parcel, i2);
        parcel.writeBundle(bundle);
        S(parcel, Q);
    }

    public static void J(Parcel parcel, int i2, Parcelable parcelable, int i5) {
        if (parcelable == null) {
            return;
        }
        int Q = Q(parcel, i2);
        parcelable.writeToParcel(parcel, i5);
        S(parcel, Q);
    }

    public static void K(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int Q = Q(parcel, i2);
        parcel.writeString(str);
        S(parcel, Q);
    }

    public static void L(Parcel parcel, int i2, Parcelable[] parcelableArr, int i5) {
        if (parcelableArr == null) {
            return;
        }
        int Q = Q(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i5);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        S(parcel, Q);
    }

    public static void M(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int Q = Q(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcelable parcelable = (Parcelable) list.get(i5);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        S(parcel, Q);
    }

    public static Object N(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.i()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static String O(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i2 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length || (indexOf = str.indexOf("%s", i5)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i5, indexOf);
            sb.append(R(objArr[i2]));
            i5 = indexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i5, str.length());
        if (i2 < length) {
            String str2 = " [";
            while (i2 < objArr.length) {
                sb.append(str2);
                sb.append(R(objArr[i2]));
                i2++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void P(Parcel parcel, int i2, int i5) {
        parcel.writeInt(i2 | (i5 << 16));
    }

    public static int Q(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static String R(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e7) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append("@");
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb2), (Throwable) e7);
            String name2 = e7.getClass().getName();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 8 + name2.length() + 1);
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }

    public static void S(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final long b(long j, long j7) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j7 == 4611686018427387903L || j7 == -4611686018427387903L) ? j7 : C0588e.a(j + j7);
        }
        if ((-4611686018427387903L >= j7 || j7 >= 4611686018427387903L) && (j7 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static C4.j c(e5.b bVar) {
        String str = bVar.f4713i;
        if (str != null) {
            return new i(2, str);
        }
        Long l7 = bVar.f4715m;
        if (l7 != null) {
            return new o(l7.longValue());
        }
        Double d7 = bVar.f4716n;
        if (d7 != null) {
            return new n(d7.doubleValue());
        }
        Boolean bool = bVar.f4714l;
        if (bool != null) {
            return new C4.k(bool.booleanValue());
        }
        T6.i iVar = bVar.f4719q;
        if (iVar != null) {
            byte[] j = iVar.j();
            Objects.requireNonNull(j, "value must not be null");
            return new m(Arrays.copyOf(j, j.length));
        }
        l lVar = bVar.f4718p;
        if (lVar == null) {
            e5.d dVar = bVar.f4717o;
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized AnyValue type");
            }
            return new i(1, Collections.unmodifiableList((List) dVar.f4721i.stream().map(new C4.a(13)).collect(Collectors.toList())));
        }
        Map map = (Map) lVar.f4736i.stream().collect(Collectors.toMap(new C4.a(11), new C4.a(12)));
        Objects.requireNonNull(map, "value must not be null");
        C4.g[] gVarArr = (C4.g[]) map.entrySet().stream().map(new C4.a(1)).toArray(new h());
        Objects.requireNonNull(gVarArr, "value must not be null");
        ArrayList arrayList = new ArrayList(gVarArr.length);
        arrayList.addAll(Arrays.asList(gVarArr));
        return new i(0, Collections.unmodifiableList(arrayList));
    }

    public static Object d(int i2, Object obj) {
        if (i2 != Integer.MAX_VALUE) {
            if (obj instanceof List) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(d(i2, it.next()));
                }
                return arrayList;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                return str.length() < i2 ? obj : str.substring(0, i2);
            }
        }
        return obj;
    }

    public static Object e(Task task) {
        u.e("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        u.g(task, "Task must not be null");
        if (task.j()) {
            return N(task);
        }
        c cVar = new c(9);
        Executor executor = K1.i.f1430b;
        task.e(executor, cVar);
        task.c(executor, cVar);
        task.a(executor, cVar);
        ((CountDownLatch) cVar.f6269d).await();
        return N(task);
    }

    public static Object f(Task task, long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        u.e("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        u.g(task, "Task must not be null");
        u.g(timeUnit, "TimeUnit must not be null");
        if (task.j()) {
            return N(task);
        }
        c cVar = new c(9);
        Executor executor = K1.i.f1430b;
        task.e(executor, cVar);
        task.c(executor, cVar);
        task.a(executor, cVar);
        if (((CountDownLatch) cVar.f6269d).await(j, timeUnit)) {
            return N(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static p i(Executor executor, Callable callable) {
        u.g(executor, "Executor must not be null");
        p pVar = new p();
        executor.execute(new F.a(pVar, 13, callable));
        return pVar;
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int k(C0409B c0409b, C0435o c0435o, View view, View view2, AbstractC0440t abstractC0440t, boolean z7) {
        int s7;
        int t6;
        if (abstractC0440t.p() == 0 || c0409b.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            ((C0441u) view.getLayoutParams()).getClass();
            throw null;
        }
        int b7 = c0435o.b(view2) - c0435o.c(view);
        switch (c0435o.f4957b) {
            case 0:
                AbstractC0440t abstractC0440t2 = c0435o.f4956a;
                s7 = abstractC0440t2.f4967f - abstractC0440t2.s();
                t6 = abstractC0440t2.t();
                break;
            default:
                AbstractC0440t abstractC0440t3 = c0435o.f4956a;
                s7 = abstractC0440t3.f4968g - abstractC0440t3.u();
                t6 = abstractC0440t3.r();
                break;
        }
        return Math.min(s7 - t6, b7);
    }

    public static int l(C0409B c0409b, C0435o c0435o, View view, View view2, AbstractC0440t abstractC0440t, boolean z7) {
        if (abstractC0440t.p() == 0 || c0409b.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return c0409b.a();
        }
        c0435o.b(view2);
        c0435o.c(view);
        ((C0441u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int m(String str, int i2, int i5, boolean z7) {
        while (i2 < i5) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z7)) {
                return i2;
            }
            i2++;
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0143, code lost:
    
        if (n(r1.getValue(), r4.getValue()) == false) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                return Arrays.equals((byte[]) obj, (byte[]) obj2);
            }
            if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                return Arrays.equals((int[]) obj, (int[]) obj2);
            }
            if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                return Arrays.equals((long[]) obj, (long[]) obj2);
            }
            if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (dArr.length == dArr2.length) {
                    int length = dArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (r(dArr[i2], dArr2[i2])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (fArr.length == fArr2.length) {
                    int length2 = fArr.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        if (u(fArr[i5], fArr2[i5])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (objArr.length == objArr2.length) {
                    int length3 = objArr.length;
                    for (int i7 = 0; i7 < length3; i7++) {
                        if (n(objArr[i7], objArr2[i7])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof List) && (obj2 instanceof List)) {
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() == list2.size()) {
                    Iterator it = list.iterator();
                    Iterator it2 = list2.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        if (!n(it.next(), it2.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    return ((obj instanceof Double) && (obj2 instanceof Double)) ? r(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) : ((obj instanceof Float) && (obj2 instanceof Float)) ? u(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Iterator it3 = map2.entrySet().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break loop4;
                            }
                            Map.Entry entry2 = (Map.Entry) it3.next();
                            if (n(key, entry2.getKey())) {
                                break;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static int o(Object obj) {
        int i2 = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return Arrays.hashCode((byte[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.hashCode((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.hashCode((long[]) obj);
        }
        int i5 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (i2 < length) {
                double d7 = dArr[i2];
                int i7 = i5 * 31;
                if (d7 == 0.0d) {
                    d7 = 0.0d;
                }
                long doubleToLongBits = Double.doubleToLongBits(d7);
                i5 = i7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                i2++;
            }
            return i5;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (i2 < length2) {
                float f7 = fArr[i2];
                int i8 = i5 * 31;
                if (f7 == 0.0f) {
                    f7 = 0.0f;
                }
                i5 = i8 + Float.floatToIntBits(f7);
                i2++;
            }
            return i5;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (i2 < length3) {
                i5 = (i5 * 31) + o(objArr[i2]);
                i2++;
            }
            return i5;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i5 = (i5 * 31) + o(it.next());
            }
            return i5;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i2 += o(entry.getValue()) ^ (o(entry.getKey()) * 31);
            }
            return i2;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Number) obj).doubleValue();
            long doubleToLongBits2 = Double.doubleToLongBits(doubleValue != 0.0d ? doubleValue : 0.0d);
            return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        }
        if (!(obj instanceof Float)) {
            return obj.hashCode();
        }
        float floatValue = ((Number) obj).floatValue();
        return Float.floatToIntBits(floatValue != 0.0f ? floatValue : 0.0f);
    }

    public static boolean p() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            g.e();
            g e7 = g.e();
            e7.a();
            Context context = e7.f2270a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static void q(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            S1.b bVar = (S1.b) obj;
            S1.h hVar = new S1.h(bVar);
            for (r rVar : bVar.f2466b) {
                boolean z7 = bVar.f2469e == 0;
                S1.i iVar = new S1.i(rVar, !z7);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set = (Set) hashMap.get(iVar);
                if (!set.isEmpty() && z7) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                }
                set.add(hVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (S1.h hVar2 : (Set) it.next()) {
                for (S1.j jVar : hVar2.f2483a.f2467c) {
                    if (jVar.f2490c == 0) {
                        Set<S1.h> set2 = (Set) hashMap.get(new S1.i(jVar.f2488a, jVar.f2489b == 2));
                        if (set2 != null) {
                            for (S1.h hVar3 : set2) {
                                hVar2.f2484b.add(hVar3);
                                hVar3.f2485c.add(hVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            S1.h hVar4 = (S1.h) it3.next();
            if (hVar4.f2485c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            S1.h hVar5 = (S1.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i2++;
            Iterator it4 = hVar5.f2484b.iterator();
            while (it4.hasNext()) {
                S1.h hVar6 = (S1.h) it4.next();
                hVar6.f2485c.remove(hVar5);
                if (hVar6.f2485c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i2 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            S1.h hVar7 = (S1.h) it5.next();
            if (!hVar7.f2485c.isEmpty() && !hVar7.f2484b.isEmpty()) {
                arrayList2.add(hVar7.f2483a);
            }
        }
        throw new S1.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static boolean r(double d7, double d8) {
        if ((d7 == 0.0d ? 0.0d : d7) == (d8 != 0.0d ? d8 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d7) && Double.isNaN(d8);
    }

    public static final long s(long j) {
        long j7 = (j << 1) + 1;
        C0694b.f6584e.getClass();
        int i2 = m6.c.f6589a;
        return j7;
    }

    public static final long t(long j) {
        long j7 = j << 1;
        C0694b.f6584e.getClass();
        int i2 = m6.c.f6589a;
        return j7;
    }

    public static boolean u(float f7, float f8) {
        if ((f7 == 0.0f ? 0.0f : f7) == (f8 != 0.0f ? f8 : 0.0f)) {
            return true;
        }
        return Float.isNaN(f7) && Float.isNaN(f8);
    }

    public static p v(Exception exc) {
        p pVar = new p();
        pVar.m(exc);
        return pVar;
    }

    public static p w(Object obj) {
        p pVar = new p();
        pVar.l(obj);
        return pVar;
    }

    public static final P0.j x(P0.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new P0.j(pVar.f2220a, pVar.f2238t);
    }

    public static String y(byte[] bArr) {
        int o7;
        C0194j c0194j = new C0194j(bArr);
        int i2 = c0194j.f3524a;
        boolean z7 = false;
        while (!z7) {
            if (c0194j.f3525b == i2) {
                c0194j.f3526c = 0;
                o7 = 0;
            } else {
                o7 = c0194j.o();
                c0194j.f3526c = o7;
                if ((o7 >>> 3) == 0) {
                    throw new IOException("Invalid tag: " + c0194j.f3526c);
                }
            }
            if (o7 == 0) {
                z7 = true;
            } else {
                if (o7 == 18) {
                    int o8 = c0194j.o();
                    if (o8 > 0) {
                        int i5 = c0194j.f3525b;
                        if (o8 <= i2 - i5) {
                            String str = new String(bArr, i5, o8, StandardCharsets.UTF_8);
                            c0194j.f3525b += o8;
                            return str;
                        }
                    }
                    if (o8 == 0) {
                        return "";
                    }
                    if (o8 <= 0) {
                        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                int i7 = o7 & 7;
                if (i7 == 0) {
                    if (i2 - c0194j.f3525b >= 10) {
                        for (int i8 = 0; i8 < 10; i8++) {
                            int i9 = c0194j.f3525b;
                            c0194j.f3525b = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                        }
                        throw new IOException("CodedInputStream encountered a malformed varint.");
                    }
                    for (int i10 = 0; i10 < 10; i10++) {
                        int i11 = c0194j.f3525b;
                        if (i11 == i2) {
                            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        byte[] bArr2 = (byte[]) c0194j.f3527d;
                        c0194j.f3525b = i11 + 1;
                        if (bArr2[i11] >= 0) {
                            break;
                        }
                    }
                    throw new IOException("CodedInputStream encountered a malformed varint.");
                }
                if (i7 == 1) {
                    c0194j.z(8);
                } else if (i7 == 2) {
                    c0194j.z(c0194j.o());
                } else {
                    if (i7 != 5) {
                        throw new IOException(C4.p.g(o7, "Invalid wire type: "));
                    }
                    c0194j.z(4);
                }
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void z(Intent intent) {
        int parseInt;
        int i2;
        String string;
        String string2;
        Object[] objArr;
        String string3;
        String string4;
        long parseLong;
        String str;
        String str2;
        if (F(intent)) {
            A("_nr", intent.getExtras());
        }
        int i5 = 0;
        if ((intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) ? false : p()) {
            X0.e eVar = (X0.e) FirebaseMessaging.f4436n.get();
            if (eVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            C0598d c0598d = null;
            r4 = null;
            String str3 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    i2 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            g e7 = g.e();
                            try {
                                Object obj2 = C0396c.f4778m;
                                string = (String) e(((C0396c) e7.c(InterfaceC0397d.class)).c());
                            } catch (InterruptedException e8) {
                                e = e8;
                                throw new RuntimeException(e);
                            }
                        } catch (InterruptedException | ExecutionException e9) {
                            e = e9;
                        }
                    }
                    String str4 = string;
                    g e10 = g.e();
                    e10.a();
                    String packageName = e10.f2270a.getPackageName();
                    EnumC0596b enumC0596b = !c.B(extras) ? EnumC0596b.DISPLAY_NOTIFICATION : EnumC0596b.DATA_MESSAGE;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 == null) {
                        if (!"1".equals(extras.getString("google.priority_reduced"))) {
                            string2 = extras.getString("google.priority");
                        }
                        objArr = 2;
                        if (objArr == 2) {
                            i5 = 5;
                        } else if (objArr == 1) {
                            i5 = 10;
                        }
                        int i7 = i5;
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        String str5 = string3 != null ? string3 : "";
                        string4 = extras.getString("from");
                        if (string4 != null && string4.startsWith("/topics/")) {
                            str3 = string4;
                        }
                        String str6 = str3 != null ? str3 : "";
                        String string5 = extras.getString("collapse_key");
                        String str7 = string5 != null ? string5 : "";
                        String string6 = extras.getString("google.c.a.m_l");
                        String str8 = string6 != null ? string6 : "";
                        String string7 = extras.getString("google.c.a.c_l");
                        String str9 = string7 != null ? string7 : "";
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e11) {
                                Log.w("FirebaseMessaging", "error parsing project number", e11);
                            }
                            c0598d = new C0598d(parseLong > 0 ? parseLong : 0L, str5, str4, enumC0596b, packageName, str7, i7, i2, str6, str8, str9);
                        }
                        g e12 = g.e();
                        P1.h hVar = e12.f2272c;
                        e12.a();
                        str = hVar.f2283e;
                        if (str != null) {
                            try {
                                parseLong = Long.parseLong(str);
                            } catch (NumberFormatException e13) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e13);
                            }
                            c0598d = new C0598d(parseLong > 0 ? parseLong : 0L, str5, str4, enumC0596b, packageName, str7, i7, i2, str6, str8, str9);
                        }
                        e12.a();
                        str2 = hVar.f2280b;
                        if (str2.startsWith("1:")) {
                            String[] split = str2.split(":");
                            if (split.length >= 2) {
                                String str10 = split[1];
                                if (!str10.isEmpty()) {
                                    try {
                                        parseLong = Long.parseLong(str10);
                                    } catch (NumberFormatException e14) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e14);
                                    }
                                }
                            }
                            parseLong = 0;
                        } else {
                            try {
                                parseLong = Long.parseLong(str2);
                            } catch (NumberFormatException e15) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e15);
                            }
                        }
                        c0598d = new C0598d(parseLong > 0 ? parseLong : 0L, str5, str4, enumC0596b, packageName, str7, i7, i2, str6, str8, str9);
                    }
                    if ("high".equals(string2)) {
                        if (!"normal".equals(string2)) {
                            objArr = 0;
                        }
                        objArr = 2;
                    } else {
                        objArr = 1;
                    }
                    if (objArr == 2) {
                    }
                    int i72 = i5;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                    }
                    if (string3 != null) {
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                        str3 = string4;
                    }
                    if (str3 != null) {
                    }
                    String string52 = extras.getString("collapse_key");
                    if (string52 != null) {
                    }
                    String string62 = extras.getString("google.c.a.m_l");
                    if (string62 != null) {
                    }
                    String string72 = extras.getString("google.c.a.c_l");
                    if (string72 != null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                    }
                    g e122 = g.e();
                    P1.h hVar2 = e122.f2272c;
                    e122.a();
                    str = hVar2.f2283e;
                    if (str != null) {
                    }
                    e122.a();
                    str2 = hVar2.f2280b;
                    if (str2.startsWith("1:")) {
                    }
                    c0598d = new C0598d(parseLong > 0 ? parseLong : 0L, str5, str4, enumC0596b, packageName, str7, i72, i2, str6, str8, str9);
                }
                i2 = parseInt;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                }
                String str42 = string;
                g e102 = g.e();
                e102.a();
                String packageName2 = e102.f2270a.getPackageName();
                EnumC0596b enumC0596b2 = !c.B(extras) ? EnumC0596b.DISPLAY_NOTIFICATION : EnumC0596b.DATA_MESSAGE;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                }
                if ("high".equals(string2)) {
                }
                if (objArr == 2) {
                }
                int i722 = i5;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 != null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                }
                if (str3 != null) {
                }
                String string522 = extras.getString("collapse_key");
                if (string522 != null) {
                }
                String string622 = extras.getString("google.c.a.m_l");
                if (string622 != null) {
                }
                String string722 = extras.getString("google.c.a.c_l");
                if (string722 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                g e1222 = g.e();
                P1.h hVar22 = e1222.f2272c;
                e1222.a();
                str = hVar22.f2283e;
                if (str != null) {
                }
                e1222.a();
                str2 = hVar22.f2280b;
                if (str2.startsWith("1:")) {
                }
                c0598d = new C0598d(parseLong > 0 ? parseLong : 0L, str5, str42, enumC0596b2, packageName2, str7, i722, i2, str6, str8, str9);
            }
            if (c0598d == null) {
                return;
            }
            try {
                X0.b bVar = new X0.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                X0.c cVar = new X0.c("proto");
                A4.c cVar2 = new A4.c(25);
                a1.o oVar = (a1.o) eVar;
                Set set = oVar.f3075a;
                if (!set.contains(cVar)) {
                    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
                }
                new D0.j(oVar.f3076b, cVar, cVar2, oVar.f3077c).a0(new X0.a(new k2.e(c0598d), bVar));
            } catch (RuntimeException e16) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e16);
            }
        }
    }

    public abstract void I(byte[] bArr, int i2, int i5);

    public InterfaceC0844c g(Context context, Looper looper, w1 w1Var, Object obj, r1.k kVar, r1.l lVar) {
        return h(context, looper, w1Var, obj, kVar, lVar);
    }

    public InterfaceC0844c h(Context context, Looper looper, w1 w1Var, Object obj, r1.k kVar, r1.l lVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
