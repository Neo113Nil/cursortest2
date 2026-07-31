package com.onesignal.notifications.internal.receivereceipt.impl;

import T1.f;
import Y2.b;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.config.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l0.d;
import l0.g;
import l0.l;
import l0.o;
import l0.r;
import l0.w;
import l5.AbstractC0506j;
import m0.k;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import u0.C0686p;
import w3.InterfaceC0720b;

/* loaded from: classes.dex */
public final class ReceiveReceiptWorkManager implements b {
    public static final a Companion = new a(null);
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final f _applicationService;
    private final c _configModelStore;
    private final InterfaceC0720b _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    public static final class ReceiveReceiptWorker extends CoroutineWorker {

        public static final class a extends AbstractC0607c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(InterfaceC0564d interfaceC0564d) {
                super(interfaceC0564d);
            }

            @Override // q5.AbstractC0605a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return ReceiveReceiptWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            i.e(context, "context");
            i.e(workerParams, "workerParams");
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
        
            if (r6.sendReceiveReceipt(r5, r2, r9, r0) == r1) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(InterfaceC0564d interfaceC0564d) {
            a aVar;
            Object obj;
            int i7;
            ReceiveReceiptWorker receiveReceiptWorker;
            if (interfaceC0564d instanceof a) {
                aVar = (a) interfaceC0564d;
                int i8 = aVar.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i8 - Integer.MIN_VALUE;
                    obj = aVar.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = aVar.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        Context applicationContext = getApplicationContext();
                        i.d(applicationContext, "getApplicationContext(...)");
                        aVar.L$0 = this;
                        aVar.label = 1;
                        obj = L1.f.f(applicationContext, aVar);
                        if (obj != enumC0580a) {
                            receiveReceiptWorker = this;
                        }
                        return enumC0580a;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        return o.a();
                    }
                    receiveReceiptWorker = (ReceiveReceiptWorker) aVar.L$0;
                    AbstractC0676f.w(obj);
                    if (((Boolean) obj).booleanValue()) {
                        com.onesignal.debug.internal.logging.b.warn$default("ReceiveReceiptWorker skipped due to failed OneSignal initialization", null, 2, null);
                        return o.a();
                    }
                    String b7 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_NOTIFICATION_ID);
                    if (b7 == null) {
                        return new l();
                    }
                    String b8 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_APP_ID);
                    if (b8 == null) {
                        return new l();
                    }
                    String b9 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_SUBSCRIPTION_ID);
                    if (b9 == null) {
                        return new l();
                    }
                    Y2.a aVar2 = (Y2.a) L1.f.d().getService(Y2.a.class);
                    aVar.L$0 = null;
                    aVar.label = 2;
                }
            }
            aVar = new a(interfaceC0564d);
            obj = aVar.result;
            EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
            i7 = aVar.label;
            if (i7 != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public ReceiveReceiptWorkManager(f _applicationService, c _configModelStore, InterfaceC0720b _subscriptionManager) {
        i.e(_applicationService, "_applicationService");
        i.e(_configModelStore, "_configModelStore");
        i.e(_subscriptionManager, "_subscriptionManager");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._subscriptionManager = _subscriptionManager;
        this.maxDelay = 25;
    }

    private final d buildConstraints() {
        return new d(2, false, false, false, false, -1L, -1L, AbstractC0506j.T(new LinkedHashSet()));
    }

    @Override // Y2.b
    public void enqueueReceiveReceipt(String notificationId) {
        i.e(notificationId, "notificationId");
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
        g gVar = new g(hashMap);
        g.c(gVar);
        d constraints = buildConstraints();
        B0.c cVar = new B0.c(ReceiveReceiptWorker.class);
        i.e(constraints, "constraints");
        ((C0686p) cVar.f73i).f6009j = constraints;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        cVar.B(randomDelay);
        ((C0686p) cVar.f73i).f6004e = gVar;
        r f7 = cVar.f();
        com.onesignal.debug.internal.logging.b.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + notificationId + " and delay: " + randomDelay + " seconds", null, 2, null);
        w iVar = Q2.i.INSTANCE.getInstance(this._applicationService.getAppContext());
        String concat = notificationId.concat("_receive_receipt");
        iVar.getClass();
        new k((m0.o) iVar, concat, Collections.singletonList(f7)).H();
    }
}
