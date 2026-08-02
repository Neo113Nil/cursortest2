package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class os extends ou implements Iterator {
    final /* synthetic */ ov a;
    private or b;
    private boolean c = true;

    public os(ov ovVar) {
        this.a = ovVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        if (this.c) {
            this.c = false;
            or orVar = this.a.a;
            this.b = orVar;
            return orVar;
        }
        or orVar2 = this.b;
        or orVar3 = orVar2 != null ? orVar2.c : null;
        this.b = orVar3;
        return orVar3;
    }

    @Override // defpackage.ou
    public final void b(or orVar) {
        or orVar2 = this.b;
        if (orVar == orVar2) {
            or orVar3 = orVar2.d;
            this.b = orVar3;
            this.c = orVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.a != null;
        }
        or orVar = this.b;
        return (orVar == null || orVar.c == null) ? false : true;
    }
}
