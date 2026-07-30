package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.google.firebase.database.core.ServerValues;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class AFf1qSDK extends AFe1dSDK<Unit> {
    private final String AFLogger;
    private final AFd1lSDK d;
    private final AFg1wSDK e;
    private final AFg1mSDK registerClient;
    private final AFd1sSDK unregisterClient;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
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
        AFd1lSDK w = aFd1kSDK.w();
        Intrinsics.checkNotNullExpressionValue(w, "");
        this.d = w;
        AFg1mSDK e = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e, "");
        this.registerClient = e;
        AFg1wSDK i = aFd1kSDK.i();
        Intrinsics.checkNotNullExpressionValue(i, "");
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.appsflyer.internal.AFe1bSDK] */
    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        MeasurementManager measurementManager;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AFe1bSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.d.AFKeystoreWrapper;
            if (context != null && (measurementManager = (MeasurementManager) context.getSystemService(MeasurementManager.class)) != null) {
                new AFj1xSDK(this.unregisterClient, null, 2, null);
                Uri.Builder buildUpon = Uri.parse(AFj1xSDK.valueOf()).buildUpon();
                AFd1sSDK aFd1sSDK = this.unregisterClient;
                Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("event_name", this.AFLogger), TuplesKt.to("app_id", this.unregisterClient.valueOf.AFKeystoreWrapper.getPackageName()), TuplesKt.to("app_version", AFb1uSDK.AFInAppEventType(aFd1sSDK.valueOf.AFKeystoreWrapper, aFd1sSDK.valueOf.AFKeystoreWrapper.getPackageName())), TuplesKt.to("sdk_version", AFd1sSDK.AFInAppEventType()), TuplesKt.to("api_version", AFd1sSDK.values()), TuplesKt.to(ServerValues.NAME_OP_TIMESTAMP, String.valueOf(this.registerClient.AFInAppEventType())), TuplesKt.to("request_id", AFd1sSDK.valueOf()));
                AFd1sSDK aFd1sSDK2 = this.unregisterClient;
                String valueOf = AFb1kSDK.valueOf(aFd1sSDK2.valueOf, aFd1sSDK2.AFKeystoreWrapper);
                if (valueOf != null) {
                    mutableMapOf.put("appsflyer_id", valueOf);
                }
                Long AFInAppEventParameterName = this.registerClient.AFInAppEventParameterName();
                if (AFInAppEventParameterName != null) {
                    mutableMapOf.put("install_time", String.valueOf(AFInAppEventParameterName.longValue()));
                }
                for (Map.Entry entry : mutableMapOf.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                Intrinsics.checkNotNullExpressionValue(build, "");
                measurementManager.registerTrigger(build, new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue()), new AFa1tSDK(objectRef, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            valueOf(th);
        }
        return (AFe1bSDK) objectRef.element;
    }

    public static final class AFa1tSDK implements OutcomeReceiver<Object, Exception> {
        private /* synthetic */ Ref.ObjectRef<AFe1bSDK> AFInAppEventParameterName;
        private /* synthetic */ CountDownLatch valueOf;
        private /* synthetic */ AFf1qSDK values;

        AFa1tSDK(Ref.ObjectRef<AFe1bSDK> objectRef, CountDownLatch countDownLatch, AFf1qSDK aFf1qSDK) {
            this.AFInAppEventParameterName = objectRef;
            this.valueOf = countDownLatch;
            this.values = aFf1qSDK;
        }

        @Override // android.os.OutcomeReceiver
        public final /* synthetic */ void onError(Exception exc) {
            Exception exc2 = exc;
            Intrinsics.checkNotNullParameter(exc2, "");
            AFf1qSDK.valueOf(exc2);
            this.valueOf.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.appsflyer.internal.AFe1bSDK] */
        @Override // android.os.OutcomeReceiver
        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.AFInAppEventParameterName.element = AFe1bSDK.SUCCESS;
            this.valueOf.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void valueOf(Throwable th) {
        AFLogger.INSTANCE.e(AFg1aSDK.PRIVACY_SANDBOX, new StringBuilder("Error occurred: ").append(th.getMessage()).toString(), th, false, false, true, true);
    }
}
