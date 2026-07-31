package ru.rustore.sdk.pay.internal;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleDelayKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;

/* loaded from: classes3.dex */
public final class sh extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wh f45017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f45018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(wh whVar, PurchaseId purchaseId) {
        super(1);
        this.f45017a = whVar;
        this.f45018b = purchaseId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        wh whVar = this.f45017a;
        int i4 = whVar.f45188m + 1;
        whVar.f45188m = i4;
        if (((error instanceof UnknownHostException) || (error instanceof ConnectException) || (error instanceof SocketTimeoutException)) && i4 < 5) {
            whVar.f45187l.add(SingleSubscribeKt.subscribe$default(SingleDelayKt.delay$default(Single.Companion.from(uh.f45103a), 5000L, null, 2, null), null, new vh(whVar, this.f45018b), 1, null));
        } else {
            String localizedMessage = error.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "Error occurred during payment by card";
            }
            whVar.a(localizedMessage);
        }
        return Unit.f41027a;
    }
}
