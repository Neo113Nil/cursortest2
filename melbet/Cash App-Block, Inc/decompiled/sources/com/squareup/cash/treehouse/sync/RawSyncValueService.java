package com.squareup.cash.treehouse.sync;

import app.cash.zipline.ZiplineService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface RawSyncValueService extends ZiplineService {
    Flow encodedAllSyncValues();

    Flow getSyncValues(int i);
}
