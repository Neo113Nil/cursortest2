package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;

/* loaded from: classes3.dex */
public final class al extends kotlin.jvm.internal.s implements Function1<yk, Single<u7>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl f43835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u7 f43836b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(cl clVar, u7 u7Var) {
        super(1);
        this.f43835a = clVar;
        this.f43836b = u7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Single flatMap;
        yk signature = (yk) obj;
        Intrinsics.checkNotNullParameter(signature, "signature");
        cl clVar = this.f43835a;
        u7 u7Var = this.f43836b;
        wk wkVar = clVar.f43934a;
        String keyId = signature.f45299a;
        String responseData = signature.f45301c;
        wkVar.getClass();
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        e6 e6Var = wkVar.f45192a;
        Intrinsics.checkNotNullParameter(keyId, "value");
        if (StringsKt.z(keyId)) {
            throw new IllegalStateException("Check failed.");
        }
        e6Var.getClass();
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        synchronized (e6Var) {
            flatMap = SingleFlatMapKt.flatMap(Single.Companion.from(new a6(e6Var, keyId)), new d6(e6Var, keyId));
        }
        return SingleMapKt.map(SingleFlatMapKt.flatMap(flatMap, new uk(wkVar, responseData)), new bl(signature, u7Var, clVar));
    }
}
