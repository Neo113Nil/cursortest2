package io.appmetrica.analytics.impl;

import java.util.Map;
import o3.InterfaceC1339l;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898qd extends kotlin.jvm.internal.j implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0611fb f12613a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0898qd(C0611fb c0611fb) {
        super(1);
        this.f12613a = c0611fb;
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        Yc yc = (Yc) ((Map.Entry) obj).getValue();
        return yc.f11302b.parse(this.f12613a);
    }
}
