package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yc extends kotlin.jvm.internal.s implements Function1<s9, CharSequence> {

    /* renamed from: a, reason: collision with root package name */
    public static final yc f45267a = new yc();

    public yc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s9 it = (s9) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return j.a(it);
    }
}
