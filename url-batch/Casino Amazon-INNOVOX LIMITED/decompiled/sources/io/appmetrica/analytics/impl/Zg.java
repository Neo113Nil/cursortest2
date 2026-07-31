package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes3.dex */
public final class Zg implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C0047af y = C0401oa.I.y();
        if (timePassedChecker.didTimePassMillis(y.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            Map mapOf = MapsKt.mapOf(TuplesKt.to("major", Integer.valueOf(kotlinVersion.getMajor())), TuplesKt.to("minor", Integer.valueOf(kotlinVersion.getMinor())), TuplesKt.to("patch", Integer.valueOf(kotlinVersion.getPatch())), TuplesKt.to("version", new StringBuilder().append(kotlinVersion.getMajor()).append('.').append(kotlinVersion.getMinor()).append('.').append(kotlinVersion.getPatch()).toString()));
            Rj rj = AbstractC0435pj.f1437a;
            rj.getClass();
            rj.a(new Qj("kotlin_version", mapOf));
            y.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
