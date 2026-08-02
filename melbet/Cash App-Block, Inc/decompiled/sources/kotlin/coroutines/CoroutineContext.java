package kotlin.coroutines;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Key", "Element", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CoroutineContext {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Element extends CoroutineContext {

        public abstract class DefaultImpls {
            public static Element get(Element element, Key key) {
                key.getClass();
                if (Intrinsics.areEqual(element.getKey(), key)) {
                    return element;
                }
                return null;
            }

            public static CoroutineContext minusKey(Element element, Key key) {
                key.getClass();
                return Intrinsics.areEqual(element.getKey(), key) ? EmptyCoroutineContext.INSTANCE : element;
            }

            public static CoroutineContext plus(Element element, CoroutineContext coroutineContext) {
                coroutineContext.getClass();
                return coroutineContext == EmptyCoroutineContext.INSTANCE ? element : (CoroutineContext) coroutineContext.fold(element, new SaversKt$$ExternalSyntheticLambda5(8));
            }
        }

        Key getKey();
    }

    public interface Key {
    }

    Object fold(Object obj, Function2 function2);

    Element get(Key key);

    CoroutineContext minusKey(Key key);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
