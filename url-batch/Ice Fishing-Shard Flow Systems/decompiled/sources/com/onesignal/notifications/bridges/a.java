package com.onesignal.notifications.bridges;

import X5.j;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.common.f;
import com.onesignal.notifications.internal.registration.impl.c;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n2.AbstractC0755f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final a INSTANCE = new a();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    /* renamed from: com.onesignal.notifications.bridges.a$a, reason: collision with other inner class name */
    public static final class C0056a extends j implements Function1 {
        final /* synthetic */ Context $context;
        final /* synthetic */ RemoteMessage $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0056a(Context context, RemoteMessage remoteMessage, V5.b bVar) {
            super(1, bVar);
            this.$context = context;
            this.$message = remoteMessage;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new C0056a(this.$context, this.$message, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((C0056a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                Context context = this.$context;
                this.label = 1;
                obj = AbstractC0755f.f(context, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return Unit.f6114a;
            }
            I2.a aVar2 = (I2.a) AbstractC0755f.d().getService(I2.a.class);
            o3.b bVar = (o3.b) AbstractC0755f.d().getService(o3.b.class);
            String data = this.$message.getData();
            try {
                JSONObject jSONObject = new JSONObject(this.$message.getData());
                if (this.$message.getTtl() == 0) {
                    jSONObject.put(a.HMS_TTL_KEY, 259200);
                } else {
                    jSONObject.put(a.HMS_TTL_KEY, this.$message.getTtl());
                }
                if (this.$message.getSentTime() == 0) {
                    jSONObject.put(a.HMS_SENT_TIME_KEY, aVar2.getCurrentTimeMillis());
                } else {
                    jSONObject.put(a.HMS_SENT_TIME_KEY, this.$message.getSentTime());
                }
                data = jSONObject.toString();
            } catch (JSONException unused) {
                com.onesignal.debug.internal.logging.b.warn$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", null, 2, null);
            }
            if (data == null) {
                return Unit.f6114a;
            }
            Bundle jsonStringToBundle = f.INSTANCE.jsonStringToBundle(data);
            if (jsonStringToBundle == null) {
                return Unit.f6114a;
            }
            bVar.processBundleFromReceiver(this.$context, jsonStringToBundle);
            return Unit.f6114a;
        }
    }

    public static final class b extends j implements Function1 {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, V5.b bVar) {
            super(1, bVar);
            this.$token = str;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new b(this.$token, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                c cVar = (c) AbstractC0755f.d().getService(c.class);
                String str = this.$token;
                this.label = 1;
                if (cVar.fireCallback(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    private a() {
    }

    public final void onMessageReceived(Context context, RemoteMessage message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnDefault(new C0056a(context, message, null));
    }

    public final void onNewToken(Context context, String token, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        if (!firstToken.compareAndSet(true, false)) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new b(token, null));
    }

    public final void onNewToken(Context context, String token) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        onNewToken(context, token, null);
    }
}
