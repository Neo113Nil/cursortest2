package com.onesignal.notifications.internal.generation.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bc.h;
import c6.p;
import com.onesignal.common.AndroidUtils;
import ec.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.l;
import nd.c;
import org.json.JSONException;
import org.json.JSONObject;
import t5.e;
import t5.j;
import t5.m;
import t5.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class NotificationGenerationWorkManager implements b {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String OS_ID_DATA_PARAM = "os_notif_id";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    public static final a Companion = new a(null);
    private static final ConcurrentHashMap<String, Boolean> notificationIds = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/onesignal/notifications/internal/generation/impl/NotificationGenerationWorkManager$NotificationGenerationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lt5/m;", "doWork", "(Lld/a;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotificationGenerationWorker extends CoroutineWorker {

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(ld.a aVar) {
                super(aVar);
            }

            @Override // nd.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationGenerationWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationGenerationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            context.getClass();
            workerParameters.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, md.a] */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(ld.a aVar) {
            a aVar2;
            ?? r22;
            int i3;
            Throwable th;
            String str;
            JSONException jSONException;
            String str2;
            try {
                if (aVar instanceof a) {
                    aVar2 = (a) aVar;
                    int i10 = aVar2.label;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        aVar2.label = i10 - Integer.MIN_VALUE;
                        a aVar3 = aVar2;
                        Object obj = aVar3.result;
                        r22 = md.a.f6622d;
                        i3 = aVar3.label;
                        if (i3 != 0) {
                            cf.c.M(obj);
                            Context applicationContext = getApplicationContext();
                            applicationContext.getClass();
                            if (!v9.c.b(applicationContext)) {
                                return m.a();
                            }
                            ec.a aVar4 = (ec.a) v9.c.a().getService(ec.a.class);
                            e inputData = getInputData();
                            inputData.getClass();
                            String b10 = inputData.b(NotificationGenerationWorkManager.OS_ID_DATA_PARAM);
                            HashMap hashMap = inputData.f9302a;
                            if (b10 == null) {
                                return new j();
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
                                Context applicationContext2 = getApplicationContext();
                                applicationContext2.getClass();
                                aVar3.L$0 = b10;
                                aVar3.label = 1;
                                if (aVar4.processNotificationData(applicationContext2, intValue, jSONObject, booleanValue, currentTimeMillis, aVar3) == r22) {
                                    return r22;
                                }
                                str2 = b10;
                            } catch (JSONException e2) {
                                jSONException = e2;
                                str2 = b10;
                                com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str2, jSONException);
                                j jVar = new j();
                                a aVar5 = NotificationGenerationWorkManager.Companion;
                                str2.getClass();
                                aVar5.removeNotificationIdProcessed(str2);
                                return jVar;
                            } catch (Throwable th2) {
                                th = th2;
                                str = b10;
                                a aVar6 = NotificationGenerationWorkManager.Companion;
                                str.getClass();
                                aVar6.removeNotificationIdProcessed(str);
                                throw th;
                            }
                        } else {
                            if (i3 != 1) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str2 = (String) aVar3.L$0;
                            try {
                                cf.c.M(obj);
                            } catch (JSONException e9) {
                                jSONException = e9;
                                com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str2, jSONException);
                                j jVar2 = new j();
                                a aVar52 = NotificationGenerationWorkManager.Companion;
                                str2.getClass();
                                aVar52.removeNotificationIdProcessed(str2);
                                return jVar2;
                            }
                        }
                        a aVar7 = NotificationGenerationWorkManager.Companion;
                        str2.getClass();
                        aVar7.removeNotificationIdProcessed(str2);
                        return m.a();
                    }
                }
                if (i3 != 0) {
                }
                a aVar72 = NotificationGenerationWorkManager.Companion;
                str2.getClass();
                aVar72.removeNotificationIdProcessed(str2);
                return m.a();
            } catch (Throwable th3) {
                th = th3;
                str = r22;
            }
            aVar2 = new a(aVar);
            a aVar32 = aVar2;
            Object obj5 = aVar32.result;
            r22 = md.a.f6622d;
            i3 = aVar32.label;
        }
    }

    @Override // ec.b
    public boolean beginEnqueueingWork(Context context, String str, int i3, JSONObject jSONObject, long j, boolean z10, boolean z11) {
        context.getClass();
        str.getClass();
        String oSNotificationIdFromJson = bc.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
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
        hashMap.put(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, Integer.valueOf(i3));
        hashMap.put(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jSONObject));
        hashMap.put(TIMESTAMP_WORKER_DATA_PARAM, Long.valueOf(j));
        hashMap.put(IS_RESTORING_WORKER_DATA_PARAM, Boolean.valueOf(z10));
        e eVar = new e(hashMap);
        e.c(eVar);
        p.e eVar2 = new p.e(NotificationGenerationWorker.class);
        ((p) eVar2.f7589i).f1843e = eVar;
        t5.p d10 = eVar2.d();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + jSONObject, null, 2, null);
        u hVar = h.INSTANCE.getInstance(context);
        hVar.getClass();
        new u5.j((u5.m) hVar, str, Collections.singletonList(d10)).a();
        return true;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean addNotificationIdProcessed(String str) {
            str.getClass();
            if (!AndroidUtils.INSTANCE.isStringNotEmpty(str)) {
                return true;
            }
            if (NotificationGenerationWorkManager.notificationIds.contains(str)) {
                com.onesignal.debug.internal.logging.b.debug$default(l.g("OSNotificationWorkManager notification with notificationId: ", str, " already queued"), null, 2, null);
                return false;
            }
            NotificationGenerationWorkManager.notificationIds.put(str, Boolean.TRUE);
            return true;
        }

        public final void removeNotificationIdProcessed(String str) {
            str.getClass();
            if (AndroidUtils.INSTANCE.isStringNotEmpty(str)) {
                NotificationGenerationWorkManager.notificationIds.remove(str);
            }
        }

        private a() {
        }
    }
}
