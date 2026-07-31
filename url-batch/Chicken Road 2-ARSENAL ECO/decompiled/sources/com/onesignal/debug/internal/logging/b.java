package com.onesignal.debug.internal.logging;

import F5.k;
import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import H5.n0;
import T1.f;
import a1.AbstractC0223a;
import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import c3.e;
import c3.o;
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class b {
    private static final String TAG = "OneSignal";
    private static f applicationService;
    private static volatile e otelRemoteTelemetry;
    public static final b INSTANCE = new b();
    private static final CopyOnWriteArraySet<i2.b> logListeners = new CopyOnWriteArraySet<>();
    private static volatile InterfaceC0743l shouldSendLogLevel = c.INSTANCE;
    private static final InterfaceC0163x otelLoggingScope = AbstractC0165z.b(AbstractC0223a.D(new n0(), F.f1027a));
    private static i2.c logLevel = i2.c.WARN;
    private static i2.c visualLogLevel = i2.c.NONE;

    public static final class a extends g implements InterfaceC0747p {
        final /* synthetic */ i2.c $level;
        final /* synthetic */ String $message;
        final /* synthetic */ e $telemetry;
        final /* synthetic */ Throwable $throwable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, i2.c cVar, String str, Throwable th, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$telemetry = eVar;
            this.$level = cVar;
            this.$message = str;
            this.$throwable = th;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new a(this.$telemetry, this.$level, this.$message, this.$throwable, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    o oVar = o.f3806a;
                    e eVar = this.$telemetry;
                    String name = this.$level.name();
                    String str = this.$message;
                    Throwable th = this.$throwable;
                    String name2 = th != null ? th.getClass().getName() : null;
                    Throwable th2 = this.$throwable;
                    String message = th2 != null ? th2.getMessage() : null;
                    Throwable th3 = this.$throwable;
                    String y = th3 != null ? i6.g.y(th3) : null;
                    this.label = 1;
                    if (oVar.a(eVar, name, str, name2, message, y, this) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
            } catch (Throwable th4) {
                Log.e("OneSignal", "Failed to log to Otel: " + th4.getMessage(), th4);
            }
            return v.f5219a;
        }
    }

    /* renamed from: com.onesignal.debug.internal.logging.b$b, reason: collision with other inner class name */
    public static final class C0027b extends j implements InterfaceC0743l {
        public static final C0027b INSTANCE = new C0027b();

        public C0027b() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final Boolean invoke(i2.c it) {
            i.e(it, "it");
            return Boolean.FALSE;
        }
    }

    public static final class c extends j implements InterfaceC0743l {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final Boolean invoke(i2.c it) {
            i.e(it, "it");
            return Boolean.FALSE;
        }
    }

    public static final class d extends g implements InterfaceC0743l {
        final /* synthetic */ String $finalFullMessage;
        final /* synthetic */ i2.c $level;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i2.c cVar, String str, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$level = cVar;
            this.$finalFullMessage = str;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new d(this.$level, this.$finalFullMessage, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            f applicationService = b.INSTANCE.getApplicationService();
            Activity current = applicationService != null ? applicationService.getCurrent() : null;
            if (current != null) {
                new AlertDialog.Builder(current).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((d) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    private b() {
    }

    public static final boolean atLogLevel(i2.c level) {
        i.e(level, "level");
        return level.compareTo(visualLogLevel) < 1 || level.compareTo(logLevel) < 1;
    }

    private final void callLogListeners(i2.c cVar, String str, Throwable th) {
        CopyOnWriteArraySet<i2.b> copyOnWriteArraySet = logListeners;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        Iterator<i2.b> it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            new i2.d(cVar, str);
            throw null;
        }
    }

    public static final void debug(String message, Throwable th) {
        i.e(message, "message");
        log(i2.c.DEBUG, message, th);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    public static final void error(String message, Throwable th) {
        i.e(message, "message");
        log(i2.c.ERROR, message, th);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    public static final void fatal(String message, Throwable th) {
        i.e(message, "message");
        log(i2.c.FATAL, message, th);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th = null;
        }
        fatal(str, th);
    }

    public static final i2.c getLogLevel() {
        return logLevel;
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static final i2.c getVisualLogLevel() {
        return visualLogLevel;
    }

    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }

    public static final void info(String message, Throwable th) {
        i.e(message, "message");
        log(i2.c.INFO, message, th);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    public static final void log(i2.c level, String message) {
        i.e(level, "level");
        i.e(message, "message");
        log(level, message, null);
    }

    private final void logToLogcat(i2.c cVar, String str, Throwable th) {
        if (cVar.compareTo(logLevel) >= 1) {
            return;
        }
        switch (com.onesignal.debug.internal.logging.a.$EnumSwitchMapping$0[cVar.ordinal()]) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Log.v("OneSignal", str, th);
                break;
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                Log.d("OneSignal", str, th);
                break;
            case 3:
                Log.i("OneSignal", str, th);
                break;
            case 4:
                Log.w("OneSignal", str, th);
                break;
            case 5:
            case 6:
                Log.e("OneSignal", str, th);
                break;
        }
    }

    private final void logToOtel(i2.c cVar, String str, Throwable th) {
        e eVar = otelRemoteTelemetry;
        if (eVar == null || cVar == i2.c.NONE || !((Boolean) shouldSendLogLevel.invoke(cVar)).booleanValue()) {
            return;
        }
        AbstractC0165z.l(otelLoggingScope, null, new a(eVar, cVar, str, th, null), 3);
    }

    public static final void setLogLevel(i2.c cVar) {
        i.e(cVar, "<set-?>");
        logLevel = cVar;
    }

    public static /* synthetic */ void setOtelTelemetry$default(b bVar, e eVar, InterfaceC0743l interfaceC0743l, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            interfaceC0743l = C0027b.INSTANCE;
        }
        bVar.setOtelTelemetry(eVar, interfaceC0743l);
    }

    public static final void setVisualLogLevel(i2.c cVar) {
        i.e(cVar, "<set-?>");
        visualLogLevel = cVar;
    }

    private final void showVisualLogging(i2.c cVar, String str, Throwable th) {
        if (cVar.compareTo(visualLogLevel) >= 1) {
            return;
        }
        try {
            String y = k.y(str + '\n');
            if (th != null) {
                String str2 = y + th.getMessage();
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                y = str2 + stringWriter;
            }
            com.onesignal.common.threading.b.suspendifyOnMain(new d(cVar, y, null));
        } catch (Throwable th2) {
            Log.e("OneSignal", "Error showing logging message.", th2);
        }
    }

    public static final void verbose(String message, Throwable th) {
        i.e(message, "message");
        log(i2.c.VERBOSE, message, th);
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    public static final void warn(String message, Throwable th) {
        i.e(message, "message");
        log(i2.c.WARN, message, th);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    public final void addListener(i2.b listener) {
        i.e(listener, "listener");
        logListeners.add(listener);
    }

    public final f getApplicationService() {
        return applicationService;
    }

    public final void removeListener(i2.b listener) {
        i.e(listener, "listener");
        logListeners.remove(listener);
    }

    public final void setApplicationService(f fVar) {
        applicationService = fVar;
    }

    public final void setOtelTelemetry(e eVar, InterfaceC0743l shouldSend) {
        i.e(shouldSend, "shouldSend");
        otelRemoteTelemetry = eVar;
        shouldSendLogLevel = shouldSend;
    }

    public static final void log(i2.c level, String message, Throwable th) {
        i.e(level, "level");
        i.e(message, "message");
        String str = "[" + Thread.currentThread().getName() + "] " + message;
        b bVar = INSTANCE;
        bVar.logToLogcat(level, str, th);
        bVar.showVisualLogging(level, str, th);
        bVar.callLogListeners(level, str, th);
        bVar.logToOtel(level, str, th);
    }
}
