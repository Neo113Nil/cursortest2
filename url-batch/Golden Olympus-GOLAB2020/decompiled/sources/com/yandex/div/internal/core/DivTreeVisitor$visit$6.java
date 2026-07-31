package com.yandex.div.internal.core;

import O1.Bc;
import O1.Z;
import W1.q;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTreeVisitor$visit$6 extends s implements Function0<List<? extends q>> {
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ Z.o $data;
    final /* synthetic */ DivStatePath $path;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTreeVisitor$visit$6(Z.o oVar, BindingContext bindingContext, DivStatePath divStatePath) {
        super(0);
        this.$data = oVar;
        this.$context = bindingContext;
        this.$path = divStatePath;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<q> invoke() {
        List<Bc.c> list = this.$data.c().f1529y;
        BindingContext bindingContext = this.$context;
        DivStatePath divStatePath = this.$path;
        Z.o oVar = this.$data;
        ArrayList arrayList = new ArrayList();
        for (Bc.c cVar : list) {
            Z z4 = cVar.f1536c;
            q qVar = z4 != null ? new q(z4, bindingContext, divStatePath.append(DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, oVar.c(), null, 1, null), cVar.f1537d)) : null;
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }
}
