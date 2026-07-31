package com.yandex.div.core.view2.animations;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class ViewCopiesKt$createOrGetVisualCopy$1 extends s implements Function0<Unit> {
    final /* synthetic */ ImageView $copy;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewCopiesKt$createOrGetVisualCopy$1(ImageView imageView, View view) {
        super(0);
        this.$copy = imageView;
        this.$view = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m62invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m62invoke() {
        ViewCopiesKt.setScreenshotFromView(this.$copy, this.$view);
    }
}
