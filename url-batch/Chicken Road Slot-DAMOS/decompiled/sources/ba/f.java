package ba;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends e {
    private final Function1<b, Object> create;
    private Object obj;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Function1<? super b, Object> function1) {
        function1.getClass();
        this.create = function1;
    }

    @Override // ba.e
    public Object resolve(b bVar) {
        bVar.getClass();
        Object obj = this.obj;
        if (obj != null) {
            return obj;
        }
        Object invoke = this.create.invoke(bVar);
        this.obj = invoke;
        return invoke;
    }
}
