package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: JsonTreeReader.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {24}, m = "readObject", n = {"$this$readObject", "this_$iv", "result$iv", "key$iv", "$i$f$readObjectImpl", "lastToken$iv", "$i$a$-readObjectImpl-JsonTreeReader$readObject$3"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "B$0", "I$1"})
/* loaded from: classes2.dex */
final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    byte B$0;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonTreeReader$readObject$2(JsonTreeReader jsonTreeReader, Continuation<? super JsonTreeReader$readObject$2> continuation) {
        super(continuation);
        this.this$0 = jsonTreeReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object readObject;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readObject = this.this$0.readObject(null, this);
        return readObject;
    }
}
