package com.squareup.cash.treehouse.sqldelight;

import app.cash.zipline.ZiplineService;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public interface SqlDelightBridge extends ZiplineService {
    Object beginTransaction(ContinuationImpl continuationImpl);

    Object endTransaction(int i, ContinuationImpl continuationImpl);

    Object execute(String str, List list, int i, ContinuationImpl continuationImpl);

    Object executeQuery(String str, List list, int i, ContinuationImpl continuationImpl);

    Object rollbackTransaction(int i, ContinuationImpl continuationImpl);
}
