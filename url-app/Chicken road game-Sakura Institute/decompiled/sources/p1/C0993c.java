package p1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import l.t0;

/* renamed from: p1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993c extends t0 {
    public /* synthetic */ C0993c() {
        this(C0991a.f9082b);
    }

    public final Object q(InterfaceC0992b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((LinkedHashMap) this.f7841a).get(key);
    }

    public final void r(InterfaceC0992b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((LinkedHashMap) this.f7841a).put(key, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0993c(t0 initialExtras) {
        super(1);
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        ((LinkedHashMap) this.f7841a).putAll((LinkedHashMap) initialExtras.f7841a);
    }
}
