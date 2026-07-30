package com.onesignal.debug.internal.logging;

import E3.e;
import E3.o;
import R5.C0164d;
import X5.j;
import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import n6.m0;
import v2.f;

/* loaded from: classes.dex */
public final class b {
    private static final String TAG = "OneSignal";
    private static f applicationService;
    private static volatile e otelRemoteTelemetry;
    public static final b INSTANCE = new b();
    private static final CopyOnWriteArraySet<K2.b> logListeners = new CopyOnWriteArraySet<>();
    private static volatile Function1<? super K2.c, Boolean> shouldSendLogLevel = c.INSTANCE;
    private static final InterfaceC0789w otelLoggingScope = AbstractC0792z.b(kotlin.coroutines.e.c(new m0(), F.f7011a));
    private static K2.c logLevel = K2.c.WARN;
    private static K2.c visualLogLevel = K2.c.NONE;

    public static final class a extends j implements Function2 {
        final /* synthetic */ K2.c $level;
        final /* synthetic */ String $message;
        final /* synthetic */ e $telemetry;
        final /* synthetic */ Throwable $throwable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, K2.c cVar, String str, Throwable th, V5.b bVar) {
            super(2, bVar);
            this.$telemetry = eVar;
            this.$level = cVar;
            this.$message = str;
            this.$throwable = th;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new a(this.$telemetry, this.$level, this.$message, this.$throwable, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    o oVar = o.f699a;
                    e eVar = this.$telemetry;
                    String name = this.$level.name();
                    String str = this.$message;
                    Throwable th = this.$throwable;
                    String name2 = th != null ? th.getClass().getName() : null;
                    Throwable th2 = this.$throwable;
                    String message = th2 != null ? th2.getMessage() : null;
                    Throwable th3 = this.$throwable;
                    String b7 = th3 != null ? C0164d.b(th3) : null;
                    this.label = 1;
                    if (oVar.a(eVar, name, str, name2, message, b7, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
            } catch (Throwable th4) {
                Log.e("OneSignal", "Failed to log to Otel: " + th4.getMessage(), th4);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((a) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* renamed from: com.onesignal.debug.internal.logging.b$b, reason: collision with other inner class name */
    public static final class C0027b extends p implements Function1 {
        public static final C0027b INSTANCE = new C0027b();

        public C0027b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(K2.c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    public static final class c extends p implements Function1 {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(K2.c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    public static final class d extends j implements Function1 {
        final /* synthetic */ String $finalFullMessage;
        final /* synthetic */ K2.c $level;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(K2.c cVar, String str, V5.b bVar) {
            super(1, bVar);
            this.$level = cVar;
            this.$finalFullMessage = str;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new d(this.$level, this.$finalFullMessage, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            f applicationService = b.INSTANCE.getApplicationService();
            Activity current = applicationService != null ? applicationService.getCurrent() : null;
            if (current != null) {
                new AlertDialog.Builder(current).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
            }
            return Unit.f6114a;
        }
    }

    private b() {
    }

    public static final boolean atLogLevel(K2.c level) {
        Intrinsics.checkNotNullParameter(level, "level");
        return level.compareTo(visualLogLevel) < 1 || level.compareTo(logLevel) < 1;
    }

    private final void callLogListeners(K2.c cVar, String str, Throwable th) {
        CopyOnWriteArraySet<K2.b> copyOnWriteArraySet = logListeners;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        Iterator<K2.b> it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            new K2.d(cVar, str);
            throw null;
        }
    }

    public static final void debug(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(K2.c.DEBUG, message, th);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    public static final void error(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(K2.c.ERROR, message, th);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    public static final void fatal(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(K2.c.FATAL, message, th);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        fatal(str, th);
    }

    public static final K2.c getLogLevel() {
        return logLevel;
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static final K2.c getVisualLogLevel() {
        return visualLogLevel;
    }

    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }

    public static final void info(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(K2.c.INFO, message, th);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    public static final void log(K2.c level, String message) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        log(level, message, null);
    }

    private final void logToLogcat(K2.c cVar, String str, Throwable th) {
        if (cVar.compareTo(logLevel) >= 1) {
            return;
        }
        switch (com.onesignal.debug.internal.logging.a.$EnumSwitchMapping$0[cVar.ordinal()]) {
            case 1:
                Log.v("OneSignal", str, th);
                break;
            case 2:
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

    private final void logToOtel(K2.c cVar, String str, Throwable th) {
        e eVar = otelRemoteTelemetry;
        if (eVar == null || cVar == K2.c.NONE || !((Boolean) shouldSendLogLevel.invoke(cVar)).booleanValue()) {
            return;
        }
        AbstractC0792z.l(otelLoggingScope, null, new a(eVar, cVar, str, th, null), 3);
    }

    public static final void setLogLevel(K2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        logLevel = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOtelTelemetry$default(b bVar, e eVar, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = C0027b.INSTANCE;
        }
        bVar.setOtelTelemetry(eVar, function1);
    }

    public static final void setVisualLogLevel(K2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        visualLogLevel = cVar;
    }

    private final void showVisualLogging(K2.c cVar, String str, Throwable th) {
        if (cVar.compareTo(visualLogLevel) >= 1) {
            return;
        }
        try {
            String b7 = kotlin.text.j.b(str + '\n');
            if (th != null) {
                String str2 = b7 + th.getMessage();
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                b7 = str2 + stringWriter;
            }
            com.onesignal.common.threading.b.suspendifyOnMain(new d(cVar, b7, null));
        } catch (Throwable th2) {
            Log.e("OneSignal", "Error showing logging message.", th2);
        }
    }

    public static final void verbose(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(K2.c.VERBOSE, message, th);
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    public static final void warn(String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(K2.c.WARN, message, th);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    public final void addListener(K2.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        logListeners.add(listener);
    }

    public final f getApplicationService() {
        return applicationService;
    }

    public final void removeListener(K2.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        logListeners.remove(listener);
    }

    public final void setApplicationService(f fVar) {
        applicationService = fVar;
    }

    public final void setOtelTelemetry(e eVar, Function1<? super K2.c, Boolean> shouldSend) {
        Intrinsics.checkNotNullParameter(shouldSend, "shouldSend");
        otelRemoteTelemetry = eVar;
        shouldSendLogLevel = shouldSend;
    }

    public static final void log(K2.c level, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = "[" + Thread.currentThread().getName() + "] " + message;
        b bVar = INSTANCE;
        bVar.logToLogcat(level, str, th);
        bVar.showVisualLogging(level, str, th);
        bVar.callLogListeners(level, str, th);
        bVar.logToOtel(level, str, th);
    }
}
