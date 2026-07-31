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

/* loaded from: classes3.dex */
public final class Wd {

    /* renamed from: a, reason: collision with root package name */
    public static final Wd f1105a = new Wd();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final String c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.14.1", "50147609");

    public final synchronized ExponentialBackoffDataHolder a(Ud ud) {
        Object obj;
        LinkedHashMap linkedHashMap = b;
        obj = linkedHashMap.get(ud);
        if (obj == null) {
            obj = new ExponentialBackoffDataHolder(new C0625xa(C0401oa.I.y(), ud), ud.name());
            linkedHashMap.put(ud, obj);
        }
        return (ExponentialBackoffDataHolder) obj;
    }

    public static final NetworkTask a(Y4 y4) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C0049ah c0049ah = new C0049ah(aESRSARequestBodyEncrypter);
        C0676zb c0676zb = new C0676zb(y4);
        return new NetworkTask(new BlockingExecutor(), new C0446q5(y4.f1126a), new AllHostsExponentialBackoffPolicy(f1105a.a(Ud.REPORT)), new C0582vh(y4, c0049ah, c0676zb, new FullUrlFormer(c0049ah, c0676zb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), y4.i(), y4.p(), y4.u(), aESRSARequestBodyEncrypter), CollectionsKt.listOf(new lo()), c);
    }
}
