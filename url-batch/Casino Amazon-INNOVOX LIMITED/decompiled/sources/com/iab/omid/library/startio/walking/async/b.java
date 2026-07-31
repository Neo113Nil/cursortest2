package com.iab.omid.library.startio.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private a f61a;
    protected final InterfaceC0018b b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.startio.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0018b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0018b interfaceC0018b) {
        this.b = interfaceC0018b;
    }

    public void a(a aVar) {
        this.f61a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f61a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
