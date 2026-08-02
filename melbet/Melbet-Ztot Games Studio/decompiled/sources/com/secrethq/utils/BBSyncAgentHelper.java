package com.secrethq.utils;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

/* loaded from: classes3.dex */
public class BBSyncAgentHelper extends BackupAgentHelper {
    public static final String PREFS = "androidx.multidexbb2_user_progress";
    public static final String PREFS_BACKUP_KEY = "progress";

    @Override // android.app.backup.BackupAgent
    public void onCreate() {
        addHelper("progress", new SharedPreferencesBackupHelper(this, PREFS));
    }
}
