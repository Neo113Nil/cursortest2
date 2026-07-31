package io.appmetrica.analytics.coreutils.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ReferenceHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f37008a = new LinkedHashSet();

    @NotNull
    public final Set<Object> peekReferences() {
        return CollectionsKt.toSet(this.f37008a);
    }

    public final void removeReference(@NotNull Object obj) {
        this.f37008a.remove(obj);
    }

    public final void storeReference(@NotNull Object obj) {
        this.f37008a.add(obj);
    }
}
