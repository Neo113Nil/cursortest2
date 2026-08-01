package com.onesignal.notifications.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.d0;
import cf.c;
import com.onesignal.common.AndroidUtils;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import nd.i;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a extends Activity {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.activities.a$a, reason: collision with other inner class name */
    public static final class C0047a extends i implements Function1 {
        int label;

        public C0047a(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return a.this.new C0047a(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((C0047a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                c.M(obj);
                hc.a aVar2 = (hc.a) v9.c.a().getService(hc.a.class);
                a aVar3 = a.this;
                Intent intent = aVar3.getIntent();
                intent.getClass();
                this.label = 1;
                if (aVar2.processFromContext(aVar3, intent, this) == aVar) {
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

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent$com_onesignal_notifications();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        processIntent$com_onesignal_notifications();
    }

    public void processIntent$com_onesignal_notifications() {
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        if (v9.c.b(applicationContext)) {
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new C0047a(null), new b(), 1, (Object) null);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function0 {
        public b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(a aVar) {
            aVar.getClass();
            AndroidUtils.INSTANCE.finishSafely(aVar);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m12invoke() {
            a aVar = a.this;
            aVar.runOnUiThread(new d0(7, aVar));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m12invoke();
            return Unit.f5554a;
        }
    }
}
