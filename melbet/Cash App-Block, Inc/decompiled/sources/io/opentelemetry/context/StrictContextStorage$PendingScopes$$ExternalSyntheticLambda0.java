package io.opentelemetry.context;

import io.opentelemetry.context.StrictContextStorage;
import java.util.function.Predicate;

/* loaded from: classes9.dex */
public final /* synthetic */ class StrictContextStorage$PendingScopes$$ExternalSyntheticLambda0 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        ((StrictContextStorage.CallerStackTrace) obj).getClass();
        return true;
    }
}
