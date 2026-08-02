package string.compareToDate;

import com.squareup.cash.api.Aliases;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.time.Instant;
import operation.StandardLogicOperation;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public final class CompareToDate implements StandardLogicOperation {
    public static final CompareToDate INSTANCE = new CompareToDate();

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        Object failure;
        Object failure2;
        List list = AnyUtilsKt.getAsList(obj).items;
        try {
            Result.Companion companion = Result.Companion;
            Object obj3 = list.get(2);
            obj3.getClass();
            ComparePrecision valueOf = ComparePrecision.valueOf((String) obj3);
            Object obj4 = list.get(0);
            obj4.getClass();
            Instant formatDate = Aliases.formatDate((String) obj4, valueOf);
            Object obj5 = list.get(1);
            obj5.getClass();
            failure = CollectionsKt__CollectionsKt.listOf((Object[]) new Instant[]{formatDate, Aliases.formatDate((String) obj5, valueOf)});
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        List list2 = (List) failure;
        if (list2 == null) {
            return null;
        }
        try {
            failure2 = Integer.valueOf(((Instant) CollectionsKt.first(list2)).compareTo((Instant) CollectionsKt.last(list2)));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            failure2 = new Result.Failure(th2);
        }
        boolean z = failure2 instanceof Result.Failure;
        if (z) {
            return (Integer) (z ? null : failure2);
        }
        int intValue = ((Number) failure2).intValue();
        return intValue > 0 ? 1 : intValue < 0 ? -1 : 0;
    }
}
