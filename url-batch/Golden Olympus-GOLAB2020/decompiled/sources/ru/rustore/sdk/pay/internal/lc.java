package ru.rustore.sdk.pay.internal;

import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import ru.rustore.sdk.pay.internal.ki;

/* loaded from: classes3.dex */
public final class lc extends kotlin.jvm.internal.s implements Function0<ki.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final lc f44512a = new lc();

    public lc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ki.a("api/v1/keys/public", MapsKt.emptyMap());
    }
}
