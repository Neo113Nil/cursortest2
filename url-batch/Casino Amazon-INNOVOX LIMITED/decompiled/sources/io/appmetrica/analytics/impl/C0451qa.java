package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0451qa {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1451a;
    public final boolean b;

    public C0451qa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f1451a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f1451a.toString();
    }

    public C0451qa(boolean z) {
        this.f1451a = new HashMap();
        this.b = z;
    }
}
