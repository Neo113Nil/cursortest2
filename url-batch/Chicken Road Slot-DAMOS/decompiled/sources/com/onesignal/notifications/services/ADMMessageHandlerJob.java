package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cf.c;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import nd.i;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0014J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\u0010"}, d2 = {"Lcom/onesignal/notifications/services/ADMMessageHandlerJob;", "Lcom/amazon/device/messaging/ADMMessageHandlerJobBase;", "()V", "onMessage", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onRegistered", "newRegistrationId", "", "onRegistrationError", "error", "onUnregistered", "registrationId", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends i implements Function1 {
        final /* synthetic */ String $newRegistrationId;
        final /* synthetic */ b0 $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, String str, ld.a aVar) {
            super(1, aVar);
            this.$registerer = b0Var;
            this.$newRegistrationId = str;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return new a(this.$registerer, this.$newRegistrationId, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                c.M(obj);
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) this.$registerer.f10141d;
                String str = this.$newRegistrationId;
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

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function1 {
        final /* synthetic */ b0 $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0 b0Var, ld.a aVar) {
            super(1, aVar);
            this.$registerer = b0Var;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return new b(this.$registerer, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                c.M(obj);
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) this.$registerer.f10141d;
                this.label = 1;
                if (cVar.fireCallback(null, this) == aVar) {
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

    public void onMessage(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        if (v9.c.b(applicationContext)) {
            xb.b bVar = (xb.b) v9.c.a().getService(xb.b.class);
            Bundle extras = intent != null ? intent.getExtras() : null;
            extras.getClass();
            bVar.processBundleFromReceiver(context, extras);
        }
    }

    public void onRegistered(Context context, String newRegistrationId) {
        com.onesignal.debug.internal.logging.b.info$default("ADM registration ID: " + newRegistrationId, null, 2, null);
        b0 b0Var = new b0();
        b0Var.f10141d = v9.c.a().getService(com.onesignal.notifications.internal.registration.impl.c.class);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(b0Var, newRegistrationId, null), 1, null);
    }

    public void onRegistrationError(Context context, String error) {
        com.onesignal.debug.internal.logging.b.error$default("ADM:onRegistrationError: " + error, null, 2, null);
        if ("INVALID_SENDER".equals(error)) {
            com.onesignal.debug.internal.logging.b.error$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        b0 b0Var = new b0();
        b0Var.f10141d = v9.c.a().getService(com.onesignal.notifications.internal.registration.impl.c.class);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(b0Var, null), 1, null);
    }

    public void onUnregistered(Context context, String registrationId) {
        com.onesignal.debug.internal.logging.b.info$default("ADM:onUnregistered: " + registrationId, null, 2, null);
    }
}
