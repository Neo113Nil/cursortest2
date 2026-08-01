package com.onesignal.notifications.internal.receivereceipt.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bc.h;
import c6.p;
import com.onesignal.common.AndroidUtils;
import ea.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import jc.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.c;
import t5.d;
import t5.e;
import t5.m;
import t5.u;
import u5.j;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ReceiveReceiptWorkManager implements b {
    public static final a Companion = new a(null);
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final dd.b _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/onesignal/notifications/internal/receivereceipt/impl/ReceiveReceiptWorkManager$ReceiveReceiptWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lt5/m;", "doWork", "(Lld/a;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReceiveReceiptWorker extends CoroutineWorker {

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends c {
            int label;
            /* synthetic */ Object result;

            public a(ld.a aVar) {
                super(aVar);
            }

            @Override // nd.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return ReceiveReceiptWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            context.getClass();
            workerParameters.getClass();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(ld.a aVar) {
            a aVar2;
            int i3;
            if (aVar instanceof a) {
                aVar2 = (a) aVar;
                int i10 = aVar2.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar2.label = i10 - Integer.MIN_VALUE;
                    Object obj = aVar2.result;
                    md.a aVar3 = md.a.f6622d;
                    i3 = aVar2.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        Context applicationContext = getApplicationContext();
                        applicationContext.getClass();
                        if (!v9.c.b(applicationContext)) {
                            return m.a();
                        }
                        String b10 = getInputData().b(ReceiveReceiptWorkManager.OS_NOTIFICATION_ID);
                        b10.getClass();
                        String b11 = getInputData().b(ReceiveReceiptWorkManager.OS_APP_ID);
                        b11.getClass();
                        String b12 = getInputData().b(ReceiveReceiptWorkManager.OS_SUBSCRIPTION_ID);
                        b12.getClass();
                        jc.a aVar4 = (jc.a) v9.c.a().getService(jc.a.class);
                        aVar2.label = 1;
                        if (aVar4.sendReceiveReceipt(b11, b12, b10, aVar2) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                    }
                    return m.a();
                }
            }
            aVar2 = new a(aVar);
            Object obj2 = aVar2.result;
            md.a aVar32 = md.a.f6622d;
            i3 = aVar2.label;
            if (i3 != 0) {
            }
            return m.a();
        }
    }

    public ReceiveReceiptWorkManager(f fVar, com.onesignal.core.internal.config.b bVar, dd.b bVar2) {
        fVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this._applicationService = fVar;
        this._configModelStore = bVar;
        this._subscriptionManager = bVar2;
        this.maxDelay = 25;
    }

    private final d buildConstraints() {
        return new d(2, false, false, false, false, -1L, -1L, CollectionsKt.T(new LinkedHashSet()));
    }

    @Override // jc.b
    public void enqueueReceiveReceipt(String str) {
        str.getClass();
        if (!((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getReceiveReceiptEnabled()) {
            com.onesignal.debug.internal.logging.b.debug$default("sendReceiveReceipt disabled", null, 2, null);
            return;
        }
        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
        String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
        if (id2.length() == 0 || appId.length() == 0) {
            com.onesignal.debug.internal.logging.b.debug$default("ReceiveReceiptWorkManager: No push subscription or appId!", null, 2, null);
        }
        int randomDelay = AndroidUtils.INSTANCE.getRandomDelay(this.minDelay, this.maxDelay);
        HashMap hashMap = new HashMap();
        hashMap.put(OS_NOTIFICATION_ID, str);
        hashMap.put(OS_APP_ID, appId);
        hashMap.put(OS_SUBSCRIPTION_ID, id2);
        e eVar = new e(hashMap);
        e.c(eVar);
        d buildConstraints = buildConstraints();
        p.e eVar2 = new p.e(ReceiveReceiptWorker.class);
        buildConstraints.getClass();
        ((p) eVar2.f7589i).j = buildConstraints;
        eVar2.k(randomDelay);
        ((p) eVar2.f7589i).f1843e = eVar;
        t5.p d10 = eVar2.d();
        com.onesignal.debug.internal.logging.b.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + str + " and delay: " + randomDelay + " seconds", null, 2, null);
        u hVar = h.INSTANCE.getInstance(this._applicationService.getAppContext());
        String concat = str.concat("_receive_receipt");
        hVar.getClass();
        new j((u5.m) hVar, concat, Collections.singletonList(d10)).a();
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
