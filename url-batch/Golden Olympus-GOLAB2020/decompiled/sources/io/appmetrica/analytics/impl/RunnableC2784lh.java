package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.jsonwebtoken.JwtParser;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2784lh implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C2834nf x4 = Ia.f37730F.x();
        if (timePassedChecker.didTimePassMillis(x4.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            Pair pair = TuplesKt.to("major", Integer.valueOf(kotlinVersion.getMajor()));
            Pair pair2 = TuplesKt.to("minor", Integer.valueOf(kotlinVersion.getMinor()));
            Pair pair3 = TuplesKt.to("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(kotlinVersion.getMinor());
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(kotlinVersion.getPatch());
            Map mapOf = MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("version", sb.toString()));
            C2551ck c2551ck = Bj.f37257a;
            c2551ck.getClass();
            c2551ck.a(new C2524bk("kotlin_version", mapOf));
            x4.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
