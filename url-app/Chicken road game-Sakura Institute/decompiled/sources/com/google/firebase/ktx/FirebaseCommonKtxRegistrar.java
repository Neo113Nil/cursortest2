package com.google.firebase.ktx;

import W1.c;
import W1.d;
import W2.AbstractC0298u;
import Z1.a;
import Z1.b;
import Z1.k;
import Z1.t;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v2.C1251a;
import y2.InterfaceC1329d;
import z2.C1441y;

@InterfaceC1329d
@Metadata
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a a4 = b.a(new t(W1.a.class, AbstractC0298u.class));
        a4.a(new k(new t(W1.a.class, Executor.class), 1, 0));
        a4.f4559e = C1251a.f10988b;
        b b4 = a4.b();
        Intrinsics.checkNotNullExpressionValue(b4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        a a5 = b.a(new t(c.class, AbstractC0298u.class));
        a5.a(new k(new t(c.class, Executor.class), 1, 0));
        a5.f4559e = C1251a.f10989c;
        b b5 = a5.b();
        Intrinsics.checkNotNullExpressionValue(b5, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        a a6 = b.a(new t(W1.b.class, AbstractC0298u.class));
        a6.a(new k(new t(W1.b.class, Executor.class), 1, 0));
        a6.f4559e = C1251a.f10990d;
        b b6 = a6.b();
        Intrinsics.checkNotNullExpressionValue(b6, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        a a7 = b.a(new t(d.class, AbstractC0298u.class));
        a7.a(new k(new t(d.class, Executor.class), 1, 0));
        a7.f4559e = C1251a.f10991e;
        b b7 = a7.b();
        Intrinsics.checkNotNullExpressionValue(b7, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return C1441y.e(b4, b5, b6, b7);
    }
}
