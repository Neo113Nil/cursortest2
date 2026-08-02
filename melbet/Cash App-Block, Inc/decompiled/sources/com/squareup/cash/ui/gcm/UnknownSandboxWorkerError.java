package com.squareup.cash.ui.gcm;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/ui/gcm/UnknownSandboxWorkerError;", "Lcom/squareup/cash/observability/types/ReportedError;", "cash-os"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnknownSandboxWorkerError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Sandbox.INSTANCE);
    public final String message;

    public UnknownSandboxWorkerError(String str) {
        this.message = Recorder$$ExternalSyntheticOutline2.m("Unknown sandbox worker class ", str);
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
