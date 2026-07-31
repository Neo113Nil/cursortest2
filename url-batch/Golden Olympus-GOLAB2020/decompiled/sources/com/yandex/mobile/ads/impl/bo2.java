package com.yandex.mobile.ads.impl;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes3.dex */
public abstract class bo2 extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f23887a;

    /* renamed from: b, reason: collision with root package name */
    protected final b f23888b;

    public interface a {
    }

    public interface b {
    }

    public bo2(b bVar) {
        this.f23888b = bVar;
    }

    public final void a(a aVar) {
        this.f23887a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f23887a;
        if (aVar != null) {
            ((fo2) aVar).a();
        }
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
