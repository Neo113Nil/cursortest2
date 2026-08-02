package io.flutter.plugins.inapppurchase;

import E1.AbstractC0028d;
import E1.C;
import E1.C0027c;
import E1.E;
import android.content.Context;
import c3.C0297i;
import io.flutter.Log;

/* loaded from: classes.dex */
final class BillingClientFactoryImpl implements BillingClientFactory {

    /* renamed from: io.flutter.plugins.inapppurchase.BillingClientFactoryImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$inapppurchase$PlatformBillingChoiceMode;

        static {
            int[] iArr = new int[PlatformBillingChoiceMode.values().length];
            $SwitchMap$io$flutter$plugins$inapppurchase$PlatformBillingChoiceMode = iArr;
            try {
                iArr[PlatformBillingChoiceMode.ALTERNATIVE_BILLING_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$PlatformBillingChoiceMode[PlatformBillingChoiceMode.USER_CHOICE_BILLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$PlatformBillingChoiceMode[PlatformBillingChoiceMode.PLAY_BILLING_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C0297i lambda$createUserChoiceBillingListener$0(ResultCompat resultCompat) {
        Throwable exceptionOrNull = resultCompat.exceptionOrNull();
        if (exceptionOrNull != null) {
            Log.e("IN_APP_PURCHASE", "userSelectedalternativeBilling handler error: " + exceptionOrNull);
        }
        return C0297i.f5732a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createUserChoiceBillingListener$1(InAppPurchaseCallbackApi inAppPurchaseCallbackApi, E e4) {
        inAppPurchaseCallbackApi.userSelectedalternativeBilling(TranslatorKt.fromUserChoiceDetails(e4), ResultCompat.asCompatCallback(new a(0)));
    }

    @Override // io.flutter.plugins.inapppurchase.BillingClientFactory
    public AbstractC0028d createBillingClient(Context context, InAppPurchaseCallbackApi inAppPurchaseCallbackApi, PlatformBillingChoiceMode platformBillingChoiceMode, PlatformPendingPurchasesParams platformPendingPurchasesParams) {
        C0027c c0027c = new C0027c(context);
        c0027c.f578a = TranslatorKt.toPendingPurchasesParams(platformPendingPurchasesParams);
        int i4 = AnonymousClass1.$SwitchMap$io$flutter$plugins$inapppurchase$PlatformBillingChoiceMode[platformBillingChoiceMode.ordinal()];
        if (i4 == 1) {
            c0027c.f582e = true;
        } else if (i4 == 2) {
            c0027c.f581d = createUserChoiceBillingListener(inAppPurchaseCallbackApi);
        } else if (i4 != 3) {
            Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + platformBillingChoiceMode + ", Defaulting to PLAY_BILLING_ONLY");
        }
        c0027c.f580c = new PluginPurchaseListener(inAppPurchaseCallbackApi);
        return c0027c.a();
    }

    public C createUserChoiceBillingListener(InAppPurchaseCallbackApi inAppPurchaseCallbackApi) {
        return new f(inAppPurchaseCallbackApi);
    }
}
