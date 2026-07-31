package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.f;
import androidx.emoji2.text.k;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import z.g;

/* loaded from: classes.dex */
public class k extends f.c {

    /* renamed from: k, reason: collision with root package name */
    private static final a f12189k = new a();

    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return z.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, z.e eVar) {
            return z.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f12190a;

        /* renamed from: b, reason: collision with root package name */
        private final z.e f12191b;

        /* renamed from: c, reason: collision with root package name */
        private final a f12192c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f12193d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Handler f12194e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f12195f;

        /* renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f12196g;

        /* renamed from: h, reason: collision with root package name */
        f.i f12197h;

        /* renamed from: i, reason: collision with root package name */
        private ContentObserver f12198i;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f12199j;

        b(Context context, z.e eVar, a aVar) {
            A.h.g(context, "Context cannot be null");
            A.h.g(eVar, "FontRequest cannot be null");
            this.f12190a = context.getApplicationContext();
            this.f12191b = eVar;
            this.f12192c = aVar;
        }

        private void b() {
            synchronized (this.f12193d) {
                try {
                    this.f12197h = null;
                    ContentObserver contentObserver = this.f12198i;
                    if (contentObserver != null) {
                        this.f12192c.c(this.f12190a, contentObserver);
                        this.f12198i = null;
                    }
                    Handler handler = this.f12194e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f12199j);
                    }
                    this.f12194e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f12196g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f12195f = null;
                    this.f12196g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private g.b e() {
            try {
                g.a b4 = this.f12192c.b(this.f12190a, this.f12191b);
                if (b4.c() == 0) {
                    g.b[] b5 = b4.b();
                    if (b5 == null || b5.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return b5[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b4.c() + ")");
            } catch (PackageManager.NameNotFoundException e4) {
                throw new RuntimeException("provider not found", e4);
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(f.i iVar) {
            A.h.g(iVar, "LoaderCallback cannot be null");
            synchronized (this.f12193d) {
                this.f12197h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f12193d) {
                try {
                    if (this.f12197h == null) {
                        return;
                    }
                    try {
                        g.b e4 = e();
                        int b4 = e4.b();
                        if (b4 == 2) {
                            synchronized (this.f12193d) {
                            }
                        }
                        if (b4 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b4 + ")");
                        }
                        try {
                            androidx.core.os.n.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a4 = this.f12192c.a(this.f12190a, e4);
                            ByteBuffer f4 = androidx.core.graphics.j.f(this.f12190a, null, e4.d());
                            if (f4 == null || a4 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            n b5 = n.b(a4, f4);
                            androidx.core.os.n.b();
                            synchronized (this.f12193d) {
                                try {
                                    f.i iVar = this.f12197h;
                                    if (iVar != null) {
                                        iVar.b(b5);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            androidx.core.os.n.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f12193d) {
                            try {
                                f.i iVar2 = this.f12197h;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f12193d) {
                try {
                    if (this.f12197h == null) {
                        return;
                    }
                    if (this.f12195f == null) {
                        ThreadPoolExecutor b4 = c.b("emojiCompat");
                        this.f12196g = b4;
                        this.f12195f = b4;
                    }
                    this.f12195f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            k.b.this.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f12193d) {
                this.f12195f = executor;
            }
        }
    }

    public k(Context context, z.e eVar) {
        super(new b(context, eVar, f12189k));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
