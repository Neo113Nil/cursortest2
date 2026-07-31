package com.yandex.div.core.view2;

import com.yandex.div.core.font.DivTypefaceProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivTypefaceResolver {

    @NotNull
    private final DivTypefaceProvider defaultTypeface;

    @NotNull
    private final Map<String, DivTypefaceProvider> typefaceProviders;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTypefaceResolver(@NotNull Map<String, ? extends DivTypefaceProvider> typefaceProviders, @NotNull DivTypefaceProvider defaultTypeface) {
        Intrinsics.checkNotNullParameter(typefaceProviders, "typefaceProviders");
        Intrinsics.checkNotNullParameter(defaultTypeface, "defaultTypeface");
        this.typefaceProviders = typefaceProviders;
        this.defaultTypeface = defaultTypeface;
    }

    @NotNull
    public DivTypefaceProvider getTypefaceProvider(@Nullable String str) {
        DivTypefaceProvider divTypefaceProvider;
        return (str == null || (divTypefaceProvider = this.typefaceProviders.get(str)) == null) ? this.defaultTypeface : divTypefaceProvider;
    }
}
