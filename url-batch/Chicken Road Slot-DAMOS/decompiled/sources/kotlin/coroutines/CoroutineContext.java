package kotlin.coroutines;

import a4.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J)\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H¦\u0082\u0004¢\u0006\u0002\u0010\u0007J7\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\t0\fH¦\u0080\u0004¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0082\u0004J\u0016\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H¦\u0080\u0004Ê\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "get", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "plus", "context", "minusKey", "Key", "Element", "kotlin-stdlib", "Lkotlin/SinceKotlin;", "version", "1.3"}, k = 1, mv = {2, j.LONG_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CoroutineContext {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\b\b\u0000\u0010\u0007*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0003H\u0096\u0082\u0004¢\u0006\u0002\u0010\bJ7\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\n0\rH\u0096\u0080\u0004¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0096\u0080\u0004R\u0017\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0084\b¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "kotlin-stdlib"}, k = 1, mv = {2, j.LONG_FIELD_NUMBER, 0}, xi = 48)
    public interface Element extends CoroutineContext {
        f getKey();
    }

    CoroutineContext F(f fVar);

    Element m(f fVar);

    CoroutineContext p(CoroutineContext coroutineContext);

    Object z(Object obj, Function2 function2);
}
