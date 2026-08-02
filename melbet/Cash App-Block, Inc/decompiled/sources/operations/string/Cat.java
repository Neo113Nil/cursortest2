package operations.string;

import androidx.activity.OnBackPressedDispatcherKt;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import operation.StandardLogicOperation;
import type.JsonLogicList;
import utils.AnyUtilsKt;
import utils.StringUtilsKt;

/* loaded from: classes9.dex */
public final class Cat implements StandardLogicOperation {
    public static final Cat INSTANCE = new Cat(0);
    public static final Cat INSTANCE$1 = new Cat(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Cat(int i) {
        this.$r8$classId = i;
    }

    public static int constrainOutOfBoundsCharsCount(int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        if (i > i2) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlin.Result$Failure] */
    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return CollectionsKt.joinToString$default(OnBackPressedDispatcherKt.unwrapValueAsString(obj), "", null, null, 0, null, null, 62);
            default:
                JsonLogicList asList = AnyUtilsKt.getAsList(obj);
                List list = asList.items;
                int doubleOrZero = (int) StringUtilsKt.getDoubleOrZero(String.valueOf(CollectionsKt.getOrNull(1, asList)));
                int doubleOrZero2 = (int) StringUtilsKt.getDoubleOrZero(String.valueOf(CollectionsKt.getOrNull(2, asList)));
                String joinToString$default = CollectionsKt.joinToString$default(OnBackPressedDispatcherKt.unwrapValueAsString(CollectionsKt.firstOrNull((List) asList)), ",", null, null, 0, null, null, 62);
                try {
                    Result.Companion companion = Result.Companion;
                    if (list.size() == 2) {
                        if (doubleOrZero >= 0) {
                            joinToString$default = joinToString$default.substring(doubleOrZero);
                        } else if (Math.abs(doubleOrZero) <= joinToString$default.length()) {
                            joinToString$default = joinToString$default.substring(joinToString$default.length() + doubleOrZero);
                        }
                    } else if (list.size() > 2) {
                        if (doubleOrZero >= 0 && doubleOrZero2 > 0) {
                            joinToString$default = joinToString$default.substring(doubleOrZero, constrainOutOfBoundsCharsCount(doubleOrZero2 + doubleOrZero, joinToString$default.length()));
                        } else if (doubleOrZero < 0 || doubleOrZero2 >= 0) {
                            if (doubleOrZero < 0 && doubleOrZero2 < 0) {
                                int length = joinToString$default.length() + doubleOrZero;
                                Integer valueOf = Integer.valueOf(length);
                                if (length < 0) {
                                    valueOf = null;
                                }
                                joinToString$default = joinToString$default.substring(valueOf != null ? valueOf.intValue() : 0, constrainOutOfBoundsCharsCount(joinToString$default.length() + doubleOrZero2, joinToString$default.length()));
                            } else if (doubleOrZero >= 0 || doubleOrZero2 <= 0) {
                                joinToString$default = null;
                            } else {
                                int length2 = joinToString$default.length() + doubleOrZero;
                                Integer valueOf2 = Integer.valueOf(length2);
                                if (length2 < 0) {
                                    valueOf2 = null;
                                }
                                int intValue = valueOf2 != null ? valueOf2.intValue() : 0;
                                joinToString$default = joinToString$default.substring(intValue, constrainOutOfBoundsCharsCount(doubleOrZero2 + intValue, joinToString$default.length()));
                            }
                        } else {
                            joinToString$default = joinToString$default.substring(doubleOrZero, joinToString$default.length() + doubleOrZero2);
                        }
                    }
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    joinToString$default = new Result.Failure(th);
                }
                String str = joinToString$default instanceof Result.Failure ? null : joinToString$default;
                return str == null ? "" : str;
        }
    }
}
