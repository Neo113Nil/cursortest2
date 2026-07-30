package com.onesignal.notifications.internal.receivereceipt.impl;

import A3.b;
import D0.j;
import G0.B;
import G0.e;
import G0.h;
import G0.n;
import G0.p;
import G0.q;
import G0.t;
import G0.u;
import H0.k;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.config.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n2.AbstractC0755f;
import s3.i;
import v2.f;

/* loaded from: classes.dex */
public final class ReceiveReceiptWorkManager implements b {
    public static final a Companion = new a(null);
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final f _applicationService;
    private final c _configModelStore;
    private final Y3.b _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    @Metadata
    public static final class ReceiveReceiptWorker extends CoroutineWorker {

        public static final class a extends X5.c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(V5.b bVar) {
                super(bVar);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return ReceiveReceiptWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
        
            if (r6.sendReceiveReceipt(r7, r2, r10, r0) == r1) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(V5.b bVar) {
            a aVar;
            Object obj;
            int i2;
            ReceiveReceiptWorker receiveReceiptWorker;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i5 = aVar.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i5 - Integer.MIN_VALUE;
                    obj = aVar.result;
                    W5.a aVar2 = W5.a.f2787d;
                    i2 = aVar.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        Context applicationContext = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        aVar.L$0 = this;
                        aVar.label = 1;
                        obj = AbstractC0755f.f(applicationContext, aVar);
                        if (obj != aVar2) {
                            receiveReceiptWorker = this;
                        }
                        return aVar2;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                        p a7 = q.a();
                        Intrinsics.checkNotNullExpressionValue(a7, "success(...)");
                        return a7;
                    }
                    receiveReceiptWorker = (ReceiveReceiptWorker) aVar.L$0;
                    V6.b.P(obj);
                    if (((Boolean) obj).booleanValue()) {
                        com.onesignal.debug.internal.logging.b.warn$default("ReceiveReceiptWorker skipped due to failed OneSignal initialization", null, 2, null);
                        p a8 = q.a();
                        Intrinsics.checkNotNullExpressionValue(a8, "success(...)");
                        return a8;
                    }
                    String b7 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_NOTIFICATION_ID);
                    if (b7 == null) {
                        n nVar = new n();
                        Intrinsics.checkNotNullExpressionValue(nVar, "failure(...)");
                        return nVar;
                    }
                    String b8 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_APP_ID);
                    if (b8 == null) {
                        n nVar2 = new n();
                        Intrinsics.checkNotNullExpressionValue(nVar2, "failure(...)");
                        return nVar2;
                    }
                    String b9 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_SUBSCRIPTION_ID);
                    if (b9 == null) {
                        n nVar3 = new n();
                        Intrinsics.checkNotNullExpressionValue(nVar3, "failure(...)");
                        return nVar3;
                    }
                    A3.a aVar3 = (A3.a) AbstractC0755f.d().getService(A3.a.class);
                    aVar.L$0 = null;
                    aVar.label = 2;
                }
            }
            aVar = new a(bVar);
            obj = aVar.result;
            W5.a aVar22 = W5.a.f2787d;
            i2 = aVar.label;
            if (i2 != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ReceiveReceiptWorkManager(f _applicationService, c _configModelStore, Y3.b _subscriptionManager) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._subscriptionManager = _subscriptionManager;
        this.maxDelay = 25;
    }

    private final e buildConstraints() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        t networkType = t.f826e;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        return new e(networkType, false, false, false, false, -1L, -1L, CollectionsKt.C(linkedHashSet));
    }

    @Override // A3.b
    public void enqueueReceiveReceipt(String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        if (!((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getReceiveReceiptEnabled()) {
            com.onesignal.debug.internal.logging.b.debug$default("sendReceiveReceipt disabled", null, 2, null);
            return;
        }
        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        if (id.length() == 0 || appId.length() == 0) {
            com.onesignal.debug.internal.logging.b.debug$default("ReceiveReceiptWorkManager: No push subscription or appId!", null, 2, null);
        }
        int randomDelay = AndroidUtils.INSTANCE.getRandomDelay(this.minDelay, this.maxDelay);
        HashMap hashMap = new HashMap();
        hashMap.put(OS_NOTIFICATION_ID, notificationId);
        hashMap.put(OS_APP_ID, appId);
        hashMap.put(OS_SUBSCRIPTION_ID, id);
        h inputData = new h(hashMap);
        h.c(inputData);
        Intrinsics.checkNotNullExpressionValue(inputData, "build(...)");
        e constraints = buildConstraints();
        j jVar = new j(ReceiveReceiptWorker.class);
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        ((P0.p) jVar.f331i).j = constraints;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        jVar.c0(randomDelay);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ((P0.p) jVar.f331i).f2224e = inputData;
        u z7 = jVar.z();
        com.onesignal.debug.internal.logging.b.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + notificationId + " and delay: " + randomDelay + " seconds", null, 2, null);
        B iVar = i.INSTANCE.getInstance(this._applicationService.getAppContext());
        StringBuilder sb = new StringBuilder();
        sb.append(notificationId);
        sb.append("_receive_receipt");
        String sb2 = sb.toString();
        iVar.getClass();
        new k((H0.p) iVar, sb2, Collections.singletonList(z7)).d0();
    }
}
