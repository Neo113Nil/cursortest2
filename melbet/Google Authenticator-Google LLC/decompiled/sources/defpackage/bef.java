package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bef {
    final Object a;
    public List b;
    bef c;
    bef d;

    public bef(Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final int a() {
        List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object b() {
        int a = a();
        if (a > 0) {
            return this.b.remove(a - 1);
        }
        return null;
    }

    bef() {
        throw null;
    }
}
