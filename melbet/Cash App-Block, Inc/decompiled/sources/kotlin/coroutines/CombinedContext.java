package kotlin.coroutines;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class CombinedContext implements CoroutineContext, Serializable {
    public final CoroutineContext.Element element;
    public final CoroutineContext left;

    public CombinedContext(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        element.getClass();
        this.left = coroutineContext;
        this.element = element;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof CombinedContext) {
            CombinedContext combinedContext = (CombinedContext) obj;
            int i = 2;
            CombinedContext combinedContext2 = combinedContext;
            int i2 = 2;
            while (true) {
                CoroutineContext coroutineContext = combinedContext2.left;
                combinedContext2 = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
                if (combinedContext2 == null) {
                    break;
                }
                i2++;
            }
            CombinedContext combinedContext3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = combinedContext3.left;
                combinedContext3 = coroutineContext2 instanceof CombinedContext ? (CombinedContext) coroutineContext2 : null;
                if (combinedContext3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    CoroutineContext.Element element = this.element;
                    if (!Intrinsics.areEqual(combinedContext.get(element.getKey()), element)) {
                        z = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = this.left;
                    if (!(coroutineContext3 instanceof CombinedContext)) {
                        coroutineContext3.getClass();
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        z = Intrinsics.areEqual(combinedContext.get(element2.getKey()), element2);
                        break;
                    }
                    this = (CombinedContext) coroutineContext3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(this.left.fold(obj, function2), this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        key.getClass();
        while (true) {
            CoroutineContext.Element element = this.element.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = this.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return coroutineContext.get(key);
            }
            this = (CombinedContext) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        key.getClass();
        CoroutineContext.Element element = this.element;
        CoroutineContext.Element element2 = element.get(key);
        CoroutineContext coroutineContext = this.left;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext minusKey = coroutineContext.minusKey(key);
        return minusKey == coroutineContext ? this : minusKey == EmptyCoroutineContext.INSTANCE ? element : new CombinedContext(element, minusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == EmptyCoroutineContext.INSTANCE ? this : (CoroutineContext) coroutineContext.fold(this, new SaversKt$$ExternalSyntheticLambda5(8));
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("["), (String) fold("", new Equals$$ExternalSyntheticLambda0(19)), ']');
    }
}
