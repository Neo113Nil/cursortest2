package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxo {
    private final String a;
    private final Object b;

    public jxo(String str, Object obj) {
        Logger logger = jxr.c;
        this.a = str;
        this.b = obj;
    }

    public final Object a(jxr jxrVar) {
        kbb kbbVar = jxrVar.f;
        Object d = kbbVar == null ? null : kbbVar.d(this, hashCode(), 0);
        return d == null ? this.b : d;
    }

    public final String toString() {
        return this.a;
    }
}
