package com.onesignal.notifications.bridges;

import android.content.Context;
import android.os.Bundle;
import cf.c;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.common.f;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import nd.i;
import org.json.JSONException;
import org.json.JSONObject;
import wd.b0;
import xb.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final a INSTANCE = new a();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.bridges.a$a, reason: collision with other inner class name */
    public static final class C0048a extends i implements Function1 {
        final /* synthetic */ b0 $registerer;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0048a(b0 b0Var, String str, ld.a aVar) {
            super(1, aVar);
            this.$registerer = b0Var;
            this.$token = str;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return new C0048a(this.$registerer, this.$token, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((C0048a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                c.M(obj);
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) this.$registerer.f10141d;
                String str = this.$token;
                this.label = 1;
                if (cVar.fireCallback(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    private a() {
    }

    public final void onMessageReceived(Context context, RemoteMessage remoteMessage) {
        Bundle jsonStringToBundle;
        context.getClass();
        remoteMessage.getClass();
        if (v9.c.b(context)) {
            sa.a aVar = (sa.a) v9.c.a().getService(sa.a.class);
            b bVar = (b) v9.c.a().getService(b.class);
            String data = remoteMessage.getData();
            try {
                JSONObject jSONObject = new JSONObject(remoteMessage.getData());
                if (remoteMessage.getTtl() == 0) {
                    jSONObject.put(HMS_TTL_KEY, 259200);
                } else {
                    jSONObject.put(HMS_TTL_KEY, remoteMessage.getTtl());
                }
                if (remoteMessage.getSentTime() == 0) {
                    jSONObject.put(HMS_SENT_TIME_KEY, aVar.getCurrentTimeMillis());
                } else {
                    jSONObject.put(HMS_SENT_TIME_KEY, remoteMessage.getSentTime());
                }
                data = jSONObject.toString();
            } catch (JSONException unused) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", null, 2, null);
            }
            if (data == null || (jsonStringToBundle = f.INSTANCE.jsonStringToBundle(data)) == null) {
                return;
            }
            bVar.processBundleFromReceiver(context, jsonStringToBundle);
        }
    }

    public final void onNewToken(Context context, String str, Bundle bundle) {
        context.getClass();
        str.getClass();
        if (!firstToken.compareAndSet(true, false)) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + str + " Bundle: " + bundle, null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + str + " Bundle: " + bundle, null, 2, null);
        b0 b0Var = new b0();
        b0Var.f10141d = v9.c.a().getService(com.onesignal.notifications.internal.registration.impl.c.class);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new C0048a(b0Var, str, null), 1, null);
    }

    @hd.a
    public final void onNewToken(Context context, String str) {
        context.getClass();
        str.getClass();
        onNewToken(context, str, null);
    }
}
