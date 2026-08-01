package com.winpower.neonfit.data;

import a1.d;
import c1.AbstractC0106c;
import c1.InterfaceC0108e;

@InterfaceC0108e(c = "com.winpower.neonfit.data.NutritionRepository", f = "NutritionRepository.kt", l = {33}, m = "getTodayTotals")
/* loaded from: classes.dex */
public final class NutritionRepository$getTodayTotals$1 extends AbstractC0106c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NutritionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NutritionRepository$getTodayTotals$1(NutritionRepository nutritionRepository, d dVar) {
        super(dVar);
        this.this$0 = nutritionRepository;
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getTodayTotals(this);
    }
}
