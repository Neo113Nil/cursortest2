package operations.logic.equals;

import com.nimbusds.jose.util.DeflateUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import operation.StandardLogicOperation;
import operations.ComparingOperation;

/* loaded from: classes9.dex */
public final class Equals implements StandardLogicOperation, EqualsOperation {
    public static final Equals INSTANCE = new Equals(0);
    public static final Equals INSTANCE$1 = new Equals(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Equals(int i) {
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
                return Boolean.valueOf(DeflateUtils.compare(this, obj, new Equals$$ExternalSyntheticLambda0(0)));
            default:
                return Boolean.valueOf(!DeflateUtils.compare(this, obj, new Equals$$ExternalSyntheticLambda0(24)));
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

    @Override // operations.logic.equals.EqualsOperation
    public final Object unwrapSingleNestedValueOrDefault(Object obj) {
        switch (this.$r8$classId) {
        }
        return DeflateUtils.unwrapSingleNestedValueOrDefault(obj);
    }

    @Override // operations.logic.equals.EqualsOperation
    public final Object unwrapValue(Object obj) {
        switch (this.$r8$classId) {
        }
        return DeflateUtils.unwrapValue(this, obj);
    }

    @Override // operations.ComparingOperation
    public final Boolean unwrapValueAsBoolean(Comparable comparable) {
        switch (this.$r8$classId) {
        }
        return ComparingOperation.DefaultImpls.unwrapValueAsBoolean(comparable);
    }
}
