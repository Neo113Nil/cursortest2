package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bdl {
    final Executor a;
    final blg b;

    public bdl(blg blgVar, Executor executor) {
        this.b = blgVar;
        this.a = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdl) {
            return this.b.equals(((bdl) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
