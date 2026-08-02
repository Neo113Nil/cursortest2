package operations.logic.equals;

import operations.ComparingOperation;

/* loaded from: classes9.dex */
public interface EqualsOperation extends ComparingOperation {
    Object unwrapSingleNestedValueOrDefault(Object obj);

    Object unwrapValue(Object obj);
}
