package com.yandex.div.internal.util;

import androidx.collection.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class CollectionsKt {
    public static final boolean allIsNullOrEmpty(@NotNull List<?>... items) {
        Intrinsics.checkNotNullParameter(items, "items");
        for (List<?> list : items) {
            if (list != null && !list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <K, V> Map<K, V> arrayMap() {
        return new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> immutableCopy(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!M.l(list)) {
            return list;
        }
        List<T> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n        Collections.un…st(ArrayList(this))\n    }");
        return unmodifiableList;
    }
}
