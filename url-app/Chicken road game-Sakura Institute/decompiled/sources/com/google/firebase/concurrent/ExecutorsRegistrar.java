package com.google.firebase.concurrent;

import A.C0022s;
import W1.a;
import W1.d;
import Z1.b;
import Z1.f;
import Z1.o;
import Z1.t;
import com.google.firebase.components.ComponentRegistrar;
import j0.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final o f6057a = new o(new f(2));

    /* renamed from: b, reason: collision with root package name */
    public static final o f6058b = new o(new f(3));

    /* renamed from: c, reason: collision with root package name */
    public static final o f6059c = new o(new f(4));

    /* renamed from: d, reason: collision with root package name */
    public static final o f6060d = new o(new f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        t tVar = new t(a.class, ScheduledExecutorService.class);
        t[] tVarArr = {new t(a.class, ExecutorService.class), new t(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            c.s(tVar2, "Null interface");
        }
        Collections.addAll(hashSet, tVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, new C0022s(15), hashSet3);
        t tVar3 = new t(W1.b.class, ScheduledExecutorService.class);
        t[] tVarArr2 = {new t(W1.b.class, ExecutorService.class), new t(W1.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(tVar3);
        for (t tVar4 : tVarArr2) {
            c.s(tVar4, "Null interface");
        }
        Collections.addAll(hashSet4, tVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, new C0022s(16), hashSet6);
        t tVar5 = new t(W1.c.class, ScheduledExecutorService.class);
        t[] tVarArr3 = {new t(W1.c.class, ExecutorService.class), new t(W1.c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(tVar5);
        for (t tVar6 : tVarArr3) {
            c.s(tVar6, "Null interface");
        }
        Collections.addAll(hashSet7, tVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, new C0022s(17), hashSet9);
        Z1.a a4 = b.a(new t(d.class, Executor.class));
        a4.f4559e = new C0022s(18);
        return Arrays.asList(bVar, bVar2, bVar3, a4.b());
    }
}
