package com.ironsource;

import com.ironsource.fr;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class jh implements ih {
    @Override // com.ironsource.ih
    public void a(@NotNull fr.a event, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        mh.a(event, params);
    }
}
