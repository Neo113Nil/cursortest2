package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.af;
import defpackage.be0;
import defpackage.ca0;
import defpackage.ch0;
import defpackage.ck;
import defpackage.lj;
import defpackage.mj;
import defpackage.nd;
import defpackage.rc;
import defpackage.v01;
import defpackage.vk1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final be0 a = new be0(new ck(1));
    public static final be0 b = new be0(new ck(2));
    public static final be0 c = new be0(new ck(3));
    public static final be0 d = new be0(new ck(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        v01 v01Var = new v01(rc.class, ScheduledExecutorService.class);
        v01[] v01VarArr = {new v01(rc.class, ExecutorService.class), new v01(rc.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(v01Var);
        for (v01 v01Var2 : v01VarArr) {
            ca0.f(v01Var2, "Null interface");
        }
        Collections.addAll(hashSet, v01VarArr);
        mj mjVar = new mj(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new af(13), hashSet3);
        v01 v01Var3 = new v01(nd.class, ScheduledExecutorService.class);
        v01[] v01VarArr2 = {new v01(nd.class, ExecutorService.class), new v01(nd.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(v01Var3);
        for (v01 v01Var4 : v01VarArr2) {
            ca0.f(v01Var4, "Null interface");
        }
        Collections.addAll(hashSet4, v01VarArr2);
        mj mjVar2 = new mj(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new af(14), hashSet6);
        v01 v01Var5 = new v01(ch0.class, ScheduledExecutorService.class);
        v01[] v01VarArr3 = {new v01(ch0.class, ExecutorService.class), new v01(ch0.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(v01Var5);
        for (v01 v01Var6 : v01VarArr3) {
            ca0.f(v01Var6, "Null interface");
        }
        Collections.addAll(hashSet7, v01VarArr3);
        mj mjVar3 = new mj(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new af(15), hashSet9);
        lj a2 = mj.a(new v01(vk1.class, Executor.class));
        a2.f = new af(16);
        return Arrays.asList(mjVar, mjVar2, mjVar3, a2.b());
    }
}
