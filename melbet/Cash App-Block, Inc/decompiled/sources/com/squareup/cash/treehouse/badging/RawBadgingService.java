package com.squareup.cash.treehouse.badging;

import app.cash.zipline.ZiplineService;
import kotlin.coroutines.Continuation;
import okio.ByteString;

/* loaded from: classes.dex */
public interface RawBadgingService extends ZiplineService {
    Object updateBadgeCounts(ByteString byteString, Continuation continuation);
}
