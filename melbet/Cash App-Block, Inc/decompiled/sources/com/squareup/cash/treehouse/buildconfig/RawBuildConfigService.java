package com.squareup.cash.treehouse.buildconfig;

import app.cash.zipline.ZiplineService;
import okio.ByteString;

/* loaded from: classes.dex */
public interface RawBuildConfigService extends ZiplineService {
    ByteString encodedAppVersion();

    boolean isDebug();
}
