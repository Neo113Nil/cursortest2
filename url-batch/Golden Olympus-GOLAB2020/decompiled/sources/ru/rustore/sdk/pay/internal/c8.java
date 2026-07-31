package ru.rustore.sdk.pay.internal;

import android.os.SystemClock;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.g;
import ru.rustore.sdk.pay.model.ApplicationPurchaseStatus;
import ru.rustore.sdk.pay.model.ProductPurchaseStatus;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.PurchaseStatus;
import ru.rustore.sdk.pay.model.SubscriptionPurchaseStatus;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.observable.ObservableEmitter;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleBlockingGetKt;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* loaded from: classes3.dex */
public final class c8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final w4 f43902a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final wf f43903b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f43904c;

    public c8(@NotNull w4 currentTimeMillisRepository, @NotNull wf purchaseStatusRepository, @NotNull c activePurchaseRepository) {
        Intrinsics.checkNotNullParameter(currentTimeMillisRepository, "currentTimeMillisRepository");
        Intrinsics.checkNotNullParameter(purchaseStatusRepository, "purchaseStatusRepository");
        Intrinsics.checkNotNullParameter(activePurchaseRepository, "activePurchaseRepository");
        this.f43902a = currentTimeMillisRepository;
        this.f43903b = purchaseStatusRepository;
        this.f43904c = activePurchaseRepository;
    }

    public static final void a(c8 c8Var, ObservableEmitter observableEmitter, PurchaseId purchaseId, long j4) {
        Object m243constructorimpl;
        while (true) {
            c8Var.f43902a.getClass();
            if (SystemClock.elapsedRealtime() >= j4 || observableEmitter.isDisposed()) {
                return;
            }
            wf wfVar = c8Var.f43903b;
            wfVar.getClass();
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            sf sfVar = wfVar.f45166a;
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            we weVar = sfVar.f45003a;
            weVar.getClass();
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Object blockingGet = SingleBlockingGetKt.blockingGet(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new qe(purchaseId)), Dispatchers.INSTANCE.getIo()), new te(weVar.f45165a)), new rf(sfVar)), new vf(wfVar)));
            ResultKt.a(blockingGet);
            PurchaseStatus purchaseStatus = (PurchaseStatus) blockingGet;
            if (observableEmitter.isDisposed()) {
                return;
            }
            observableEmitter.onNext(purchaseStatus);
            if (c8Var.a(purchaseStatus)) {
                observableEmitter.onComplete();
                return;
            }
            c8Var.f43902a.getClass();
            long h4 = kotlin.ranges.g.h(j4 - SystemClock.elapsedRealtime(), 1500L);
            if (h4 > 0) {
                try {
                    Result.Companion companion = Result.Companion;
                    Thread.sleep(h4);
                    m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.d(m243constructorimpl) != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final boolean a(PurchaseStatus purchaseStatus) {
        g gVar;
        a aVar = this.f43904c.f43892a.f43838a;
        if (aVar instanceof a.b) {
            gVar = ((a.b) aVar).f43789b;
        } else {
            if (!(aVar instanceof a.C0255a) && aVar != null) {
                throw new W1.m();
            }
            gVar = null;
        }
        if ((gVar instanceof g.a.b) && purchaseStatus == ProductPurchaseStatus.PAID) {
            return true;
        }
        return ((gVar instanceof f) && purchaseStatus == ProductPurchaseStatus.PAID) || purchaseStatus == ApplicationPurchaseStatus.CONFIRMED || purchaseStatus == ProductPurchaseStatus.CONFIRMED || purchaseStatus == ProductPurchaseStatus.PAID || purchaseStatus == SubscriptionPurchaseStatus.ACTIVE || purchaseStatus == ProductPurchaseStatus.REJECTED || purchaseStatus == ApplicationPurchaseStatus.REJECTED || purchaseStatus == SubscriptionPurchaseStatus.REJECTED;
    }
}
