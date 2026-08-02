package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import a.AbstractC0124a;
import c3.C0293e;
import c3.C0294f;
import c3.C0295g;
import c3.C0297i;
import c3.InterfaceC0291c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.inapppurchase.InAppPurchaseApi;
import java.util.List;
import kotlin.jvm.internal.i;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public interface InAppPurchaseApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InterfaceC0291c codec$delegate = new C0295g(new d(0));

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MessagesPigeonCodec codec_delegate$lambda$0() {
            return new MessagesPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, InAppPurchaseApi inAppPurchaseApi, String str, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, inAppPurchaseApi, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$0$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            try {
                wrapError = AbstractC0124a.H(Boolean.valueOf(inAppPurchaseApi.isReady()));
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$1$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj2).longValue();
            Object obj3 = list.get(1);
            i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
            Object obj4 = list.get(2);
            i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
            inAppPurchaseApi.startConnection(longValue, (PlatformBillingChoiceMode) obj3, (PlatformPendingPurchasesParams) obj4, new b(5, reply));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0297i setUp$lambda$1$0$0(BasicMessageChannel.Reply reply, C0294f c0294f) {
            Throwable a3 = C0294f.a(c0294f.f5727a);
            if (a3 != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(a3));
            } else {
                Object obj = c0294f.f5727a;
                if (obj instanceof C0293e) {
                    obj = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingResult) obj));
            }
            return C0297i.f5732a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$10$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            i.e(reply, "reply");
            inAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync(new b(0, reply));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0297i setUp$lambda$10$0$0(BasicMessageChannel.Reply reply, C0294f c0294f) {
            Throwable a3 = C0294f.a(c0294f.f5727a);
            if (a3 != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(a3));
            } else {
                Object obj = c0294f.f5727a;
                if (obj instanceof C0293e) {
                    obj = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingResult) obj));
            }
            return C0297i.f5732a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$11$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            i.e(reply, "reply");
            inAppPurchaseApi.showAlternativeBillingOnlyInformationDialog(new b(7, reply));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0297i setUp$lambda$11$0$0(BasicMessageChannel.Reply reply, C0294f c0294f) {
            Throwable a3 = C0294f.a(c0294f.f5727a);
            if (a3 != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(a3));
            } else {
                Object obj = c0294f.f5727a;
                if (obj instanceof C0293e) {
                    obj = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingResult) obj));
            }
            return C0297i.f5732a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$12$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            i.e(reply, "reply");
            inAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync(new b(1, reply));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0297i setUp$lambda$12$0$0(BasicMessageChannel.Reply reply, C0294f c0294f) {
            Throwable a3 = C0294f.a(c0294f.f5727a);
            if (a3 != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(a3));
            } else {
                Object obj = c0294f.f5727a;
                if (obj instanceof C0293e) {
                    obj = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformAlternativeBillingOnlyReportingDetailsResponse) obj));
            }
            return C0297i.f5732a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            try {
                inAppPurchaseApi.endConnection();
                wrapError = AbstractC0124a.H(null);
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            i.e(reply, "reply");
            inAppPurchaseApi.getBillingConfigAsync(new b(8, reply));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0297i setUp$lambda$3$0$0(BasicMessageChannel.Reply reply, C0294f c0294f) {
            Throwable a3 = C0294f.a(c0294f.f5727a);
            if (a3 != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(a3));
            } else {
                Object obj = c0294f.f5727a;
                if (obj instanceof C0293e) {
                    obj = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingConfigResponse) obj));
            }
            return C0297i.f5732a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
            try {
                wrapError = AbstractC0124a.H(inAppPurchaseApi.launchBillingFlow((PlatformBillingFlowParams) obj2));
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$5$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            inAppPurchaseApi.acknowledgePurchase((String) obj2, new b(3, reply));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0297i setUp$lambda$5$0$0(BasicMessageChannel.Reply reply, C0294f c0294f) {
            Throwable a3 = C0294f.a(c0294f.f5727a);
            if (a3 != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(a3));
            } else {
                Object obj = c0294f.f5727a;
                if (obj instanceof C0293e) {
                    obj = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingResult) obj));
            }
            return C0297i.f5732a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$6$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            inAppPurchaseApi.consumeAsync((String) obj2, new b(4, reply));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0297i setUp$lambda$6$0$0(BasicMessageChannel.Reply reply, C0294f c0294f) {
            Throwable a3 = C0294f.a(c0294f.f5727a);
            if (a3 != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(a3));
            } else {
                Object obj = c0294f.f5727a;
                if (obj instanceof C0293e) {
                    obj = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingResult) obj));
            }
            return C0297i.f5732a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$7$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
            inAppPurchaseApi.queryPurchasesAsync((PlatformProductType) obj2, new b(6, reply));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0297i setUp$lambda$7$0$0(BasicMessageChannel.Reply reply, C0294f c0294f) {
            Throwable a3 = C0294f.a(c0294f.f5727a);
            if (a3 != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(a3));
            } else {
                Object obj = c0294f.f5727a;
                if (obj instanceof C0293e) {
                    obj = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformPurchasesResponse) obj));
            }
            return C0297i.f5732a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$8$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
            inAppPurchaseApi.queryProductDetailsAsync((List) obj2, new b(2, reply));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0297i setUp$lambda$8$0$0(BasicMessageChannel.Reply reply, C0294f c0294f) {
            Throwable a3 = C0294f.a(c0294f.f5727a);
            if (a3 != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(a3));
            } else {
                Object obj = c0294f.f5727a;
                if (obj instanceof C0293e) {
                    obj = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformProductDetailsResponse) obj));
            }
            return C0297i.f5732a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$9$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> wrapError;
            i.e(reply, "reply");
            i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
            try {
                wrapError = AbstractC0124a.H(Boolean.valueOf(inAppPurchaseApi.isFeatureSupported((PlatformBillingClientFeature) obj2)));
            } catch (Throwable th) {
                wrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(wrapError);
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) ((C0295g) codec$delegate).a();
        }

        public final void setUp(BinaryMessenger binaryMessenger, InAppPurchaseApi inAppPurchaseApi) {
            i.e(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, inAppPurchaseApi, null, 4, null);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final InAppPurchaseApi inAppPurchaseApi, String messageChannelSuffix) {
            i.e(binaryMessenger, "binaryMessenger");
            i.e(messageChannelSuffix, "messageChannelSuffix");
            String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isReady", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i4 = 11;
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i4) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.startConnection", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i5 = 2;
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i5) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.endConnection", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i6 = 3;
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i6) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.getBillingConfigAsync", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i7 = 4;
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i7) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.launchBillingFlow", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i8 = 5;
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i8) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.acknowledgePurchase", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i9 = 6;
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i9) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.consumeAsync", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i10 = 7;
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i10) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchasesAsync", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i11 = 8;
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i11) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryProductDetailsAsync", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i12 = 9;
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i12) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isFeatureSupported", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i13 = 10;
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i13) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i14 = 12;
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i14) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.showAlternativeBillingOnlyInformationDialog", concat), getCodec());
            if (inAppPurchaseApi != null) {
                final int i15 = 0;
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i15) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync", concat), getCodec());
            if (inAppPurchaseApi == null) {
                basicMessageChannel13.setMessageHandler(null);
            } else {
                final int i16 = 1;
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i16) {
                            case 0:
                                InAppPurchaseApi.Companion.setUp$lambda$11$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 1:
                                InAppPurchaseApi.Companion.setUp$lambda$12$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 2:
                                InAppPurchaseApi.Companion.setUp$lambda$1$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 3:
                                InAppPurchaseApi.Companion.setUp$lambda$2$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 4:
                                InAppPurchaseApi.Companion.setUp$lambda$3$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 5:
                                InAppPurchaseApi.Companion.setUp$lambda$4$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 6:
                                InAppPurchaseApi.Companion.setUp$lambda$5$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 7:
                                InAppPurchaseApi.Companion.setUp$lambda$6$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 8:
                                InAppPurchaseApi.Companion.setUp$lambda$7$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 9:
                                InAppPurchaseApi.Companion.setUp$lambda$8$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 10:
                                InAppPurchaseApi.Companion.setUp$lambda$9$0(inAppPurchaseApi, obj, reply);
                                break;
                            case 11:
                                InAppPurchaseApi.Companion.setUp$lambda$0$0(inAppPurchaseApi, obj, reply);
                                break;
                            default:
                                InAppPurchaseApi.Companion.setUp$lambda$10$0(inAppPurchaseApi, obj, reply);
                                break;
                        }
                    }
                });
            }
        }
    }

    void acknowledgePurchase(String str, InterfaceC1339l interfaceC1339l);

    void consumeAsync(String str, InterfaceC1339l interfaceC1339l);

    void createAlternativeBillingOnlyReportingDetailsAsync(InterfaceC1339l interfaceC1339l);

    void endConnection();

    void getBillingConfigAsync(InterfaceC1339l interfaceC1339l);

    void isAlternativeBillingOnlyAvailableAsync(InterfaceC1339l interfaceC1339l);

    boolean isFeatureSupported(PlatformBillingClientFeature platformBillingClientFeature);

    boolean isReady();

    PlatformBillingResult launchBillingFlow(PlatformBillingFlowParams platformBillingFlowParams);

    void queryProductDetailsAsync(List<PlatformQueryProduct> list, InterfaceC1339l interfaceC1339l);

    void queryPurchasesAsync(PlatformProductType platformProductType, InterfaceC1339l interfaceC1339l);

    void showAlternativeBillingOnlyInformationDialog(InterfaceC1339l interfaceC1339l);

    void startConnection(long j4, PlatformBillingChoiceMode platformBillingChoiceMode, PlatformPendingPurchasesParams platformPendingPurchasesParams, InterfaceC1339l interfaceC1339l);
}
