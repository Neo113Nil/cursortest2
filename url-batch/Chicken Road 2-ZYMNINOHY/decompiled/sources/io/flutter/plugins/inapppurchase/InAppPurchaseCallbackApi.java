package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import O3.l;
import a.AbstractC0124a;
import c3.C0294f;
import c3.C0295g;
import c3.C0297i;
import c3.InterfaceC0291c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.jvm.internal.i;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class InAppPurchaseCallbackApi {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0291c codec$delegate = new C0295g(new d(1));
    private final BinaryMessenger binaryMessenger;
    private final String messageChannelSuffix;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) ((C0295g) InAppPurchaseCallbackApi.codec$delegate).a();
        }

        private Companion() {
        }
    }

    public InAppPurchaseCallbackApi(BinaryMessenger binaryMessenger, String messageChannelSuffix) {
        i.e(binaryMessenger, "binaryMessenger");
        i.e(messageChannelSuffix, "messageChannelSuffix");
        this.binaryMessenger = binaryMessenger;
        this.messageChannelSuffix = messageChannelSuffix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessagesPigeonCodec codec_delegate$lambda$0() {
        return new MessagesPigeonCodec();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingServiceDisconnected$lambda$0(InterfaceC1339l interfaceC1339l, String str, Object obj) {
        if (!(obj instanceof List)) {
            interfaceC1339l.invoke(new C0294f(l.h(MessagesPigeonUtils.INSTANCE.createConnectionError(str))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            interfaceC1339l.invoke(new C0294f(C0297i.f5732a));
            return;
        }
        Object obj2 = list.get(0);
        i.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        i.c(obj3, "null cannot be cast to non-null type kotlin.String");
        interfaceC1339l.invoke(new C0294f(l.h(new FlutterError((String) obj2, (String) obj3, (String) list.get(2)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPurchasesUpdated$lambda$0(InterfaceC1339l interfaceC1339l, String str, Object obj) {
        if (!(obj instanceof List)) {
            interfaceC1339l.invoke(new C0294f(l.h(MessagesPigeonUtils.INSTANCE.createConnectionError(str))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            interfaceC1339l.invoke(new C0294f(C0297i.f5732a));
            return;
        }
        Object obj2 = list.get(0);
        i.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        i.c(obj3, "null cannot be cast to non-null type kotlin.String");
        interfaceC1339l.invoke(new C0294f(l.h(new FlutterError((String) obj2, (String) obj3, (String) list.get(2)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void userSelectedalternativeBilling$lambda$0(InterfaceC1339l interfaceC1339l, String str, Object obj) {
        if (!(obj instanceof List)) {
            interfaceC1339l.invoke(new C0294f(l.h(MessagesPigeonUtils.INSTANCE.createConnectionError(str))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            interfaceC1339l.invoke(new C0294f(C0297i.f5732a));
            return;
        }
        Object obj2 = list.get(0);
        i.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        i.c(obj3, "null cannot be cast to non-null type kotlin.String");
        interfaceC1339l.invoke(new C0294f(l.h(new FlutterError((String) obj2, (String) obj3, (String) list.get(2)))));
    }

    public final void onBillingServiceDisconnected(long j4, InterfaceC1339l callback) {
        i.e(callback, "callback");
        String n = AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected", this.messageChannelSuffix.length() > 0 ? AbstractC0005f.n(".", this.messageChannelSuffix) : "");
        new BasicMessageChannel(this.binaryMessenger, n, Companion.getCodec()).send(AbstractC0124a.H(Long.valueOf(j4)), new e(callback, n, 1));
    }

    public final void onPurchasesUpdated(PlatformPurchasesResponse updateArg, InterfaceC1339l callback) {
        i.e(updateArg, "updateArg");
        i.e(callback, "callback");
        String n = AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated", this.messageChannelSuffix.length() > 0 ? AbstractC0005f.n(".", this.messageChannelSuffix) : "");
        new BasicMessageChannel(this.binaryMessenger, n, Companion.getCodec()).send(AbstractC0124a.H(updateArg), new e(callback, n, 0));
    }

    public final void userSelectedalternativeBilling(PlatformUserChoiceDetails detailsArg, InterfaceC1339l callback) {
        i.e(detailsArg, "detailsArg");
        i.e(callback, "callback");
        String n = AbstractC0005f.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling", this.messageChannelSuffix.length() > 0 ? AbstractC0005f.n(".", this.messageChannelSuffix) : "");
        new BasicMessageChannel(this.binaryMessenger, n, Companion.getCodec()).send(AbstractC0124a.H(detailsArg), new e(callback, n, 2));
    }

    public /* synthetic */ InAppPurchaseCallbackApi(BinaryMessenger binaryMessenger, String str, int i4, kotlin.jvm.internal.e eVar) {
        this(binaryMessenger, (i4 & 2) != 0 ? "" : str);
    }
}
