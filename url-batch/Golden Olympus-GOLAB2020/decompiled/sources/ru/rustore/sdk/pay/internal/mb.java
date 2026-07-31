package ru.rustore.sdk.pay.internal;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.reactive.single.Single;

/* loaded from: classes3.dex */
public final class mb extends kotlin.jvm.internal.s implements Function1<Pair<? extends String, ? extends ki.b>, Single<u7>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nb f44640a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(nb nbVar) {
        super(1);
        this.f44640a = nbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        return this.f44640a.f44686b.a((String) pair.component1(), (ki.b) pair.component2());
    }
}
