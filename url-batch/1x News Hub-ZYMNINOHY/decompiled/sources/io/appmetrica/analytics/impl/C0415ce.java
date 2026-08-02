package io.appmetrica.analytics.impl;

import a.AbstractC0129a;
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
public final class C0415ce {

    /* renamed from: a, reason: collision with root package name */
    public static final C0415ce f7138a = new C0415ce();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f7139b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final String f7140c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.13.0", "50142752");

    public final synchronized ExponentialBackoffDataHolder a(EnumC0363ae enumC0363ae) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = f7139b;
            obj = linkedHashMap.get(enumC0363ae);
            if (obj == null) {
                obj = new ExponentialBackoffDataHolder(new Da(C0876ua.f8420H.z(), enumC0363ae), enumC0363ae.name());
                linkedHashMap.put(enumC0363ae, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) obj;
    }

    public static final NetworkTask a(C0457e5 c0457e5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C0469eh c0469eh = new C0469eh(aESRSARequestBodyEncrypter);
        Fb fb = new Fb(c0457e5);
        return new NetworkTask(new BlockingExecutor(), new C0923w5(c0457e5.f7225a), new AllHostsExponentialBackoffPolicy(f7138a.a(EnumC0363ae.REPORT)), new C1011zh(c0457e5, c0469eh, fb, new FullUrlFormer(c0469eh, fb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c0457e5.i(), c0457e5.p(), c0457e5.u(), aESRSARequestBodyEncrypter), AbstractC0129a.r(new C0683mo()), f7140c);
    }
}
