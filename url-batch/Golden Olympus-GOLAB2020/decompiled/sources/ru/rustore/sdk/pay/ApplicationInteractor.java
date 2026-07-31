package ru.rustore.sdk.pay;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.b;
import ru.rustore.sdk.pay.internal.c;
import ru.rustore.sdk.pay.internal.c0;
import ru.rustore.sdk.pay.internal.d0;
import ru.rustore.sdk.pay.internal.dh;
import ru.rustore.sdk.pay.internal.g8;
import ru.rustore.sdk.pay.internal.ma;
import ru.rustore.sdk.pay.internal.pk;
import ru.rustore.sdk.pay.internal.presentation.ui.PayActivity;
import ru.rustore.sdk.pay.internal.qj;
import ru.rustore.sdk.pay.internal.rj;
import ru.rustore.sdk.pay.model.ApplicationPurchaseResult;
import ru.rustore.sdk.pay.model.PackageName;
import ru.rustore.sdk.pay.model.SdkTheme;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.observable.ObservableMapKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeOnKt;
import ru.rustore.sdk.reactive.observable.ObservableTakeFirstKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class ApplicationInteractor {

    @NotNull
    private final d0 controller;

    public ApplicationInteractor(@NotNull d0 controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
    }

    public static /* synthetic */ Task purchase$default(ApplicationInteractor applicationInteractor, PackageName packageName, SdkTheme sdkTheme, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            sdkTheme = SdkTheme.LIGHT;
        }
        return applicationInteractor.purchase(packageName, sdkTheme);
    }

    @NotNull
    public final Task<ApplicationPurchaseResult> purchase(@NotNull PackageName packageName, @NotNull SdkTheme sdkTheme) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        d0 d0Var = this.controller;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        ma maVar = d0Var.f43948c.f45149a.f44684a;
        synchronized (maVar) {
            maVar.f44639a = null;
        }
        a.C0255a purchase = new a.C0255a(packageName);
        pk pkVar = d0Var.f43946a;
        pkVar.getClass();
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        c cVar = pkVar.f44789a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        b bVar = cVar.f43892a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        bVar.f43838a = purchase;
        rj rjVar = d0Var.f43949d;
        rjVar.getClass();
        Intrinsics.checkNotNullParameter(sdkTheme, "theme");
        qj qjVar = rjVar.f44931a;
        qjVar.getClass();
        Intrinsics.checkNotNullParameter(sdkTheme, "theme");
        qjVar.f44852a.set(sdkTheme);
        g8 g8Var = d0Var.f43950e;
        g8Var.getClass();
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        Context context = g8Var.f44163a;
        int i4 = PayActivity.f44804a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkTheme, "sdkTheme");
        Intent intent = new Intent(context, (Class<?>) PayActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("SDK_THEME_TAG", sdkTheme);
        context.startActivity(intent);
        return dh.a(ObservableMapKt.map(ObservableTakeFirstKt.takeFirst$default(ObservableSubscribeOnKt.subscribeOn(Subject.DefaultImpls.observe$default(d0Var.f43947b.f43959a.f44644a.f44479a, null, 1, null), Dispatchers.INSTANCE.getIo()), 0, 1, null), new c0(d0Var)));
    }
}
