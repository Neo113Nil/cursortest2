package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f3 {

    /* renamed from: a, reason: collision with root package name */
    public static final jc f2276a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile String f2277b;

    /* renamed from: c, reason: collision with root package name */
    public static final v5 f2278c;

    static {
        e3 e3Var = e3.f2248e;
        int i3 = b8.i.f1427i;
        nc ncVar = new nc(e3Var, true, b8.y.f1460x);
        z6.j jVar = new z6.j();
        jVar.f10889a = ncVar;
        f2278c = new v5(12, jVar);
        f2276a = new jc("__phenotype_server_token", jVar, "");
        f2277b = null;
    }

    public static String a() {
        return (String) f2276a.get();
    }
}
