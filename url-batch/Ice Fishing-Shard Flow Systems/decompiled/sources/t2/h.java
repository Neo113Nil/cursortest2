package t2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends e {
    private Object obj;

    public h(Object obj) {
        this.obj = obj;
    }

    @Override // t2.e
    public Object resolve(b provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return this.obj;
    }
}
