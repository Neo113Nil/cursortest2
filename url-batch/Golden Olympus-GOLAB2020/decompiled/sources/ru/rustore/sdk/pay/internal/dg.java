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
public final class dg extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg f43964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f43965b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(hg hgVar, PurchaseId purchaseId) {
        super(1);
        this.f43964a = hgVar;
        this.f43965b = purchaseId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable error = (Throwable) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        hg hgVar = this.f43964a;
        int i4 = hgVar.f44271n + 1;
        hgVar.f44271n = i4;
        if (((error instanceof UnknownHostException) || (error instanceof ConnectException) || (error instanceof SocketTimeoutException)) && i4 < 5) {
            hgVar.f44270m.add(SingleSubscribeKt.subscribe$default(SingleDelayKt.delay$default(Single.Companion.from(fg.f44128a), 5000L, null, 2, null), null, new gg(hgVar, this.f43965b), 1, null));
        } else {
            String localizedMessage = error.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "Error occurred during payment by mobile phone account";
            }
            hgVar.b(localizedMessage);
        }
        return Unit.f41027a;
    }
}
