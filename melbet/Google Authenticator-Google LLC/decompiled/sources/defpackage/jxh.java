package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxh {
    private static jxh c;
    public int a;
    public final Object b;

    public jxh() {
        this.b = Collections.EMPTY_LIST;
        this.a = 0;
    }

    public static synchronized jxh a() {
        jxh jxhVar;
        synchronized (jxh.class) {
            jxhVar = c;
            if (jxhVar == null) {
                jxhVar = new jxh();
                c = jxhVar;
            }
        }
        return jxhVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final synchronized List b() {
        this.a++;
        return this.b;
    }

    public final synchronized void c() {
    }

    public final ibu d() {
        return new ibq(this.a, (ibt) this.b);
    }

    public final void e(int i) {
        this.a = i;
    }

    public final void f() {
        ((jqw) this.b).a();
        this.a = 2;
    }

    public jxh(byte[] bArr) {
        this.b = ibt.a;
    }

    public jxh(jqw jqwVar) {
        this.a = 1;
        this.b = jqwVar;
    }
}
