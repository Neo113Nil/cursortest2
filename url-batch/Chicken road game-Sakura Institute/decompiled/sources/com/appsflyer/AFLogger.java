package com.appsflyer;

import androidx.compose.material3.MenuKt;
import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import com.appsflyer.internal.AFg1aSDK;
import com.appsflyer.internal.AFg1fSDK;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\tJ7\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0013J+\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J3\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0015J#\u0010\u0016\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0013J+\u0010\u0016\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u0006J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\tJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010\tJ'\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$JG\u0010'\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010$J!\u0010.\u001a\u00020\u00042\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010,\"\u00020\u0001¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00042\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010,\"\u00020\u0001¢\u0006\u0004\b0\u0010/J'\u00101\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b1\u0010$J'\u00102\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u0010$R\u0017\u00106\u001a\u0006*\u00020303X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b4\u00105R\u0019\u00104\u001a\b\u0012\u0004\u0012\u00020\u000107X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b8\u00105"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFg1fSDK;", "", "debugLogMessage", "", "afDebugLog", "(Ljava/lang/String;)V", "", "shouldRemoteDebug", "(Ljava/lang/String;Z)V", "message", "", "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "afErrorLogForExcManagerOnly", "disableReporting", "logMessage", "afInfoLog", "afLogForce", "rdLogMessage", "afRDLog", "afVerboseLog", "warningLogMessage", "afWarnLog", "Lcom/appsflyer/internal/AFg1aSDK;", "tag", NotificationCompat.CATEGORY_MESSAGE, "d", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;)V", "i", "", "client", "registerClient", "([Lcom/appsflyer/internal/AFg1fSDK;)V", "unregisterClient", "v", "w", "Ljava/util/concurrent/ExecutorService;", "AFInAppEventType", "Lkotlin/Lazy;", "AFInAppEventParameterName", "", "valueOf", "<init>", "()V", "LogLevel"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFLogger extends AFg1fSDK {
    public static final AFLogger INSTANCE = new AFLogger();

    /* renamed from: valueOf, reason: from kotlin metadata */
    private static final Lazy AFInAppEventType = LazyKt.lazy(new Function0<Set<AFg1fSDK>>() { // from class: com.appsflyer.AFLogger.10
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1fSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    });

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    private static final Lazy AFInAppEventParameterName = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.AFLogger.1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    private AFLogger() {
    }

    public final void registerClient(final AFg1fSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new Runnable() { // from class: com.appsflyer.AFLogger$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.AFInAppEventType(client);
            }
        });
    }

    public final void unregisterClient(final AFg1fSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new Runnable() { // from class: com.appsflyer.AFLogger$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.valueOf(client);
            }
        });
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void d(final AFg1aSDK tag, final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1fSDK, Unit>() { // from class: com.appsflyer.AFLogger.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
                valueOf(aFg1fSDK);
                return Unit.INSTANCE;
            }

            public final void valueOf(AFg1fSDK aFg1fSDK) {
                Intrinsics.checkNotNullParameter(aFg1fSDK, "");
                aFg1fSDK.d(AFg1aSDK.this, msg, shouldRemoteDebug);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(final AFg1aSDK tag, final String msg, final Throwable throwable, final boolean printMsg, final boolean printThrowable, final boolean shouldReportToExManager, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1fSDK, Unit>() { // from class: com.appsflyer.AFLogger.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
                valueOf(aFg1fSDK);
                return Unit.INSTANCE;
            }

            public final void valueOf(AFg1fSDK aFg1fSDK) {
                Intrinsics.checkNotNullParameter(aFg1fSDK, "");
                aFg1fSDK.e(AFg1aSDK.this, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void i(final AFg1aSDK tag, final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1fSDK, Unit>() { // from class: com.appsflyer.AFLogger.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void AFInAppEventType(AFg1fSDK aFg1fSDK) {
                Intrinsics.checkNotNullParameter(aFg1fSDK, "");
                aFg1fSDK.i(AFg1aSDK.this, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
                AFInAppEventType(aFg1fSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void w(final AFg1aSDK tag, final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1fSDK, Unit>() { // from class: com.appsflyer.AFLogger.9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void AFInAppEventParameterName(AFg1fSDK aFg1fSDK) {
                Intrinsics.checkNotNullParameter(aFg1fSDK, "");
                aFg1fSDK.w(AFg1aSDK.this, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
                AFInAppEventParameterName(aFg1fSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void v(final AFg1aSDK tag, final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1fSDK, Unit>() { // from class: com.appsflyer.AFLogger.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
                valueOf(aFg1fSDK);
                return Unit.INSTANCE;
            }

            public final void valueOf(AFg1fSDK aFg1fSDK) {
                Intrinsics.checkNotNullParameter(aFg1fSDK, "");
                aFg1fSDK.v(AFg1aSDK.this, msg, shouldRemoteDebug);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void force(final AFg1aSDK tag, final String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1fSDK, Unit>() { // from class: com.appsflyer.AFLogger.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void AFKeystoreWrapper(AFg1fSDK aFg1fSDK) {
                Intrinsics.checkNotNullParameter(aFg1fSDK, "");
                aFg1fSDK.force(AFg1aSDK.this, msg);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1fSDK aFg1fSDK) {
                AFKeystoreWrapper(aFg1fSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(String logMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFg1aSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(String debugLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFg1aSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String message, Throwable ex, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(ex, "");
        AFg1fSDK.e$default(INSTANCE, AFg1aSDK.OTHER, message, ex, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(String warningLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        INSTANCE.w(AFg1aSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afVerboseLog(String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFg1aSDK.OTHER, rdLogMessage, false);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afRDLog(String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFg1aSDK.OTHER, rdLogMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.force()", imports = {}))
    @JvmStatic
    public static final void afLogForce(String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.force(AFg1aSDK.OTHER, logMessage);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFg1aSDK.OTHER, debugLogMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFg1aSDK.OTHER, logMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        String str = errorLogMessage;
        if (str == null || StringsKt.isBlank(str)) {
            errorLogMessage = AbstractJsonLexerKt.NULL;
        }
        String str2 = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, ex, false, false, false, false, MenuKt.InTransitionDuration, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        String str = errorLogMessage;
        if (str == null || StringsKt.isBlank(str)) {
            errorLogMessage = AbstractJsonLexerKt.NULL;
        }
        String str2 = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, ex, false, false, true, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        String str = errorLogMessage;
        if (str == null || StringsKt.isBlank(str)) {
            errorLogMessage = AbstractJsonLexerKt.NULL;
        }
        String str2 = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, ex, false, false, !disableReporting, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        String str = errorLogMessage;
        if (str == null || StringsKt.isBlank(str)) {
            errorLogMessage = AbstractJsonLexerKt.NULL;
        }
        String str2 = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, ex, false, printThrowable, false, false, LocationRequestCompat.QUALITY_LOW_POWER, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        String str = errorLogMessage;
        if (str == null || StringsKt.isBlank(str)) {
            errorLogMessage = AbstractJsonLexerKt.NULL;
        }
        String str2 = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, ex, false, printThrowable, shouldReportToExManager, false, 72, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        AFg1fSDK.w$default(INSTANCE, AFg1aSDK.OTHER, warningLogMessage, false, 4, null);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "values", "I", "getLevel", "()I", "level", "p0", "<init>", "(Ljava/lang/String;II)V", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);


        /* renamed from: values, reason: from kotlin metadata */
        private final int level;

        LogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFg1fSDK[] aFg1fSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1fSDKArr, "");
        Lazy lazy = AFInAppEventType;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            CollectionsKt.addAll((Set) value2, aFg1fSDKArr);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFg1fSDK[] aFg1fSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1fSDKArr, "");
        Lazy lazy = AFInAppEventType;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(ArraysKt.toSet(aFg1fSDKArr));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Lazy lazy = AFInAppEventType;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            Iterator it = ((Set) value2).iterator();
            while (it.hasNext()) {
                function1.invoke((AFg1fSDK) it.next());
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
