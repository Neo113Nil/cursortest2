package P2;

import B1.j;
import android.os.AsyncTask;
import l2.e;

/* loaded from: classes.dex */
public abstract class a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public j f2087a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2088b;

    public a(e eVar) {
        this.f2088b = eVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        j jVar = this.f2087a;
        if (jVar != null) {
            jVar.f203d = null;
            jVar.g();
        }
    }
}
