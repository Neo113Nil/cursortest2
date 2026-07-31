package io.appmetrica.analytics.impl;

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
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.ke, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2755ke {

    /* renamed from: a, reason: collision with root package name */
    public static final C2755ke f39333a = new C2755ke();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f39334b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final String f39335c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.10.0", "50135769");

    public final synchronized ExponentialBackoffDataHolder a(EnumC2704ie enumC2704ie) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = f39334b;
            obj = linkedHashMap.get(enumC2704ie);
            if (obj == null) {
                obj = new ExponentialBackoffDataHolder(new Ra(Ia.f37730F.x(), enumC2704ie), enumC2704ie.name());
                linkedHashMap.put(enumC2704ie, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) obj;
    }

    public static final NetworkTask a(C2953s5 c2953s5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C2810mh c2810mh = new C2810mh(aESRSARequestBodyEncrypter);
        Tb tb = new Tb(c2953s5);
        return new NetworkTask(new BlockingExecutor(), new K5(c2953s5.f39765a), new AllHostsExponentialBackoffPolicy(f39333a.a(EnumC2704ie.REPORT)), new Hh(c2953s5, c2810mh, tb, new FullUrlFormer(c2810mh, tb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c2953s5.h(), c2953s5.o(), c2953s5.t(), aESRSARequestBodyEncrypter), CollectionsKt.listOf(new C2688ho()), f39335c);
    }
}
