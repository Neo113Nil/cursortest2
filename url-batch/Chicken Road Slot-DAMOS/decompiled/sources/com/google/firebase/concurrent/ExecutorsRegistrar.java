package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import k8.a;
import k8.c;
import k8.d;
import kotlin.collections.i0;
import l8.b;
import l8.f;
import l8.n;
import l8.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final n f3069a = new n(new f(2));

    /* renamed from: b, reason: collision with root package name */
    public static final n f3070b = new n(new f(3));

    /* renamed from: c, reason: collision with root package name */
    public static final n f3071c = new n(new f(4));

    /* renamed from: d, reason: collision with root package name */
    public static final n f3072d = new n(new f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(a.class, ExecutorService.class), new r(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            i7.a.z(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new i0(11), hashSet3);
        r rVar3 = new r(k8.b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(k8.b.class, ExecutorService.class), new r(k8.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            i7.a.z(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new i0(12), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            i7.a.z(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new i0(13), hashSet9);
        l8.a b10 = b.b(new r(d.class, Executor.class));
        b10.f5897f = new i0(14);
        return Arrays.asList(bVar, bVar2, bVar3, b10.b());
    }
}
