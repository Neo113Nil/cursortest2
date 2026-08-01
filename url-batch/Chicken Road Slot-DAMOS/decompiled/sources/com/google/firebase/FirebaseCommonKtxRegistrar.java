package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import g8.h;
import ge.t;
import java.util.List;
import java.util.concurrent.Executor;
import k8.c;
import k8.d;
import kotlin.Metadata;
import kotlin.collections.y;
import l8.a;
import l8.b;
import l8.j;
import l8.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Ll8/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a b10 = b.b(new r(k8.a.class, t.class));
        b10.a(new j(new r(k8.a.class, Executor.class), 1, 0));
        b10.f5897f = h.f4308e;
        b b11 = b10.b();
        a b12 = b.b(new r(c.class, t.class));
        b12.a(new j(new r(c.class, Executor.class), 1, 0));
        b12.f5897f = h.f4309i;
        b b13 = b12.b();
        a b14 = b.b(new r(k8.b.class, t.class));
        b14.a(new j(new r(k8.b.class, Executor.class), 1, 0));
        b14.f5897f = h.f4310r;
        b b15 = b14.b();
        a b16 = b.b(new r(d.class, t.class));
        b16.a(new j(new r(d.class, Executor.class), 1, 0));
        b16.f5897f = h.f4311s;
        return y.f(b11, b13, b15, b16.b());
    }
}
