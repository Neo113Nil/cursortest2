package com.squareup.cash.treehouse.accessibility;

import app.cash.zipline.ZiplineService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface AccessibilityCallbackService extends ZiplineService {
    Flow callbacks();
}
