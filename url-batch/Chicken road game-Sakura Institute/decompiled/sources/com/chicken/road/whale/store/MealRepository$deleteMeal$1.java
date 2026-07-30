package com.chicken.road.whale.store;

import h6.d;
import j6.c;
import j6.e;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
@e(c = "com.chicken.road.whale.store.MealRepository", f = "MealRepository.kt", l = {20, 21}, m = "deleteMeal")
/* loaded from: classes.dex */
public final class MealRepository$deleteMeal$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MealRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MealRepository$deleteMeal$1(MealRepository mealRepository, d dVar) {
        super(dVar);
        this.this$0 = mealRepository;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteMeal(null, this);
    }
}
