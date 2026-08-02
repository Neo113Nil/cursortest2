package com.squareup.cash.treehouse.financialservices;

import app.cash.zipline.ZiplineService;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;

/* loaded from: classes.dex */
public interface FinancialServicesBridge extends ZiplineService {
    Object saveUserViewedDirectDepositUpsell(ByteString byteString, ContinuationImpl continuationImpl);
}
