package com.baidu.platform.comapi.h;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.baidumap.DownloadListener;
import com.baidu.ar.baidumap.EglCoreDownloader;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private Context f9033b;

    /* renamed from: c, reason: collision with root package name */
    private EglCoreDownloader f9034c;

    /* renamed from: e, reason: collision with root package name */
    private d f9036e;

    /* renamed from: a, reason: collision with root package name */
    private boolean f9032a = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9035d = false;

    /* renamed from: f, reason: collision with root package name */
    private Handler f9037f = new a(Looper.getMainLooper());

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 0) {
                b.this.f9032a = true;
                return;
            }
            if (i8 == 1) {
                Boolean bool = (Boolean) message.obj;
                b.this.f9032a = false;
                if (b.this.f9036e == null || !bool.booleanValue()) {
                    return;
                }
                b.this.f9036e.onDownLoadFinish();
                return;
            }
            if (i8 != 2) {
                if (i8 != 3 || b.this.f9036e == null) {
                    return;
                }
                b.this.f9036e.onDownLoadProcess(((Integer) message.obj).intValue());
                return;
            }
            b.this.f9032a = false;
            if (b.this.f9036e != null) {
                b.this.f9036e.onDownLoadError();
            }
        }
    }

    /* renamed from: com.baidu.platform.comapi.h.b$b, reason: collision with other inner class name */
    class C0105b implements DownloadListener {
        C0105b() {
        }

        @Override // com.baidu.ar.baidumap.DownloadListener
        public void onDownloadComplete(boolean z7) {
            if (b.this.f9037f == null || b.this.f9033b == null) {
                return;
            }
            Message message = new Message();
            message.what = 1;
            message.obj = new Boolean(z7);
            b.this.f9037f.sendMessage(message);
        }

        @Override // com.baidu.ar.baidumap.DownloadListener
        public void onDownloadError(int i8, String str) {
            if (b.this.f9037f == null || b.this.f9033b == null) {
                return;
            }
            Message message = new Message();
            message.what = 2;
            message.obj = str;
            b.this.f9037f.sendMessage(message);
        }

        @Override // com.baidu.ar.baidumap.DownloadListener
        public void onDownloadProcess(int i8) {
            if (b.this.f9037f != null) {
                Message message = new Message();
                message.what = 3;
                message.obj = Integer.valueOf(i8);
                b.this.f9037f.sendMessage(message);
            }
        }

        @Override // com.baidu.ar.baidumap.DownloadListener
        public void onDownloadStart(boolean z7) {
            if (b.this.f9037f != null) {
                Message message = new Message();
                message.what = 0;
                b.this.f9037f.sendMessage(message);
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        static final b f9040a = new b();
    }

    public interface d {
        void onDownLoadError();

        void onDownLoadFinish();

        void onDownLoadProcess(int i8);
    }

    public void b() {
        Handler handler = this.f9037f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        EglCoreDownloader eglCoreDownloader = this.f9034c;
        if (eglCoreDownloader != null) {
            eglCoreDownloader.release();
            this.f9034c = null;
        }
    }

    public static b a() {
        return c.f9040a;
    }

    public void a(Context context, d dVar) {
        this.f9036e = dVar;
        this.f9033b = context;
        if (context == null || this.f9032a) {
            return;
        }
        if (this.f9034c == null) {
            this.f9034c = EglCoreDownloader.getInstance(context);
        }
        this.f9034c.download(new C0105b());
    }
}
