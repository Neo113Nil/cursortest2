package io.flutter.plugins.videoplayer;

import E.AbstractC0005f;
import a.AbstractC0124a;
import c3.C0295g;
import c3.InterfaceC0291c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.videoplayer.AndroidVideoPlayerApi;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public interface AndroidVideoPlayerApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InterfaceC0291c codec$delegate = new C0295g(new io.flutter.plugins.sharedpreferences.c(1));

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MessagesPigeonCodec codec_delegate$lambda$0() {
            return new MessagesPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, AndroidVideoPlayerApi androidVideoPlayerApi, String str, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, androidVideoPlayerApi, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$0$0(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            try {
                androidVideoPlayerApi.initialize();
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$1$0(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
            try {
                wrapError = AbstractC0124a.H(Long.valueOf(androidVideoPlayerApi.createForPlatformView((CreationOptions) obj2)));
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$0(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.videoplayer.CreationOptions");
            try {
                wrapError = AbstractC0124a.H(androidVideoPlayerApi.createForTextureView((CreationOptions) obj2));
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$0(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                androidVideoPlayerApi.dispose(((Long) obj2).longValue());
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$0(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                androidVideoPlayerApi.setMixWithOthers(((Boolean) obj2).booleanValue());
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$5$0(AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            try {
                wrapError = AbstractC0124a.H(androidVideoPlayerApi.getLookupKeyForAsset((String) obj2, (String) list.get(1)));
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) ((C0295g) codec$delegate).a();
        }

        public final void setUp(BinaryMessenger binaryMessenger, AndroidVideoPlayerApi androidVideoPlayerApi) {
            i.e(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, androidVideoPlayerApi, null, 4, null);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final AndroidVideoPlayerApi androidVideoPlayerApi, String messageChannelSuffix) {
            i.e(binaryMessenger, "binaryMessenger");
            i.e(messageChannelSuffix, "messageChannelSuffix");
            String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize", concat), getCodec());
            if (androidVideoPlayerApi != null) {
                final int i4 = 0;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$0$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 1:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$1$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 2:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$2$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 3:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$3$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 4:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$4$0(androidVideoPlayerApi, obj, reply);
                                break;
                            default:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$5$0(androidVideoPlayerApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForPlatformView", concat), getCodec());
            if (androidVideoPlayerApi != null) {
                final int i5 = 1;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$0$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 1:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$1$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 2:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$2$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 3:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$3$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 4:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$4$0(androidVideoPlayerApi, obj, reply);
                                break;
                            default:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$5$0(androidVideoPlayerApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForTextureView", concat), getCodec());
            if (androidVideoPlayerApi != null) {
                final int i6 = 2;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i6) {
                            case 0:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$0$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 1:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$1$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 2:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$2$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 3:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$3$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 4:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$4$0(androidVideoPlayerApi, obj, reply);
                                break;
                            default:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$5$0(androidVideoPlayerApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose", concat), getCodec());
            if (androidVideoPlayerApi != null) {
                final int i7 = 3;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i7) {
                            case 0:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$0$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 1:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$1$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 2:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$2$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 3:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$3$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 4:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$4$0(androidVideoPlayerApi, obj, reply);
                                break;
                            default:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$5$0(androidVideoPlayerApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers", concat), getCodec());
            if (androidVideoPlayerApi != null) {
                final int i8 = 4;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i8) {
                            case 0:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$0$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 1:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$1$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 2:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$2$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 3:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$3$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 4:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$4$0(androidVideoPlayerApi, obj, reply);
                                break;
                            default:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$5$0(androidVideoPlayerApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.getLookupKeyForAsset", concat), getCodec());
            if (androidVideoPlayerApi == null) {
                basicMessageChannel6.setMessageHandler(null);
            } else {
                final int i9 = 5;
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.videoplayer.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i9) {
                            case 0:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$0$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 1:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$1$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 2:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$2$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 3:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$3$0(androidVideoPlayerApi, obj, reply);
                                break;
                            case 4:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$4$0(androidVideoPlayerApi, obj, reply);
                                break;
                            default:
                                AndroidVideoPlayerApi.Companion.setUp$lambda$5$0(androidVideoPlayerApi, obj, reply);
                                break;
                        }
                    }
                });
            }
        }
    }

    long createForPlatformView(CreationOptions creationOptions);

    TexturePlayerIds createForTextureView(CreationOptions creationOptions);

    void dispose(long j4);

    String getLookupKeyForAsset(String str, String str2);

    void initialize();

    void setMixWithOthers(boolean z);
}
