package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import a.AbstractC0124a;
import c3.C0295g;
import c3.InterfaceC0291c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.videoplayer.VideoPlayerInstanceApi;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public interface VideoPlayerInstanceApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InterfaceC0291c codec$delegate = new C0295g(new io.flutter.plugins.sharedpreferences.c(2));

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MessagesPigeonCodec codec_delegate$lambda$0() {
            return new MessagesPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, VideoPlayerInstanceApi videoPlayerInstanceApi, String str, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, videoPlayerInstanceApi, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$0$0(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                videoPlayerInstanceApi.setLooping(((Boolean) obj2).booleanValue());
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$1$0(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Double");
            try {
                videoPlayerInstanceApi.setVolume(((Double) obj2).doubleValue());
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$0(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Double");
            try {
                videoPlayerInstanceApi.setPlaybackSpeed(((Double) obj2).doubleValue());
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$0(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            try {
                videoPlayerInstanceApi.play();
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$0(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            try {
                videoPlayerInstanceApi.pause();
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$5$0(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                videoPlayerInstanceApi.seekTo(((Long) obj2).longValue());
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$6$0(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            try {
                wrapError = AbstractC0124a.H(Long.valueOf(videoPlayerInstanceApi.getCurrentPosition()));
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$7$0(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            try {
                wrapError = AbstractC0124a.H(Long.valueOf(videoPlayerInstanceApi.getBufferedPosition()));
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$8$0(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            try {
                wrapError = AbstractC0124a.H(videoPlayerInstanceApi.getAudioTracks());
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$9$0(VideoPlayerInstanceApi videoPlayerInstanceApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj2).longValue();
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                videoPlayerInstanceApi.selectAudioTrack(longValue, ((Long) obj3).longValue());
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) ((C0295g) codec$delegate).a();
        }

        public final void setUp(BinaryMessenger binaryMessenger, VideoPlayerInstanceApi videoPlayerInstanceApi) {
            i.e(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, videoPlayerInstanceApi, null, 4, null);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final VideoPlayerInstanceApi videoPlayerInstanceApi, String messageChannelSuffix) {
            i.e(binaryMessenger, "binaryMessenger");
            i.e(messageChannelSuffix, "messageChannelSuffix");
            String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setLooping", concat), getCodec());
            if (videoPlayerInstanceApi != null) {
                final int i4 = 1;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$9$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 1:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$0$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 2:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$1$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 3:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$2$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 4:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$3$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 5:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$4$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 6:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$5$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 7:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$6$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 8:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$7$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            default:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$8$0(videoPlayerInstanceApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setVolume", concat), getCodec());
            if (videoPlayerInstanceApi != null) {
                final int i5 = 2;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$9$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 1:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$0$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 2:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$1$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 3:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$2$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 4:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$3$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 5:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$4$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 6:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$5$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 7:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$6$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 8:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$7$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            default:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$8$0(videoPlayerInstanceApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setPlaybackSpeed", concat), getCodec());
            if (videoPlayerInstanceApi != null) {
                final int i6 = 3;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i6) {
                            case 0:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$9$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 1:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$0$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 2:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$1$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 3:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$2$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 4:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$3$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 5:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$4$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 6:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$5$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 7:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$6$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 8:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$7$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            default:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$8$0(videoPlayerInstanceApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.play", concat), getCodec());
            if (videoPlayerInstanceApi != null) {
                final int i7 = 4;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i7) {
                            case 0:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$9$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 1:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$0$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 2:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$1$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 3:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$2$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 4:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$3$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 5:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$4$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 6:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$5$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 7:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$6$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 8:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$7$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            default:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$8$0(videoPlayerInstanceApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.pause", concat), getCodec());
            if (videoPlayerInstanceApi != null) {
                final int i8 = 5;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i8) {
                            case 0:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$9$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 1:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$0$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 2:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$1$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 3:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$2$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 4:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$3$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 5:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$4$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 6:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$5$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 7:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$6$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 8:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$7$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            default:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$8$0(videoPlayerInstanceApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.seekTo", concat), getCodec());
            if (videoPlayerInstanceApi != null) {
                final int i9 = 6;
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i9) {
                            case 0:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$9$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 1:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$0$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 2:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$1$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 3:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$2$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 4:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$3$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 5:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$4$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 6:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$5$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 7:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$6$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 8:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$7$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            default:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$8$0(videoPlayerInstanceApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getCurrentPosition", concat), getCodec());
            if (videoPlayerInstanceApi != null) {
                final int i10 = 7;
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i10) {
                            case 0:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$9$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 1:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$0$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 2:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$1$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 3:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$2$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 4:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$3$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 5:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$4$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 6:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$5$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 7:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$6$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 8:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$7$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            default:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$8$0(videoPlayerInstanceApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getBufferedPosition", concat), getCodec());
            if (videoPlayerInstanceApi != null) {
                final int i11 = 8;
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i11) {
                            case 0:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$9$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 1:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$0$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 2:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$1$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 3:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$2$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 4:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$3$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 5:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$4$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 6:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$5$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 7:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$6$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 8:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$7$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            default:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$8$0(videoPlayerInstanceApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getAudioTracks", concat), getCodec());
            if (videoPlayerInstanceApi != null) {
                final int i12 = 9;
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i12) {
                            case 0:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$9$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 1:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$0$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 2:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$1$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 3:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$2$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 4:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$3$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 5:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$4$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 6:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$5$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 7:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$6$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 8:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$7$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            default:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$8$0(videoPlayerInstanceApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.selectAudioTrack", concat), getCodec());
            if (videoPlayerInstanceApi == null) {
                basicMessageChannel10.setMessageHandler(null);
            } else {
                final int i13 = 0;
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i13) {
                            case 0:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$9$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 1:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$0$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 2:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$1$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 3:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$2$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 4:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$3$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 5:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$4$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 6:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$5$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 7:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$6$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            case 8:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$7$0(videoPlayerInstanceApi, obj, reply);
                                break;
                            default:
                                VideoPlayerInstanceApi.Companion.setUp$lambda$8$0(videoPlayerInstanceApi, obj, reply);
                                break;
                        }
                    }
                });
            }
        }
    }

    NativeAudioTrackData getAudioTracks();

    long getBufferedPosition();

    long getCurrentPosition();

    void pause();

    void play();

    void seekTo(long j4);

    void selectAudioTrack(long j4, long j5);

    void setLooping(boolean z);

    void setPlaybackSpeed(double d4);

    void setVolume(double d4);
}
