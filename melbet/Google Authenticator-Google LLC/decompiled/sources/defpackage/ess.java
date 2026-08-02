package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ess extends ContentObserver {
    final /* synthetic */ est a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ess(est estVar) {
        super(null);
        this.a = estVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        est estVar = this.a;
        synchronized (estVar.g) {
            estVar.h = null;
            eti.e();
        }
        synchronized (estVar) {
            Iterator it = estVar.i.iterator();
            while (it.hasNext()) {
                ((esu) it.next()).a();
            }
        }
    }
}
