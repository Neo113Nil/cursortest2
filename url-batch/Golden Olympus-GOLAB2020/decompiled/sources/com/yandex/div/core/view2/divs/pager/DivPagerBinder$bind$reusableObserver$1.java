package com.yandex.div.core.view2.divs.pager;

import O1.E9;
import android.util.SparseArray;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivPagerBinder$bind$reusableObserver$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ DivPagerAdapter $adapter;
    final /* synthetic */ E9 $div;
    final /* synthetic */ SparseArray<Float> $pageTranslations;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivPagerView $this_bind;
    final /* synthetic */ DivPagerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivPagerBinder$bind$reusableObserver$1(DivPagerBinder divPagerBinder, DivPagerView divPagerView, E9 e9, ExpressionResolver expressionResolver, SparseArray<Float> sparseArray, DivPagerAdapter divPagerAdapter) {
        super(1);
        this.this$0 = divPagerBinder;
        this.$this_bind = divPagerView;
        this.$div = e9;
        this.$resolver = expressionResolver;
        this.$pageTranslations = sparseArray;
        this.$adapter = divPagerAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m148invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m148invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyDecorations(this.$this_bind, this.$div, this.$resolver, this.$pageTranslations, this.$adapter);
    }
}
