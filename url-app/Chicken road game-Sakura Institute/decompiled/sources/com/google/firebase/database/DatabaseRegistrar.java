package com.google.firebase.database;

import A.C0022s;
import Y1.a;
import Z1.b;
import Z1.c;
import Z1.k;
import b2.f;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m3.s;

/* loaded from: classes.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        return new f((V1.f) cVar.a(V1.f.class), cVar.h(a.class), cVar.h(X1.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        Z1.a aVar = new Z1.a(f.class, new Class[0]);
        aVar.f4555a = LIBRARY_NAME;
        aVar.a(new k(1, 0, V1.f.class));
        aVar.a(new k(0, 2, a.class));
        aVar.a(new k(0, 2, X1.a.class));
        aVar.f4559e = new C0022s(19);
        return Arrays.asList(aVar.b(), s.j(LIBRARY_NAME, "21.0.0"));
    }
}
