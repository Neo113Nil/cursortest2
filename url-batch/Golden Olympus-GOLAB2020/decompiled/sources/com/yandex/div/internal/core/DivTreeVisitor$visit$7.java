package com.yandex.div.internal.core;

import O1.Z;
import W1.q;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTreeVisitor$visit$7 extends s implements Function0<List<? extends q>> {
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ Z.d $data;
    final /* synthetic */ DivStatePath $path;
    final /* synthetic */ DivTreeVisitor<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTreeVisitor$visit$7(DivTreeVisitor<T> divTreeVisitor, Z.d dVar, BindingContext bindingContext, DivStatePath divStatePath) {
        super(0);
        this.this$0 = divTreeVisitor;
        this.$data = dVar;
        this.$context = bindingContext;
        this.$path = divStatePath;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<q> invoke() {
        List<q> mapDivWithContext;
        mapDivWithContext = this.this$0.mapDivWithContext(DivCollectionExtensionsKt.getNonNullItems(this.$data.c()), this.$context, this.$path);
        return mapDivWithContext;
    }
}
