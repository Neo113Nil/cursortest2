package com.google.firebase;

import R1.c;
import R1.d;
import S1.a;
import S1.b;
import S1.j;
import S1.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0786t;

@Metadata
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a a7 = b.a(new r(R1.a.class, AbstractC0786t.class));
        a7.a(new j(new r(R1.a.class, Executor.class), 1, 0));
        a7.f2464g = P1.b.f2256e;
        b b7 = a7.b();
        Intrinsics.checkNotNullExpressionValue(b7, "build(...)");
        a a8 = b.a(new r(c.class, AbstractC0786t.class));
        a8.a(new j(new r(c.class, Executor.class), 1, 0));
        a8.f2464g = P1.b.f2257i;
        b b8 = a8.b();
        Intrinsics.checkNotNullExpressionValue(b8, "build(...)");
        a a9 = b.a(new r(R1.b.class, AbstractC0786t.class));
        a9.a(new j(new r(R1.b.class, Executor.class), 1, 0));
        a9.f2464g = P1.b.f2258l;
        b b9 = a9.b();
        Intrinsics.checkNotNullExpressionValue(b9, "build(...)");
        a a10 = b.a(new r(d.class, AbstractC0786t.class));
        a10.a(new j(new r(d.class, Executor.class), 1, 0));
        a10.f2464g = P1.b.f2259m;
        b b10 = a10.b();
        Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
        return kotlin.collections.r.d(b7, b8, b9, b10);
    }
}
