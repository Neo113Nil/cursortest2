package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.net.HttpURLConnection;
import java.util.List;

/* compiled from: GraphRequestAsyncTask.java */
/* loaded from: classes.dex */
public class o extends AsyncTask<Void, Void, List<q>> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6321a = o.class.getCanonicalName();

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f6322b;

    /* renamed from: c, reason: collision with root package name */
    private final p f6323c;

    /* renamed from: d, reason: collision with root package name */
    private Exception f6324d;

    public o(p pVar) {
        this(null, pVar);
    }

    public o(HttpURLConnection httpURLConnection, p pVar) {
        this.f6323c = pVar;
        this.f6322b = httpURLConnection;
    }

    public String toString() {
        return "{RequestAsyncTask:  connection: " + this.f6322b + ", requests: " + this.f6323c + "}";
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        Handler handler;
        super.onPreExecute();
        if (l.b()) {
            Log.d(f6321a, String.format("execute async task: %s", this));
        }
        if (this.f6323c.c() == null) {
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.f6323c.a(handler);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(List<q> list) {
        super.onPostExecute(list);
        if (this.f6324d != null) {
            Log.d(f6321a, String.format("onPostExecute: exception encountered during request: %s", this.f6324d.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<q> doInBackground(Void... voidArr) {
        try {
            if (this.f6322b == null) {
                return this.f6323c.g();
            }
            return GraphRequest.a(this.f6322b, this.f6323c);
        } catch (Exception e) {
            this.f6324d = e;
            return null;
        }
    }
}
