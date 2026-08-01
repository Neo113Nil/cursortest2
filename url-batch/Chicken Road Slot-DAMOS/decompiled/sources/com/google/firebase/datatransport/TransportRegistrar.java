package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import h6.e;
import i6.a;
import java.util.Arrays;
import java.util.List;
import k6.o;
import kotlin.collections.i0;
import l8.b;
import l8.c;
import l8.j;
import l8.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(c cVar) {
        o.b((Context) cVar.a(Context.class));
        return o.a().c(a.f4650f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$1(c cVar) {
        o.b((Context) cVar.a(Context.class));
        return o.a().c(a.f4650f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$2(c cVar) {
        o.b((Context) cVar.a(Context.class));
        return o.a().c(a.f4649e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        l8.a a9 = b.a(e.class);
        a9.f5892a = LIBRARY_NAME;
        a9.a(j.a(Context.class));
        a9.f5897f = new i0(24);
        b b10 = a9.b();
        l8.a b11 = b.b(new r(o8.a.class, e.class));
        b11.a(j.a(Context.class));
        b11.f5897f = new i0(25);
        b b12 = b11.b();
        l8.a b13 = b.b(new r(o8.b.class, e.class));
        b13.a(j.a(Context.class));
        b13.f5897f = new i0(26);
        return Arrays.asList(b10, b12, b13.b(), i7.a.I(LIBRARY_NAME, "18.2.0"));
    }
}
