package format;

import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import operation.StandardLogicOperation;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public final class DecimalFormat implements StandardLogicOperation {
    public static final DecimalFormat INSTANCE = new DecimalFormat();

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        Object failure;
        Double doubleOrNull;
        JsonLogicList asList = AnyUtilsKt.getAsList(obj);
        String valueOf = String.valueOf(CollectionsKt.firstOrNull((List) asList));
        String valueOf2 = String.valueOf(CollectionsKt.getOrNull(1, asList));
        try {
            Result.Companion companion = Result.Companion;
            failure = (!new Regex("%[\\d|.]*[f]").matches(valueOf) || (doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(valueOf2)) == null) ? null : String.format(valueOf, Double.valueOf(doubleOrNull.doubleValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (Result.m4120exceptionOrNullimpl(failure) == null) {
            return (String) failure;
        }
        return null;
    }
}
