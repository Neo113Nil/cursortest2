package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
abstract class zad extends zac {
    protected final TaskCompletionSource zaa;

    public zad(int i4, TaskCompletionSource taskCompletionSource) {
        super(i4);
        this.zaa = taskCompletionSource;
    }

    protected abstract void zac(zabo zaboVar);

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(Status status) {
        this.zaa.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(Exception exc) {
        this.zaa.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabo zaboVar) {
        try {
            zac(zaboVar);
        } catch (DeadObjectException e4) {
            zad(zai.zah(e4));
            throw e4;
        } catch (RemoteException e5) {
            zad(zai.zah(e5));
        } catch (RuntimeException e6) {
            this.zaa.trySetException(e6);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zag(zaac zaacVar, boolean z4) {
    }
}
