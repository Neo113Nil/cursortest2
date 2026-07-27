package com.appsflyer.internal;

import B0.AbstractC0087a;
import M2.E;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z2.C1412P;

/* loaded from: classes.dex */
public final class AFf1qSDK extends AFe1dSDK<Unit> {
    private final String AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private final AFd1lSDK f5918d;

    /* renamed from: e, reason: collision with root package name */
    private final AFg1wSDK f5919e;
    private final AFg1mSDK registerClient;
    private final AFd1sSDK unregisterClient;

    public static final class AFa1tSDK implements OutcomeReceiver {
        private /* synthetic */ E AFInAppEventParameterName;
        private /* synthetic */ CountDownLatch valueOf;
        private /* synthetic */ AFf1qSDK values;

        public AFa1tSDK(E e4, CountDownLatch countDownLatch, AFf1qSDK aFf1qSDK) {
            this.AFInAppEventParameterName = e4;
            this.valueOf = countDownLatch;
            this.values = aFf1qSDK;
        }

        public final /* synthetic */ void onError(Throwable th) {
            Exception exc = (Exception) th;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1qSDK.valueOf(exc);
            this.valueOf.countDown();
        }

        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.AFInAppEventParameterName.f3580d = AFe1bSDK.SUCCESS;
            this.valueOf.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1qSDK(AFd1kSDK aFd1kSDK, String str) {
        super(AFf1zSDK.REGISTER_TRIGGER, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.CONVERSION}, "RegisterTrigger");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AFLogger = str;
        AFd1sSDK AFInAppEventType = aFd1kSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.unregisterClient = AFInAppEventType;
        AFd1lSDK w4 = aFd1kSDK.w();
        Intrinsics.checkNotNullExpressionValue(w4, "");
        this.f5918d = w4;
        AFg1mSDK e4 = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e4, "");
        this.registerClient = e4;
        AFg1wSDK i2 = aFd1kSDK.i();
        Intrinsics.checkNotNullExpressionValue(i2, "");
        this.f5919e = i2;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        MeasurementManager c4;
        E e4 = new E();
        e4.f3580d = AFe1bSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.f5918d.AFKeystoreWrapper;
            if (context != null && (c4 = AbstractC0087a.c(context.getSystemService(AbstractC0087a.l()))) != null) {
                new AFj1xSDK(this.unregisterClient, null, 2, null);
                Uri.Builder buildUpon = Uri.parse(AFj1xSDK.valueOf()).buildUpon();
                Pair pair = new Pair("event_name", this.AFLogger);
                Pair pair2 = new Pair("app_id", this.unregisterClient.valueOf.AFKeystoreWrapper.getPackageName());
                Context context2 = this.unregisterClient.valueOf.AFKeystoreWrapper;
                LinkedHashMap f4 = C1412P.f(pair, pair2, new Pair("app_version", AFb1uSDK.AFInAppEventType(context2, context2.getPackageName())), new Pair("sdk_version", AFd1sSDK.AFInAppEventType()), new Pair("api_version", AFd1sSDK.values()), new Pair("timestamp", String.valueOf(this.registerClient.AFInAppEventType())), new Pair("request_id", AFd1sSDK.valueOf()));
                AFd1sSDK aFd1sSDK = this.unregisterClient;
                String valueOf = AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper);
                if (valueOf != null) {
                    f4.put("appsflyer_id", valueOf);
                }
                Long AFInAppEventParameterName = this.registerClient.AFInAppEventParameterName();
                if (AFInAppEventParameterName != null) {
                    f4.put("install_time", String.valueOf(AFInAppEventParameterName.longValue()));
                }
                for (Map.Entry entry : f4.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                Intrinsics.checkNotNullExpressionValue(build, "");
                c4.registerTrigger(build, new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue()), new AFa1tSDK(e4, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            valueOf(th);
        }
        return (AFe1bSDK) e4.f3580d;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void valueOf(Throwable th) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.PRIVACY_SANDBOX;
        StringBuilder sb = new StringBuilder("Error occurred: ");
        sb.append(th.getMessage());
        aFLogger.e(aFg1aSDK, sb.toString(), th, false, false, true, true);
    }
}
