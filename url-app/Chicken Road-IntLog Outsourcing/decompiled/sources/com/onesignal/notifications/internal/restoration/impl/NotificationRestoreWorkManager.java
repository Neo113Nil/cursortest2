package com.onesignal.notifications.internal.restoration.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.common.OSWorkManagerHelper;
import com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor;
import com.onesignal.notifications.internal.restoration.INotificationRestoreWorkManager;
import e5.g;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import s0.n;
import s0.q;
import s0.t;
import s0.y;
import t0.k;
import t0.o;

/* loaded from: classes.dex */
public final class NotificationRestoreWorkManager implements INotificationRestoreWorkManager {
    public static final Companion Companion = new Companion(null);
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private final Object lock = new Object();
    private boolean restored;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class NotificationRestoreWorker extends CoroutineWorker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            i.e(context, "context");
            i.e(workerParams, "workerParams");
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(InterfaceC1218d interfaceC1218d) {
            NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1 notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1;
            Object obj;
            int i2;
            Context applicationContext;
            if (interfaceC1218d instanceof NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1) {
                notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1 = (NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1) interfaceC1218d;
                int i3 = notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label = i3 - Integer.MIN_VALUE;
                    obj = notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label;
                    if (i2 != 0) {
                        g.y(obj);
                        applicationContext = getApplicationContext();
                        i.d(applicationContext, "getApplicationContext(...)");
                        notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.L$0 = applicationContext;
                        notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label = 1;
                        obj = OneSignal.initWithContext(applicationContext, notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            g.y(obj);
                            return q.a();
                        }
                        applicationContext = (Context) notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.L$0;
                        g.y(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Logging.warn$default("NotificationRestoreWorker skipped due to failed OneSignal init", null, 2, null);
                        return q.a();
                    }
                    if (!NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, applicationContext, null, 2, null)) {
                        Logging.debug$default("NotificationRestoreWorker failed: Notifications disabled", null, 2, null);
                        return new n();
                    }
                    INotificationRestoreProcessor iNotificationRestoreProcessor = (INotificationRestoreProcessor) OneSignal.INSTANCE.getServices().getService(INotificationRestoreProcessor.class);
                    notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.L$0 = null;
                    notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label = 2;
                    if (iNotificationRestoreProcessor.process(notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    return q.a();
                }
            }
            notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1 = new NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1(this, interfaceC1218d);
            obj = notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.result;
            EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
            i2 = notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label;
            if (i2 != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    @Override // com.onesignal.notifications.internal.restoration.INotificationRestoreWorkManager
    public void beginEnqueueingWork(Context context, boolean z) {
        i.e(context, "context");
        synchronized (this.lock) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            int i2 = z ? 15 : 0;
            B4.i iVar = new B4.i(NotificationRestoreWorker.class);
            iVar.S(i2, TimeUnit.SECONDS);
            t w3 = iVar.w();
            y oSWorkManagerHelper = OSWorkManagerHelper.INSTANCE.getInstance(context);
            String str = NOTIFICATION_RESTORE_WORKER_IDENTIFIER;
            oSWorkManagerHelper.getClass();
            new k((o) oSWorkManagerHelper, str, Collections.singletonList(w3)).E();
        }
    }
}
