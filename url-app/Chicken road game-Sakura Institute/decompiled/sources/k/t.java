package k;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.InterfaceC0799z;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final S.g f7322a;

    /* renamed from: b, reason: collision with root package name */
    public final M2.p f7323b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0799z f7324c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7325d;

    /* JADX WARN: Multi-variable type inference failed */
    public t(S.g gVar, Function1 function1, InterfaceC0799z interfaceC0799z, boolean z4) {
        this.f7322a = gVar;
        this.f7323b = (M2.p) function1;
        this.f7324c = interfaceC0799z;
        this.f7325d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f7322a.equals(tVar.f7322a) && this.f7323b.equals(tVar.f7323b) && Intrinsics.a(this.f7324c, tVar.f7324c) && this.f7325d == tVar.f7325d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7325d) + ((this.f7324c.hashCode() + ((this.f7323b.hashCode() + (this.f7322a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f7322a + ", size=" + this.f7323b + ", animationSpec=" + this.f7324c + ", clip=" + this.f7325d + ')';
    }
}
