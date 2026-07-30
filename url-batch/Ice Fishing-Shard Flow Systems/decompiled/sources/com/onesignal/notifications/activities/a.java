package com.onesignal.notifications.activities;

import A.k;
import V5.b;
import X5.j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.AndroidUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n2.AbstractC0755f;
import v2.g;
import y3.InterfaceC1028a;

/* loaded from: classes.dex */
public abstract class a extends Activity implements g {

    /* renamed from: com.onesignal.notifications.activities.a$a, reason: collision with other inner class name */
    public static final class C0055a extends j implements Function1 {
        int label;

        public C0055a(b bVar) {
            super(1, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(a aVar) {
            AndroidUtils.INSTANCE.finishSafely(aVar);
        }

        @Override // X5.a
        public final b create(b bVar) {
            return a.this.new C0055a(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(b bVar) {
            return ((C0055a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            if (r6.processFromContext(r1, r3, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        
            if (r6 == r0) goto L19;
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
                Context applicationContext = a.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = AbstractC0755f.f(applicationContext, this);
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    a aVar2 = a.this;
                    aVar2.runOnUiThread(new k(13, aVar2));
                    return Unit.f6114a;
                }
                V6.b.P(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return Unit.f6114a;
            }
            InterfaceC1028a interfaceC1028a = (InterfaceC1028a) AbstractC0755f.d().getService(InterfaceC1028a.class);
            a aVar3 = a.this;
            Intent intent = aVar3.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            this.label = 2;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent$com_onesignal_notifications();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        processIntent$com_onesignal_notifications();
    }

    public void processIntent$com_onesignal_notifications() {
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        com.onesignal.common.threading.b.suspendifyOnDefault(new C0055a(null));
    }
}
