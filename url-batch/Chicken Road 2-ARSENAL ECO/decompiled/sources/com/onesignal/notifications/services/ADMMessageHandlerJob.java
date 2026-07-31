package com.onesignal.notifications.services;

import L1.f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    public static final class a extends g implements InterfaceC0743l {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ Context $safeContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Bundle bundle, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$safeContext = context;
            this.$bundle = bundle;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new a(this.$safeContext, this.$bundle, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                Context safeContext = this.$safeContext;
                i.d(safeContext, "$safeContext");
                this.label = 1;
                obj = f.f(safeContext, this);
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
            if (!booleanValue) {
                com.onesignal.debug.internal.logging.b.warn$default("onMessage skipped due to failed OneSignal init", null, 2, null);
                return vVar;
            }
            M2.b bVar = (M2.b) f.d().getService(M2.b.class);
            Context safeContext2 = this.$safeContext;
            i.d(safeContext2, "$safeContext");
            bVar.processBundleFromReceiver(safeContext2, this.$bundle);
            return vVar;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class b extends g implements InterfaceC0743l {
        final /* synthetic */ String $newRegistrationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$newRegistrationId = str;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new b(this.$newRegistrationId, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) f.d().getService(com.onesignal.notifications.internal.registration.impl.c.class);
                String str = this.$newRegistrationId;
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

    public static final class c extends g implements InterfaceC0743l {
        int label;

        public c(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new c(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) f.d().getService(com.onesignal.notifications.internal.registration.impl.c.class);
                this.label = 1;
                if (cVar.fireCallback(null, this) == enumC0580a) {
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
            return ((c) create(interfaceC0564d)).invokeSuspend(v.f5219a);
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
