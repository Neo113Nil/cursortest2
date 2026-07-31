package com.yandex.div.core.view2;

import androidx.core.view.AbstractC1281a0;
import com.yandex.div.internal.util.CollectionsKt;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivViewIdProvider {

    @NotNull
    private final Map<String, Integer> cache = CollectionsKt.arrayMap();

    public final int getViewId(@Nullable String str) {
        if (str == null) {
            return -1;
        }
        Map<String, Integer> map = this.cache;
        Integer num = map.get(str);
        if (num == null) {
            num = Integer.valueOf(AbstractC1281a0.m());
            map.put(str, num);
        }
        return num.intValue();
    }
}
