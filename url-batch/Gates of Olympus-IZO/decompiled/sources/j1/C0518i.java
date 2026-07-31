package j1;

import android.os.Handler;
import android.os.Looper;
import j.C0488f;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: j1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518i {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f5254j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile C0518i f5255k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f5256a;

    /* renamed from: b, reason: collision with root package name */
    public final C0488f f5257b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5258c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f5259d;

    /* renamed from: e, reason: collision with root package name */
    public final C0515f f5260e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0517h f5261f;

    /* renamed from: g, reason: collision with root package name */
    public final F0.a f5262g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5263h;

    /* renamed from: i, reason: collision with root package name */
    public final C0513d f5264i;

    public C0518i(r rVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5256a = reentrantReadWriteLock;
        this.f5258c = 3;
        InterfaceC0517h interfaceC0517h = rVar.f5283a;
        this.f5261f = interfaceC0517h;
        int i3 = rVar.f5284b;
        this.f5263h = i3;
        this.f5264i = rVar.f5285c;
        this.f5259d = new Handler(Looper.getMainLooper());
        this.f5257b = new C0488f();
        this.f5262g = new F0.a(27);
        C0515f c0515f = new C0515f(this);
        this.f5260e = c0515f;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.f5258c = 0;
            } catch (Throwable th) {
                this.f5256a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC0517h.f(new C0514e(c0515f));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static C0518i a() {
        C0518i c0518i;
        synchronized (f5254j) {
            try {
                c0518i = f5255k;
                if (!(c0518i != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0518i;
    }

    public final int b() {
        this.f5256a.readLock().lock();
        try {
            return this.f5258c;
        } finally {
            this.f5256a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f5263h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f5256a.writeLock().lock();
        try {
            if (this.f5258c == 0) {
                return;
            }
            this.f5258c = 0;
            this.f5256a.writeLock().unlock();
            C0515f c0515f = this.f5260e;
            C0518i c0518i = c0515f.f5249a;
            try {
                c0518i.f5261f.f(new C0514e(c0515f));
            } catch (Throwable th) {
                c0518i.d(th);
            }
        } finally {
            this.f5256a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f5256a.writeLock().lock();
        try {
            this.f5258c = 2;
            arrayList.addAll(this.f5257b);
            this.f5257b.clear();
            this.f5256a.writeLock().unlock();
            this.f5259d.post(new RunnableC0516g(arrayList, this.f5258c, th));
        } catch (Throwable th2) {
            this.f5256a.writeLock().unlock();
            throw th2;
        }
    }
}
