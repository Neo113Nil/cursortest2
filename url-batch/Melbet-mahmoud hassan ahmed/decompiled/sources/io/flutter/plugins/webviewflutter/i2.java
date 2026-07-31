package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class i2 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Object, Long> f17670a = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<Long, WeakReference<Object>> f17671b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<Long, Object> f17672c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<Object> f17673d = new ReferenceQueue<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<WeakReference<Object>, Long> f17674e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final Handler f17675f;

    /* renamed from: g, reason: collision with root package name */
    private final a f17676g;

    /* renamed from: h, reason: collision with root package name */
    private long f17677h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17678i;

    public interface a {
        void a(long j7);
    }

    private i2(a aVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f17675f = handler;
        this.f17677h = 65536L;
        this.f17678i = false;
        this.f17676g = aVar;
        handler.postDelayed(new h2(this), 30000L);
    }

    private void c(Object obj, long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException("Identifier must be >= 0.");
        }
        WeakReference<Object> weakReference = new WeakReference<>(obj, this.f17673d);
        this.f17670a.put(obj, Long.valueOf(j7));
        this.f17671b.put(Long.valueOf(j7), weakReference);
        this.f17674e.put(weakReference, Long.valueOf(j7));
        this.f17672c.put(Long.valueOf(j7), obj);
    }

    private void d() {
        if (this.f17678i) {
            throw new AssertionError("Manager has already been closed.");
        }
    }

    public static i2 i(a aVar) {
        return new i2(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        while (true) {
            WeakReference weakReference = (WeakReference) this.f17673d.poll();
            if (weakReference == null) {
                this.f17675f.postDelayed(new h2(this), 30000L);
                return;
            }
            Long remove = this.f17674e.remove(weakReference);
            if (remove != null) {
                this.f17671b.remove(remove);
                this.f17672c.remove(remove);
                this.f17676g.a(remove.longValue());
            }
        }
    }

    public void b(Object obj, long j7) {
        d();
        c(obj, j7);
    }

    public void e() {
        this.f17675f.removeCallbacks(new h2(this));
        this.f17678i = true;
    }

    public boolean f(Object obj) {
        d();
        return this.f17670a.containsKey(obj);
    }

    public Long g(Object obj) {
        d();
        Long l7 = this.f17670a.get(obj);
        if (l7 != null) {
            this.f17672c.put(l7, obj);
        }
        return l7;
    }

    public <T> T h(long j7) {
        d();
        WeakReference<Object> weakReference = this.f17671b.get(Long.valueOf(j7));
        return weakReference != null ? (T) weakReference.get() : (T) this.f17672c.get(Long.valueOf(j7));
    }

    public <T> T k(long j7) {
        d();
        return (T) this.f17672c.remove(Long.valueOf(j7));
    }
}
