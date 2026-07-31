package V0;

import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;

/* loaded from: classes.dex */
public class d extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9471a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f9472b = false;

    public static void b() {
        if (e()) {
            f.e(f9471a, "checkUpgradeBks, execute check task");
            new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, b.a());
        }
    }

    private static boolean e() {
        if (f9472b) {
            return false;
        }
        Context a4 = b.a();
        if (a4 == null) {
            f.f(f9471a, "checkUpgradeBks, context is null");
            return false;
        }
        f9472b = true;
        long a5 = h.a("lastCheckTime", 0L, a4);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - a5 > 432000000) {
            h.d("lastCheckTime", currentTimeMillis, a4);
            return true;
        }
        f.e(f9471a, "checkUpgradeBks, ignore");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Context... contextArr) {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = a.n(contextArr[0]);
        } catch (Exception e4) {
            f.d(f9471a, "doInBackground: exception : " + e4.getMessage());
            inputStream = null;
        }
        f.b(f9471a, "doInBackground: get bks from hms tss cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        if (inputStream == null) {
            return Boolean.FALSE;
        }
        e.b(inputStream);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            f.e(f9471a, "onPostExecute: upate done");
        } else {
            f.d(f9471a, "onPostExecute: upate failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        f.e(f9471a, "onProgressUpdate");
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        f.b(f9471a, "onPreExecute");
    }
}
