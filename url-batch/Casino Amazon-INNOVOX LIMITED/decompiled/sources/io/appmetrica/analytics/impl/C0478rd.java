package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0478rd extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0198gb f1466a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0478rd(C0198gb c0198gb) {
        super(1);
        this.f1466a = c0198gb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Zc zc = (Zc) ((Map.Entry) obj).getValue();
        return zc.b.parse(this.f1466a);
    }
}
