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

/* renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566ce {

    /* renamed from: a, reason: collision with root package name */
    public static final C0566ce f7994a = new C0566ce();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f7995b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final String f7996c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.13.0", "50142752");

    public final synchronized ExponentialBackoffDataHolder a(EnumC0514ae enumC0514ae) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = f7995b;
            obj = linkedHashMap.get(enumC0514ae);
            if (obj == null) {
                obj = new ExponentialBackoffDataHolder(new Da(C1027ua.f9366H.z(), enumC0514ae), enumC0514ae.name());
                linkedHashMap.put(enumC0514ae, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) obj;
    }

    public static final NetworkTask a(C0608e5 c0608e5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C0620eh c0620eh = new C0620eh(aESRSARequestBodyEncrypter);
        Fb fb = new Fb(c0608e5);
        return new NetworkTask(new BlockingExecutor(), new C1074w5(c0608e5.f8085a), new AllHostsExponentialBackoffPolicy(f7994a.a(EnumC0514ae.REPORT)), new C1162zh(c0608e5, c0620eh, fb, new FullUrlFormer(c0620eh, fb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c0608e5.i(), c0608e5.p(), c0608e5.u(), aESRSARequestBodyEncrypter), K1.b.W(new C0834mo()), f7996c);
    }
}
