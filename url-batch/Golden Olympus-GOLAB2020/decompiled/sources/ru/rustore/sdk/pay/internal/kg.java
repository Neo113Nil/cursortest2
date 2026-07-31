package ru.rustore.sdk.pay.internal;

import androidx.lifecycle.V;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.ai;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.Subject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

@Metadata
/* loaded from: classes3.dex */
public final class kg extends V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final yj f44480a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Subject<ai> f44481b;

    public kg() {
        yj serviceLocator = yj.I3;
        if (serviceLocator == null) {
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        this.f44480a = serviceLocator;
        yh yhVar = (yh) serviceLocator.f45506f3.getValue();
        xl successUrlRepository = yhVar.f45271a;
        q5 failureUrlRepository = yhVar.f45272b;
        e activePurchaseStateRepository = yhVar.f45273c;
        t5 getActivePurchaseUseCase = yhVar.f45274d;
        f6 getPurchaseApplicationUseCase = yhVar.f45275e;
        y5 getProductPurchaseUseCase = yhVar.f45276f;
        bi rejectPurchaseUseCase = yhVar.f45277g;
        zh router = yhVar.f45278h;
        xh analytics = yhVar.f45279i;
        bb postMessageFactory = yhVar.f45280j;
        y7 logger = yhVar.f45281k;
        Intrinsics.checkNotNullParameter(successUrlRepository, "successUrlRepository");
        Intrinsics.checkNotNullParameter(failureUrlRepository, "failureUrlRepository");
        Intrinsics.checkNotNullParameter(activePurchaseStateRepository, "activePurchaseStateRepository");
        Intrinsics.checkNotNullParameter(getActivePurchaseUseCase, "getActivePurchaseUseCase");
        Intrinsics.checkNotNullParameter(getPurchaseApplicationUseCase, "getPurchaseApplicationUseCase");
        Intrinsics.checkNotNullParameter(getProductPurchaseUseCase, "getProductPurchaseUseCase");
        Intrinsics.checkNotNullParameter(rejectPurchaseUseCase, "rejectPurchaseUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(postMessageFactory, "postMessageFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        new ArrayList();
        this.f44481b = SubjectExtensionsKt.asSubject(new MutableStateSubject(ai.a.f43821a));
    }

    @Override // androidx.lifecycle.V
    public final void onCleared() {
        yh yhVar = (yh) this.f44480a.f45506f3.getValue();
        xl successUrlRepository = yhVar.f45271a;
        q5 failureUrlRepository = yhVar.f45272b;
        e activePurchaseStateRepository = yhVar.f45273c;
        t5 getActivePurchaseUseCase = yhVar.f45274d;
        f6 getPurchaseApplicationUseCase = yhVar.f45275e;
        y5 getProductPurchaseUseCase = yhVar.f45276f;
        bi rejectPurchaseUseCase = yhVar.f45277g;
        zh router = yhVar.f45278h;
        xh analytics = yhVar.f45279i;
        bb postMessageFactory = yhVar.f45280j;
        y7 logger = yhVar.f45281k;
        Intrinsics.checkNotNullParameter(successUrlRepository, "successUrlRepository");
        Intrinsics.checkNotNullParameter(failureUrlRepository, "failureUrlRepository");
        Intrinsics.checkNotNullParameter(activePurchaseStateRepository, "activePurchaseStateRepository");
        Intrinsics.checkNotNullParameter(getActivePurchaseUseCase, "getActivePurchaseUseCase");
        Intrinsics.checkNotNullParameter(getPurchaseApplicationUseCase, "getPurchaseApplicationUseCase");
        Intrinsics.checkNotNullParameter(getProductPurchaseUseCase, "getProductPurchaseUseCase");
        Intrinsics.checkNotNullParameter(rejectPurchaseUseCase, "rejectPurchaseUseCase");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(postMessageFactory, "postMessageFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        ArrayList arrayList = new ArrayList();
        SubjectExtensionsKt.asSubject(new MutableStateSubject(ai.a.f43821a));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Disposable) obj).dispose();
        }
        super.onCleared();
    }
}
