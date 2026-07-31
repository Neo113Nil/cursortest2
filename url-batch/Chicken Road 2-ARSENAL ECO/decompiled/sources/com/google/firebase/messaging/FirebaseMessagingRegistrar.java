package com.google.firebase.messaging;

import B1.e;
import H1.t;
import J1.b;
import a1.AbstractC0223a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m1.g;
import p1.C0576a;
import p1.InterfaceC0577b;
import p1.o;
import r1.InterfaceC0614b;
import x1.InterfaceC0727b;
import y1.f;
import z1.InterfaceC0771a;

/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(o oVar, InterfaceC0577b interfaceC0577b) {
        g gVar = (g) interfaceC0577b.a(g.class);
        if (interfaceC0577b.a(InterfaceC0771a.class) == null) {
            return new FirebaseMessaging(gVar, interfaceC0577b.c(b.class), interfaceC0577b.c(f.class), (e) interfaceC0577b.a(e.class), interfaceC0577b.d(oVar), (InterfaceC0727b) interfaceC0577b.a(InterfaceC0727b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0576a> getComponents() {
        o oVar = new o(InterfaceC0614b.class, A0.e.class);
        N3.e eVar = new N3.e(FirebaseMessaging.class, new Class[0]);
        eVar.f1689c = LIBRARY_NAME;
        eVar.a(p1.g.a(g.class));
        eVar.a(new p1.g(InterfaceC0771a.class, 0, 0));
        eVar.a(new p1.g(b.class, 0, 1));
        eVar.a(new p1.g(f.class, 0, 1));
        eVar.a(p1.g.a(e.class));
        eVar.a(new p1.g(oVar, 0, 1));
        eVar.a(p1.g.a(InterfaceC0727b.class));
        eVar.f1692f = new t(oVar, 0);
        if (!(eVar.f1687a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        eVar.f1687a = 1;
        return Arrays.asList(eVar.b(), AbstractC0223a.r(LIBRARY_NAME, "24.0.0"));
    }
}
