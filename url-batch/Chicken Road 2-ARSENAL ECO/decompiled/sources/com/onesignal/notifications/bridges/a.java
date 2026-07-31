package com.onesignal.notifications.bridges;

import L1.f;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.notifications.internal.registration.impl.c;
import g2.InterfaceC0391a;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import org.json.JSONException;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class a {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final a INSTANCE = new a();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    /* renamed from: com.onesignal.notifications.bridges.a$a, reason: collision with other inner class name */
    public static final class C0056a extends g implements InterfaceC0743l {
        final /* synthetic */ Context $context;
        final /* synthetic */ RemoteMessage $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0056a(Context context, RemoteMessage remoteMessage, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$context = context;
            this.$message = remoteMessage;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new C0056a(this.$context, this.$message, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            Bundle jsonStringToBundle;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                Context context = this.$context;
                this.label = 1;
                obj = f.f(context, this);
                if (obj == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            v vVar = v.f5219a;
            if (booleanValue) {
                InterfaceC0391a interfaceC0391a = (InterfaceC0391a) f.d().getService(InterfaceC0391a.class);
                M2.b bVar = (M2.b) f.d().getService(M2.b.class);
                String data = this.$message.getData();
                try {
                    JSONObject jSONObject = new JSONObject(this.$message.getData());
                    if (this.$message.getTtl() == 0) {
                        jSONObject.put(a.HMS_TTL_KEY, 259200);
                    } else {
                        jSONObject.put(a.HMS_TTL_KEY, this.$message.getTtl());
                    }
                    if (this.$message.getSentTime() == 0) {
                        jSONObject.put(a.HMS_SENT_TIME_KEY, interfaceC0391a.getCurrentTimeMillis());
                    } else {
                        jSONObject.put(a.HMS_SENT_TIME_KEY, this.$message.getSentTime());
                    }
                    data = jSONObject.toString();
                } catch (JSONException unused) {
                    com.onesignal.debug.internal.logging.b.warn$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", null, 2, null);
                }
                if (data != null && (jsonStringToBundle = com.onesignal.common.f.INSTANCE.jsonStringToBundle(data)) != null) {
                    bVar.processBundleFromReceiver(this.$context, jsonStringToBundle);
                    return vVar;
                }
            }
            return vVar;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((C0056a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class b extends g implements InterfaceC0743l {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$token = str;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new b(this.$token, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                c cVar = (c) f.d().getService(c.class);
                String str = this.$token;
                this.label = 1;
                if (cVar.fireCallback(str, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    private a() {
    }

    public final void onMessageReceived(Context context, RemoteMessage message) {
        i.e(context, "context");
        i.e(message, "message");
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnDefault(new C0056a(context, message, null));
    }

    public final void onNewToken(Context context, String token, Bundle bundle) {
        i.e(context, "context");
        i.e(token, "token");
        if (!firstToken.compareAndSet(true, false)) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new b(token, null));
    }

    public final void onNewToken(Context context, String token) {
        i.e(context, "context");
        i.e(token, "token");
        onNewToken(context, token, null);
    }
}
