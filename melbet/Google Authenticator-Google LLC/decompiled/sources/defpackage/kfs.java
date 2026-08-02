package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kfs {
    private ArrayList a = new ArrayList();
    private volatile jxi b = jxi.d;

    final void a(jxi jxiVar) {
        jxiVar.getClass();
        if (this.b == jxiVar || this.b == jxi.e) {
            return;
        }
        this.b = jxiVar;
        if (this.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        this.a = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
