package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(l8.r rVar, l8.c cVar) {
        g8.g gVar = (g8.g) cVar.a(g8.g.class);
        if (cVar.a(v8.a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.f(d9.b.class), cVar.f(u8.f.class), (x8.d) cVar.a(x8.d.class), cVar.c(rVar), (t8.c) cVar.a(t8.c.class));
        }
        i0.j();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<l8.b> getComponents() {
        l8.r rVar = new l8.r(o8.b.class, h6.e.class);
        l8.a a9 = l8.b.a(FirebaseMessaging.class);
        a9.f5892a = LIBRARY_NAME;
        a9.a(l8.j.a(g8.g.class));
        a9.a(new l8.j(0, 0, v8.a.class));
        a9.a(new l8.j(0, 1, d9.b.class));
        a9.a(new l8.j(0, 1, u8.f.class));
        a9.a(l8.j.a(x8.d.class));
        a9.a(new l8.j(rVar, 0, 1));
        a9.a(l8.j.a(t8.c.class));
        a9.f5897f = new p(rVar, 0);
        if (a9.f5895d == 0) {
            a9.f5895d = 1;
            return Arrays.asList(a9.b(), i7.a.I(LIBRARY_NAME, "25.1.0"));
        }
        i0.l("Instantiation type has already been set.");
        return null;
    }
}
