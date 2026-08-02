package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957xd extends kotlin.jvm.internal.k implements l2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0670mb f8617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0957xd(C0670mb c0670mb) {
        super(1);
        this.f8617a = c0670mb;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        C0491fd c0491fd = (C0491fd) ((Map.Entry) obj).getValue();
        return c0491fd.f7316b.parse(this.f8617a);
    }
}
