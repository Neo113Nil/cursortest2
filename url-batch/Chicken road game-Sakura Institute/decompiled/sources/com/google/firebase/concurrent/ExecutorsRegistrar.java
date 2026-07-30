package com.google.firebase.concurrent;

import a0.s;
import a8.m;
import b5.a;
import b5.b;
import b5.d;
import com.google.firebase.components.ComponentRegistrar;
import e5.c;
import e5.g;
import e5.p;
import e5.t;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final p f1802a = new p(new g(2));

    /* renamed from: b, reason: collision with root package name */
    public static final p f1803b = new p(new g(3));

    /* renamed from: c, reason: collision with root package name */
    public static final p f1804c = new p(new g(4));

    /* renamed from: d, reason: collision with root package name */
    public static final p f1805d = new p(new g(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        t tVar = new t(a.class, ScheduledExecutorService.class);
        t[] tVarArr = {new t(a.class, ExecutorService.class), new t(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            m.n(tVar2, "Null interface");
        }
        Collections.addAll(hashSet, tVarArr);
        c cVar = new c(null, new HashSet(hashSet), new HashSet(hashSet2), 0, new s(15), hashSet3);
        t tVar3 = new t(b.class, ScheduledExecutorService.class);
        t[] tVarArr2 = {new t(b.class, ExecutorService.class), new t(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(tVar3);
        for (t tVar4 : tVarArr2) {
            m.n(tVar4, "Null interface");
        }
        Collections.addAll(hashSet4, tVarArr2);
        c cVar2 = new c(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, new s(16), hashSet6);
        t tVar5 = new t(b5.c.class, ScheduledExecutorService.class);
        t[] tVarArr3 = {new t(b5.c.class, ExecutorService.class), new t(b5.c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(tVar5);
        for (t tVar6 : tVarArr3) {
            m.n(tVar6, "Null interface");
        }
        Collections.addAll(hashSet7, tVarArr3);
        c cVar3 = new c(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, new s(17), hashSet9);
        e5.b a3 = c.a(new t(d.class, Executor.class));
        a3.f2759f = new s(18);
        return Arrays.asList(cVar, cVar2, cVar3, a3.b());
    }
}
