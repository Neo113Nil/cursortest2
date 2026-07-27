package com.onesignal.session.internal.session.impl;

import f4.v;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class SessionService$onUnfocused$1 extends j implements InterfaceC1430a {
    final /* synthetic */ long $unfocusTimeMs;
    final /* synthetic */ SessionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionService$onUnfocused$1(SessionService sessionService, long j2) {
        super(0);
        this.this$0 = sessionService;
        this.$unfocusTimeMs = j2;
    }

    @Override // t4.InterfaceC1430a
    public /* bridge */ /* synthetic */ Object invoke() {
        m36invoke();
        return v.f5689a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m36invoke() {
        this.this$0.handleOnUnfocused(this.$unfocusTimeMs);
    }
}
