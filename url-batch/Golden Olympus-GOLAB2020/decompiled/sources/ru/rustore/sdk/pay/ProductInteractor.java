package ru.rustore.sdk.pay;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.pay.internal.dc;
import ru.rustore.sdk.pay.internal.dh;
import ru.rustore.sdk.pay.internal.ec;
import ru.rustore.sdk.pay.internal.fb;
import ru.rustore.sdk.pay.internal.gb;
import ru.rustore.sdk.pay.internal.hb;
import ru.rustore.sdk.pay.internal.kb;
import ru.rustore.sdk.pay.internal.lb;
import ru.rustore.sdk.pay.internal.mb;
import ru.rustore.sdk.pay.internal.nb;
import ru.rustore.sdk.pay.internal.z5;
import ru.rustore.sdk.pay.model.Product;
import ru.rustore.sdk.pay.model.ProductId;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

@Metadata
/* loaded from: classes3.dex */
public final class ProductInteractor {

    @NotNull
    private final fb controller;

    public ProductInteractor(@NotNull fb controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
    }

    @NotNull
    public final Task<List<Product>> getProducts(@NotNull List<ProductId> ids) {
        Intrinsics.checkNotNullParameter(ids, "productsId");
        fb fbVar = this.controller;
        fbVar.getClass();
        Intrinsics.checkNotNullParameter(ids, "productsId");
        z5 z5Var = fbVar.f44061a;
        z5Var.getClass();
        Intrinsics.checkNotNullParameter(ids, "ids");
        ec ecVar = z5Var.f45313a;
        ecVar.getClass();
        Intrinsics.checkNotNullParameter(ids, "ids");
        hb hbVar = ecVar.f44033a;
        hbVar.getClass();
        Intrinsics.checkNotNullParameter(ids, "ids");
        nb nbVar = hbVar.f44231a;
        nbVar.getClass();
        Intrinsics.checkNotNullParameter(ids, "ids");
        return dh.a(SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleMapKt.map(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new kb(nbVar, ids)), Dispatchers.INSTANCE.getIo()), new lb(nbVar)), new mb(nbVar)), new gb(hbVar)), new dc(ecVar)));
    }
}
