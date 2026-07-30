package com.google.firebase.messaging;

import b2.InterfaceC0272c;
import c2.C0292b;
import com.google.firebase.components.ComponentRegistrar;
import d2.InterfaceC0361a;
import f2.InterfaceC0397d;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(S1.r rVar, S1.c cVar) {
        P1.g gVar = (P1.g) cVar.a(P1.g.class);
        if (cVar.a(InterfaceC0361a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.e(l2.b.class), cVar.e(c2.g.class), (InterfaceC0397d) cVar.a(InterfaceC0397d.class), cVar.f(rVar), (InterfaceC0272c) cVar.a(InterfaceC0272c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<S1.b> getComponents() {
        S1.r rVar = new S1.r(V1.b.class, X0.e.class);
        S1.a aVar = new S1.a(FirebaseMessaging.class, new Class[0]);
        aVar.f2460c = LIBRARY_NAME;
        aVar.a(S1.j.a(P1.g.class));
        aVar.a(new S1.j(0, 0, InterfaceC0361a.class));
        aVar.a(new S1.j(0, 1, l2.b.class));
        aVar.a(new S1.j(0, 1, c2.g.class));
        aVar.a(S1.j.a(InterfaceC0397d.class));
        aVar.a(new S1.j(rVar, 0, 1));
        aVar.a(S1.j.a(InterfaceC0272c.class));
        aVar.f2464g = new C0292b(rVar, 1);
        if (!(aVar.f2458a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        aVar.f2458a = 1;
        return Arrays.asList(aVar.b(), O6.g.B(LIBRARY_NAME, "25.1.0"));
    }
}
