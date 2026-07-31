package com.yandex.div.internal.viewpool;

import android.view.View;
import com.yandex.div.internal.util.UtilsKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class PseudoViewPool implements ViewPool {

    @NotNull
    private final ConcurrentHashMap<String, ViewFactory<? extends View>> factoryMap = new ConcurrentHashMap<>();

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public void changeCapacity(@NotNull String tag, int i4) {
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @NotNull
    public <T extends View> T obtain(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        T t4 = (T) ((ViewFactory) UtilsKt.getOrThrow$default(this.factoryMap, tag, null, 2, null)).createView();
        Intrinsics.checkNotNull(t4, "null cannot be cast to non-null type T of com.yandex.div.internal.viewpool.PseudoViewPool.obtain");
        return t4;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public <T extends View> void register(@NotNull String tag, @NotNull ViewFactory<T> factory, int i4) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.factoryMap.put(tag, factory);
    }
}
