package com.squareup.util.android;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.os.ParcelFileDescriptor;
import com.google.android.libraries.places.internal.zzcha;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CashBackupAgent extends BackupAgentHelper {
    public static final Object lock = new Object();

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        Timber.Forest.i("CashBackupAgent onBackup", new Object[0]);
        zzcha temporarilyAllow = StrictModes.temporarilyAllow();
        temporarilyAllow.diskReads();
        temporarilyAllow.diskWrites();
        try {
            synchronized (lock) {
                super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            }
            temporarilyAllow.close();
        } finally {
        }
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        Timber.Forest.i("Starting CashBackupAgent", new Object[0]);
        zzcha temporarilyAllow = StrictModes.temporarilyAllow();
        temporarilyAllow.diskReads();
        temporarilyAllow.diskWrites();
        try {
            addHelper("backup_tag_key", new FileBackupHelper(this, "backup_tag"));
            temporarilyAllow.close();
        } finally {
        }
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor) {
        Timber.Forest.i("CashBackupAgent onRestore", new Object[0]);
        zzcha temporarilyAllow = StrictModes.temporarilyAllow();
        temporarilyAllow.diskReads();
        temporarilyAllow.diskWrites();
        try {
            synchronized (lock) {
                super.onRestore(backupDataInput, j, parcelFileDescriptor);
            }
            temporarilyAllow.close();
        } finally {
        }
    }
}
