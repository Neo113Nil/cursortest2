package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class VideoEventsStreamHandler implements MessagesPigeonEventChannelWrapper<PlatformVideoEvent> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public static /* synthetic */ void register$default(Companion companion, BinaryMessenger binaryMessenger, VideoEventsStreamHandler videoEventsStreamHandler, String str, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                str = "";
            }
            companion.register(binaryMessenger, videoEventsStreamHandler, str);
        }

        public final void register(BinaryMessenger messenger, VideoEventsStreamHandler streamHandler, String instanceName) {
            i.e(messenger, "messenger");
            i.e(streamHandler, "streamHandler");
            i.e(instanceName, "instanceName");
            new EventChannel(messenger, instanceName.length() > 0 ? "dev.flutter.pigeon.video_player_android.VideoEventChannel.videoEvents.".concat(instanceName) : "dev.flutter.pigeon.video_player_android.VideoEventChannel.videoEvents", MessagesKt.getMessagesPigeonMethodCodec()).setStreamHandler(new MessagesPigeonStreamHandler(streamHandler));
        }

        private Companion() {
        }
    }

    @Override // io.flutter.plugins.videoplayer.MessagesPigeonEventChannelWrapper
    public void onCancel(Object obj) {
    }

    @Override // io.flutter.plugins.videoplayer.MessagesPigeonEventChannelWrapper
    public void onListen(Object obj, PigeonEventSink<PlatformVideoEvent> sink) {
        i.e(sink, "sink");
    }
}
