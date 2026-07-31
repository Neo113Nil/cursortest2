package com.yandex.div.core.view2.divs;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class BaseDivViewExtensionsKt$bindClipChildren$1 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ ViewGroup $this_bindClipChildren;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseDivViewExtensionsKt$bindClipChildren$1(ViewGroup viewGroup) {
        super(1);
        this.$this_bindClipChildren = viewGroup;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        BaseDivViewExtensionsKt.applyClipChildren(this.$this_bindClipChildren, z4);
    }
}
