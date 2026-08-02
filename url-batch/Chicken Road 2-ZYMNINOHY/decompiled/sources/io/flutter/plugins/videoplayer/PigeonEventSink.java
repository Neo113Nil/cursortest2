package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PigeonEventSink<T> {
    private final EventChannel.EventSink sink;

    public PigeonEventSink(EventChannel.EventSink sink) {
        i.e(sink, "sink");
        this.sink = sink;
    }

    public final void endOfStream() {
        this.sink.endOfStream();
    }

    public final void error(String errorCode, String str, Object obj) {
        i.e(errorCode, "errorCode");
        this.sink.error(errorCode, str, obj);
    }

    public final void success(T t4) {
        this.sink.success(t4);
    }
}
