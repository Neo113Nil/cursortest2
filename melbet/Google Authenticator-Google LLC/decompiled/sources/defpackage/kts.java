package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kts implements ktu {
    public final ktu a;
    public final boolean b;
    public final krt c;

    public kts(ktu ktuVar, boolean z, krt krtVar) {
        this.a = ktuVar;
        this.b = z;
        this.c = krtVar;
    }

    @Override // defpackage.ktu
    public final Iterator a() {
        return new ktr(this);
    }
}
