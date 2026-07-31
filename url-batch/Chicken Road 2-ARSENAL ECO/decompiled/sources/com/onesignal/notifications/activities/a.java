package com.onesignal.notifications.activities;

import H1.RunnableC0139m;
import L1.f;
import T1.g;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.threading.b;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public abstract class a extends Activity implements g {

    /* renamed from: com.onesignal.notifications.activities.a$a, reason: collision with other inner class name */
    public static final class C0055a extends q5.g implements InterfaceC0743l {
        int label;

        public C0055a(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(a aVar) {
            AndroidUtils.INSTANCE.finishSafely(aVar);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return a.this.new C0055a(interfaceC0564d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        
            if (r7.processFromContext(r1, r4, r6) == r0) goto L25;
         */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            RunnableC0139m runnableC0139m;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            v vVar = v.f5219a;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    Context applicationContext = a.this.getApplicationContext();
                    i.d(applicationContext, "getApplicationContext(...)");
                    this.label = 1;
                    obj = f.f(applicationContext, this);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        aVar = a.this;
                        runnableC0139m = new RunnableC0139m(12, aVar);
                        aVar.runOnUiThread(runnableC0139m);
                        return vVar;
                    }
                    AbstractC0676f.w(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    aVar = a.this;
                    runnableC0139m = new RunnableC0139m(12, aVar);
                    aVar.runOnUiThread(runnableC0139m);
                    return vVar;
                }
                W2.a aVar2 = (W2.a) f.d().getService(W2.a.class);
                a aVar3 = a.this;
                Intent intent = aVar3.getIntent();
                i.d(intent, "getIntent(...)");
                this.label = 2;
            } catch (Throwable th) {
                a aVar4 = a.this;
                aVar4.runOnUiThread(new RunnableC0139m(12, aVar4));
                throw th;
            }
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((C0055a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent$com_onesignal_notifications();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        i.e(intent, "intent");
        super.onNewIntent(intent);
        processIntent$com_onesignal_notifications();
    }

    public void processIntent$com_onesignal_notifications() {
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        b.suspendifyOnDefault(new C0055a(null));
    }
}
