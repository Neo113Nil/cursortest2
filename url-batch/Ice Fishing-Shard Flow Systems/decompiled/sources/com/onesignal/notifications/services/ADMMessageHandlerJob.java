package com.onesignal.notifications.services;

import X5.j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n2.AbstractC0755f;

@Metadata
/* loaded from: classes.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    public static final class a extends j implements Function1 {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ Context $safeContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Bundle bundle, V5.b bVar) {
            super(1, bVar);
            this.$safeContext = context;
            this.$bundle = bundle;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new a(this.$safeContext, this.$bundle, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                Context safeContext = this.$safeContext;
                Intrinsics.checkNotNullExpressionValue(safeContext, "$safeContext");
                this.label = 1;
                obj = AbstractC0755f.f(safeContext, this);
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
                com.onesignal.debug.internal.logging.b.warn$default("onMessage skipped due to failed OneSignal init", null, 2, null);
                return Unit.f6114a;
            }
            o3.b bVar = (o3.b) AbstractC0755f.d().getService(o3.b.class);
            Context safeContext2 = this.$safeContext;
            Intrinsics.checkNotNullExpressionValue(safeContext2, "$safeContext");
            bVar.processBundleFromReceiver(safeContext2, this.$bundle);
            return Unit.f6114a;
        }
    }

    public static final class b extends j implements Function1 {
        final /* synthetic */ String $newRegistrationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, V5.b bVar) {
            super(1, bVar);
            this.$newRegistrationId = str;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new b(this.$newRegistrationId, bVar);
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
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) AbstractC0755f.d().getService(com.onesignal.notifications.internal.registration.impl.c.class);
                String str = this.$newRegistrationId;
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

    public static final class c extends j implements Function1 {
        int label;

        public c(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new c(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) AbstractC0755f.d().getService(com.onesignal.notifications.internal.registration.impl.c.class);
                this.label = 1;
                if (cVar.fireCallback(null, this) == aVar) {
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

    public void onMessage(Context context, Intent intent) {
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (context == null || extras == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new a(applicationContext, extras, null));
    }

    public void onRegistered(Context context, String str) {
        com.onesignal.debug.internal.logging.b.info$default("ADM registration ID: " + str, null, 2, null);
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new b(str, null));
    }

    public void onRegistrationError(Context context, String str) {
        com.onesignal.debug.internal.logging.b.info$default("ADM:onRegistrationError: " + str, null, 2, null);
        if ("INVALID_SENDER".equals(str)) {
            com.onesignal.debug.internal.logging.b.info$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new c(null));
    }

    public void onUnregistered(Context context, String str) {
        com.onesignal.debug.internal.logging.b.info$default("ADM:onUnregistered: " + str, null, 2, null);
    }
}
