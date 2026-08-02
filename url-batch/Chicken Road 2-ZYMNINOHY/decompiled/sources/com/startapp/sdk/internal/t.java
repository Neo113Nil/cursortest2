package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f7582d = new t();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7583a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7584b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7585c = new HashMap();

    public final synchronized void a(s sVar) {
        try {
            this.f7583a.add(0, sVar);
            List list = (List) this.f7584b.get(sVar.f7542b);
            if (list == null) {
                list = new ArrayList();
                this.f7584b.put(sVar.f7542b, list);
            }
            list.add(0, sVar);
            List list2 = (List) this.f7585c.get(sVar.f7543c);
            if (list2 == null) {
                list2 = new ArrayList();
                this.f7585c.put(sVar.f7543c, list2);
            }
            list2.add(0, sVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
