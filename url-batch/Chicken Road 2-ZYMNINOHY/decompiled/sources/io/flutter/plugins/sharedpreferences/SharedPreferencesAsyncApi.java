package io.flutter.plugins.sharedpreferences;

import E.AbstractC0005f;
import a.AbstractC0124a;
import c3.C0295g;
import c3.InterfaceC0291c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public interface SharedPreferencesAsyncApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InterfaceC0291c codec$delegate = new C0295g(new c(0));

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MessagesAsyncPigeonCodec codec_delegate$lambda$0() {
            return new MessagesAsyncPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, SharedPreferencesAsyncApi sharedPreferencesAsyncApi, String str, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, sharedPreferencesAsyncApi, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$0$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setBool(str, booleanValue, (SharedPreferencesPigeonOptions) obj4);
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$1$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setString(str, str2, (SharedPreferencesPigeonOptions) obj4);
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$10$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = AbstractC0124a.H(sharedPreferencesAsyncApi.getPlatformEncodedStringList(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$11$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = AbstractC0124a.H(sharedPreferencesAsyncApi.getStringList(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$12$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.clear(list2, (SharedPreferencesPigeonOptions) obj2);
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$13$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = AbstractC0124a.H(sharedPreferencesAsyncApi.getAll(list2, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$14$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = AbstractC0124a.H(sharedPreferencesAsyncApi.getKeys(list2, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj3).longValue();
            Object obj4 = list.get(2);
            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setInt(str, longValue, (SharedPreferencesPigeonOptions) obj4);
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue = ((Double) obj3).doubleValue();
            Object obj4 = list.get(2);
            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setDouble(str, doubleValue, (SharedPreferencesPigeonOptions) obj4);
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setEncodedStringList(str, str2, (SharedPreferencesPigeonOptions) obj4);
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$5$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List<String> list2 = (List) obj3;
            Object obj4 = list.get(2);
            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setDeprecatedStringList(str, list2, (SharedPreferencesPigeonOptions) obj4);
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$6$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = AbstractC0124a.H(sharedPreferencesAsyncApi.getString(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$7$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = AbstractC0124a.H(sharedPreferencesAsyncApi.getBool(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$8$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = AbstractC0124a.H(sharedPreferencesAsyncApi.getDouble(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$9$0(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = AbstractC0124a.H(sharedPreferencesAsyncApi.getInt(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                wrapError = MessagesAsyncPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) ((C0295g) codec$delegate).a();
        }

        public final void setUp(BinaryMessenger binaryMessenger, SharedPreferencesAsyncApi sharedPreferencesAsyncApi) {
            i.e(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, sharedPreferencesAsyncApi, null, 4, null);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final SharedPreferencesAsyncApi sharedPreferencesAsyncApi, String messageChannelSuffix) {
            i.e(binaryMessenger, "binaryMessenger");
            i.e(messageChannelSuffix, "messageChannelSuffix");
            String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            BinaryMessenger.TaskQueue makeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i4 = 0;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i5 = 11;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i6 = 12;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i6) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i7 = 13;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i7) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i8 = 14;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i8) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i9 = 1;
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i9) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i10 = 2;
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i10) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i11 = 3;
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i11) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i12 = 4;
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i12) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i13 = 5;
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i13) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i14 = 6;
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i14) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i15 = 7;
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i15) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i16 = 8;
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i16) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i17 = 9;
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i17) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), getCodec(), makeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi == null) {
                basicMessageChannel15.setMessageHandler(null);
            } else {
                final int i18 = 10;
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i18) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$5$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$0(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            }
        }
    }

    void clear(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Boolean getBool(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Double getDouble(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Long getInt(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    List<String> getPlatformEncodedStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    String getString(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    StringListResult getStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setBool(String str, boolean z, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setDeprecatedStringList(String str, List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setDouble(String str, double d4, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setEncodedStringList(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setInt(String str, long j4, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setString(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);
}
