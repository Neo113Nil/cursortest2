package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agv implements afd {
    public final aha a;
    public boolean b = false;
    public final exs c;

    public agv(aha ahaVar, exs exsVar) {
        this.a = ahaVar;
        this.c = exsVar;
    }

    @Override // defpackage.afd
    public final void a(Object obj) {
        if (agt.b(2)) {
            Objects.toString(this.a);
            aha.e(obj);
        }
        this.b = true;
        this.c.a((List) obj);
    }

    public final String toString() {
        return this.c.toString();
    }
}
