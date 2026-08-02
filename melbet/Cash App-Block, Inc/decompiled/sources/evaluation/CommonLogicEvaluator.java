package evaluation;

import defpackage.JsonLogicException;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import operation.FunctionalLogicOperation;
import operation.StandardLogicOperation;

/* loaded from: classes9.dex */
public final class CommonLogicEvaluator {

    /* renamed from: operations, reason: collision with root package name */
    public final LogicOperations f1518operations;

    public CommonLogicEvaluator(LogicOperations logicOperations) {
        this.f1518operations = logicOperations;
    }

    public final Object evaluateLogic(Map map, Object obj) {
        map.getClass();
        return executeExpression(map, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    public final Object executeExpression(Object obj, Object obj2) {
        Object executeExpression;
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(executeExpression(it.next(), obj2));
            }
            return arrayList;
        }
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return obj2;
        }
        Object firstOrNull = CollectionsKt.firstOrNull(map.keySet());
        Object obj3 = map.get(firstOrNull);
        LogicOperations logicOperations = this.f1518operations;
        LinkedHashMap linkedHashMap = logicOperations.functionalOperations;
        if (CollectionsKt.contains(linkedHashMap.keySet(), firstOrNull)) {
            FunctionalLogicOperation functionalLogicOperation = (FunctionalLogicOperation) linkedHashMap.get(firstOrNull);
            if (functionalLogicOperation != null) {
                return functionalLogicOperation.evaluateLogic(obj3, obj2, this);
            }
            return null;
        }
        StandardLogicOperation standardLogicOperation = (StandardLogicOperation) logicOperations.standardOperations.get(firstOrNull);
        if (standardLogicOperation == null) {
            throw new JsonLogicException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Operation ", " not found.", firstOrNull));
        }
        if (obj3 instanceof List) {
            Iterable iterable2 = (Iterable) obj3;
            executeExpression = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                executeExpression.add(executeExpression(it2.next(), obj2));
            }
        } else {
            executeExpression = obj3 instanceof Map ? executeExpression(obj3, obj2) : executeExpression(obj3, obj2);
        }
        return standardLogicOperation.evaluateLogic(executeExpression, obj2);
    }
}
