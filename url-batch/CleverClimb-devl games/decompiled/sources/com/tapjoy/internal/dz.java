package com.tapjoy.internal;

import android.os.AsyncTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class dz extends AsyncTask {

    /* renamed from: d, reason: collision with root package name */
    a f7976d;
    protected final b e;

    public interface a {
        void a();
    }

    public interface b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public dz(b bVar) {
        this.e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        if (this.f7976d != null) {
            this.f7976d.a();
        }
    }
}
