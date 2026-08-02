package io.flutter.plugins.videoplayer;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public interface MessagesPigeonEventChannelWrapper<T> {

    public static final class DefaultImpls {
        @Deprecated
        public static <T> void onCancel(MessagesPigeonEventChannelWrapper<T> messagesPigeonEventChannelWrapper, Object obj) {
            MessagesPigeonEventChannelWrapper.super.onCancel(obj);
        }

        @Deprecated
        public static <T> void onListen(MessagesPigeonEventChannelWrapper<T> messagesPigeonEventChannelWrapper, Object obj, PigeonEventSink<T> sink) {
            i.e(sink, "sink");
            MessagesPigeonEventChannelWrapper.super.onListen(obj, sink);
        }
    }

    default void onCancel(Object obj) {
    }

    default void onListen(Object obj, PigeonEventSink<T> sink) {
        i.e(sink, "sink");
    }
}
