package com.onesignal.notifications.receivers;

import V5.b;
import X5.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n2.AbstractC0755f;
import n6.F;
import n6.InterfaceC0789w;
import o6.C0809e;
import s6.n;
import u6.C0953e;
import y3.InterfaceC1028a;

@Metadata
/* loaded from: classes.dex */
public final class NotificationDismissReceiver extends BroadcastReceiver {

    public static final class a extends j implements Function1 {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* renamed from: com.onesignal.notifications.receivers.NotificationDismissReceiver$a$a, reason: collision with other inner class name */
        public static final class C0072a extends j implements Function2 {
            final /* synthetic */ Context $context;
            final /* synthetic */ Intent $intent;
            final /* synthetic */ InterfaceC1028a $notificationOpenedProcessor;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0072a(InterfaceC1028a interfaceC1028a, Context context, Intent intent, b bVar) {
                super(2, bVar);
                this.$notificationOpenedProcessor = interfaceC1028a;
                this.$context = context;
                this.$intent = intent;
            }

            @Override // X5.a
            public final b create(Object obj, b bVar) {
                return new C0072a(this.$notificationOpenedProcessor, this.$context, this.$intent, bVar);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                W5.a aVar = W5.a.f2787d;
                int i2 = this.label;
                if (i2 == 0) {
                    V6.b.P(obj);
                    InterfaceC1028a interfaceC1028a = this.$notificationOpenedProcessor;
                    Context context = this.$context;
                    Intent intent = this.$intent;
                    this.label = 1;
                    if (interfaceC1028a.processFromContext(context, intent, this) == aVar) {
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC0789w interfaceC0789w, b bVar) {
                return ((C0072a) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BroadcastReceiver.PendingResult pendingResult, Intent intent, b bVar) {
            super(1, bVar);
            this.$context = context;
            this.$pendingResult = pendingResult;
            this.$intent = intent;
        }

        @Override // X5.a
        public final b create(b bVar) {
            return new a(this.$context, this.$pendingResult, this.$intent, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(b bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        
            if (n6.AbstractC0792z.t(r2, r4, r7) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0030, code lost:
        
            if (r8 == r0) goto L22;
         */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                Context applicationContext = this.$context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = AbstractC0755f.f(applicationContext, this);
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    return Unit.f6114a;
                }
                V6.b.P(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                com.onesignal.debug.internal.logging.b.warn$default("NotificationOpenedReceiver skipped due to failed OneSignal init", null, 2, null);
                BroadcastReceiver.PendingResult pendingResult2 = this.$pendingResult;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                return Unit.f6114a;
            }
            InterfaceC1028a interfaceC1028a = (InterfaceC1028a) AbstractC0755f.d().getService(InterfaceC1028a.class);
            C0953e c0953e = F.f7011a;
            C0809e c0809e = n.f7850a;
            C0072a c0072a = new C0072a(interfaceC1028a, this.$context, this.$intent, null);
            this.label = 2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new a(context, goAsync(), intent, null));
    }
}
