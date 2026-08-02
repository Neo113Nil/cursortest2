package com.squareup.cash.treehouse.appmessaging;

import app.cash.zipline.ZiplineService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface RawAppMessagingService extends ZiplineService {
    Flow getDisplayActivityInlineMessage();
}
