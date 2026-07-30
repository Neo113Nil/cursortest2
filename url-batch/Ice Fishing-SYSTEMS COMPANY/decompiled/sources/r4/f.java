package r4;

import E7.l;

/* loaded from: classes2.dex */
public final class f extends e {
    private final l create;
    private Object obj;

    public f(l create) {
        kotlin.jvm.internal.h.e(create, "create");
        this.create = create;
    }

    @Override // r4.e
    public Object resolve(b provider) {
        kotlin.jvm.internal.h.e(provider, "provider");
        Object obj = this.obj;
        if (obj != null) {
            return obj;
        }
        Object invoke = this.create.invoke(provider);
        this.obj = invoke;
        return invoke;
    }
}
