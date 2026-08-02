package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bkn implements bjv {
    final /* synthetic */ bkp a;

    public bkn(bkp bkpVar) {
        this.a = bkpVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.bjv
    public final void a(boolean z) {
        ArrayList arrayList;
        bmi.f();
        bkp bkpVar = this.a;
        synchronized (bkpVar) {
            arrayList = new ArrayList((Collection) bkpVar.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjv) arrayList.get(i)).a(z);
        }
    }
}
