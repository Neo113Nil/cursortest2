package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import ru.rustore.sdk.pay.internal.ak;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* loaded from: classes3.dex */
public final class mk extends kotlin.jvm.internal.s implements Function1<ak.a, Single<ak>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk f44650a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(bk bkVar) {
        super(1);
        this.f44650a = bkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak.a aVar = (ak.a) obj;
        if (aVar != null) {
            return Single.Companion.from(new lk(aVar));
        }
        bk bkVar = this.f44650a;
        di diVar = bkVar.f43876b;
        r rVar = diVar.f43971a;
        rVar.getClass();
        return SingleMapKt.map(SingleMapKt.map(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new p(rVar)), Dispatchers.INSTANCE.getIo()), new q(rVar)), new ci(diVar)), new ok(bkVar));
    }
}
