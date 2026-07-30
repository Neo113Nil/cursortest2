package com.crrepa.ble.conn.listener;

/* loaded from: classes3.dex */
public interface CRPMusicChangeListener {
    public static final long DEFAULT_TIME = 1000;
    public static final long UPDATE_TIME = 0;

    void onAvailableSize(int i8);

    void onMusicDeleted(int i8, boolean z7);

    void onMusicName(int i8, String str);

    void onMusicSavedCount(int i8, long j8);
}
