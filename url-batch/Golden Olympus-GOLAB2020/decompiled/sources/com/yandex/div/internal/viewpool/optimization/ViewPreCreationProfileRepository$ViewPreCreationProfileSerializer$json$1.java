package com.yandex.div.internal.viewpool.optimization;

import D2.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer$json$1 extends s implements Function1<e, Unit> {
    public static final ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer$json$1 INSTANCE = new ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer$json$1();

    ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer$json$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull e Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.c(false);
    }
}
