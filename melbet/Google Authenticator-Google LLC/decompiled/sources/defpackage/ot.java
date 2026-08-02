package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ot extends ou implements Iterator {
    or a;
    or b;

    public ot(or orVar, or orVar2) {
        this.a = orVar2;
        this.b = orVar;
    }

    private final or c() {
        or orVar = this.b;
        or orVar2 = this.a;
        if (orVar == orVar2 || orVar2 == null) {
            return null;
        }
        return orVar.c;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        or orVar = this.b;
        this.b = c();
        return orVar;
    }

    @Override // defpackage.ou
    public final void b(or orVar) {
        if (this.a == orVar && orVar == this.b) {
            this.b = null;
            this.a = null;
        }
        or orVar2 = this.a;
        if (orVar2 == orVar) {
            this.a = orVar2.d;
        }
        if (this.b == orVar) {
            this.b = c();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
