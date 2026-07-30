package com.baidu.platform.base;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.platform.base.e;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    private Thread f8672b;

    /* renamed from: f, reason: collision with root package name */
    private SearchType f8676f;

    /* renamed from: a, reason: collision with root package name */
    private e f8671a = new e();

    /* renamed from: c, reason: collision with root package name */
    private Handler f8673c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    protected final Lock f8674d = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    private boolean f8675e = true;

    /* renamed from: com.baidu.platform.base.a$a, reason: collision with other inner class name */
    class RunnableC0093a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f8677a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchResult f8678b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f8679c;

        RunnableC0093a(f fVar, SearchResult searchResult, Object obj) {
            this.f8677a = fVar;
            this.f8678b = searchResult;
            this.f8679c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8677a != null) {
                a.this.f8674d.lock();
                try {
                    this.f8677a.a(this.f8678b, this.f8679c);
                } finally {
                    a.this.f8674d.unlock();
                }
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8681a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8682b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8683c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f8684d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f8685e;

        /* renamed from: com.baidu.platform.base.a$b$a, reason: collision with other inner class name */
        class C0094a implements e.d {
            C0094a() {
            }

            @Override // com.baidu.platform.base.e.d
            public void a(File file) {
                String str = "{\"status\":0,\"path\":\"" + file.getAbsolutePath() + "\"}";
                b bVar = b.this;
                a.this.a(str, bVar.f8684d, bVar.f8685e);
            }

            @Override // com.baidu.platform.base.e.d
            public void onFailed() {
                Log.d("BaseDownload", "startNetworkOperation: onFailed");
                HttpClient.HttpStateError httpStateError = HttpClient.HttpStateError.INNER_ERROR;
                b bVar = b.this;
                a.this.a(httpStateError, bVar.f8684d, bVar.f8685e);
            }
        }

        b(String str, String str2, String str3, f fVar, Object obj) {
            this.f8681a = str;
            this.f8682b = str2;
            this.f8683c = str3;
            this.f8684d = fVar;
            this.f8685e = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d("BaseDownload", "startNetworkOperation: run");
            a.this.f8671a.a(this.f8681a, this.f8682b, this.f8683c, 1, new C0094a());
        }
    }

    protected boolean a(g gVar, String str, String str2, Object obj, f fVar) {
        if (fVar == null) {
            Log.e(com.baidu.platform.base.b.class.getSimpleName(), "The SearchParser is null, must be applied.");
            return false;
        }
        SearchType a8 = fVar.a();
        this.f8676f = a8;
        String b8 = gVar.b(a8);
        if (b8 == null) {
            Log.e("BaseDownload", "The sendurl is: null");
            a(fVar.a("{SDK_InnerError:{PermissionCheckError:Error}}"), obj, fVar);
            return false;
        }
        SearchType searchType = this.f8676f;
        String str3 = "";
        if (searchType == SearchType.SVG_TILE_SEARCH) {
            str3 = ".bin";
        } else if (searchType == SearchType.SVG_TILE_BATCH_SEARCH) {
            str3 = ".zip";
        }
        Log.d("SVG下载", " 下载请求:" + b8);
        a(b8, str, str2 + str3, obj, fVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, f fVar, Object obj) {
        a(fVar.a(str), obj, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HttpClient.HttpStateError httpStateError, f fVar, Object obj) {
        a(fVar.a("{SDK_InnerError:{httpStateError:" + httpStateError + "}}"), obj, fVar);
    }

    private void a(SearchResult searchResult, Object obj, f fVar) {
        this.f8673c.post(new RunnableC0093a(fVar, searchResult, obj));
    }

    private synchronized void a(String str, String str2, String str3, Object obj, f fVar) {
        Thread thread = this.f8672b;
        if (thread != null && thread.isAlive()) {
            System.out.println("Network operation is already running.");
            Log.d("BaseDownload", "startNetworkOperation: Network operation is already running.");
        } else {
            Thread thread2 = new Thread(new b(str, str2, str3, fVar, obj), "DownloadSVGTileThread");
            this.f8672b = thread2;
            thread2.start();
        }
    }
}
