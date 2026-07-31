package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function0<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f43705a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(String str) {
        super(0);
        this.f43705a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Delete id's from storage " + this.f43705a;
    }
}
