package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928wa {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8560a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8561b;

    public C0928wa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f8560a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f8560a.toString();
    }

    public C0928wa(boolean z) {
        this.f8560a = new HashMap();
        this.f8561b = z;
    }
}
