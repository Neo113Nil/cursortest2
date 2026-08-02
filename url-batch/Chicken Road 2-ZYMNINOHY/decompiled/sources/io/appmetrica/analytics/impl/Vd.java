package io.appmetrica.analytics.impl;

import a.AbstractC0124a;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Vd {

    /* renamed from: a, reason: collision with root package name */
    public static final Vd f11116a = new Vd();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f11117b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final String f11118c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "8.0.0", "50147728");

    public final synchronized ExponentialBackoffDataHolder a(Td td) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = f11117b;
            obj = linkedHashMap.get(td);
            if (obj == null) {
                obj = new ExponentialBackoffDataHolder(new C1050wa(C0817na.f12417I.y(), td), td.name());
                linkedHashMap.put(td, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) obj;
    }

    public static final NetworkTask a(X4 x4) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        Zg zg = new Zg(aESRSARequestBodyEncrypter);
        C1103yb c1103yb = new C1103yb(x4);
        return new NetworkTask(new BlockingExecutor(), new C0864p5(x4.f11222a), new AllHostsExponentialBackoffPolicy(f11116a.a(Td.REPORT)), new C1005uh(x4, zg, c1103yb, new FullUrlFormer(zg, c1103yb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), x4.i(), x4.p(), x4.u(), aESRSARequestBodyEncrypter), AbstractC0124a.H(new C0753ko()), f11118c);
    }
}
