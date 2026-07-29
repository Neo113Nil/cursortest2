package com.facebook.ads.internal.p.a;

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class h extends AsyncTask<l, Void, n> implements c {

    /* renamed from: a, reason: collision with root package name */
    private static Executor f5292a = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* renamed from: b, reason: collision with root package name */
    private a f5293b;

    /* renamed from: c, reason: collision with root package name */
    private b f5294c;

    /* renamed from: d, reason: collision with root package name */
    private Exception f5295d;

    public h(a aVar, b bVar) {
        this.f5293b = aVar;
        this.f5294c = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n doInBackground(l... lVarArr) {
        if (lVarArr != null) {
            try {
                if (lVarArr.length > 0) {
                    return this.f5293b.a(lVarArr[0]);
                }
            } catch (Exception e) {
                this.f5295d = e;
                cancel(true);
                return null;
            }
        }
        throw new IllegalArgumentException("DoHttpRequestTask takes exactly one argument of type HttpRequest");
    }

    @Override // com.facebook.ads.internal.p.a.c
    public void a(l lVar) {
        super.executeOnExecutor(f5292a, lVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(n nVar) {
        this.f5294c.a(nVar);
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        this.f5294c.a(this.f5295d);
    }
}
