package com.yandex.div.core.view2.divs;

import com.yandex.div.core.player.DivPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivVideoBinder$observeMuted$1 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ DivPlayer $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivVideoBinder$observeMuted$1(DivPlayer divPlayer) {
        super(1);
        this.$player = divPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        this.$player.setMuted(z4);
    }
}
