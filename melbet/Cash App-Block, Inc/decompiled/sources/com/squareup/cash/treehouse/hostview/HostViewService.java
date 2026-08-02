package com.squareup.cash.treehouse.hostview;

import app.cash.zipline.ZiplineService;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public interface HostViewService extends ZiplineService {
    StateFlow lifecycleStateFlow();
}
