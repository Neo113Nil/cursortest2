package com.yandex.div.core.view2.errors;

import O1.C1165z4;
import com.yandex.div.DivDataTag;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class ErrorCollectors {

    @NotNull
    private final Map<String, ErrorCollector> collectors = new LinkedHashMap();

    @NotNull
    public ErrorCollector getOrCreate(@NotNull DivDataTag tag, @Nullable C1165z4 c1165z4) {
        ErrorCollector errorCollector;
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.collectors) {
            try {
                Map<String, ErrorCollector> map = this.collectors;
                String id = tag.getId();
                Intrinsics.checkNotNullExpressionValue(id, "tag.id");
                ErrorCollector errorCollector2 = map.get(id);
                if (errorCollector2 == null) {
                    errorCollector2 = new ErrorCollector();
                    map.put(id, errorCollector2);
                }
                errorCollector2.attachParsingErrors(c1165z4);
                errorCollector = errorCollector2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return errorCollector;
    }

    @Nullable
    public ErrorCollector getOrNull(@NotNull DivDataTag tag, @Nullable C1165z4 c1165z4) {
        ErrorCollector errorCollector;
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.collectors) {
            errorCollector = this.collectors.get(tag.getId());
            if (errorCollector != null) {
                errorCollector.attachParsingErrors(c1165z4);
            } else {
                errorCollector = null;
            }
        }
        return errorCollector;
    }

    public void reset(@NotNull List<? extends DivDataTag> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (tags.isEmpty()) {
            this.collectors.clear();
            return;
        }
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            this.collectors.remove(((DivDataTag) it.next()).getId());
        }
    }
}
