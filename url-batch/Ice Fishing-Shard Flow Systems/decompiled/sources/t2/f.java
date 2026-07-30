package t2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends e {
    private final Function1<b, Object> create;
    private Object obj;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Function1<? super b, Object> create) {
        Intrinsics.checkNotNullParameter(create, "create");
        this.create = create;
    }

    @Override // t2.e
    public Object resolve(b provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Object obj = this.obj;
        if (obj != null) {
            return obj;
        }
        Object invoke = this.create.invoke(provider);
        this.obj = invoke;
        return invoke;
    }
}
