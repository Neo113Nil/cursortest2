package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ql2 implements kv3<lj2<JSONObject>> {
    public static lj2<JSONObject> b(hn0 hn0Var, jn0 jn0Var, Object obj, ek2 ek2Var, dl2 dl2Var, ev3<yj2> ev3Var, ev3<hk2> ev3Var2, ev3<nk2> ev3Var3, ev3<rk2> ev3Var4, ev3<zk2> ev3Var5, ev3<gl2> ev3Var6, ev3<yl2> ev3Var7, ev3<tl2> ev3Var8, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((vk2) obj);
        hashSet.add(ek2Var);
        hashSet.add(dl2Var);
        if (((Boolean) sw.c().b(m10.f8205g4)).booleanValue()) {
            hashSet.add(ev3Var.a());
        }
        if (((Boolean) sw.c().b(m10.f8213h4)).booleanValue()) {
            hashSet.add(ev3Var2.a());
        }
        if (((Boolean) sw.c().b(m10.f8221i4)).booleanValue()) {
            hashSet.add(ev3Var3.a());
        }
        if (((Boolean) sw.c().b(m10.f8229j4)).booleanValue()) {
            hashSet.add(ev3Var4.a());
        }
        if (((Boolean) sw.c().b(m10.f8261n4)).booleanValue()) {
            hashSet.add(ev3Var6.a());
        }
        if (((Boolean) sw.c().b(m10.f8269o4)).booleanValue()) {
            hashSet.add(ev3Var7.a());
        }
        return new lj2<>(executor, hashSet);
    }
}
