package com.google.common.eventbus;

import com.baidu.platform.comapi.map.MapController;
import com.google.common.eventbus.EventBus;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(String str, Executor executor) {
        super(str, executor, Dispatcher.legacyAsync(), EventBus.LoggingHandler.INSTANCE);
    }

    public AsyncEventBus(Executor executor, SubscriberExceptionHandler subscriberExceptionHandler) {
        super(MapController.DEFAULT_LAYER_TAG, executor, Dispatcher.legacyAsync(), subscriberExceptionHandler);
    }

    public AsyncEventBus(Executor executor) {
        super(MapController.DEFAULT_LAYER_TAG, executor, Dispatcher.legacyAsync(), EventBus.LoggingHandler.INSTANCE);
    }
}
