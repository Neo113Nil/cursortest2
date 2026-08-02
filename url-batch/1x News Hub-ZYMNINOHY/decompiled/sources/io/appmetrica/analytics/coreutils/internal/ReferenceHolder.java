package io.appmetrica.analytics.coreutils.internal;

import c2.e;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ReferenceHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f5469a = new LinkedHashSet();

    public final Set<Object> peekReferences() {
        return e.a0(this.f5469a);
    }

    public final void removeReference(Object obj) {
        this.f5469a.remove(obj);
    }

    public final void storeReference(Object obj) {
        this.f5469a.add(obj);
    }
}
