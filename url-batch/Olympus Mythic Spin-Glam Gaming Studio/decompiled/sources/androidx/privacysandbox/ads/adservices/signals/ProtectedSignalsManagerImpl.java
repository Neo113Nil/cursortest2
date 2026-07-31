package androidx.privacysandbox.ads.adservices.signals;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.exoplayer.hls.offline.HlsDownloader$$ExternalSyntheticLambda0;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProtectedSignalsManagerImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManagerImpl;", "Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "request", "Landroid/adservices/signals/UpdateSignalsRequest;", "convertUpdateRequest", "(Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;)Landroid/adservices/signals/UpdateSignalsRequest;", "", "updateSignals", "(Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/adservices/signals/ProtectedSignalsManager;", "protectedSignalsManager", "Landroid/adservices/signals/ProtectedSignalsManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@ExperimentalFeatures.Ext12OptIn
@RequiresExtension
@RestrictTo
/* loaded from: classes5.dex */
public class ProtectedSignalsManagerImpl extends ProtectedSignalsManager {
    private final android.adservices.signals.ProtectedSignalsManager protectedSignalsManager;

    @Override // androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object updateSignals(@NotNull UpdateSignalsRequest updateSignalsRequest, @NotNull Continuation continuation) {
        return updateSignals$suspendImpl(this, updateSignalsRequest, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.signals.UpdateSignalsRequest convertUpdateRequest(UpdateSignalsRequest request) {
        android.adservices.signals.UpdateSignalsRequest build;
        ProtectedSignalsManagerImpl$$ExternalSyntheticApiModelOutline2.m();
        build = ProtectedSignalsManagerImpl$$ExternalSyntheticApiModelOutline1.m(request.getUpdateUri()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(request.updateUri).build()");
        return build;
    }

    @RequiresPermission
    @DoNotInline
    static /* synthetic */ Object updateSignals$suspendImpl(ProtectedSignalsManagerImpl protectedSignalsManagerImpl, UpdateSignalsRequest updateSignalsRequest, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        protectedSignalsManagerImpl.protectedSignalsManager.updateSignals(protectedSignalsManagerImpl.convertUpdateRequest(updateSignalsRequest), new HlsDownloader$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
