package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
final class MessagesPigeonStreamHandler<T> implements EventChannel.StreamHandler {
    private PigeonEventSink<T> pigeonSink;
    private final MessagesPigeonEventChannelWrapper<T> wrapper;

    public MessagesPigeonStreamHandler(MessagesPigeonEventChannelWrapper<T> wrapper) {
        i.e(wrapper, "wrapper");
        this.wrapper = wrapper;
    }

    public final PigeonEventSink<T> getPigeonSink() {
        return this.pigeonSink;
    }

    public final MessagesPigeonEventChannelWrapper<T> getWrapper() {
        return this.wrapper;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.pigeonSink = null;
        this.wrapper.onCancel(obj);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink sink) {
        i.e(sink, "sink");
        PigeonEventSink<T> pigeonEventSink = new PigeonEventSink<>(sink);
        this.pigeonSink = pigeonEventSink;
        this.wrapper.onListen(obj, pigeonEventSink);
    }

    public final void setPigeonSink(PigeonEventSink<T> pigeonEventSink) {
        this.pigeonSink = pigeonEventSink;
    }
}
