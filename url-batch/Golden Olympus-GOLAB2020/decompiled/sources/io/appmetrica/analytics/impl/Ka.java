package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Ka {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f37877a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37878b;

    public Ka() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f37877a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f37877a.toString();
    }

    public Ka(boolean z4) {
        this.f37877a = new HashMap();
        this.f37878b = z4;
    }
}
