package com.squareup.cash.treehouse.platform;

import app.cash.zipline.ZiplineService;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;

/* loaded from: classes.dex */
public interface CashContextService extends ZiplineService {
    Object consumeResponseContext(ByteString byteString, ByteString byteString2, Continuation continuation);

    Object consumeSubmitBlockerResponseAppResponseContext(ByteString byteString, ByteString byteString2, Continuation continuation);

    String getCustomerToken();

    Object produceRequestContext(List list, ByteString byteString, ContinuationImpl continuationImpl);

    Object produceRequestContext(ByteString byteString, ContinuationImpl continuationImpl);

    Object produceSubmitBlockerRequestAppRequestContext(ContinuationImpl continuationImpl);

    String webPortalBaseUrl();
}
