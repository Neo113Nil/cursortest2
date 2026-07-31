package com.yandex.div.core.view2.divs.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivPagerAdapter$onCreateViewHolder$1 extends s implements Function0<Boolean> {
    final /* synthetic */ DivPagerAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivPagerAdapter$onCreateViewHolder$1(DivPagerAdapter divPagerAdapter) {
        super(0);
        this.this$0 = divPagerAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        boolean isHorizontal;
        isHorizontal = this.this$0.isHorizontal();
        return Boolean.valueOf(isHorizontal);
    }
}
