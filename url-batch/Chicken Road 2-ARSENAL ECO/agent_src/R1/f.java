package R1;

import kotlin.jvm.internal.i;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class f extends e {
    private final InterfaceC0743l create;
    private Object obj;

    public f(InterfaceC0743l create) {
        i.e(create, "create");
        this.create = create;
    }

    @Override // R1.e
    public Object resolve(b provider) {
        i.e(provider, "provider");
        Object obj = this.obj;
        if (obj != null) {
            return obj;
        }
        Object invoke = this.create.invoke(provider);
        this.obj = invoke;
        return invoke;
    }
}
