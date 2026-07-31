package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sc2 implements rc2, tc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f31686a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f31687b = new LinkedHashSet();

    public final void a(@NotNull rc2... newProgressChangeListeners) {
        Intrinsics.checkNotNullParameter(newProgressChangeListeners, "newProgressChangeListeners");
        CollectionsKt.addAll(this.f31686a, newProgressChangeListeners);
    }

    @Override // com.yandex.mobile.ads.impl.tc2
    public final void b() {
        Iterator it = this.f31687b.iterator();
        while (it.hasNext()) {
            ((tc2) it.next()).b();
        }
    }

    public final void a(@NotNull tc2... newProgressLifecycleListeners) {
        Intrinsics.checkNotNullParameter(newProgressLifecycleListeners, "newProgressLifecycleListeners");
        CollectionsKt.addAll(this.f31687b, newProgressLifecycleListeners);
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        Iterator it = this.f31686a.iterator();
        while (it.hasNext()) {
            ((rc2) it.next()).a(j4, j5);
        }
    }

    @Override // com.yandex.mobile.ads.impl.tc2
    public final void a() {
        Iterator it = this.f31687b.iterator();
        while (it.hasNext()) {
            ((tc2) it.next()).a();
        }
    }
}
