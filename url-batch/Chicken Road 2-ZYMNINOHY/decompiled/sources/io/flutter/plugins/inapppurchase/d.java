package io.flutter.plugins.inapppurchase;

import io.flutter.plugins.inapppurchase.InAppPurchaseApi;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13577a;

    public /* synthetic */ d(int i4) {
        this.f13577a = i4;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        MessagesPigeonCodec codec_delegate$lambda$0;
        MessagesPigeonCodec codec_delegate$lambda$02;
        switch (this.f13577a) {
            case 0:
                codec_delegate$lambda$0 = InAppPurchaseApi.Companion.codec_delegate$lambda$0();
                return codec_delegate$lambda$0;
            default:
                codec_delegate$lambda$02 = InAppPurchaseCallbackApi.codec_delegate$lambda$0();
                return codec_delegate$lambda$02;
        }
    }
}
