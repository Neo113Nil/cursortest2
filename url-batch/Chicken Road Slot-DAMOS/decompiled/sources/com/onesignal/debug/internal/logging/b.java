package com.onesignal.debug.internal.logging;

import a4.j;
import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import ea.f;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import nd.i;
import ua.c;
import ua.d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {
    private static final String TAG = "OneSignal";
    private static f applicationService;
    public static final b INSTANCE = new b();
    private static final CopyOnWriteArraySet<ua.b> logListeners = new CopyOnWriteArraySet<>();
    private static c logLevel = c.WARN;
    private static c visualLogLevel = c.NONE;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends i implements Function1 {
        final /* synthetic */ String $finalFullMessage;
        final /* synthetic */ c $level;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, String str, ld.a aVar) {
            super(1, aVar);
            this.$level = cVar;
            this.$finalFullMessage = str;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return new a(this.$level, this.$finalFullMessage, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            f applicationService = b.INSTANCE.getApplicationService();
            Activity current = applicationService != null ? applicationService.getCurrent() : null;
            if (current != null) {
                new AlertDialog.Builder(current).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
            }
            return Unit.f5554a;
        }
    }

    private b() {
    }

    public static final boolean atLogLevel(c cVar) {
        cVar.getClass();
        return cVar.compareTo(visualLogLevel) < 1 || cVar.compareTo(logLevel) < 1;
    }

    private final void callLogListeners(c cVar, String str, Throwable th) {
        CopyOnWriteArraySet<ua.b> copyOnWriteArraySet = logListeners;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        Iterator<ua.b> it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                i0.j();
            } else {
                new d(cVar, str);
                throw null;
            }
        }
    }

    public static final void debug(String str, Throwable th) {
        str.getClass();
        log(c.DEBUG, str, th);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    public static final void error(String str, Throwable th) {
        str.getClass();
        log(c.ERROR, str, th);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    public static final void fatal(String str, Throwable th) {
        str.getClass();
        log(c.FATAL, str, th);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            th = null;
        }
        fatal(str, th);
    }

    public static final c getLogLevel() {
        return logLevel;
    }

    public static final c getVisualLogLevel() {
        return visualLogLevel;
    }

    public static final void info(String str, Throwable th) {
        str.getClass();
        log(c.INFO, str, th);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    public static final void log(c cVar, String str, Throwable th) {
        cVar.getClass();
        str.getClass();
        String str2 = "[" + Thread.currentThread().getName() + "] " + str;
        b bVar = INSTANCE;
        bVar.logToLogcat(cVar, str2, th);
        bVar.showVisualLogging(cVar, str2, th);
        bVar.callLogListeners(cVar, str2, th);
    }

    private final void logToLogcat(c cVar, String str, Throwable th) {
        if (cVar.compareTo(logLevel) >= 1) {
            return;
        }
        switch (com.onesignal.debug.internal.logging.a.$EnumSwitchMapping$0[cVar.ordinal()]) {
            case 1:
                Log.v(TAG, str, th);
                break;
            case 2:
                Log.d(TAG, str, th);
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                Log.i(TAG, str, th);
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
                Log.w(TAG, str, th);
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                Log.e(TAG, str, th);
                break;
        }
    }

    public static final void setLogLevel(c cVar) {
        cVar.getClass();
        logLevel = cVar;
    }

    public static final void setVisualLogLevel(c cVar) {
        cVar.getClass();
        visualLogLevel = cVar;
    }

    private final void showVisualLogging(c cVar, String str, Throwable th) {
        if (cVar.compareTo(visualLogLevel) >= 1) {
            return;
        }
        try {
            String c10 = kotlin.text.i.c(str + '\n');
            if (th != null) {
                String str2 = c10 + th.getMessage();
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                c10 = str2 + stringWriter;
            }
            com.onesignal.common.threading.b.suspendifyOnMain(new a(cVar, c10, null));
        } catch (Throwable th2) {
            Log.e(TAG, "Error showing logging message.", th2);
        }
    }

    public static final void verbose(String str, Throwable th) {
        str.getClass();
        log(c.VERBOSE, str, th);
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    public static final void warn(String str, Throwable th) {
        str.getClass();
        log(c.WARN, str, th);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    public final void addListener(ua.b bVar) {
        bVar.getClass();
        logListeners.add(bVar);
    }

    public final f getApplicationService() {
        return applicationService;
    }

    public final void removeListener(ua.b bVar) {
        bVar.getClass();
        logListeners.remove(bVar);
    }

    public final void setApplicationService(f fVar) {
        applicationService = fVar;
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }

    public static final void log(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        log(cVar, str, null);
    }
}
