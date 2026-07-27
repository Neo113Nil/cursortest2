package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1079wa {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9514a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9515b;

    public C1079wa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f9514a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f9514a.toString();
    }

    public C1079wa(boolean z) {
        this.f9514a = new HashMap();
        this.f9515b = z;
    }
}
