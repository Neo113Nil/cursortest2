package ru.rustore.sdk.pay.internal;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.reactive.single.Single;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.s implements Function1<Pair<? extends String, ? extends ki.b>, Single<u7>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f44806a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar) {
        super(1);
        this.f44806a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        return this.f44806a.f44858a.a((String) pair.component1(), (ki.b) pair.component2());
    }
}
