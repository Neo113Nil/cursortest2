package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import ru.rustore.sdk.pay.internal.hf;

/* loaded from: classes3.dex */
public final class u6 extends kotlin.jvm.internal.s implements Function1<qb, hf> {

    /* renamed from: a, reason: collision with root package name */
    public static final u6 f45082a = new u6();

    public u6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qb qbVar = (qb) obj;
        return new hf.b.a(qbVar != null ? qbVar.f44818c : null, qbVar != null ? qbVar.f44820e : null, qbVar != null ? qbVar.f44821f : null);
    }
}
