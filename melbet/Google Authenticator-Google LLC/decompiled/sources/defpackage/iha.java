package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iha {
    public final long a;
    public final koe b;
    public long c = -1;
    public final LinkedHashMap d = hnu.A(100);
    public ArrayList e = new ArrayList();

    public iha(long j, koe koeVar) {
        this.a = j;
        this.b = koeVar;
    }

    public final synchronized List a() {
        ArrayList arrayList;
        arrayList = this.e;
        this.e = new ArrayList();
        return arrayList;
    }
}
