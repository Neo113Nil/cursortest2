package com.google.firebase.messaging;

import K1.g;
import N1.b;
import N1.i;
import N1.q;
import S0.f;
import X1.a;
import Z1.d;
import com.google.firebase.components.ComponentRegistrar;
import h2.C0481b;
import java.util.Arrays;
import java.util.List;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(q qVar, b bVar) {
        g gVar = (g) bVar.a(g.class);
        if (bVar.a(a.class) == null) {
            return new FirebaseMessaging(gVar, bVar.e(C0481b.class), bVar.e(W1.g.class), (d) bVar.a(d.class), bVar.b(qVar), (V1.b) bVar.a(V1.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<N1.a> getComponents() {
        q qVar = new q(P1.b.class, f.class);
        G2.d dVar = new G2.d(FirebaseMessaging.class, new Class[0]);
        dVar.f936c = LIBRARY_NAME;
        dVar.a(i.a(g.class));
        dVar.a(new i(0, a.class, 0));
        dVar.a(new i(0, C0481b.class, 1));
        dVar.a(new i(0, W1.g.class, 1));
        dVar.a(i.a(d.class));
        dVar.a(new i(qVar, 0, 1));
        dVar.a(i.a(V1.b.class));
        dVar.f939f = new W1.b(qVar, 1);
        if (!(dVar.f934a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        dVar.f934a = 1;
        return Arrays.asList(dVar.b(), AbstractC1341c.e(LIBRARY_NAME, "24.0.0"));
    }
}
