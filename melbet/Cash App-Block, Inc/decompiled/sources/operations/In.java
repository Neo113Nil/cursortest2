package operations;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import operation.StandardLogicOperation;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public final class In implements StandardLogicOperation {
    public static final In INSTANCE = new In(0);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ In(int i) {
        this.$r8$classId = i;
    }

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) AnyUtilsKt.getAsList(obj));
                Object orNull = CollectionsKt.getOrNull(1, AnyUtilsKt.getAsList(obj));
                return orNull instanceof String ? Boolean.valueOf(StringsKt.contains((CharSequence) orNull, (CharSequence) String.valueOf(firstOrNull), false)) : orNull instanceof List ? Boolean.valueOf(((List) orNull).contains(firstOrNull)) : Boolean.FALSE;
            default:
                return CollectionsKt.firstOrNull((List) AnyUtilsKt.getAsList(obj));
        }
    }
}
