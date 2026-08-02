package defpackage;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dnc extends AsyncTask {
    private final WeakReference a;

    public dnc(dne dneVar) {
        this.a = new WeakReference(dneVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        dne dneVar = (dne) this.a.get();
        if (dneVar == null) {
            return null;
        }
        dneVar.l = dneVar.a.getSharedPreferences("ANIMATABLE_LOGO_VIEW_FILE_KEY", 0);
        dneVar.m = Long.valueOf(dneVar.l.getLong("LAST_ANIMATION_TIME_KEY", -1L));
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        dne dneVar = (dne) this.a.get();
        if (dneVar != null) {
            dneVar.c();
        }
    }
}
