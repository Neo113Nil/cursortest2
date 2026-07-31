package com.onesignal.internal;

import com.onesignal.core.BuildConfig;
import com.onesignal.debug.LogLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelConfigEvaluator.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/onesignal/internal/OtelConfigAction;", "", "()V", "Disable", "Enable", "NoChange", "UpdateLogLevel", "Lcom/onesignal/internal/OtelConfigAction$Disable;", "Lcom/onesignal/internal/OtelConfigAction$Enable;", "Lcom/onesignal/internal/OtelConfigAction$NoChange;", "Lcom/onesignal/internal/OtelConfigAction$UpdateLogLevel;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OtelConfigAction {
    public /* synthetic */ OtelConfigAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OtelConfigAction() {
    }

    /* compiled from: OtelConfigEvaluator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onesignal/internal/OtelConfigAction$NoChange;", "Lcom/onesignal/internal/OtelConfigAction;", "()V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoChange extends OtelConfigAction {
        public static final NoChange INSTANCE = new NoChange();

        private NoChange() {
            super(null);
        }
    }

    /* compiled from: OtelConfigEvaluator.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onesignal/internal/OtelConfigAction$Enable;", "Lcom/onesignal/internal/OtelConfigAction;", "logLevel", "Lcom/onesignal/debug/LogLevel;", "(Lcom/onesignal/debug/LogLevel;)V", "getLogLevel", "()Lcom/onesignal/debug/LogLevel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Enable extends OtelConfigAction {
        private final LogLevel logLevel;

        public static /* synthetic */ Enable copy$default(Enable enable, LogLevel logLevel, int i, Object obj) {
            if ((i & 1) != 0) {
                logLevel = enable.logLevel;
            }
            return enable.copy(logLevel);
        }

        /* renamed from: component1, reason: from getter */
        public final LogLevel getLogLevel() {
            return this.logLevel;
        }

        public final Enable copy(LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            return new Enable(logLevel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Enable) && this.logLevel == ((Enable) other).logLevel;
        }

        public int hashCode() {
            return this.logLevel.hashCode();
        }

        public String toString() {
            return "Enable(logLevel=" + this.logLevel + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enable(LogLevel logLevel) {
            super(null);
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            this.logLevel = logLevel;
        }

        public final LogLevel getLogLevel() {
            return this.logLevel;
        }
    }

    /* compiled from: OtelConfigEvaluator.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/onesignal/internal/OtelConfigAction$UpdateLogLevel;", "Lcom/onesignal/internal/OtelConfigAction;", "oldLevel", "Lcom/onesignal/debug/LogLevel;", "newLevel", "(Lcom/onesignal/debug/LogLevel;Lcom/onesignal/debug/LogLevel;)V", "getNewLevel", "()Lcom/onesignal/debug/LogLevel;", "getOldLevel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateLogLevel extends OtelConfigAction {
        private final LogLevel newLevel;
        private final LogLevel oldLevel;

        public static /* synthetic */ UpdateLogLevel copy$default(UpdateLogLevel updateLogLevel, LogLevel logLevel, LogLevel logLevel2, int i, Object obj) {
            if ((i & 1) != 0) {
                logLevel = updateLogLevel.oldLevel;
            }
            if ((i & 2) != 0) {
                logLevel2 = updateLogLevel.newLevel;
            }
            return updateLogLevel.copy(logLevel, logLevel2);
        }

        /* renamed from: component1, reason: from getter */
        public final LogLevel getOldLevel() {
            return this.oldLevel;
        }

        /* renamed from: component2, reason: from getter */
        public final LogLevel getNewLevel() {
            return this.newLevel;
        }

        public final UpdateLogLevel copy(LogLevel oldLevel, LogLevel newLevel) {
            Intrinsics.checkNotNullParameter(oldLevel, "oldLevel");
            Intrinsics.checkNotNullParameter(newLevel, "newLevel");
            return new UpdateLogLevel(oldLevel, newLevel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateLogLevel)) {
                return false;
            }
            UpdateLogLevel updateLogLevel = (UpdateLogLevel) other;
            return this.oldLevel == updateLogLevel.oldLevel && this.newLevel == updateLogLevel.newLevel;
        }

        public int hashCode() {
            return (this.oldLevel.hashCode() * 31) + this.newLevel.hashCode();
        }

        public String toString() {
            return "UpdateLogLevel(oldLevel=" + this.oldLevel + ", newLevel=" + this.newLevel + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateLogLevel(LogLevel oldLevel, LogLevel newLevel) {
            super(null);
            Intrinsics.checkNotNullParameter(oldLevel, "oldLevel");
            Intrinsics.checkNotNullParameter(newLevel, "newLevel");
            this.oldLevel = oldLevel;
            this.newLevel = newLevel;
        }

        public final LogLevel getNewLevel() {
            return this.newLevel;
        }

        public final LogLevel getOldLevel() {
            return this.oldLevel;
        }
    }

    /* compiled from: OtelConfigEvaluator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onesignal/internal/OtelConfigAction$Disable;", "Lcom/onesignal/internal/OtelConfigAction;", "()V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Disable extends OtelConfigAction {
        public static final Disable INSTANCE = new Disable();

        private Disable() {
            super(null);
        }
    }
}
