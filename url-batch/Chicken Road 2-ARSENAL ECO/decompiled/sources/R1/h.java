package R1;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class h extends e {
    private Object obj;

    public h(Object obj) {
        this.obj = obj;
    }

    @Override // R1.e
    public Object resolve(b provider) {
        i.e(provider, "provider");
        return this.obj;
    }
}
