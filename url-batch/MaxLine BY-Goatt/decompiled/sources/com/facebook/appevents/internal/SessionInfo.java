package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import defpackage.lh;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class SessionInfo {
    public static final Companion Companion = new Companion(null);
    private static final String INTERRUPTION_COUNT_KEY = "com.facebook.appevents.SessionInfo.interruptionCount";
    private static final String LAST_SESSION_INFO_END_KEY = "com.facebook.appevents.SessionInfo.sessionEndTime";
    private static final String LAST_SESSION_INFO_START_KEY = "com.facebook.appevents.SessionInfo.sessionStartTime";
    private static final String SESSION_ID_KEY = "com.facebook.appevents.SessionInfo.sessionId";
    private Long diskRestoreTime;
    private int interruptionCount;
    private UUID sessionId;
    private Long sessionLastEventTime;
    private final Long sessionStartTime;
    private SourceApplicationInfo sourceApplicationInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SessionInfo(Long l, Long l2, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, uuid);
        if ((i & 4) != 0) {
            uuid = UUID.randomUUID();
            uuid.getClass();
        }
    }

    public static final void clearSavedSessionFromDisk() {
        Companion.clearSavedSessionFromDisk();
    }

    public static final SessionInfo getStoredSessionInfo() {
        return Companion.getStoredSessionInfo();
    }

    public final Long getDiskRestoreTime() {
        Long l = this.diskRestoreTime;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    public final int getInterruptionCount() {
        return this.interruptionCount;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final Long getSessionLastEventTime() {
        return this.sessionLastEventTime;
    }

    public final long getSessionLength() {
        Long l;
        if (this.sessionStartTime != null && (l = this.sessionLastEventTime) != null) {
            if (l != null) {
                return l.longValue() - this.sessionStartTime.longValue();
            }
            lh.g("Required value was null.");
        }
        return 0L;
    }

    public final Long getSessionStartTime() {
        return this.sessionStartTime;
    }

    public final SourceApplicationInfo getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    public final void incrementInterruptionCount() {
        this.interruptionCount++;
    }

    public final void setDiskRestoreTime(Long l) {
        this.diskRestoreTime = l;
    }

    public final void setSessionId(UUID uuid) {
        uuid.getClass();
        this.sessionId = uuid;
    }

    public final void setSessionLastEventTime(Long l) {
        this.sessionLastEventTime = l;
    }

    public final void setSourceApplicationInfo(SourceApplicationInfo sourceApplicationInfo) {
        this.sourceApplicationInfo = sourceApplicationInfo;
    }

    public final void writeSessionToDisk() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
        Long l = this.sessionStartTime;
        edit.putLong(LAST_SESSION_INFO_START_KEY, l != null ? l.longValue() : 0L);
        Long l2 = this.sessionLastEventTime;
        edit.putLong(LAST_SESSION_INFO_END_KEY, l2 != null ? l2.longValue() : 0L);
        edit.putInt(INTERRUPTION_COUNT_KEY, this.interruptionCount);
        edit.putString(SESSION_ID_KEY, this.sessionId.toString());
        edit.apply();
        SourceApplicationInfo sourceApplicationInfo = this.sourceApplicationInfo;
        if (sourceApplicationInfo == null || sourceApplicationInfo == null) {
            return;
        }
        sourceApplicationInfo.writeSourceApplicationInfoToDisk();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clearSavedSessionFromDisk() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
            edit.remove(SessionInfo.LAST_SESSION_INFO_START_KEY);
            edit.remove(SessionInfo.LAST_SESSION_INFO_END_KEY);
            edit.remove(SessionInfo.INTERRUPTION_COUNT_KEY);
            edit.remove(SessionInfo.SESSION_ID_KEY);
            edit.apply();
            SourceApplicationInfo.Companion.clearSavedSourceApplicationInfoFromDisk();
        }

        public final SessionInfo getStoredSessionInfo() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
            long j = defaultSharedPreferences.getLong(SessionInfo.LAST_SESSION_INFO_START_KEY, 0L);
            long j2 = defaultSharedPreferences.getLong(SessionInfo.LAST_SESSION_INFO_END_KEY, 0L);
            String string = defaultSharedPreferences.getString(SessionInfo.SESSION_ID_KEY, null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            SessionInfo sessionInfo = new SessionInfo(Long.valueOf(j), Long.valueOf(j2), null, 4, null);
            sessionInfo.interruptionCount = defaultSharedPreferences.getInt(SessionInfo.INTERRUPTION_COUNT_KEY, 0);
            sessionInfo.setSourceApplicationInfo(SourceApplicationInfo.Companion.getStoredSourceApplicatioInfo());
            sessionInfo.setDiskRestoreTime(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            fromString.getClass();
            sessionInfo.setSessionId(fromString);
            return sessionInfo;
        }

        private Companion() {
        }
    }

    public SessionInfo(Long l, Long l2, UUID uuid) {
        uuid.getClass();
        this.sessionStartTime = l;
        this.sessionLastEventTime = l2;
        this.sessionId = uuid;
    }

    public SessionInfo(Long l, Long l2) {
        this(l, l2, null, 4, null);
    }
}
