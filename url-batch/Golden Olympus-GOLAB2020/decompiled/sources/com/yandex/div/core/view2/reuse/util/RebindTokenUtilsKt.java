package com.yandex.div.core.view2.reuse.util;

import com.yandex.div.core.view2.reuse.ExistingToken;
import com.yandex.div.core.view2.reuse.NewToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class RebindTokenUtilsKt {
    @NotNull
    public static final ExistingToken combineTokens(@NotNull ExistingToken existingToken, @NotNull NewToken newToken) {
        Intrinsics.checkNotNullParameter(existingToken, "existingToken");
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        return new ExistingToken(newToken.getItem(), newToken.getChildIndex(), existingToken.getView(), existingToken.getParentToken());
    }
}
