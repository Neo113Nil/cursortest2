package com.onesignal.notifications.activities;

import D.RunnableC0281a;
import E7.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bumptech.glide.f;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.threading.c;
import q7.v;
import t4.g;
import v5.InterfaceC5128a;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public abstract class a extends Activity implements g {

    /* renamed from: com.onesignal.notifications.activities.a$a, reason: collision with other inner class name */
    public static final class C0224a extends h implements l {
        int label;

        public C0224a(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(a aVar) {
            AndroidUtils.INSTANCE.finishSafely(aVar);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return a.this.new C0224a(interfaceC5133d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            if (r7.processFromContext(r1, r4, r6) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        
            if (r7 == r0) goto L18;
         */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            v vVar = v.f40183a;
            if (i == 0) {
                f.r(obj);
                Context applicationContext = a.this.getApplicationContext();
                kotlin.jvm.internal.h.d(applicationContext, "getApplicationContext(...)");
                this.label = 1;
                obj = l4.g.b(applicationContext, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                    a aVar = a.this;
                    aVar.runOnUiThread(new RunnableC0281a(21, aVar));
                    return vVar;
                }
                f.r(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return vVar;
            }
            InterfaceC5128a interfaceC5128a = (InterfaceC5128a) l4.g.a().getService(InterfaceC5128a.class);
            a aVar2 = a.this;
            Intent intent = aVar2.getIntent();
            kotlin.jvm.internal.h.d(intent, "getIntent(...)");
            this.label = 2;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((C0224a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent$com_onesignal_notifications();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.onNewIntent(intent);
        processIntent$com_onesignal_notifications();
    }

    public void processIntent$com_onesignal_notifications() {
        c.suspendifyOnDefault(new C0224a(null));
    }
}
