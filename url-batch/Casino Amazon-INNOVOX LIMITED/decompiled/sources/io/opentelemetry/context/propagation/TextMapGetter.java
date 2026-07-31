package io.opentelemetry.context.propagation;

import java.util.Collections;
import java.util.Iterator;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface TextMapGetter<C> {
    @Nullable
    String get(@Nullable C c, String str);

    Iterable<String> keys(C c);

    default Iterator<String> getAll(@Nullable C c, String str) {
        String str2 = get(c, str);
        if (str2 == null) {
            return Collections.emptyIterator();
        }
        return Collections.singleton(str2).iterator();
    }
}
