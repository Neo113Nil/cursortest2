package com.onesignal.notifications.receivers;

import H5.F;
import H5.InterfaceC0163x;
import I5.e;
import L1.f;
import M5.o;
import O5.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.onesignal.debug.internal.logging.b;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class NotificationDismissReceiver extends BroadcastReceiver {

    public static final class a extends g implements InterfaceC0743l {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* renamed from: com.onesignal.notifications.receivers.NotificationDismissReceiver$a$a, reason: collision with other inner class name */
        public static final class C0072a extends g implements InterfaceC0747p {
            final /* synthetic */ Context $context;
            final /* synthetic */ Intent $intent;
            final /* synthetic */ W2.a $notificationOpenedProcessor;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0072a(W2.a aVar, Context context, Intent intent, InterfaceC0564d interfaceC0564d) {
                super(2, interfaceC0564d);
                this.$notificationOpenedProcessor = aVar;
                this.$context = context;
                this.$intent = intent;
            }

            @Override // q5.AbstractC0605a
            public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
                return new C0072a(this.$notificationOpenedProcessor, this.$context, this.$intent, interfaceC0564d);
            }

            @Override // x5.InterfaceC0747p
            public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
                return ((C0072a) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
            }

            @Override // q5.AbstractC0605a
            public final Object invokeSuspend(Object obj) {
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                int i7 = this.label;
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    W2.a aVar = this.$notificationOpenedProcessor;
                    Context context = this.$context;
                    Intent intent = this.$intent;
                    this.label = 1;
                    if (aVar.processFromContext(context, intent, this) == enumC0580a) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BroadcastReceiver.PendingResult pendingResult, Intent intent, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$context = context;
            this.$pendingResult = pendingResult;
            this.$intent = intent;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new a(this.$context, this.$pendingResult, this.$intent, interfaceC0564d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        
            if (H5.AbstractC0165z.t(r3, r5, r8) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
        
            if (r9 == r0) goto L21;
         */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            v vVar = v.f5219a;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                Context applicationContext = this.$context.getApplicationContext();
                i.d(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = f.f(applicationContext, this);
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    BroadcastReceiver.PendingResult pendingResult = this.$pendingResult;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    return vVar;
                }
                AbstractC0676f.w(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                b.warn$default("NotificationOpenedReceiver skipped due to failed OneSignal init", null, 2, null);
                BroadcastReceiver.PendingResult pendingResult2 = this.$pendingResult;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                    return vVar;
                }
                return vVar;
            }
            W2.a aVar = (W2.a) f.d().getService(W2.a.class);
            d dVar = F.f1027a;
            e eVar = o.f1618a;
            C0072a c0072a = new C0072a(aVar, this.$context, this.$intent, null);
            this.label = 2;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnIO(new a(context, goAsync(), intent, null));
    }
}
