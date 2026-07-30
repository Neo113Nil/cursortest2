package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends c {
    public /* synthetic */ d(int i2) {
        this(C0265a.f4133b);
    }

    public final Object a(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f4134a.get(key);
    }

    public final void b(b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f4134a.put(key, obj);
    }

    public d(c initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        this.f4134a.putAll(initialExtras.f4134a);
    }
}
