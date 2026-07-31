package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class x6 {

    /* renamed from: a, reason: collision with root package name */
    public final lh f491a;
    public final z2 b;
    public final v6 c;
    public final ArrayList d;
    public final LinkedHashMap e;

    public x6(Object obj, lh lhVar, z2 z2Var) {
        lhVar.getClass();
        z2Var.getClass();
        this.f491a = lhVar;
        this.b = z2Var;
        this.c = new v6(obj);
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
    }

    public final void a(y7 y7Var, HashMap hashMap) {
        if (this.c.a(y7Var)) {
            long a2 = this.b.a();
            for (Map.Entry entry : hashMap.entrySet()) {
                lh lhVar = (lh) entry.getKey();
                String str = (String) entry.getValue();
                List list = (List) this.e.get(lhVar);
                if (list == null) {
                    list = new ArrayList();
                    this.e.put(lhVar, list);
                }
                list.add(new Pair(str, Long.valueOf(a2)));
            }
        }
    }
}
