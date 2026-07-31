package com.onesignal.debug;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneSignalLogEvent.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/onesignal/debug/OneSignalLogEvent;", "", "level", "Lcom/onesignal/debug/LogLevel;", "entry", "", "(Lcom/onesignal/debug/LogLevel;Ljava/lang/String;)V", "getEntry", "()Ljava/lang/String;", "getLevel", "()Lcom/onesignal/debug/LogLevel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OneSignalLogEvent {
    private final String entry;
    private final LogLevel level;

    public static /* synthetic */ OneSignalLogEvent copy$default(OneSignalLogEvent oneSignalLogEvent, LogLevel logLevel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            logLevel = oneSignalLogEvent.level;
        }
        if ((i & 2) != 0) {
            str = oneSignalLogEvent.entry;
        }
        return oneSignalLogEvent.copy(logLevel, str);
    }

    /* renamed from: component1, reason: from getter */
    public final LogLevel getLevel() {
        return this.level;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntry() {
        return this.entry;
    }

    public final OneSignalLogEvent copy(LogLevel level, String entry) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(entry, "entry");
        return new OneSignalLogEvent(level, entry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneSignalLogEvent)) {
            return false;
        }
        OneSignalLogEvent oneSignalLogEvent = (OneSignalLogEvent) other;
        return this.level == oneSignalLogEvent.level && Intrinsics.areEqual(this.entry, oneSignalLogEvent.entry);
    }

    public int hashCode() {
        return (this.level.hashCode() * 31) + this.entry.hashCode();
    }

    public String toString() {
        return "OneSignalLogEvent(level=" + this.level + ", entry=" + this.entry + ')';
    }

    public OneSignalLogEvent(LogLevel level, String entry) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.level = level;
        this.entry = entry;
    }

    public final LogLevel getLevel() {
        return this.level;
    }

    public final String getEntry() {
        return this.entry;
    }
}
