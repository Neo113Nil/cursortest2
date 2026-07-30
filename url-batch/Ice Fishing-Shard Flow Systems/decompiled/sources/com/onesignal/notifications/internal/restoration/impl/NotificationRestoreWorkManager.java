package com.onesignal.notifications.internal.restoration.impl;

import C3.c;
import D0.j;
import G0.B;
import G0.n;
import G0.p;
import G0.q;
import G0.u;
import H0.k;
import V5.b;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n2.AbstractC0755f;
import s3.e;
import s3.i;

/* loaded from: classes.dex */
public final class NotificationRestoreWorkManager implements c {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private final Object lock = new Object();
    private boolean restored;

    @Metadata
    public static final class NotificationRestoreWorker extends CoroutineWorker {

        public static final class a extends X5.c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(b bVar) {
                super(bVar);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationRestoreWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
        
            if (r7.process(r0) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
        
            if (r7 == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(b bVar) {
            a aVar;
            Object obj;
            int i2;
            Context applicationContext;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i5 = aVar.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i5 - Integer.MIN_VALUE;
                    obj = aVar.result;
                    W5.a aVar2 = W5.a.f2787d;
                    i2 = aVar.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        applicationContext = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        aVar.L$0 = applicationContext;
                        aVar.label = 1;
                        obj = AbstractC0755f.f(applicationContext, aVar);
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            V6.b.P(obj);
                            p a7 = q.a();
                            Intrinsics.checkNotNullExpressionValue(a7, "success(...)");
                            return a7;
                        }
                        applicationContext = (Context) aVar.L$0;
                        V6.b.P(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        com.onesignal.debug.internal.logging.b.warn$default("NotificationRestoreWorker skipped due to failed OneSignal init", null, 2, null);
                        p a8 = q.a();
                        Intrinsics.checkNotNullExpressionValue(a8, "success(...)");
                        return a8;
                    }
                    if (!e.areNotificationsEnabled$default(e.INSTANCE, applicationContext, null, 2, null)) {
                        com.onesignal.debug.internal.logging.b.debug$default("NotificationRestoreWorker failed: Notifications disabled", null, 2, null);
                        n nVar = new n();
                        Intrinsics.checkNotNullExpressionValue(nVar, "failure(...)");
                        return nVar;
                    }
                    C3.b bVar2 = (C3.b) AbstractC0755f.d().getService(C3.b.class);
                    aVar.L$0 = null;
                    aVar.label = 2;
                }
            }
            aVar = new a(bVar);
            obj = aVar.result;
            W5.a aVar22 = W5.a.f2787d;
            i2 = aVar.label;
            if (i2 != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // C3.c
    public void beginEnqueueingWork(Context context, boolean z7) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this.lock) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            Unit unit = Unit.f6114a;
            int i2 = z7 ? 15 : 0;
            j jVar = new j(NotificationRestoreWorker.class);
            long j = i2;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            jVar.c0(j);
            u z8 = jVar.z();
            B iVar = i.INSTANCE.getInstance(context);
            String str = NOTIFICATION_RESTORE_WORKER_IDENTIFIER;
            iVar.getClass();
            new k((H0.p) iVar, str, Collections.singletonList(z8)).d0();
        }
    }
}
