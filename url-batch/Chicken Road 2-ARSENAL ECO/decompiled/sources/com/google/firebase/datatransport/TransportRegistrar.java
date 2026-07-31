package com.google.firebase.datatransport;

import A0.e;
import B0.a;
import D0.s;
import a1.AbstractC0223a;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import m1.AbstractC0521b;
import p1.C0576a;
import p1.InterfaceC0577b;
import p1.c;
import p1.g;
import p1.o;
import r1.InterfaceC0613a;
import r1.InterfaceC0614b;

/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(InterfaceC0577b interfaceC0577b) {
        s.b((Context) interfaceC0577b.a(Context.class));
        return s.a().c(a.f65f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$1(InterfaceC0577b interfaceC0577b) {
        s.b((Context) interfaceC0577b.a(Context.class));
        return s.a().c(a.f65f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$2(InterfaceC0577b interfaceC0577b) {
        s.b((Context) interfaceC0577b.a(Context.class));
        return s.a().c(a.f64e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0576a> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o.a(e.class));
        for (Class cls : new Class[0]) {
            AbstractC0521b.f(cls, "Null interface");
            hashSet.add(o.a(cls));
        }
        g a7 = g.a(Context.class);
        if (hashSet.contains(a7.f5680a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a7);
        final int i7 = 0;
        C0576a c0576a = new C0576a(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new c() { // from class: r1.c
            @Override // p1.c
            public final Object b(A.e eVar) {
                e lambda$getComponents$0;
                e lambda$getComponents$1;
                e lambda$getComponents$2;
                switch (i7) {
                    case 0:
                        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(eVar);
                        return lambda$getComponents$0;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(eVar);
                        return lambda$getComponents$1;
                    default:
                        lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(eVar);
                        return lambda$getComponents$2;
                }
            }
        }, hashSet3);
        N3.e a8 = C0576a.a(new o(InterfaceC0613a.class, e.class));
        a8.a(g.a(Context.class));
        final int i8 = 1;
        a8.f1692f = new c() { // from class: r1.c
            @Override // p1.c
            public final Object b(A.e eVar) {
                e lambda$getComponents$0;
                e lambda$getComponents$1;
                e lambda$getComponents$2;
                switch (i8) {
                    case 0:
                        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(eVar);
                        return lambda$getComponents$0;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(eVar);
                        return lambda$getComponents$1;
                    default:
                        lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(eVar);
                        return lambda$getComponents$2;
                }
            }
        };
        C0576a b7 = a8.b();
        N3.e a9 = C0576a.a(new o(InterfaceC0614b.class, e.class));
        a9.a(g.a(Context.class));
        final int i9 = 2;
        a9.f1692f = new c() { // from class: r1.c
            @Override // p1.c
            public final Object b(A.e eVar) {
                e lambda$getComponents$0;
                e lambda$getComponents$1;
                e lambda$getComponents$2;
                switch (i9) {
                    case 0:
                        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(eVar);
                        return lambda$getComponents$0;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(eVar);
                        return lambda$getComponents$1;
                    default:
                        lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(eVar);
                        return lambda$getComponents$2;
                }
            }
        };
        return Arrays.asList(c0576a, b7, a9.b(), AbstractC0223a.r(LIBRARY_NAME, "18.2.0"));
    }
}
