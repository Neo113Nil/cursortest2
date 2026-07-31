package com.yandex.div.core.view2.divs;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.ParsingExceptionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivStateBinder$bindView$id$1 extends s implements Function0<Unit> {
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ DivStatePath $path;
    final /* synthetic */ DivStateBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivStateBinder$bindView$id$1(DivStateBinder divStateBinder, BindingContext bindingContext, DivStatePath divStatePath) {
        super(0);
        this.this$0 = divStateBinder;
        this.$context = bindingContext;
        this.$path = divStatePath;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m128invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m128invoke() {
        ErrorCollectors errorCollectors;
        errorCollectors = this.this$0.errorCollectors;
        errorCollectors.getOrCreate(this.$context.getDivView().getDataTag(), this.$context.getDivView().getDivData()).logError(ParsingExceptionKt.missingValue("id", this.$path.toString()));
    }
}
