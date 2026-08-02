package io.appmetrica.analytics.coreutils.internal;

import d3.i;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ReferenceHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f9723a = new LinkedHashSet();

    public final Set<Object> peekReferences() {
        return i.p0(this.f9723a);
    }

    public final void removeReference(Object obj) {
        this.f9723a.remove(obj);
    }

    public final void storeReference(Object obj) {
        this.f9723a.add(obj);
    }
}
