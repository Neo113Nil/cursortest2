package com.yandex.div.core.expression;

import com.yandex.div.core.ObserverList;
import com.yandex.div.data.Variable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ExpressionResolverImpl$subscribeOnVariables$1 extends s implements Function1<Variable, Unit> {
    final /* synthetic */ ExpressionResolverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionResolverImpl$subscribeOnVariables$1(ExpressionResolverImpl expressionResolverImpl) {
        super(1);
        this.this$0 = expressionResolverImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Variable) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Variable v4) {
        Map map;
        Map map2;
        Map map3;
        Intrinsics.checkNotNullParameter(v4, "v");
        map = this.this$0.varToExpressions;
        Set set = (Set) map.get(v4.getName());
        List<String> list = set != null ? CollectionsKt.toList(set) : null;
        if (list != null) {
            ExpressionResolverImpl expressionResolverImpl = this.this$0;
            for (String str : list) {
                map3 = expressionResolverImpl.evaluationsCache;
                map3.remove(str);
            }
        }
        if (list != null) {
            ExpressionResolverImpl expressionResolverImpl2 = this.this$0;
            for (String str2 : list) {
                map2 = expressionResolverImpl2.expressionObservers;
                ObserverList observerList = (ObserverList) map2.get(str2);
                if (observerList != null) {
                    Iterator<E> it = observerList.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                }
            }
        }
    }
}
