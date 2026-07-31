package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.ew1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3313G;
import o2.InterfaceC3316J;

/* renamed from: com.yandex.mobile.ads.impl.ud, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2274ud {
    private C2274ud() {
    }

    public static void a(Context context, mp1 reporter) {
        C2251td c2251td;
        Object obj;
        AbstractC3313G coroutineContext = o2.Z.b();
        InterfaceC3316J coroutineScope = o2.K.a(o2.R0.b(null, 1, null).plus(o2.Z.b()).plus(reporter != null ? new eu(reporter) : new du()));
        C2205rd anrChecker = new C2205rd(coroutineContext, new Handler(Looper.getMainLooper()));
        C2228sd anrReporter = new C2228sd(reporter);
        m42 threadUtils = new m42();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(anrChecker, "anrChecker");
        Intrinsics.checkNotNullParameter(anrReporter, "anrReporter");
        Intrinsics.checkNotNullParameter(threadUtils, "threadUtils");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        if (a4 == null || !a4.f()) {
            return;
        }
        Long g4 = a4.g();
        long longValue = g4 != null ? g4.longValue() : 1000L;
        Long h4 = a4.h();
        long longValue2 = h4 != null ? h4.longValue() : 3500L;
        Set<u50> o4 = a4.o();
        if (o4 == null) {
            o4 = kotlin.collections.T.e();
        }
        Set<u50> crashStackTraceExclusionRules = o4;
        int i5 = C2251td.f32296l;
        Intrinsics.checkNotNullParameter(crashStackTraceExclusionRules, "crashStackTraceExclusionRules");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(anrChecker, "anrChecker");
        Intrinsics.checkNotNullParameter(anrReporter, "anrReporter");
        Intrinsics.checkNotNullParameter(threadUtils, "threadUtils");
        c2251td = C2251td.f32295k;
        if (c2251td == null) {
            obj = C2251td.f32294j;
            synchronized (obj) {
                c2251td = C2251td.f32295k;
                if (c2251td == null) {
                    C2251td c2251td2 = new C2251td(longValue, longValue2, crashStackTraceExclusionRules, coroutineScope, anrChecker, anrReporter, threadUtils, 0);
                    C2251td.f32295k = c2251td2;
                    c2251td = c2251td2;
                }
            }
        }
        c2251td.c();
    }
}
