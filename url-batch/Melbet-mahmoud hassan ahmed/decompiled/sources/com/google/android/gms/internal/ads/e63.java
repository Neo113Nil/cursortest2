package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class e63 extends i63<Map.Entry> {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ n63 f4504j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e63(n63 n63Var) {
        super(n63Var, null);
        this.f4504j = n63Var;
    }

    @Override // com.google.android.gms.internal.ads.i63
    final /* bridge */ /* synthetic */ Map.Entry a(int i7) {
        return new k63(this.f4504j, i7);
    }
}
