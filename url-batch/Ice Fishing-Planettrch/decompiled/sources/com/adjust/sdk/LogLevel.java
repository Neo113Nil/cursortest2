package com.adjust.sdk;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public enum LogLevel {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    ASSERT(7),
    SUPPRESS(8);

    final int androidLogLevel;

    LogLevel(int i) {
        this.androidLogLevel = i;
    }

    public int getAndroidLogLevel() {
        return this.androidLogLevel;
    }
}
