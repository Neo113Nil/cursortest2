package com.squareup.cash.treehouse.flows;

import app.cash.zipline.ZiplineService;
import java.util.List;
import kotlin.coroutines.Continuation;
import okio.ByteString;

/* loaded from: classes7.dex */
public interface RawFlowService extends ZiplineService {
    Object advance(ByteString byteString, boolean z, Continuation continuation);

    Object consumeResponseContext(ByteString byteString, ByteString byteString2, Continuation continuation);

    Object dismiss(Continuation continuation);

    Object produceRequestContext(List list, Continuation continuation);

    Object retreat(ByteString byteString, Continuation continuation);
}
