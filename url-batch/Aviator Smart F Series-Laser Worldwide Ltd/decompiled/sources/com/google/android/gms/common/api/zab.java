package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* loaded from: classes3.dex */
final class zab implements PendingResult.StatusListener {
    final /* synthetic */ Batch zaa;

    zab(Batch batch) {
        this.zaa = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Object obj;
        int i8;
        int i9;
        boolean z7;
        boolean z8;
        PendingResult[] pendingResultArr;
        obj = this.zaa.zai;
        synchronized (obj) {
            try {
                if (this.zaa.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.zaa.zag = true;
                } else if (!status.isSuccess()) {
                    this.zaa.zaf = true;
                }
                Batch batch = this.zaa;
                i8 = batch.zae;
                batch.zae = i8 - 1;
                Batch batch2 = this.zaa;
                i9 = batch2.zae;
                if (i9 == 0) {
                    z7 = batch2.zag;
                    if (z7) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        z8 = batch2.zaf;
                        Status status2 = z8 ? new Status(13) : Status.RESULT_SUCCESS;
                        Batch batch3 = this.zaa;
                        pendingResultArr = batch3.zah;
                        batch3.setResult(new BatchResult(status2, pendingResultArr));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
