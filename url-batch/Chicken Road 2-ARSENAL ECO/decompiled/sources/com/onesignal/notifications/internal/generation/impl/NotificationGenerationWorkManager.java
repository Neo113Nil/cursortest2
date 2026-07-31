package com.onesignal.notifications.internal.generation.impl;

import L1.f;
import Q2.c;
import T2.b;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.common.AndroidUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l0.g;
import l0.l;
import l0.n;
import l0.o;
import l0.r;
import l0.w;
import m0.k;
import o5.InterfaceC0564d;
import org.json.JSONException;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import u0.C0686p;

/* loaded from: classes.dex */
public final class NotificationGenerationWorkManager implements b {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String OS_ID_DATA_PARAM = "os_notif_id";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    public static final a Companion = new a(null);
    private static final ConcurrentHashMap<String, Boolean> notificationIds = new ConcurrentHashMap<>();

    public static final class NotificationGenerationWorker extends CoroutineWorker {

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
                return NotificationGenerationWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationGenerationWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            i.e(context, "context");
            i.e(workerParams, "workerParams");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0051  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(InterfaceC0564d interfaceC0564d) {
            a aVar;
            Object obj;
            int i7;
            NotificationGenerationWorker notificationGenerationWorker;
            String str;
            String str2 = "NotificationWorker running doWork with data: ";
            try {
                if (interfaceC0564d instanceof a) {
                    aVar = (a) interfaceC0564d;
                    int i8 = aVar.label;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        aVar.label = i8 - Integer.MIN_VALUE;
                        a aVar2 = aVar;
                        obj = aVar2.result;
                        EnumC0580a enumC0580a = EnumC0580a.f5697f;
                        i7 = aVar2.label;
                        if (i7 != 0) {
                            AbstractC0676f.w(obj);
                            Context applicationContext = getApplicationContext();
                            i.d(applicationContext, "getApplicationContext(...)");
                            aVar2.L$0 = this;
                            aVar2.label = 1;
                            obj = f.f(applicationContext, aVar2);
                            if (obj != enumC0580a) {
                                notificationGenerationWorker = this;
                            }
                            return enumC0580a;
                        }
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = (String) aVar2.L$0;
                            try {
                                AbstractC0676f.w(obj);
                                n a7 = o.a();
                                a aVar3 = NotificationGenerationWorkManager.Companion;
                                i.b(str);
                                aVar3.removeNotificationIdProcessed(str);
                                return a7;
                            } catch (JSONException e4) {
                                e = e4;
                                com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str, e);
                                l lVar = new l();
                                a aVar4 = NotificationGenerationWorkManager.Companion;
                                i.b(str);
                                aVar4.removeNotificationIdProcessed(str);
                                return lVar;
                            }
                        }
                        notificationGenerationWorker = (NotificationGenerationWorker) aVar2.L$0;
                        AbstractC0676f.w(obj);
                        if (((Boolean) obj).booleanValue()) {
                            com.onesignal.debug.internal.logging.b.warn$default("NotificationWorker skipped due to failed OneSignal initialization", null, 2, null);
                            return o.a();
                        }
                        T2.a aVar5 = (T2.a) f.d().getService(T2.a.class);
                        g inputData = notificationGenerationWorker.getInputData();
                        i.d(inputData, "getInputData(...)");
                        HashMap hashMap = inputData.f5271a;
                        String b7 = inputData.b(NotificationGenerationWorkManager.OS_ID_DATA_PARAM);
                        if (b7 == null) {
                            return new l();
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
                            i.d(applicationContext2, "getApplicationContext(...)");
                            aVar2.L$0 = b7;
                            aVar2.label = 2;
                            if (aVar5.processNotificationData(applicationContext2, intValue, jSONObject, booleanValue, currentTimeMillis, aVar2) != enumC0580a) {
                                str = b7;
                                n a72 = o.a();
                                a aVar32 = NotificationGenerationWorkManager.Companion;
                                i.b(str);
                                aVar32.removeNotificationIdProcessed(str);
                                return a72;
                            }
                            return enumC0580a;
                        } catch (JSONException e7) {
                            e = e7;
                            str = b7;
                            com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str, e);
                            l lVar2 = new l();
                            a aVar42 = NotificationGenerationWorkManager.Companion;
                            i.b(str);
                            aVar42.removeNotificationIdProcessed(str);
                            return lVar2;
                        } catch (Throwable th) {
                            th = th;
                            str2 = b7;
                            a aVar6 = NotificationGenerationWorkManager.Companion;
                            i.b(str2);
                            aVar6.removeNotificationIdProcessed(str2);
                            throw th;
                        }
                    }
                }
                if (i7 != 0) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
            aVar = new a(interfaceC0564d);
            a aVar22 = aVar;
            obj = aVar22.result;
            EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
            i7 = aVar22.label;
        }
    }

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final boolean addNotificationIdProcessed(String osNotificationId) {
            i.e(osNotificationId, "osNotificationId");
            if (!AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                return true;
            }
            if (NotificationGenerationWorkManager.notificationIds.contains(osNotificationId)) {
                com.onesignal.debug.internal.logging.b.debug$default(W4.o.e("OSNotificationWorkManager notification with notificationId: ", osNotificationId, " already queued"), null, 2, null);
                return false;
            }
            NotificationGenerationWorkManager.notificationIds.put(osNotificationId, Boolean.TRUE);
            return true;
        }

        public final void removeNotificationIdProcessed(String osNotificationId) {
            i.e(osNotificationId, "osNotificationId");
            if (AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                NotificationGenerationWorkManager.notificationIds.remove(osNotificationId);
            }
        }

        private a() {
        }
    }

    @Override // T2.b
    public boolean beginEnqueueingWork(Context context, String osNotificationId, int i7, JSONObject jSONObject, long j4, boolean z5, boolean z6) {
        i.e(context, "context");
        i.e(osNotificationId, "osNotificationId");
        String oSNotificationIdFromJson = c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
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
        hashMap.put(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, Integer.valueOf(i7));
        hashMap.put(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jSONObject));
        hashMap.put(TIMESTAMP_WORKER_DATA_PARAM, Long.valueOf(j4));
        hashMap.put(IS_RESTORING_WORKER_DATA_PARAM, Boolean.valueOf(z5));
        g gVar = new g(hashMap);
        g.c(gVar);
        B0.c cVar = new B0.c(NotificationGenerationWorker.class);
        ((C0686p) cVar.f73i).f6004e = gVar;
        r f7 = cVar.f();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + osNotificationId + " and jsonPayload: " + jSONObject, null, 2, null);
        w iVar = Q2.i.INSTANCE.getInstance(context);
        iVar.getClass();
        new k((m0.o) iVar, osNotificationId, Collections.singletonList(f7)).H();
        return true;
    }
}
