package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a6 extends kotlin.jvm.internal.s implements Function0<gc> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e6 f43795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f43796b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(e6 e6Var, String str) {
        super(0);
        this.f43795a = e6Var;
        this.f43796b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        rc rcVar = this.f43795a.f44001a;
        String id = this.f43796b;
        rcVar.getClass();
        Intrinsics.checkNotNullParameter(id, "keyId");
        q2 q2Var = rcVar.f44912b;
        q2Var.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        String string = q2Var.f44809a.getString(id, null);
        if (string != null) {
            return new gc(id, string);
        }
        return null;
    }
}
