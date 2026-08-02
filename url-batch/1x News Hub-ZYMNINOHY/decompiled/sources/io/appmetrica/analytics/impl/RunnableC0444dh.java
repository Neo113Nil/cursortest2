package io.appmetrica.analytics.impl;

import b2.C0190d;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0444dh implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C0467ef z = C0876ua.f8420H.z();
        if (timePassedChecker.didTimePassMillis(z.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            C0190d c0190d = new C0190d("major", Integer.valueOf(kotlinVersion.getMajor()));
            C0190d c0190d2 = new C0190d("minor", Integer.valueOf(kotlinVersion.getMinor()));
            C0190d c0190d3 = new C0190d("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            Map c02 = c2.p.c0(c0190d, c0190d2, c0190d3, new C0190d("version", sb.toString()));
            Vj vj = AbstractC0859tj.f8379a;
            vj.getClass();
            vj.a(new Uj("kotlin_version", c02));
            z.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
