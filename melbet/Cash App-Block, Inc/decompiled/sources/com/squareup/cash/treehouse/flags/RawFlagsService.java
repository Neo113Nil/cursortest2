package com.squareup.cash.treehouse.flags;

import app.cash.zipline.ZiplineService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface RawFlagsService extends ZiplineService {
    Flow encodedClientDataFeatureFlags();

    String get(String str);

    String get(String str, boolean z);
}
