package com.onesignal.notifications.internal.restoration.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bc.e;
import bc.h;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.b;
import lc.c;
import t5.j;
import t5.m;
import t5.p;
import t5.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class NotificationRestoreWorkManager implements c {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private boolean restored;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/onesignal/notifications/internal/restoration/impl/NotificationRestoreWorkManager$NotificationRestoreWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lt5/m;", "doWork", "(Lld/a;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotificationRestoreWorker extends CoroutineWorker {

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends nd.c {
            int label;
            /* synthetic */ Object result;

            public a(ld.a aVar) {
                super(aVar);
            }

            @Override // nd.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationRestoreWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            context.getClass();
            workerParameters.getClass();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(ld.a aVar) {
            a aVar2;
            int i3;
            if (aVar instanceof a) {
                aVar2 = (a) aVar;
                int i10 = aVar2.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar2.label = i10 - Integer.MIN_VALUE;
                    Object obj = aVar2.result;
                    md.a aVar3 = md.a.f6622d;
                    i3 = aVar2.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        Context applicationContext = getApplicationContext();
                        applicationContext.getClass();
                        if (!v9.c.b(applicationContext)) {
                            return m.a();
                        }
                        if (!e.areNotificationsEnabled$default(e.INSTANCE, applicationContext, null, 2, null)) {
                            return new j();
                        }
                        b bVar = (b) v9.c.a().getService(b.class);
                        aVar2.label = 1;
                        if (bVar.process(aVar2) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i3 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                    }
                    return m.a();
                }
            }
            aVar2 = new a(aVar);
            Object obj2 = aVar2.result;
            md.a aVar32 = md.a.f6622d;
            i3 = aVar2.label;
            if (i3 != 0) {
            }
            return m.a();
        }
    }

    @Override // lc.c
    public void beginEnqueueingWork(Context context, boolean z10) {
        context.getClass();
        synchronized (Boolean.valueOf(this.restored)) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            int i3 = z10 ? 15 : 0;
            p.e eVar = new p.e(NotificationRestoreWorker.class);
            eVar.k(i3);
            p d10 = eVar.d();
            u hVar = h.INSTANCE.getInstance(context);
            String str = NOTIFICATION_RESTORE_WORKER_IDENTIFIER;
            hVar.getClass();
            new u5.j((u5.m) hVar, str, Collections.singletonList(d10)).a();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
