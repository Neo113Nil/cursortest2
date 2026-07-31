package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetUrlFromArray extends ArrayUrl {

    @NotNull
    public static final GetUrlFromArray INSTANCE = new GetUrlFromArray();

    @NotNull
    private static final String name = "getUrlFromArray";

    private GetUrlFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
