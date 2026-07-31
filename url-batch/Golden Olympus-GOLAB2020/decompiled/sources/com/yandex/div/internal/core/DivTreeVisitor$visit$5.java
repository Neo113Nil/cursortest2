package com.yandex.div.internal.core;

import O1.C1013qd;
import O1.Z;
import W1.q;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTreeVisitor$visit$5 extends s implements Function0<List<? extends q>> {
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ Z.q $data;
    final /* synthetic */ DivStatePath $path;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTreeVisitor$visit$5(Z.q qVar, BindingContext bindingContext, DivStatePath divStatePath) {
        super(0);
        this.$data = qVar;
        this.$context = bindingContext;
        this.$path = divStatePath;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<q> invoke() {
        List list = this.$data.c().f7630q;
        BindingContext bindingContext = this.$context;
        DivStatePath divStatePath = this.$path;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Z z4 = ((C1013qd.c) obj).f7643a;
            arrayList.add(new q(z4, bindingContext, BaseDivViewExtensionsKt.resolvePath(z4.b(), i4, divStatePath)));
            i4 = i5;
        }
        return arrayList;
    }
}
