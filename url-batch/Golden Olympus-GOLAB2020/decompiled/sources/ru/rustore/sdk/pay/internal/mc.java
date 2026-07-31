package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.reactive.single.Single;

/* loaded from: classes3.dex */
public final class mc extends kotlin.jvm.internal.s implements Function1<ki.a, Single<u7>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oc f44641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(oc ocVar, String str) {
        super(1);
        this.f44641a = ocVar;
        this.f44642b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ki.a requestType = (ki.a) obj;
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        return this.f44641a.f44730a.a(this.f44642b, requestType);
    }
}
