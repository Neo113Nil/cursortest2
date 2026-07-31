package com.yandex.div.core.view2.divs;

import O1.Lf;
import com.yandex.div.core.player.DivPlayerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivVideoBinder$observeScale$1 extends s implements Function1<Lf, Unit> {
    final /* synthetic */ DivPlayerView $playerView;
    final /* synthetic */ PreviewImageView $previewView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivVideoBinder$observeScale$1(DivPlayerView divPlayerView, PreviewImageView previewImageView) {
        super(1);
        this.$playerView = divPlayerView;
        this.$previewView = previewImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Lf) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Lf it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$playerView.setScale(it);
        this.$previewView.setScale(it);
    }
}
