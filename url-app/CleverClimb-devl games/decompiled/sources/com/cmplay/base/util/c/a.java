package com.cmplay.base.util.c;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.cmplay.base.util.h;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: AsyncImageLoader.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static HashSet<String> f3969b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, SoftReference<Bitmap>> f3970c;

    /* renamed from: d, reason: collision with root package name */
    private static e f3971d;
    private static ExecutorService e;
    private static a g;

    /* renamed from: a, reason: collision with root package name */
    public Context f3972a;
    private Handler f;

    /* compiled from: AsyncImageLoader.java */
    /* renamed from: com.cmplay.base.util.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0324a {
        void a(Bitmap bitmap, String str);
    }

    public static a a(Context context) {
        if (g == null) {
            synchronized (a.class) {
                if (g == null) {
                    g = new a(context);
                }
            }
        }
        return g;
    }

    private a(Context context) {
        this.f3972a = context.getApplicationContext();
        f3969b = new HashSet<>();
        f3970c = new HashMap();
        f3971d = new e(f3970c);
        this.f = new Handler(Looper.getMainLooper());
        a();
        b(context);
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            a(cacheDir.getAbsolutePath());
        }
    }

    public void b(Context context) {
        f3971d.a(context);
    }

    public void a(boolean z) {
        f3971d.a(z);
    }

    public void a(String str) {
        f3971d.a(str);
    }

    public static void a() {
        if (e == null || e.isShutdown() || e.isTerminated()) {
            e = Executors.newFixedThreadPool(5);
        }
    }

    public void a(final String str, final boolean z, final InterfaceC0324a interfaceC0324a) {
        try {
            Bitmap a2 = f3971d.a(this.f3972a, str);
            h.a("AsyncImageLoader", "取出bitmap=" + a2);
            if (a2 != null) {
                if (interfaceC0324a != null) {
                    interfaceC0324a.a(a2, str);
                }
            } else {
                if (f3969b.contains(str)) {
                    h.a("###该图片正在下载，不能重复下载！");
                    return;
                }
                f3969b.add(str);
                if (TextUtils.equals(Build.VERSION.RELEASE, "4.0.3") && this.f3972a != null && ((ActivityManager) this.f3972a.getSystemService("activity")).getMemoryClass() - ((int) ((Runtime.getRuntime().totalMemory() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) < 10) {
                    f3969b.remove(str);
                } else {
                    e.submit(new Runnable() { // from class: com.cmplay.base.util.c.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            final Bitmap a3 = a.f3971d.a(a.this.f3972a, str, z);
                            a.this.f.post(new Runnable() { // from class: com.cmplay.base.util.c.a.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (interfaceC0324a != null) {
                                        synchronized (interfaceC0324a) {
                                            interfaceC0324a.a(a3, str);
                                        }
                                    }
                                    a.f3969b.remove(str);
                                }
                            });
                        }
                    });
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
