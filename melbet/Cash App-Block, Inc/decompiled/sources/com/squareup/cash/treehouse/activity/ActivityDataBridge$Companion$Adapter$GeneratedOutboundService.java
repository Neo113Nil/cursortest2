package com.squareup.cash.treehouse.activity;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ActivityDataBridge$Companion$Adapter$GeneratedOutboundService implements ActivityDataBridge, OutboundService {
    public final OutboundCallHandler callHandler;

    public ActivityDataBridge$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object applyDynamicFormatting(SerializableActivityItem serializableActivityItem, SerializableRenderedActivityItem serializableRenderedActivityItem, ContinuationImpl continuationImpl) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2 activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2;
        int i;
        if (continuationImpl instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2) continuationImpl;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2.label = 1;
                    obj = this.callHandler.callSuspending(this, 17, new Object[]{serializableActivityItem, serializableRenderedActivityItem}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (FormattingResult) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2(this, continuationImpl);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$2.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (FormattingResult) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cacheActivityItemAndCheckEnrichedReceipt(SerializableActivityItem serializableActivityItem, Continuation continuation) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1 activityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1;
        int i;
        if (continuation instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1) continuation;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 2, new Object[]{serializableActivityItem}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Boolean) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$cacheActivityItemAndCheckEnrichedReceipt$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Boolean) obj2;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 18, new Object[0]);
        call.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object format(SerializableActivityItem serializableActivityItem, Continuation continuation) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4 activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4;
        int i;
        if (continuation instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4) continuation;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4.label = 1;
                    obj = this.callHandler.callSuspending(this, 15, new Object[]{serializableActivityItem}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (FormattingResult) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4(this, (ContinuationImpl) continuation);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$4.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (FormattingResult) obj2;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object getCachedActivityItem(SuspendLambda suspendLambda) {
        Object callSuspending = this.callHandler.callSuspending(this, 14, new Object[0], suspendLambda);
        return callSuspending == CoroutineSingletons.COROUTINE_SUSPENDED ? callSuspending : (SerializablePaymentActivityItem) callSuspending;
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object offlinePaymentHistoryData(String str, ContinuationImpl continuationImpl) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1 activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1;
        int i;
        if (continuationImpl instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1) continuationImpl;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 12, new Object[]{str}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (String) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1(this, continuationImpl);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlinePaymentHistoryData$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (String) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object offlineTransferHistoryData(String str, ContinuationImpl continuationImpl) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1 activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1;
        int i;
        if (continuationImpl instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1) continuationImpl;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 13, new Object[]{str}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (String) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1(this, continuationImpl);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$offlineTransferHistoryData$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (String) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setCachedActivityItem(ByteString byteString, Continuation continuation) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1 activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1;
        int i;
        if (continuation instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1) continuation;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 0, new Object[]{byteString}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setCachedActivityItemFromInitiatePaymentRequest(ByteString byteString, String str, long j, Continuation continuation) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1 activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1;
        int i;
        if (continuation instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1) continuation;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object[] objArr = {byteString, str, new Long(j)};
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 3, objArr, activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromInitiatePaymentRequest$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setCachedActivityItemFromTransferFundsRequest(ByteString byteString, long j, Continuation continuation) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1 activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1;
        int i;
        if (continuation instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1) continuation;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object[] objArr = {byteString, new Long(j)};
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 4, objArr, activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItemFromTransferFundsRequest$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setNativeActivityFlowToken(String str, ContinuationImpl continuationImpl) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1 activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1;
        int i;
        if (continuationImpl instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1) continuationImpl;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 8, new Object[]{str}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1(this, continuationImpl);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeActivityFlowToken$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setNativeQueryToken(String str, ContinuationImpl continuationImpl) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1 activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1;
        int i;
        if (continuationImpl instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1) continuationImpl;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 10, new Object[]{str}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1(this, continuationImpl);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeQueryToken$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setNativeSearchFlowToken(String str, ContinuationImpl continuationImpl) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1 activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1;
        int i;
        if (continuationImpl instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1) continuationImpl;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 9, new Object[]{str}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1(this, continuationImpl);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setNativeSearchFlowToken$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object applyDynamicFormatting(SerializableActivityItem serializableActivityItem, SerializableRenderedActivityItem serializableRenderedActivityItem, String str, ContinuationImpl continuationImpl) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1 activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1;
        int i;
        if (continuationImpl instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1) continuationImpl;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 7, new Object[]{serializableActivityItem, serializableRenderedActivityItem, str}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (FormattingResult) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1(this, continuationImpl);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$applyDynamicFormatting$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (FormattingResult) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setCachedActivityItem(SerializableActivityItem serializableActivityItem, Continuation continuation) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2 activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2;
        int i;
        if (continuation instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2) continuation;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2.label = 1;
                    obj = this.callHandler.callSuspending(this, 1, new Object[]{serializableActivityItem}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (Unit) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2(this, (ContinuationImpl) continuation);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$2.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object format(SerializableActivityItem serializableActivityItem, String str, Continuation continuation) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1 activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1;
        int i;
        if (continuation instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1) continuation;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 5, new Object[]{serializableActivityItem, str}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (FormattingResult) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1(this, (ContinuationImpl) continuation);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (FormattingResult) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object format(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3 activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3;
        int i;
        if (continuationImpl instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3) continuationImpl;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3.label = 1;
                    obj = this.callHandler.callSuspending(this, 11, new Object[]{str, str2, str3, str4}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (String) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3(this, continuationImpl);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$3.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (String) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object format(String str, List list, Continuation continuation) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2 activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2;
        int i;
        if (continuation instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2) continuation;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2.label = 1;
                    obj = this.callHandler.callSuspending(this, 6, new Object[]{list, str}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (List) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2(this, (ContinuationImpl) continuation);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$2.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (List) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object format(List list, Continuation continuation) {
        ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5 activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5;
        int i;
        if (continuation instanceof ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5) {
            activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5 = (ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5) continuation;
            int i2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5.label = 1;
                    obj = this.callHandler.callSuspending(this, 16, new Object[]{list}, activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                obj.getClass();
                return (List) obj;
            }
        }
        activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5 = new ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5(this, (ContinuationImpl) continuation);
        Object obj2 = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityDataBridge$Companion$Adapter$GeneratedOutboundService$format$5.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (List) obj2;
    }
}
