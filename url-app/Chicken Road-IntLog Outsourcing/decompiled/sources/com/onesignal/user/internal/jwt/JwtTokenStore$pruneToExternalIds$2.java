package com.onesignal.user.internal.jwt;

import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class JwtTokenStore$pruneToExternalIds$2 extends j implements InterfaceC1441l {
    final /* synthetic */ String $externalId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JwtTokenStore$pruneToExternalIds$2(String str) {
        super(1);
        this.$externalId = str;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IJwtUpdateListener) obj);
        return v.f5689a;
    }

    public final void invoke(IJwtUpdateListener it) {
        i.e(it, "it");
        it.onJwtUpdated(this.$externalId);
    }
}
