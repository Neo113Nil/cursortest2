package l1;

import f1.k0;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 extends z {

    /* renamed from: d, reason: collision with root package name */
    public final List f4745d;

    /* renamed from: e, reason: collision with root package name */
    public final k0 f4746e;

    public b0(List list, k0 k0Var) {
        this.f4745d = list;
        this.f4746e = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f4746e.equals(b0Var.f4746e) && q6.i.a(this.f4745d, b0Var.f4745d);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + a0.q.a(0.0f, a0.q.a(1.0f, a0.q.a(0.0f, a0.q.a(1.0f, a0.q.b(2, a0.q.b(0, a0.q.a(1.0f, a0.q.a(1.0f, a0.q.a(1.0f, (this.f4746e.hashCode() + (this.f4745d.hashCode() * 31)) * 31, 961), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
