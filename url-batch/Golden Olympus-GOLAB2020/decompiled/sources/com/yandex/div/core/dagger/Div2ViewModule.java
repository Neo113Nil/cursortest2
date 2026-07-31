package com.yandex.div.core.dagger;

import com.yandex.div.core.view2.state.DivStateSwitcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class Div2ViewModule {

    @NotNull
    public static final Div2ViewModule INSTANCE = new Div2ViewModule();

    private Div2ViewModule() {
    }

    @NotNull
    public static final DivStateSwitcher provideStateSwitcher(boolean z4, @NotNull V1.a joinedStateSwitcher, @NotNull V1.a multipleStateSwitcher) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(joinedStateSwitcher, "joinedStateSwitcher");
        Intrinsics.checkNotNullParameter(multipleStateSwitcher, "multipleStateSwitcher");
        if (z4) {
            obj = multipleStateSwitcher.get();
            str = "multipleStateSwitcher.get()";
        } else {
            obj = joinedStateSwitcher.get();
            str = "joinedStateSwitcher.get()";
        }
        Intrinsics.checkNotNullExpressionValue(obj, str);
        return (DivStateSwitcher) obj;
    }
}
