package com.squareup.cash.treehouse.activity;

import app.cash.zipline.ZiplineService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface RawOfflineActivityService extends ZiplineService {
    Flow offlineActivityItems();

    Flow offlinePendingItems();

    void retryPendingItems();
}
