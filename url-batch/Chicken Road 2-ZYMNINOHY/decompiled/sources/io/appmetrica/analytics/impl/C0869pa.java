package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0869pa {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12571a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12572b;

    public C0869pa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f12571a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f12571a.toString();
    }

    public C0869pa(boolean z) {
        this.f12571a = new HashMap();
        this.f12572b = z;
    }
}
