package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class Gd extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ab f37575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gd(Ab ab) {
        super(1);
        this.f37575a = ab;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2987td c2987td = (C2987td) ((Map.Entry) obj).getValue();
        return c2987td.f39855b.parse(this.f37575a);
    }
}
