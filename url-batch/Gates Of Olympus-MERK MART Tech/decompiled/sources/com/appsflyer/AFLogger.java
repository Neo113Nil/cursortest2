package com.appsflyer;

import androidx.core.location.LocationRequestCompat;
import com.appsflyer.internal.AFg1jSDK;
import com.appsflyer.internal.AFg1pSDK;
import com.google.firebase.analytics.FirebaseAnalytics;
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

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u00011B\t\b\u0002¢\u0006\u0004\b/\u00100J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\tJ7\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000e\u0010\u0010J+\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u0011J3\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u0012J#\u0010\u0013\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0010J+\u0010\u0013\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0006J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\tJ'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\u001bJ!\u0010$\u001a\u00020\u00042\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010#\"\u00020\u0001¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\u00042\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010#\"\u00020\u0001¢\u0006\u0004\b&\u0010%J'\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\u001bJ'\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010\u001bR\u0017\u0010,\u001a\u0006*\u00020)0)X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b*\u0010+R\u0019\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010-X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b.\u0010+"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFg1pSDK;", "", "p0", "", "afDebugLog", "(Ljava/lang/String;)V", "", "p1", "(Ljava/lang/String;Z)V", "", "p2", "p3", "p4", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "afErrorLogForExcManagerOnly", "afInfoLog", "afLogForce", "afRDLog", "afVerboseLog", "afWarnLog", "Lcom/appsflyer/internal/AFg1jSDK;", "d", "(Lcom/appsflyer/internal/AFg1jSDK;Ljava/lang/String;Z)V", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFg1jSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1jSDK;Ljava/lang/String;)V", "i", "", "registerClient", "([Lcom/appsflyer/internal/AFg1pSDK;)V", "unregisterClient", "v", "w", "Ljava/util/concurrent/ExecutorService;", "values", "Lkotlin/Lazy;", "AFInAppEventParameterName", "", "AFKeystoreWrapper", "<init>", "()V", "LogLevel"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFLogger extends AFg1pSDK {
    public static final AFLogger INSTANCE = new AFLogger();
    private static final Lazy AFKeystoreWrapper = LazyKt.lazy(new Function0<Set<AFg1pSDK>>() { // from class: com.appsflyer.AFLogger.8
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1pSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    });

    /* renamed from: values, reason: from kotlin metadata */
    private static final Lazy AFInAppEventParameterName = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.AFLogger.5
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    private AFLogger() {
    }

    public final void registerClient(final AFg1pSDK... p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new Runnable() { // from class: com.appsflyer.AFLogger$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.values(p0);
            }
        });
    }

    public final void unregisterClient(final AFg1pSDK... p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new Runnable() { // from class: com.appsflyer.AFLogger$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.AFKeystoreWrapper(p0);
            }
        });
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void d(final AFg1jSDK p0, final String p1, final boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1pSDK, Unit>() { // from class: com.appsflyer.AFLogger.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1pSDK aFg1pSDK) {
                values(aFg1pSDK);
                return Unit.INSTANCE;
            }

            public final void values(AFg1pSDK aFg1pSDK) {
                Intrinsics.checkNotNullParameter(aFg1pSDK, "");
                aFg1pSDK.d(AFg1jSDK.this, p1, p2);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void e(final AFg1jSDK p0, final String p1, final Throwable p2, final boolean p3, final boolean p4, final boolean p5, final boolean p6) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1pSDK, Unit>() { // from class: com.appsflyer.AFLogger.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1pSDK aFg1pSDK) {
                AFKeystoreWrapper(aFg1pSDK);
                return Unit.INSTANCE;
            }

            public final void AFKeystoreWrapper(AFg1pSDK aFg1pSDK) {
                Intrinsics.checkNotNullParameter(aFg1pSDK, "");
                aFg1pSDK.e(AFg1jSDK.this, p1, p2, p3, p4, p5, p6);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void i(final AFg1jSDK p0, final String p1, final boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1pSDK, Unit>() { // from class: com.appsflyer.AFLogger.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void AFKeystoreWrapper(AFg1pSDK aFg1pSDK) {
                Intrinsics.checkNotNullParameter(aFg1pSDK, "");
                aFg1pSDK.i(AFg1jSDK.this, p1, p2);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1pSDK aFg1pSDK) {
                AFKeystoreWrapper(aFg1pSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void w(final AFg1jSDK p0, final String p1, final boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1pSDK, Unit>() { // from class: com.appsflyer.AFLogger.10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1pSDK aFg1pSDK) {
                values(aFg1pSDK);
                return Unit.INSTANCE;
            }

            public final void values(AFg1pSDK aFg1pSDK) {
                Intrinsics.checkNotNullParameter(aFg1pSDK, "");
                aFg1pSDK.w(AFg1jSDK.this, p1, p2);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void v(final AFg1jSDK p0, final String p1, final boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1pSDK, Unit>() { // from class: com.appsflyer.AFLogger.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1pSDK aFg1pSDK) {
                values(aFg1pSDK);
                return Unit.INSTANCE;
            }

            public final void values(AFg1pSDK aFg1pSDK) {
                Intrinsics.checkNotNullParameter(aFg1pSDK, "");
                aFg1pSDK.v(AFg1jSDK.this, p1, p2);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void force(final AFg1jSDK p0, final String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1pSDK, Unit>() { // from class: com.appsflyer.AFLogger.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void AFKeystoreWrapper(AFg1pSDK aFg1pSDK) {
                Intrinsics.checkNotNullParameter(aFg1pSDK, "");
                aFg1pSDK.force(AFg1jSDK.this, p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1pSDK aFg1pSDK) {
                AFKeystoreWrapper(aFg1pSDK);
                return Unit.INSTANCE;
            }
        }));
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.i(AFg1jSDK.OTHER, p0, p1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.d(AFg1jSDK.OTHER, p0, p1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String p0, Throwable p1, boolean p2, boolean p3, boolean p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        AFg1pSDK.e$default(INSTANCE, AFg1jSDK.OTHER, p0, p1, p2, p3, p4, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.w(AFg1jSDK.OTHER, p0, p1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afVerboseLog(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.v(AFg1jSDK.OTHER, p0, false);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afRDLog(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.v(AFg1jSDK.OTHER, p0, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.force()", imports = {}))
    @JvmStatic
    public static final void afLogForce(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.force(AFg1jSDK.OTHER, p0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.d(AFg1jSDK.OTHER, p0, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        INSTANCE.i(AFg1jSDK.OTHER, p0, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String p0, Throwable p1) {
        AFLogger aFLogger = INSTANCE;
        AFg1jSDK aFg1jSDK = AFg1jSDK.OTHER;
        String str = p0;
        if (str == null || StringsKt.isBlank(str)) {
            p0 = AbstractJsonLexerKt.NULL;
        }
        String str2 = p0;
        if (p1 == null) {
            p1 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1pSDK.e$default(aFLogger, aFg1jSDK, str2, p1, false, false, false, false, 120, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(String p0, Throwable p1) {
        AFLogger aFLogger = INSTANCE;
        AFg1jSDK aFg1jSDK = AFg1jSDK.OTHER;
        String str = p0;
        if (str == null || StringsKt.isBlank(str)) {
            p0 = AbstractJsonLexerKt.NULL;
        }
        String str2 = p0;
        if (p1 == null) {
            p1 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1pSDK.e$default(aFLogger, aFg1jSDK, str2, p1, false, false, true, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(String p0, Throwable p1, boolean p2) {
        AFLogger aFLogger = INSTANCE;
        AFg1jSDK aFg1jSDK = AFg1jSDK.OTHER;
        String str = p0;
        if (str == null || StringsKt.isBlank(str)) {
            p0 = AbstractJsonLexerKt.NULL;
        }
        String str2 = p0;
        if (p1 == null) {
            p1 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1pSDK.e$default(aFLogger, aFg1jSDK, str2, p1, false, false, !p2, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String p0, Throwable p1, boolean p2) {
        AFLogger aFLogger = INSTANCE;
        AFg1jSDK aFg1jSDK = AFg1jSDK.OTHER;
        String str = p0;
        if (str == null || StringsKt.isBlank(str)) {
            p0 = AbstractJsonLexerKt.NULL;
        }
        String str2 = p0;
        if (p1 == null) {
            p1 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1pSDK.e$default(aFLogger, aFg1jSDK, str2, p1, false, p2, false, false, LocationRequestCompat.QUALITY_LOW_POWER, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String p0, Throwable p1, boolean p2, boolean p3) {
        AFLogger aFLogger = INSTANCE;
        AFg1jSDK aFg1jSDK = AFg1jSDK.OTHER;
        String str = p0;
        if (str == null || StringsKt.isBlank(str)) {
            p0 = AbstractJsonLexerKt.NULL;
        }
        String str2 = p0;
        if (p1 == null) {
            p1 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1pSDK.e$default(aFLogger, aFg1jSDK, str2, p1, false, p2, p3, false, 72, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        AFg1pSDK.w$default(INSTANCE, AFg1jSDK.OTHER, p0, false, 4, null);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "valueOf", "I", "getLevel", "()I", FirebaseAnalytics.Param.LEVEL, "p0", "<init>", "(Ljava/lang/String;II)V", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);


        /* renamed from: valueOf, reason: from kotlin metadata */
        private final int level;

        LogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFg1pSDK[] aFg1pSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1pSDKArr, "");
        Lazy lazy = AFKeystoreWrapper;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            CollectionsKt.addAll((Set) value2, aFg1pSDKArr);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFg1pSDK[] aFg1pSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1pSDKArr, "");
        Lazy lazy = AFKeystoreWrapper;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(ArraysKt.toSet(aFg1pSDKArr));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Lazy lazy = AFKeystoreWrapper;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            Iterator it = ((Set) value2).iterator();
            while (it.hasNext()) {
                function1.invoke((AFg1pSDK) it.next());
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
