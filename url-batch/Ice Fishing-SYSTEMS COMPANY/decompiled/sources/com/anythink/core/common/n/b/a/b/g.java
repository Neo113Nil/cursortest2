package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.ah;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Set<ah> f15164a = new LinkedHashSet();

    public final synchronized void a(ah ahVar) {
        this.f15164a.add(ahVar);
    }

    public final synchronized void b(ah ahVar) {
        this.f15164a.remove(ahVar);
    }

    public final synchronized boolean c(ah ahVar) {
        return this.f15164a.contains(ahVar);
    }
}
