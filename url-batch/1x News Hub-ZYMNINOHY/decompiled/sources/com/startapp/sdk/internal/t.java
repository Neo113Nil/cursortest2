package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f4445d = new t();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4446a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4447b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4448c = new HashMap();

    public final synchronized void a(s sVar) {
        try {
            this.f4446a.add(0, sVar);
            List list = (List) this.f4447b.get(sVar.f4404b);
            if (list == null) {
                list = new ArrayList();
                this.f4447b.put(sVar.f4404b, list);
            }
            list.add(0, sVar);
            List list2 = (List) this.f4448c.get(sVar.f4405c);
            if (list2 == null) {
                list2 = new ArrayList();
                this.f4448c.put(sVar.f4405c, list2);
            }
            list2.add(0, sVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
