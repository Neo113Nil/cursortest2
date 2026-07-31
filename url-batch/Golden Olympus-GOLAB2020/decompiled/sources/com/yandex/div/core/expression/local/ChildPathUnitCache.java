package com.yandex.div.core.expression.local;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ChildPathUnitCache {

    @NotNull
    public static final ChildPathUnitCache INSTANCE = new ChildPathUnitCache();

    @NotNull
    private static ArrayList<String> cache = new ArrayList<>();

    private ChildPathUnitCache() {
    }

    private final void ensureGenerated(int i4) {
        if (cache.size() > i4) {
            return;
        }
        cache.ensureCapacity(i4 + 1);
        int size = cache.size();
        if (size > i4) {
            return;
        }
        while (true) {
            cache.add(size, "child#" + size);
            if (size == i4) {
                return;
            } else {
                size++;
            }
        }
    }

    @NotNull
    public final String getValue$div_release(int i4) {
        ensureGenerated(i4);
        String str = cache.get(i4);
        Intrinsics.checkNotNullExpressionValue(str, "cache[index]");
        return str;
    }
}
