package com.squareup.cash.taptopay.backend.real;

import android.nfc.tech.IsoDep;
import com.google.mlkit.vision.common.zzb;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobKt;

/* loaded from: classes7.dex */
public final class RealTagCommunication {
    public final CoroutineContext ioContext;
    public final IsoDep tagTechnology;
    public final RealTagCommunicationTeardownRunner teardownRunner;

    public RealTagCommunication(RealTagCommunicationTeardownRunner realTagCommunicationTeardownRunner, IsoDep isoDep, CoroutineContext coroutineContext) {
        this.teardownRunner = realTagCommunicationTeardownRunner;
        this.tagTechnology = isoDep;
        this.ioContext = coroutineContext;
    }

    public final void closeInBackground() {
        IsoDep isoDep = this.tagTechnology;
        zzb zzbVar = new zzb(isoDep);
        RealTagCommunicationTeardownRunner realTagCommunicationTeardownRunner = this.teardownRunner;
        if (realTagCommunicationTeardownRunner.teardownInFlight.contains(zzbVar) || !isoDep.isConnected()) {
            return;
        }
        JobKt.launch$default(realTagCommunicationTeardownRunner.scope, realTagCommunicationTeardownRunner.ioContext, null, new WorkflowNode$tick$1$1(realTagCommunicationTeardownRunner, zzbVar, null, 6), 2);
    }
}
