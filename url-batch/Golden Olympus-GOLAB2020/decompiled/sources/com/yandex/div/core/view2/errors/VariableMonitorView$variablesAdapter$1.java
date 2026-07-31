package com.yandex.div.core.view2.errors;

import h2.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
/* synthetic */ class VariableMonitorView$variablesAdapter$1 extends p implements n {
    VariableMonitorView$variablesAdapter$1(Object obj) {
        super(3, obj, VariableMonitor.class, "mutateVariable", "mutateVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // h2.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((String) obj, (String) obj2, (String) obj3);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull String p02, @NotNull String p12, @NotNull String p22) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        ((VariableMonitor) this.receiver).mutateVariable(p02, p12, p22);
    }
}
