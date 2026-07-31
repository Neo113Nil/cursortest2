package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class t {
    public static final t d = new t();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f428a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public final synchronized void a(s sVar) {
        this.f428a.add(0, sVar);
        List list = (List) this.b.get(sVar.b);
        if (list == null) {
            list = new ArrayList();
            this.b.put(sVar.b, list);
        }
        list.add(0, sVar);
        List list2 = (List) this.c.get(sVar.c);
        if (list2 == null) {
            list2 = new ArrayList();
            this.c.put(sVar.c, list2);
        }
        list2.add(0, sVar);
    }
}
