package ru.rustore.sdk.pay;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.g8;
import ru.rustore.sdk.pay.internal.presentation.ui.PayActivity;
import ru.rustore.sdk.pay.internal.qj;
import ru.rustore.sdk.pay.internal.rj;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.internal.z6;
import ru.rustore.sdk.pay.model.SdkTheme;

@Metadata
/* loaded from: classes3.dex */
public final class IntentInteractor {

    @NotNull
    private final z6 controller;

    public IntentInteractor(@NotNull z6 controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
    }

    public static /* synthetic */ void proceedIntent$default(IntentInteractor intentInteractor, Intent intent, SdkTheme sdkTheme, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            sdkTheme = SdkTheme.LIGHT;
        }
        intentInteractor.proceedIntent(intent, sdkTheme);
    }

    public final void proceedIntent(@Nullable Intent intent, @NotNull SdkTheme sdkTheme) {
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        z6 z6Var = this.controller;
        z6Var.getClass();
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        ua paymentType = z6Var.f45314a.f45161a.f45124a;
        if (paymentType == null) {
            return;
        }
        Uri data = intent != null ? intent.getData() : null;
        boolean z4 = false;
        if (data != null) {
            String value = z6Var.f45315b.a().getValue();
            String uri = data.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
            z4 = StringsKt.P(uri, value, false, 2, null);
        }
        if (z4) {
            if ((paymentType instanceof ua.e) || (paymentType instanceof ua.d)) {
                rj rjVar = z6Var.f45316c;
                rjVar.getClass();
                Intrinsics.checkNotNullParameter(sdkTheme, "theme");
                qj qjVar = rjVar.f44931a;
                qjVar.getClass();
                Intrinsics.checkNotNullParameter(sdkTheme, "theme");
                qjVar.f44852a.set(sdkTheme);
                g8 g8Var = z6Var.f45317d;
                g8Var.getClass();
                Intrinsics.checkNotNullParameter(paymentType, "paymentType");
                Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
                Context context = g8Var.f44163a;
                int i4 = PayActivity.f44804a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(paymentType, "paymentType");
                Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
                Intent intent2 = new Intent(context, (Class<?>) PayActivity.class);
                intent2.setFlags(268435456);
                intent2.putExtra("PAYMENT_TYPE_TAG", paymentType);
                intent2.putExtra("SDK_THEME_TAG", sdkTheme);
                context.startActivity(intent2);
            }
        }
    }
}
