package com.onesignal.notifications.internal.restoration.impl;

import B0.c;
import L1.f;
import Q2.e;
import a3.InterfaceC0226b;
import a3.InterfaceC0227c;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.debug.internal.logging.b;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import l0.l;
import l0.o;
import l0.r;
import l0.w;
import m0.k;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class NotificationRestoreWorkManager implements InterfaceC0227c {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private final Object lock = new Object();
    private boolean restored;

    public static final class NotificationRestoreWorker extends CoroutineWorker {

        public static final class a extends AbstractC0607c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(InterfaceC0564d interfaceC0564d) {
                super(interfaceC0564d);
            }

            @Override // q5.AbstractC0605a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationRestoreWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            i.e(context, "context");
            i.e(workerParams, "workerParams");
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        
            if (r6.process(r0) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
        
            if (r6 == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(InterfaceC0564d interfaceC0564d) {
            a aVar;
            Object obj;
            int i7;
            Context applicationContext;
            if (interfaceC0564d instanceof a) {
                aVar = (a) interfaceC0564d;
                int i8 = aVar.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i8 - Integer.MIN_VALUE;
                    obj = aVar.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = aVar.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        applicationContext = getApplicationContext();
                        i.d(applicationContext, "getApplicationContext(...)");
                        aVar.L$0 = applicationContext;
                        aVar.label = 1;
                        obj = f.f(applicationContext, aVar);
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0676f.w(obj);
                            return o.a();
                        }
                        applicationContext = (Context) aVar.L$0;
                        AbstractC0676f.w(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        b.warn$default("NotificationRestoreWorker skipped due to failed OneSignal init", null, 2, null);
                        return o.a();
                    }
                    if (!e.areNotificationsEnabled$default(e.INSTANCE, applicationContext, null, 2, null)) {
                        b.debug$default("NotificationRestoreWorker failed: Notifications disabled", null, 2, null);
                        return new l();
                    }
                    InterfaceC0226b interfaceC0226b = (InterfaceC0226b) f.d().getService(InterfaceC0226b.class);
                    aVar.L$0 = null;
                    aVar.label = 2;
                }
            }
            aVar = new a(interfaceC0564d);
            obj = aVar.result;
            EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
            i7 = aVar.label;
            if (i7 != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    @Override // a3.InterfaceC0227c
    public void beginEnqueueingWork(Context context, boolean z5) {
        i.e(context, "context");
        synchronized (this.lock) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            int i7 = z5 ? 15 : 0;
            c cVar = new c(NotificationRestoreWorker.class);
            long j4 = i7;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.B(j4);
            r f7 = cVar.f();
            w iVar = Q2.i.INSTANCE.getInstance(context);
            String str = NOTIFICATION_RESTORE_WORKER_IDENTIFIER;
            iVar.getClass();
            new k((m0.o) iVar, str, Collections.singletonList(f7)).H();
        }
    }
}
