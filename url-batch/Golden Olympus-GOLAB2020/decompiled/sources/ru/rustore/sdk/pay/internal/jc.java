package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jc extends kotlin.jvm.internal.s implements Function1<ak, String> {

    /* renamed from: a, reason: collision with root package name */
    public static final jc f44373a = new jc();

    public jc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak it = (ak) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.a();
    }
}
