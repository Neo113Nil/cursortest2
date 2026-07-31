package com.yandex.div.core;

import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.DivRequestExecutor$Companion$STUB$1;
import com.yandex.div.core.images.LoadReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivRequestExecutor$Companion$STUB$1 implements DivRequestExecutor {
    DivRequestExecutor$Companion$STUB$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0() {
    }

    @Override // com.yandex.div.core.DivRequestExecutor
    @NotNull
    public LoadReference execute(@NotNull DivRequestExecutor.Request request, @Nullable DivRequestExecutor.Callback callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new LoadReference() { // from class: m1.g
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                DivRequestExecutor$Companion$STUB$1.execute$lambda$0();
            }
        };
    }
}
