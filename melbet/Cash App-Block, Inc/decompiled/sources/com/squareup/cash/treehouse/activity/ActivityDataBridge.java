package com.squareup.cash.treehouse.activity;

import app.cash.zipline.ZiplineService;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okio.ByteString;

/* loaded from: classes.dex */
public interface ActivityDataBridge extends ZiplineService {
    Object applyDynamicFormatting(SerializableActivityItem serializableActivityItem, SerializableRenderedActivityItem serializableRenderedActivityItem, String str, ContinuationImpl continuationImpl);

    Object applyDynamicFormatting(SerializableActivityItem serializableActivityItem, SerializableRenderedActivityItem serializableRenderedActivityItem, ContinuationImpl continuationImpl);

    Object cacheActivityItemAndCheckEnrichedReceipt(SerializableActivityItem serializableActivityItem, Continuation continuation);

    Object format(SerializableActivityItem serializableActivityItem, String str, Continuation continuation);

    Object format(SerializableActivityItem serializableActivityItem, Continuation continuation);

    Object format(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl);

    Object format(String str, List list, Continuation continuation);

    Object format(List list, Continuation continuation);

    Object getCachedActivityItem(SuspendLambda suspendLambda);

    Object offlinePaymentHistoryData(String str, ContinuationImpl continuationImpl);

    Object offlineTransferHistoryData(String str, ContinuationImpl continuationImpl);

    Object setCachedActivityItem(SerializableActivityItem serializableActivityItem, Continuation continuation);

    Object setCachedActivityItem(ByteString byteString, Continuation continuation);

    Object setCachedActivityItemFromInitiatePaymentRequest(ByteString byteString, String str, long j, Continuation continuation);

    Object setCachedActivityItemFromTransferFundsRequest(ByteString byteString, long j, Continuation continuation);

    Object setNativeActivityFlowToken(String str, ContinuationImpl continuationImpl);

    Object setNativeQueryToken(String str, ContinuationImpl continuationImpl);

    Object setNativeSearchFlowToken(String str, ContinuationImpl continuationImpl);
}
