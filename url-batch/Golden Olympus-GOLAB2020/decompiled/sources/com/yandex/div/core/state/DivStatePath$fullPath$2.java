package com.yandex.div.core.state;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivStatePath$fullPath$2 extends s implements Function0<String> {
    final /* synthetic */ DivStatePath this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivStatePath$fullPath$2(DivStatePath divStatePath) {
        super(0);
        this.this$0 = divStatePath;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        return CollectionsKt.joinToString$default(this.this$0.getPath$div_release(), "/", null, null, 0, null, null, 62, null);
    }
}
