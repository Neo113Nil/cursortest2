package com.squareup.cash.treehouse.appconfig;

import app.cash.zipline.ZiplineService;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;

/* loaded from: classes.dex */
public interface RawAppConfigService extends ZiplineService {
    ByteString bankingConfigByteString();

    Flow bankingConfigByteStringFlow();

    Flow clientDataByteStringFlow();
}
