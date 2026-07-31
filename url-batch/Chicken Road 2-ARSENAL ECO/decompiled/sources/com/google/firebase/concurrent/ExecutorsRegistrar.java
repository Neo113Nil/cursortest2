package com.google.firebase.concurrent;

import B1.g;
import H1.o;
import N3.e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import m1.AbstractC0521b;
import o1.InterfaceC0555a;
import o1.InterfaceC0556b;
import o1.InterfaceC0557c;
import o1.d;
import p1.C0576a;
import p1.k;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final k f3891a = new k(new o(3));

    /* renamed from: b, reason: collision with root package name */
    public static final k f3892b = new k(new o(4));

    /* renamed from: c, reason: collision with root package name */
    public static final k f3893c = new k(new o(5));

    /* renamed from: d, reason: collision with root package name */
    public static final k f3894d = new k(new o(6));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p1.o oVar = new p1.o(InterfaceC0555a.class, ScheduledExecutorService.class);
        p1.o[] oVarArr = {new p1.o(InterfaceC0555a.class, ExecutorService.class), new p1.o(InterfaceC0555a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(oVar);
        for (p1.o oVar2 : oVarArr) {
            AbstractC0521b.f(oVar2, "Null interface");
        }
        Collections.addAll(hashSet, oVarArr);
        C0576a c0576a = new C0576a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new g(26), hashSet3);
        p1.o oVar3 = new p1.o(InterfaceC0556b.class, ScheduledExecutorService.class);
        p1.o[] oVarArr2 = {new p1.o(InterfaceC0556b.class, ExecutorService.class), new p1.o(InterfaceC0556b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(oVar3);
        for (p1.o oVar4 : oVarArr2) {
            AbstractC0521b.f(oVar4, "Null interface");
        }
        Collections.addAll(hashSet4, oVarArr2);
        C0576a c0576a2 = new C0576a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new g(27), hashSet6);
        p1.o oVar5 = new p1.o(InterfaceC0557c.class, ScheduledExecutorService.class);
        p1.o[] oVarArr3 = {new p1.o(InterfaceC0557c.class, ExecutorService.class), new p1.o(InterfaceC0557c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(oVar5);
        for (p1.o oVar6 : oVarArr3) {
            AbstractC0521b.f(oVar6, "Null interface");
        }
        Collections.addAll(hashSet7, oVarArr3);
        C0576a c0576a3 = new C0576a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new g(28), hashSet9);
        e a7 = C0576a.a(new p1.o(d.class, Executor.class));
        a7.f1692f = new g(29);
        return Arrays.asList(c0576a, c0576a2, c0576a3, a7.b());
    }
}
