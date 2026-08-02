package operations.numeric.compare;

import defpackage.DropMode;
import java.util.List;
import kotlin.jvm.functions.Function2;
import operation.StandardLogicOperation;
import operations.ComparingOperation;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;
import radiography.ViewStateRenderers$$ExternalSyntheticLambda1;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public final class LessThan implements StandardLogicOperation, ComparingOperation {
    public final /* synthetic */ int $r8$classId;
    public static final LessThan INSTANCE$1 = new LessThan(1);
    public static final LessThan INSTANCE$2 = new LessThan(2);
    public static final LessThan INSTANCE = new LessThan(0);
    public static final LessThan INSTANCE$3 = new LessThan(3);

    public /* synthetic */ LessThan(int i) {
        this.$r8$classId = i;
    }

    @Override // operations.ComparingOperation
    public final boolean compareListOfTwo(List list, Function2 function2) {
        switch (this.$r8$classId) {
            case 0:
                return ComparingOperation.DefaultImpls.compareListOfTwo(this, list, function2);
            case 1:
                throw null;
            case 2:
                throw null;
            default:
                return ComparingOperation.DefaultImpls.compareListOfTwo(this, list, function2);
        }
    }

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return Boolean.valueOf(DropMode.compareOrBetween(this, AnyUtilsKt.getAsList(obj), new Equals$$ExternalSyntheticLambda0(29)));
            case 1:
                return Boolean.valueOf(ComparingOperation.DefaultImpls.compareListOfTwo(this, AnyUtilsKt.getAsList(obj), new Equals$$ExternalSyntheticLambda0(27)));
            case 2:
                return Boolean.valueOf(ComparingOperation.DefaultImpls.compareListOfTwo(this, AnyUtilsKt.getAsList(obj), new Equals$$ExternalSyntheticLambda0(28)));
            default:
                return Boolean.valueOf(DropMode.compareOrBetween(this, AnyUtilsKt.getAsList(obj), new ViewStateRenderers$$ExternalSyntheticLambda1(1)));
        }
    }

    @Override // operations.ComparingOperation
    public final List unwrapAsComparable(Comparable comparable, Comparable comparable2) {
        switch (this.$r8$classId) {
        }
        return ComparingOperation.DefaultImpls.unwrapAsComparable(this, comparable, comparable2);
    }

    @Override // operations.ComparingOperation
    public final List unwrapAsComparableWithTypeSensitivity(Comparable comparable, Comparable comparable2) {
        switch (this.$r8$classId) {
        }
        return ComparingOperation.DefaultImpls.unwrapAsComparableWithTypeSensitivity(comparable, comparable2);
    }

    @Override // operations.ComparingOperation
    public final Boolean unwrapValueAsBoolean(Comparable comparable) {
        switch (this.$r8$classId) {
        }
        return ComparingOperation.DefaultImpls.unwrapValueAsBoolean(comparable);
    }
}
