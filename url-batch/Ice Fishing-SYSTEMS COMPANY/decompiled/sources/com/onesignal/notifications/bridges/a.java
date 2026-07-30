package com.onesignal.notifications.bridges;

import E7.l;
import android.content.Context;
import android.os.Bundle;
import com.bumptech.glide.f;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.notifications.internal.registration.impl.c;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.g;
import org.json.JSONException;
import org.json.JSONObject;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class a {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final a INSTANCE = new a();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    /* renamed from: com.onesignal.notifications.bridges.a$a, reason: collision with other inner class name */
    public static final class C0225a extends h implements l {
        final /* synthetic */ Context $context;
        final /* synthetic */ RemoteMessage $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0225a(Context context, RemoteMessage remoteMessage, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$context = context;
            this.$message = remoteMessage;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new C0225a(this.$context, this.$message, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            Bundle jsonStringToBundle;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                f.r(obj);
                Context context = this.$context;
                this.label = 1;
                obj = g.b(context, this);
                if (obj == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.r(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            v vVar = v.f40183a;
            if (booleanValue) {
                G4.a aVar = (G4.a) g.a().getService(G4.a.class);
                l5.b bVar = (l5.b) g.a().getService(l5.b.class);
                String data = this.$message.getData();
                try {
                    JSONObject jSONObject = new JSONObject(this.$message.getData());
                    if (this.$message.getTtl() == 0) {
                        jSONObject.put(a.HMS_TTL_KEY, 259200);
                    } else {
                        jSONObject.put(a.HMS_TTL_KEY, this.$message.getTtl());
                    }
                    if (this.$message.getSentTime() == 0) {
                        jSONObject.put(a.HMS_SENT_TIME_KEY, aVar.getCurrentTimeMillis());
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

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((C0225a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class b extends h implements l {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$token = str;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return new b(this.$token, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                f.r(obj);
                c cVar = (c) g.a().getService(c.class);
                String str = this.$token;
                this.label = 1;
                if (cVar.fireCallback(str, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    private a() {
    }

    public final void onMessageReceived(Context context, RemoteMessage message) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(message, "message");
        com.onesignal.common.threading.c.suspendifyOnDefault(new C0225a(context, message, null));
    }

    public final void onNewToken(Context context, String token, Bundle bundle) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(token, "token");
        if (!firstToken.compareAndSet(true, false)) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new b(token, null));
    }

    public final void onNewToken(Context context, String token) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(token, "token");
        onNewToken(context, token, null);
    }
}
