package com.google.firebase.ktx;

import M3.c;
import M3.d;
import N3.a;
import N3.b;
import N3.j;
import N3.r;
import O7.AbstractC0395u;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e4.C4472a;
import java.util.List;
import java.util.concurrent.Executor;
import r7.AbstractC4980k;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a a9 = b.a(new r(M3.a.class, AbstractC0395u.class));
        a9.b(new j(new r(M3.a.class, Executor.class), 1, 0));
        a9.f2153z = C4472a.f37328u;
        b c4 = a9.c();
        a a10 = b.a(new r(c.class, AbstractC0395u.class));
        a10.b(new j(new r(c.class, Executor.class), 1, 0));
        a10.f2153z = C4472a.f37329v;
        b c9 = a10.c();
        a a11 = b.a(new r(M3.b.class, AbstractC0395u.class));
        a11.b(new j(new r(M3.b.class, Executor.class), 1, 0));
        a11.f2153z = C4472a.f37330w;
        b c10 = a11.c();
        a a12 = b.a(new r(d.class, AbstractC0395u.class));
        a12.b(new j(new r(d.class, Executor.class), 1, 0));
        a12.f2153z = C4472a.f37331x;
        return AbstractC4980k.B(c4, c9, c10, a12.c());
    }
}
