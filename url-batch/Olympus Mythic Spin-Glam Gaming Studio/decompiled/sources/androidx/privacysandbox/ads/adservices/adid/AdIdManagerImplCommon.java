package androidx.privacysandbox.ads.adservices.adid;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.exoplayer.hls.offline.HlsDownloader$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdIdManagerImplCommon.kt */
@RequiresExtension.Container
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u0006H\u0097@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\bH\u0083@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "mAdIdManager", "Landroid/adservices/adid/AdIdManager;", "(Landroid/adservices/adid/AdIdManager;)V", "convertResponse", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "response", "Landroid/adservices/adid/AdId;", "getAdId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdIdAsyncInternal", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure", "NewApi"})
@RestrictTo
/* loaded from: classes13.dex */
public class AdIdManagerImplCommon extends AdIdManager {
    private final android.adservices.adid.AdIdManager mAdIdManager;

    @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object getAdId(@NotNull Continuation continuation) {
        return getAdId$suspendImpl(this, continuation);
    }

    public AdIdManagerImplCommon(android.adservices.adid.AdIdManager mAdIdManager) {
        Intrinsics.checkNotNullParameter(mAdIdManager, "mAdIdManager");
        this.mAdIdManager = mAdIdManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @RequiresPermission
    @DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object getAdId$suspendImpl(AdIdManagerImplCommon adIdManagerImplCommon, Continuation continuation) {
        AdIdManagerImplCommon$getAdId$1 adIdManagerImplCommon$getAdId$1;
        int i;
        if (continuation instanceof AdIdManagerImplCommon$getAdId$1) {
            adIdManagerImplCommon$getAdId$1 = (AdIdManagerImplCommon$getAdId$1) continuation;
            int i2 = adIdManagerImplCommon$getAdId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adIdManagerImplCommon$getAdId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = adIdManagerImplCommon$getAdId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = adIdManagerImplCommon$getAdId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    adIdManagerImplCommon$getAdId$1.L$0 = adIdManagerImplCommon;
                    adIdManagerImplCommon$getAdId$1.label = 1;
                    obj = adIdManagerImplCommon.getAdIdAsyncInternal(adIdManagerImplCommon$getAdId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    adIdManagerImplCommon = (AdIdManagerImplCommon) adIdManagerImplCommon$getAdId$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return adIdManagerImplCommon.convertResponse(AdIdManagerImplCommon$$ExternalSyntheticApiModelOutline0.m(obj));
            }
        }
        adIdManagerImplCommon$getAdId$1 = new AdIdManagerImplCommon$getAdId$1(adIdManagerImplCommon, continuation);
        Object obj2 = adIdManagerImplCommon$getAdId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = adIdManagerImplCommon$getAdId$1.label;
        if (i != 0) {
        }
        return adIdManagerImplCommon.convertResponse(AdIdManagerImplCommon$$ExternalSyntheticApiModelOutline0.m(obj2));
    }

    private final AdId convertResponse(android.adservices.adid.AdId response) {
        String adId;
        boolean isLimitAdTrackingEnabled;
        adId = response.getAdId();
        Intrinsics.checkNotNullExpressionValue(adId, "response.adId");
        isLimitAdTrackingEnabled = response.isLimitAdTrackingEnabled();
        return new AdId(adId, isLimitAdTrackingEnabled);
    }

    private final Object getAdIdAsyncInternal(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.mAdIdManager.getAdId(new HlsDownloader$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
