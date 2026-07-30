package com.onesignal.notifications.internal.generation.impl;

import D0.j;
import G0.B;
import G0.h;
import G0.n;
import G0.p;
import G0.q;
import G0.u;
import H0.k;
import V5.b;
import X5.c;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.common.AndroidUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n2.AbstractC0755f;
import org.json.JSONException;
import org.json.JSONObject;
import r4.f;
import s3.i;
import v3.InterfaceC0972a;
import v3.InterfaceC0973b;

/* loaded from: classes.dex */
public final class NotificationGenerationWorkManager implements InterfaceC0973b {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String OS_ID_DATA_PARAM = "os_notif_id";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    public static final a Companion = new a(null);
    private static final ConcurrentHashMap<String, Boolean> notificationIds = new ConcurrentHashMap<>();

    @Metadata
    public static final class NotificationGenerationWorker extends CoroutineWorker {

        public static final class a extends c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(b bVar) {
                super(bVar);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationGenerationWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationGenerationWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0051  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(b bVar) {
            a aVar;
            Object obj;
            int i2;
            NotificationGenerationWorker notificationGenerationWorker;
            String str;
            String str2 = "NotificationWorker running doWork with data: ";
            try {
                if (bVar instanceof a) {
                    aVar = (a) bVar;
                    int i5 = aVar.label;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        aVar.label = i5 - Integer.MIN_VALUE;
                        a aVar2 = aVar;
                        obj = aVar2.result;
                        W5.a aVar3 = W5.a.f2787d;
                        i2 = aVar2.label;
                        if (i2 != 0) {
                            V6.b.P(obj);
                            Context applicationContext = getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            aVar2.L$0 = this;
                            aVar2.label = 1;
                            obj = AbstractC0755f.f(applicationContext, aVar2);
                            if (obj != aVar3) {
                                notificationGenerationWorker = this;
                            }
                            return aVar3;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = (String) aVar2.L$0;
                            try {
                                V6.b.P(obj);
                                p a7 = q.a();
                                a aVar4 = NotificationGenerationWorkManager.Companion;
                                Intrinsics.b(str);
                                aVar4.removeNotificationIdProcessed(str);
                                return a7;
                            } catch (JSONException e7) {
                                e = e7;
                                com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str, e);
                                n nVar = new n();
                                a aVar5 = NotificationGenerationWorkManager.Companion;
                                Intrinsics.b(str);
                                aVar5.removeNotificationIdProcessed(str);
                                return nVar;
                            }
                        }
                        notificationGenerationWorker = (NotificationGenerationWorker) aVar2.L$0;
                        V6.b.P(obj);
                        if (((Boolean) obj).booleanValue()) {
                            com.onesignal.debug.internal.logging.b.warn$default("NotificationWorker skipped due to failed OneSignal initialization", null, 2, null);
                            p a8 = q.a();
                            Intrinsics.checkNotNullExpressionValue(a8, "success(...)");
                            return a8;
                        }
                        InterfaceC0972a interfaceC0972a = (InterfaceC0972a) AbstractC0755f.d().getService(InterfaceC0972a.class);
                        h inputData = notificationGenerationWorker.getInputData();
                        Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
                        String b7 = inputData.b(NotificationGenerationWorkManager.OS_ID_DATA_PARAM);
                        HashMap hashMap = inputData.f810a;
                        if (b7 == null) {
                            n nVar2 = new n();
                            Intrinsics.checkNotNullExpressionValue(nVar2, "failure(...)");
                            return nVar2;
                        }
                        try {
                            com.onesignal.debug.internal.logging.b.debug$default("NotificationWorker running doWork with data: " + inputData, null, 2, null);
                            Object obj2 = hashMap.get(NotificationGenerationWorkManager.ANDROID_NOTIF_ID_WORKER_DATA_PARAM);
                            int intValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                            JSONObject jSONObject = new JSONObject(inputData.b(NotificationGenerationWorkManager.JSON_PAYLOAD_WORKER_DATA_PARAM));
                            long currentTimeMillis = System.currentTimeMillis() / 1000;
                            Object obj3 = hashMap.get(NotificationGenerationWorkManager.TIMESTAMP_WORKER_DATA_PARAM);
                            if (obj3 instanceof Long) {
                                currentTimeMillis = ((Long) obj3).longValue();
                            }
                            Object obj4 = hashMap.get(NotificationGenerationWorkManager.IS_RESTORING_WORKER_DATA_PARAM);
                            boolean booleanValue = obj4 instanceof Boolean ? ((Boolean) obj4).booleanValue() : false;
                            Context applicationContext2 = notificationGenerationWorker.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                            aVar2.L$0 = b7;
                            aVar2.label = 2;
                            if (interfaceC0972a.processNotificationData(applicationContext2, intValue, jSONObject, booleanValue, currentTimeMillis, aVar2) != aVar3) {
                                str = b7;
                                p a72 = q.a();
                                a aVar42 = NotificationGenerationWorkManager.Companion;
                                Intrinsics.b(str);
                                aVar42.removeNotificationIdProcessed(str);
                                return a72;
                            }
                            return aVar3;
                        } catch (JSONException e8) {
                            e = e8;
                            str = b7;
                            com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str, e);
                            n nVar3 = new n();
                            a aVar52 = NotificationGenerationWorkManager.Companion;
                            Intrinsics.b(str);
                            aVar52.removeNotificationIdProcessed(str);
                            return nVar3;
                        } catch (Throwable th) {
                            th = th;
                            str2 = b7;
                            a aVar6 = NotificationGenerationWorkManager.Companion;
                            Intrinsics.b(str2);
                            aVar6.removeNotificationIdProcessed(str2);
                            throw th;
                        }
                    }
                }
                if (i2 != 0) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
            aVar = new a(bVar);
            a aVar22 = aVar;
            obj = aVar22.result;
            W5.a aVar32 = W5.a.f2787d;
            i2 = aVar22.label;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean addNotificationIdProcessed(String osNotificationId) {
            Intrinsics.checkNotNullParameter(osNotificationId, "osNotificationId");
            if (!AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                return true;
            }
            if (NotificationGenerationWorkManager.notificationIds.contains(osNotificationId)) {
                com.onesignal.debug.internal.logging.b.debug$default(f.d("OSNotificationWorkManager notification with notificationId: ", osNotificationId, " already queued"), null, 2, null);
                return false;
            }
            NotificationGenerationWorkManager.notificationIds.put(osNotificationId, Boolean.TRUE);
            return true;
        }

        public final void removeNotificationIdProcessed(String osNotificationId) {
            Intrinsics.checkNotNullParameter(osNotificationId, "osNotificationId");
            if (AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                NotificationGenerationWorkManager.notificationIds.remove(osNotificationId);
            }
        }

        private a() {
        }
    }

    @Override // v3.InterfaceC0973b
    public boolean beginEnqueueingWork(Context context, String osNotificationId, int i2, JSONObject jSONObject, long j, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(osNotificationId, "osNotificationId");
        String oSNotificationIdFromJson = s3.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
        if (oSNotificationIdFromJson == null) {
            com.onesignal.debug.internal.logging.b.debug$default("Notification beginEnqueueingWork with id null", null, 2, null);
            return false;
        }
        if (!Companion.addNotificationIdProcessed(oSNotificationIdFromJson)) {
            com.onesignal.debug.internal.logging.b.debug$default("Notification beginEnqueueingWork with id duplicated", null, 2, null);
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(OS_ID_DATA_PARAM, oSNotificationIdFromJson);
        hashMap.put(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, Integer.valueOf(i2));
        hashMap.put(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jSONObject));
        hashMap.put(TIMESTAMP_WORKER_DATA_PARAM, Long.valueOf(j));
        hashMap.put(IS_RESTORING_WORKER_DATA_PARAM, Boolean.valueOf(z7));
        h inputData = new h(hashMap);
        h.c(inputData);
        Intrinsics.checkNotNullExpressionValue(inputData, "build(...)");
        j jVar = new j(NotificationGenerationWorker.class);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ((P0.p) jVar.f331i).f2224e = inputData;
        u z9 = jVar.z();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + osNotificationId + " and jsonPayload: " + jSONObject, null, 2, null);
        B iVar = i.INSTANCE.getInstance(context);
        iVar.getClass();
        new k((H0.p) iVar, osNotificationId, Collections.singletonList(z9)).d0();
        return true;
    }
}
