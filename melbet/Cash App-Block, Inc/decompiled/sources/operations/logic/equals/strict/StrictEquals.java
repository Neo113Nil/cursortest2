package operations.logic.equals.strict;

import com.nimbusds.jose.util.DeflateUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.TypesJVMKt;
import operation.StandardLogicOperation;
import operations.ComparingOperation;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;
import operations.logic.equals.EqualsOperation;

/* loaded from: classes9.dex */
public final class StrictEquals implements StandardLogicOperation, EqualsOperation {
    public final /* synthetic */ int $r8$classId;
    public static final StrictEquals INSTANCE$1 = new StrictEquals(1);
    public static final StrictEquals INSTANCE = new StrictEquals(0);

    public /* synthetic */ StrictEquals(int i) {
        this.$r8$classId = i;
    }

    @Override // operations.ComparingOperation
    public final boolean compareListOfTwo(List list, Function2 function2) {
        switch (this.$r8$classId) {
        }
        return ComparingOperation.DefaultImpls.compareListOfTwo(this, (ArrayList) list, function2);
    }

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return Boolean.valueOf(TypesJVMKt.compare(this, obj, new Equals$$ExternalSyntheticLambda0(26)));
            default:
                return Boolean.valueOf(!TypesJVMKt.compare(this, obj, new Equals$$ExternalSyntheticLambda0(25)));
        }
    }

    @Override // operations.ComparingOperation
    public final List unwrapAsComparable(Comparable comparable, Comparable comparable2) {
        switch (this.$r8$classId) {
        }
        return ComparingOperation.DefaultImpls.unwrapAsComparableWithTypeSensitivity(comparable, comparable2);
    }

    @Override // operations.ComparingOperation
    public final List unwrapAsComparableWithTypeSensitivity(Comparable comparable, Comparable comparable2) {
        switch (this.$r8$classId) {
        }
        return ComparingOperation.DefaultImpls.unwrapAsComparableWithTypeSensitivity(comparable, comparable2);
    }

    @Override // operations.logic.equals.EqualsOperation
    public final Object unwrapSingleNestedValueOrDefault(Object obj) {
        switch (this.$r8$classId) {
        }
        return DeflateUtils.unwrapSingleNestedValueOrDefault(obj);
    }

    @Override // operations.logic.equals.EqualsOperation
    public final Object unwrapValue(Object obj) {
        Number number;
        switch (this.$r8$classId) {
            case 0:
                number = obj instanceof Number ? (Number) obj : null;
                return number != null ? Double.valueOf(number.doubleValue()) : obj;
            default:
                number = obj instanceof Number ? (Number) obj : null;
                return number != null ? Double.valueOf(number.doubleValue()) : obj;
        }
    }

    @Override // operations.ComparingOperation
    public final Boolean unwrapValueAsBoolean(Comparable comparable) {
        switch (this.$r8$classId) {
        }
        return ComparingOperation.DefaultImpls.unwrapValueAsBoolean(comparable);
    }
}
