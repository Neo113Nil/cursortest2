package com.withpersona.sdk2.inquiry.network.dto;

import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import defpackage.CommonJsonLogicEngine;
import defpackage.JsonLogicEngine;
import defpackage.OperationsProvider;
import evaluation.CommonLogicEvaluator;
import evaluation.LogicOperations;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import operation.FunctionalLogicOperation;
import operation.StandardLogicOperation;
import operations.In;
import operations.array.Filter;
import operations.array.Map;
import operations.array.Merge;
import operations.array.Reduce;
import operations.array.occurence.All;
import operations.data.Var;
import operations.logic.If;
import operations.logic.equals.Equals;
import operations.logic.equals.strict.StrictEquals;
import operations.numeric.Max;
import operations.numeric.compare.LessThan;
import operations.string.Cat;
import org.slf4j.Marker;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"jsonLogicEngine", "LJsonLogicEngine;", "getJsonLogicEngine", "()LJsonLogicEngine;", "jsonLogicEngine$delegate", "Lkotlin/Lazy;", "network-inquiry_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonLogicBooleanKt {
    private static final Lazy jsonLogicEngine$delegate = LazyKt.lazy(new ShimmerThemeKt$$ExternalSyntheticLambda0(20));

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonLogicEngine getJsonLogicEngine() {
        return (JsonLogicEngine) jsonLogicEngine$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonLogicEngine jsonLogicEngine_delegate$lambda$0() {
        LinkedHashMap mutableMapOf = MapsKt__MapsKt.mutableMapOf(new Pair("var", Var.INSTANCE), new Pair("missing_some", Var.INSTANCE$2), new Pair("missing", Var.INSTANCE$1), new Pair(">", LessThan.INSTANCE$1), new Pair(">=", LessThan.INSTANCE$2), new Pair("<", LessThan.INSTANCE), new Pair("<=", LessThan.INSTANCE$3), new Pair("min", Max.INSTANCE$3), new Pair("max", Max.INSTANCE), new Pair(Marker.ANY_NON_NULL_MARKER, Max.INSTANCE$1), new Pair("-", Max.INSTANCE$6), new Pair(Marker.ANY_MARKER, Max.INSTANCE$5), new Pair("/", Max.INSTANCE$2), new Pair("%", Max.INSTANCE$4), new Pair("==", Equals.INSTANCE), new Pair("!=", Equals.INSTANCE$1), new Pair("===", StrictEquals.INSTANCE), new Pair("!==", StrictEquals.INSTANCE$1), new Pair("!", If.INSTANCE$3), new Pair("!!", If.INSTANCE$2), new Pair("and", If.INSTANCE$1), new Pair("or", If.INSTANCE$4), new Pair("if", If.INSTANCE), new Pair("cat", Cat.INSTANCE), new Pair("substr", Cat.INSTANCE$1), new Pair("merge", Merge.INSTANCE), new Pair("in", In.INSTANCE));
        LinkedHashMap mutableMapOf2 = MapsKt__MapsKt.mutableMapOf(new Pair("map", Map.INSTANCE), new Pair("filter", Filter.INSTANCE), new Pair("reduce", Reduce.INSTANCE), new Pair("all", All.INSTANCE), new Pair("none", All.INSTANCE$1), new Pair("some", All.INSTANCE$2));
        LinkedHashMap linkedHashMap = OperationsProvider.standardOperations;
        linkedHashMap.getClass();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            StandardLogicOperation standardLogicOperation = (StandardLogicOperation) entry.getValue();
            str.getClass();
            standardLogicOperation.getClass();
            if (!mutableMapOf2.containsKey(str) && !mutableMapOf.containsKey(str)) {
                mutableMapOf.put(str, standardLogicOperation);
            }
        }
        LinkedHashMap linkedHashMap2 = OperationsProvider.functionalOperations;
        linkedHashMap2.getClass();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str2 = (String) entry2.getKey();
            FunctionalLogicOperation functionalLogicOperation = (FunctionalLogicOperation) entry2.getValue();
            str2.getClass();
            functionalLogicOperation.getClass();
            if (!mutableMapOf2.containsKey(str2) && !mutableMapOf.containsKey(str2)) {
                mutableMapOf2.put(str2, functionalLogicOperation);
            }
        }
        return new CommonJsonLogicEngine(new CommonLogicEvaluator(new LogicOperations(mutableMapOf, mutableMapOf2)));
    }
}
