package ru.rustore.sdk.pay.internal;

import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.PackageName;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function0<ki.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PackageName f44354a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(PackageName packageName) {
        super(0);
        this.f44354a = packageName;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ki.b("api/v1/purchases/applications/" + this.f44354a.getValue(), MapsKt.emptyMap(), null);
    }
}
