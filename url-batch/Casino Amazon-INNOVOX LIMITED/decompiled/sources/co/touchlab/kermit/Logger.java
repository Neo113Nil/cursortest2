package co.touchlab.kermit;

import com.onesignal.core.internal.config.ConfigModelStoreKt;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J'\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0087\bJ0\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0087\bø\u0001\u0000J'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0087\bJ0\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0087\bø\u0001\u0000J'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0087\bJ0\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0087\bø\u0001\u0000J'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0087\bJ0\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0087\bø\u0001\u0000J'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0087\bJ0\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0087\bø\u0001\u0000J'\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0087\bJ0\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0087\bø\u0001\u0000J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lco/touchlab/kermit/Logger;", "Lco/touchlab/kermit/BaseLogger;", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Lco/touchlab/kermit/LoggerConfig;", "tag", "", "(Lco/touchlab/kermit/LoggerConfig;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "a", "", "messageString", "throwable", "", "message", "Lkotlin/Function0;", "d", "e", "i", "v", "w", "withTag", "Companion", "kermit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class Logger extends BaseLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String tag;

    public /* synthetic */ Logger(LoggerConfig loggerConfig, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(loggerConfig, (i & 2) != 0 ? "" : str);
    }

    public String getTag() {
        return this.tag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logger(LoggerConfig config, String tag) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
    }

    public final Logger withTag(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new Logger(getConfig(), tag);
    }

    public static /* synthetic */ void v$default(Logger logger, Throwable th, String tag, Function0 message, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger2 = logger;
        Severity severity = Severity.Verbose;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, (String) message.invoke());
        }
    }

    public final void v(Throwable throwable, String tag, Function0<String> message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger = this;
        Severity severity = Severity.Verbose;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, message.invoke());
        }
    }

    public static /* synthetic */ void d$default(Logger logger, Throwable th, String tag, Function0 message, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger2 = logger;
        Severity severity = Severity.Debug;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, (String) message.invoke());
        }
    }

    public final void d(Throwable throwable, String tag, Function0<String> message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger = this;
        Severity severity = Severity.Debug;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, message.invoke());
        }
    }

    public static /* synthetic */ void i$default(Logger logger, Throwable th, String tag, Function0 message, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger2 = logger;
        Severity severity = Severity.Info;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, (String) message.invoke());
        }
    }

    public final void i(Throwable throwable, String tag, Function0<String> message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger = this;
        Severity severity = Severity.Info;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, message.invoke());
        }
    }

    public static /* synthetic */ void w$default(Logger logger, Throwable th, String tag, Function0 message, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger2 = logger;
        Severity severity = Severity.Warn;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, (String) message.invoke());
        }
    }

    public final void w(Throwable throwable, String tag, Function0<String> message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger = this;
        Severity severity = Severity.Warn;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, message.invoke());
        }
    }

    public static /* synthetic */ void e$default(Logger logger, Throwable th, String tag, Function0 message, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger2 = logger;
        Severity severity = Severity.Error;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, (String) message.invoke());
        }
    }

    public final void e(Throwable throwable, String tag, Function0<String> message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger = this;
        Severity severity = Severity.Error;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, message.invoke());
        }
    }

    public static /* synthetic */ void a$default(Logger logger, Throwable th, String tag, Function0 message, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: a");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger2 = logger;
        Severity severity = Severity.Assert;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, (String) message.invoke());
        }
    }

    public final void a(Throwable throwable, String tag, Function0<String> message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger = this;
        Severity severity = Severity.Assert;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, message.invoke());
        }
    }

    public static /* synthetic */ void v$default(Logger logger, String messageString, Throwable th, String tag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger2 = logger;
        Severity severity = Severity.Verbose;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, messageString);
        }
    }

    public final void v(String messageString, Throwable throwable, String tag) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger = this;
        Severity severity = Severity.Verbose;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, messageString);
        }
    }

    public static /* synthetic */ void d$default(Logger logger, String messageString, Throwable th, String tag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger2 = logger;
        Severity severity = Severity.Debug;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, messageString);
        }
    }

    public final void d(String messageString, Throwable throwable, String tag) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger = this;
        Severity severity = Severity.Debug;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, messageString);
        }
    }

    public static /* synthetic */ void i$default(Logger logger, String messageString, Throwable th, String tag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger2 = logger;
        Severity severity = Severity.Info;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, messageString);
        }
    }

    public final void i(String messageString, Throwable throwable, String tag) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger = this;
        Severity severity = Severity.Info;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, messageString);
        }
    }

    public static /* synthetic */ void w$default(Logger logger, String messageString, Throwable th, String tag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger2 = logger;
        Severity severity = Severity.Warn;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, messageString);
        }
    }

    public final void w(String messageString, Throwable throwable, String tag) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger = this;
        Severity severity = Severity.Warn;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, messageString);
        }
    }

    public static /* synthetic */ void e$default(Logger logger, String messageString, Throwable th, String tag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger2 = logger;
        Severity severity = Severity.Error;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, messageString);
        }
    }

    public final void e(String messageString, Throwable throwable, String tag) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger = this;
        Severity severity = Severity.Error;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, messageString);
        }
    }

    public static /* synthetic */ void a$default(Logger logger, String messageString, Throwable th, String tag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: a");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            tag = logger.getTag();
        }
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger2 = logger;
        Severity severity = Severity.Assert;
        if (logger2.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger2.processLog(severity, tag, th, messageString);
        }
    }

    public final void a(String messageString, Throwable throwable, String tag) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger logger = this;
        Severity severity = Severity.Assert;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, throwable, messageString);
        }
    }

    /* compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fJ\u001f\u0010\r\u001a\u00020\b2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u0010¢\u0006\u0002\u0010\u0011J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fJ(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fJ(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fJ\u001f\u0010\u0015\u001a\u00020\b2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004J(\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fJ(\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001e"}, d2 = {"Lco/touchlab/kermit/Logger$Companion;", "Lco/touchlab/kermit/Logger;", "()V", "tag", "", "getTag", "()Ljava/lang/String;", "a", "", "throwable", "", "message", "Lkotlin/Function0;", "addLogWriter", "logWriter", "", "Lco/touchlab/kermit/LogWriter;", "([Lco/touchlab/kermit/LogWriter;)V", "d", "e", "i", "setLogWriters", "logWriters", "", "setMinSeverity", "severity", "Lco/touchlab/kermit/Severity;", "setTag", "v", "w", "kermit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion extends Logger {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(KermitConfigKt.mutableLoggerConfigInit(CollectionsKt.listOf(PlatformLogWriterKt.platformLogWriter$default(null, 1, null))), "");
        }

        @Override // co.touchlab.kermit.Logger
        public String getTag() {
            return DefaultsJVMKt.getDefaultTag();
        }

        public final void setMinSeverity(Severity severity) {
            Intrinsics.checkNotNullParameter(severity, "severity");
            getMutableConfig().setMinSeverity(severity);
        }

        public final void setLogWriters(List<? extends LogWriter> logWriters) {
            Intrinsics.checkNotNullParameter(logWriters, "logWriters");
            getMutableConfig().setLogWriterList(logWriters);
        }

        public final void setLogWriters(LogWriter... logWriter) {
            Intrinsics.checkNotNullParameter(logWriter, "logWriter");
            getMutableConfig().setLogWriterList(ArraysKt.toList(logWriter));
        }

        public final void addLogWriter(LogWriter... logWriter) {
            Intrinsics.checkNotNullParameter(logWriter, "logWriter");
            getMutableConfig().setLogWriterList(CollectionsKt.plus((Collection) ArraysKt.toList(logWriter), (Iterable) getMutableConfig().getLogWriterList()));
        }

        public final void setTag(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            DefaultsJVMKt.setDefaultTag(tag);
        }

        public static /* synthetic */ void v$default(Companion companion, String str, Throwable th, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            companion.v(str, th, (Function0<String>) function0);
        }

        public final void v(String tag, Throwable throwable, Function0<String> message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (getConfig().get_minSeverity().compareTo(Severity.Verbose) <= 0) {
                Companion companion = this;
                Severity severity = Severity.Verbose;
                String invoke = message.invoke();
                if (companion.getConfig().get_minSeverity().compareTo(severity) <= 0) {
                    companion.processLog(severity, tag, throwable, invoke);
                }
            }
        }

        public static /* synthetic */ void d$default(Companion companion, String str, Throwable th, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            companion.d(str, th, (Function0<String>) function0);
        }

        public final void d(String tag, Throwable throwable, Function0<String> message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (getConfig().get_minSeverity().compareTo(Severity.Debug) <= 0) {
                Companion companion = this;
                Severity severity = Severity.Debug;
                String invoke = message.invoke();
                if (companion.getConfig().get_minSeverity().compareTo(severity) <= 0) {
                    companion.processLog(severity, tag, throwable, invoke);
                }
            }
        }

        public static /* synthetic */ void i$default(Companion companion, String str, Throwable th, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            companion.i(str, th, (Function0<String>) function0);
        }

        public final void i(String tag, Throwable throwable, Function0<String> message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (getConfig().get_minSeverity().compareTo(Severity.Info) <= 0) {
                Companion companion = this;
                Severity severity = Severity.Info;
                String invoke = message.invoke();
                if (companion.getConfig().get_minSeverity().compareTo(severity) <= 0) {
                    companion.processLog(severity, tag, throwable, invoke);
                }
            }
        }

        public static /* synthetic */ void w$default(Companion companion, String str, Throwable th, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            companion.w(str, th, (Function0<String>) function0);
        }

        public final void w(String tag, Throwable throwable, Function0<String> message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (getConfig().get_minSeverity().compareTo(Severity.Warn) <= 0) {
                Companion companion = this;
                Severity severity = Severity.Warn;
                String invoke = message.invoke();
                if (companion.getConfig().get_minSeverity().compareTo(severity) <= 0) {
                    companion.processLog(severity, tag, throwable, invoke);
                }
            }
        }

        public static /* synthetic */ void e$default(Companion companion, String str, Throwable th, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            companion.e(str, th, (Function0<String>) function0);
        }

        public final void e(String tag, Throwable throwable, Function0<String> message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (getConfig().get_minSeverity().compareTo(Severity.Error) <= 0) {
                Companion companion = this;
                Severity severity = Severity.Error;
                String invoke = message.invoke();
                if (companion.getConfig().get_minSeverity().compareTo(severity) <= 0) {
                    companion.processLog(severity, tag, throwable, invoke);
                }
            }
        }

        public static /* synthetic */ void a$default(Companion companion, String str, Throwable th, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            companion.a(str, th, (Function0<String>) function0);
        }

        public final void a(String tag, Throwable throwable, Function0<String> message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (getConfig().get_minSeverity().compareTo(Severity.Assert) <= 0) {
                Companion companion = this;
                Severity severity = Severity.Assert;
                String invoke = message.invoke();
                if (companion.getConfig().get_minSeverity().compareTo(severity) <= 0) {
                    companion.processLog(severity, tag, throwable, invoke);
                }
            }
        }
    }

    public final void v(Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Verbose;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, message.invoke());
        }
    }

    public final void v(Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Verbose;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, message.invoke());
        }
    }

    public final void d(Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Debug;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, message.invoke());
        }
    }

    public final void d(Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Debug;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, message.invoke());
        }
    }

    public final void i(Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Info;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, message.invoke());
        }
    }

    public final void i(Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Info;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, message.invoke());
        }
    }

    public final void w(Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Warn;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, message.invoke());
        }
    }

    public final void w(Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Warn;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, message.invoke());
        }
    }

    public final void e(Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Error;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, message.invoke());
        }
    }

    public final void e(Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Error;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, message.invoke());
        }
    }

    public final void a(Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Assert;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, message.invoke());
        }
    }

    public final void a(Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Assert;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, message.invoke());
        }
    }

    public final void v(String messageString, Throwable th) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Verbose;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, messageString);
        }
    }

    public final void v(String messageString) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Verbose;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, messageString);
        }
    }

    public final void d(String messageString) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Debug;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, messageString);
        }
    }

    public final void d(String messageString, Throwable th) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Debug;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, messageString);
        }
    }

    public final void i(String messageString) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Info;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, messageString);
        }
    }

    public final void i(String messageString, Throwable th) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Info;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, messageString);
        }
    }

    public final void w(String messageString) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Warn;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, messageString);
        }
    }

    public final void w(String messageString, Throwable th) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Warn;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, messageString);
        }
    }

    public final void e(String messageString) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Error;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, messageString);
        }
    }

    public final void e(String messageString, Throwable th) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Error;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, messageString);
        }
    }

    public final void a(String messageString) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Assert;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, null, messageString);
        }
    }

    public final void a(String messageString, Throwable th) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        String tag = getTag();
        Logger logger = this;
        Severity severity = Severity.Assert;
        if (logger.getConfig().get_minSeverity().compareTo(severity) <= 0) {
            logger.processLog(severity, tag, th, messageString);
        }
    }
}
