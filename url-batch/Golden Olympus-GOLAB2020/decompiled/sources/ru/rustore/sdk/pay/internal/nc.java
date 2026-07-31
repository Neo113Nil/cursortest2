package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* loaded from: classes3.dex */
public final class nc extends kotlin.jvm.internal.s implements Function1<String, Single<u7>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oc f44688a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(oc ocVar) {
        super(1);
        this.f44688a = ocVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String host = (String) obj;
        Intrinsics.checkNotNullParameter(host, "host");
        this.f44688a.getClass();
        return SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(Single.Companion.from(lc.f44512a), Dispatchers.INSTANCE.getIo()), new mc(this.f44688a, host));
    }
}
