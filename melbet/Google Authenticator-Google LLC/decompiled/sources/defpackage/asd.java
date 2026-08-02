package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asd extends atf {
    public final List a = new CopyOnWriteArrayList();

    @Override // defpackage.atf
    public final asp a(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                asp a = ((atf) it.next()).a(context, str, workerParameters);
                if (a != null) {
                    return a;
                }
            } catch (Throwable th) {
                asq.a().d(ase.a, a.Z(str, "Unable to instantiate a ListenableWorker (", ")"), th);
                throw th;
            }
        }
        return null;
    }
}
