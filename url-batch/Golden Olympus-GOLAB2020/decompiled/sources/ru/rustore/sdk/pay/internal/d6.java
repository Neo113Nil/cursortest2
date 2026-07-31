package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapKt;

/* loaded from: classes3.dex */
public final class d6 extends kotlin.jvm.internal.s implements Function1<gc, Single<gc>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e6 f43957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f43958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(e6 e6Var, String str) {
        super(1);
        this.f43957a = e6Var;
        this.f43958b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Single map;
        gc gcVar = (gc) obj;
        if (gcVar != null) {
            return Single.Companion.from(new c6(gcVar));
        }
        rc rcVar = this.f43957a.f44001a;
        synchronized (rcVar) {
            map = SingleMapKt.map(rcVar.f44911a.a(), new qc(rcVar));
        }
        return SingleMapKt.map(map, new b6(this.f43958b));
    }
}
