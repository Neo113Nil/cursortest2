package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.l82;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2148p1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2145ol f30263a;

    /* renamed from: com.yandex.mobile.ads.impl.p1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final AtomicLong f30264a = new AtomicLong(SystemClock.elapsedRealtime() - 2000);

        public static boolean a() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long andSet = elapsedRealtime - f30264a.getAndSet(elapsedRealtime);
            return !(0 <= andSet && andSet < 1001);
        }
    }

    public /* synthetic */ C2148p1(vu1 vu1Var) {
        this(vu1Var, new C2145ol(vu1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@Nullable Context context, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull np1 reporter, @NotNull String url, @NotNull C1871d8 receiver, boolean z4) {
        ho hoVar;
        String value;
        boolean z5 = true;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        if (context == null || !a.a()) {
            return;
        }
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        if (a4 != null && (value = a4.m()) != null) {
            ho.f26863c.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            ho[] values = ho.values();
            int length = values.length;
            for (int i5 = 0; i5 < length; i5++) {
                hoVar = values[i5];
                if (Intrinsics.areEqual(hoVar.a(), value)) {
                    break;
                }
            }
        }
        hoVar = null;
        if ((z4 && hoVar == null) || ho.f26864d == hoVar) {
            l82.f28461a.getClass();
            if (l82.a.b(url)) {
                z5 = this.f30263a.a(context, adResponse, receiver, adConfiguration, url);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("click_type", "default");
                linkedHashMap.put("click_handled", Boolean.valueOf(z5));
                k82.f28112a.getClass();
                linkedHashMap.put("click_url", k82.a(url));
                ip1.b bVar = ip1.b.f27341c;
                reporter.a(linkedHashMap);
                if (receiver == null) {
                    receiver.a(9, null);
                    return;
                }
                return;
            }
        }
        if (new n82(new m82()).a(context, url)) {
            receiver.a(7, null);
        } else {
            z5 = URLUtil.isNetworkUrl(url) ? this.f30263a.a(context, adResponse, receiver, adConfiguration, url) : false;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("click_type", "default");
        linkedHashMap2.put("click_handled", Boolean.valueOf(z5));
        k82.f28112a.getClass();
        linkedHashMap2.put("click_url", k82.a(url));
        ip1.b bVar2 = ip1.b.f27341c;
        reporter.a(linkedHashMap2);
        if (receiver == null) {
        }
    }

    public C2148p1(@NotNull vu1 sdkEnvironmentModule, @NotNull C2145ol browserAdActivityLauncher) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(browserAdActivityLauncher, "browserAdActivityLauncher");
        this.f30263a = browserAdActivityLauncher;
    }
}
