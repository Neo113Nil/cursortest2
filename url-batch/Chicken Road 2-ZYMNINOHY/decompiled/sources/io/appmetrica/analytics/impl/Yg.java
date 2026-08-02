package io.appmetrica.analytics.impl;

import c3.C0292d;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class Yg implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        Ze y4 = C0817na.f12417I.y();
        if (timePassedChecker.didTimePassMillis(y4.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            C0292d c0292d = new C0292d("major", Integer.valueOf(kotlinVersion.getMajor()));
            C0292d c0292d2 = new C0292d("minor", Integer.valueOf(kotlinVersion.getMinor()));
            C0292d c0292d3 = new C0292d("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            Map C4 = d3.t.C(c0292d, c0292d2, c0292d3, new C0292d("version", sb.toString()));
            Qj qj = AbstractC0852oj.f12527a;
            qj.getClass();
            qj.a(new Pj("kotlin_version", C4));
            y4.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
