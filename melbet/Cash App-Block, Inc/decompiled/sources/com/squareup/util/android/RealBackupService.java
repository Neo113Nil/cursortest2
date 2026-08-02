package com.squareup.util.android;

import android.app.backup.BackupManager;
import android.content.Context;
import com.squareup.cash.CashApp$onCreate$1;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RealBackupService {
    public final BackupManager backupManager;
    public final Context context;
    public final CoroutineContext ioDispatcher;

    public RealBackupService(Context context, CoroutineContext coroutineContext) {
        this.context = context;
        this.ioDispatcher = coroutineContext;
        this.backupManager = new BackupManager(context);
    }

    public final Object readBackupTag(ContinuationImpl continuationImpl) {
        return JobKt.withContext(this.ioDispatcher, new CashApp$onCreate$1(this, null, 12), continuationImpl);
    }
}
