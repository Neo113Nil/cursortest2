package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktz implements ktu {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;

    public ktz(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    @Override // defpackage.ktu
    public final Iterator a() {
        int i = this.c;
        return i != 0 ? i != 1 ? new kua(this) : new ktt(this) : new kty(this);
    }

    public ktz(ktu ktuVar, krt krtVar, int i) {
        this.c = i;
        this.a = ktuVar;
        this.b = krtVar;
    }
}
