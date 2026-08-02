package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilw {
    public static jkx a(Object obj, long j) {
        return (jkx) jmp.f(obj, j);
    }

    public static final List b(Object obj, long j) {
        jkx a = a(obj, j);
        if (a.c()) {
            return a;
        }
        int size = a.size();
        jkx d = a.d(size == 0 ? 10 : size + size);
        jmp.q(obj, j, d);
        return d;
    }
}
