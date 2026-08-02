package defpackage;

import android.graphics.PorterDuff;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dnd extends AsyncTask {
    private final WeakReference a;

    public dnd(dne dneVar) {
        this.a = new WeakReference(dneVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        dne dneVar = (dne) this.a.get();
        if (dneVar == null) {
            return null;
        }
        dni a = dneVar.a(2131230951, 50, 833);
        int i = dneVar.i;
        if (i == 0) {
            return a;
        }
        a.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        return a;
    }

    @Override // android.os.AsyncTask
    protected final void onCancelled() {
        dne dneVar = (dne) this.a.get();
        if (dneVar != null) {
            dneVar.b();
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        dni dniVar = (dni) obj;
        dne dneVar = (dne) this.a.get();
        if (dneVar != null) {
            if (dniVar == null) {
                dneVar.b();
                return;
            }
            if (dneVar.e()) {
                dneVar.j = dniVar;
                if (dneVar.e) {
                    dneVar.c();
                    dneVar.e = false;
                }
            }
        }
    }
}
