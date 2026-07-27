package com.onesignal.notifications.internal.receivereceipt.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.common.OSWorkManagerHelper;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptProcessor;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptWorkManager;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import e5.g;
import g4.AbstractC0465j;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import s0.C1416d;
import s0.n;
import s0.q;
import s0.t;
import s0.y;
import t0.k;
import t0.o;

/* loaded from: classes.dex */
public final class ReceiveReceiptWorkManager implements IReceiveReceiptWorkManager {
    public static final Companion Companion = new Companion(null);
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final ISubscriptionManager _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class ReceiveReceiptWorker extends CoroutineWorker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            i.e(context, "context");
            i.e(workerParams, "workerParams");
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(InterfaceC1218d interfaceC1218d) {
            ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1 receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1;
            Object obj;
            int i2;
            ReceiveReceiptWorker receiveReceiptWorker;
            if (interfaceC1218d instanceof ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1) {
                receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1 = (ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1) interfaceC1218d;
                int i3 = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label = i3 - Integer.MIN_VALUE;
                    obj = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label;
                    if (i2 != 0) {
                        g.y(obj);
                        Context applicationContext = getApplicationContext();
                        i.d(applicationContext, "getApplicationContext(...)");
                        receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.L$0 = this;
                        receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label = 1;
                        obj = OneSignal.initWithContext(applicationContext, receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        receiveReceiptWorker = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            g.y(obj);
                            return q.a();
                        }
                        receiveReceiptWorker = (ReceiveReceiptWorker) receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.L$0;
                        g.y(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Logging.warn$default("ReceiveReceiptWorker skipped due to failed OneSignal initialization", null, 2, null);
                        return q.a();
                    }
                    String b6 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_NOTIFICATION_ID);
                    if (b6 == null) {
                        return new n();
                    }
                    String b7 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_APP_ID);
                    if (b7 == null) {
                        return new n();
                    }
                    String b8 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_SUBSCRIPTION_ID);
                    if (b8 == null) {
                        return new n();
                    }
                    IReceiveReceiptProcessor iReceiveReceiptProcessor = (IReceiveReceiptProcessor) OneSignal.INSTANCE.getServices().getService(IReceiveReceiptProcessor.class);
                    receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.L$0 = null;
                    receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label = 2;
                    if (iReceiveReceiptProcessor.sendReceiveReceipt(b7, b8, b6, receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    return q.a();
                }
            }
            receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1 = new ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1(this, interfaceC1218d);
            obj = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.result;
            EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
            i2 = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label;
            if (i2 != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    public ReceiveReceiptWorkManager(IApplicationService _applicationService, ConfigModelStore _configModelStore, ISubscriptionManager _subscriptionManager) {
        i.e(_applicationService, "_applicationService");
        i.e(_configModelStore, "_configModelStore");
        i.e(_subscriptionManager, "_subscriptionManager");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._subscriptionManager = _subscriptionManager;
        this.maxDelay = 25;
    }

    private final C1416d buildConstraints() {
        return new C1416d(2, false, false, false, false, -1L, -1L, AbstractC0465j.X0(new LinkedHashSet()));
    }

    @Override // com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptWorkManager
    public void enqueueReceiveReceipt(String notificationId) {
        i.e(notificationId, "notificationId");
        if (!this._configModelStore.getModel().getReceiveReceiptEnabled()) {
            Logging.debug$default("sendReceiveReceipt disabled", null, 2, null);
            return;
        }
        String appId = this._configModelStore.getModel().getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        if (id.length() == 0 || appId.length() == 0) {
            Logging.debug$default("ReceiveReceiptWorkManager: No push subscription or appId!", null, 2, null);
        }
        int randomDelay = AndroidUtils.INSTANCE.getRandomDelay(this.minDelay, this.maxDelay);
        HashMap hashMap = new HashMap();
        hashMap.put(OS_NOTIFICATION_ID, notificationId);
        hashMap.put(OS_APP_ID, appId);
        hashMap.put(OS_SUBSCRIPTION_ID, id);
        s0.g gVar = new s0.g(hashMap);
        s0.g.c(gVar);
        C1416d constraints = buildConstraints();
        B4.i iVar = new B4.i(ReceiveReceiptWorker.class);
        i.e(constraints, "constraints");
        ((B0.q) iVar.f312c).f182j = constraints;
        iVar.S(randomDelay, TimeUnit.SECONDS);
        ((B0.q) iVar.f312c).f177e = gVar;
        t w3 = iVar.w();
        Logging.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + notificationId + " and delay: " + randomDelay + " seconds", null, 2, null);
        y oSWorkManagerHelper = OSWorkManagerHelper.INSTANCE.getInstance(this._applicationService.getAppContext());
        String concat = notificationId.concat("_receive_receipt");
        oSWorkManagerHelper.getClass();
        new k((o) oSWorkManagerHelper, concat, Collections.singletonList(w3)).E();
    }
}
