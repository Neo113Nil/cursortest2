package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jlw extends jjk {
    final jlx a;
    jjm b = b();
    final /* synthetic */ jly c;

    public jlw(jly jlyVar) {
        this.c = jlyVar;
        this.a = new jlx(jlyVar);
    }

    private final jjm b() {
        jlx jlxVar = this.a;
        if (jlxVar.hasNext()) {
            return jlxVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.jjm
    public final byte a() {
        jjm jjmVar = this.b;
        if (jjmVar == null) {
            throw new NoSuchElementException();
        }
        byte a = jjmVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
