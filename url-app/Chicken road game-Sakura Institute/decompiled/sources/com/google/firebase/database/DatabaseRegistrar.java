package com.google.firebase.database;

import a0.s;
import com.google.firebase.components.ComponentRegistrar;
import d5.a;
import e5.b;
import e5.c;
import e5.d;
import e5.l;
import g5.f;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(d dVar) {
        return new f((a5.f) dVar.a(a5.f.class), dVar.h(a.class), dVar.h(c5.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        b bVar = new b(f.class, new Class[0]);
        bVar.f2755b = LIBRARY_NAME;
        bVar.a(new l(1, 0, a5.f.class));
        bVar.a(new l(0, 2, a.class));
        bVar.a(new l(0, 2, c5.a.class));
        bVar.f2759f = new s(20);
        return Arrays.asList(bVar.b(), j1.c.Q(LIBRARY_NAME, "21.0.0"));
    }
}
