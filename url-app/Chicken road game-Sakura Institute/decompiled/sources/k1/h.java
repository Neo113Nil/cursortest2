package k1;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import i.C0671f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f7379j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile h f7380k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f7381a;

    /* renamed from: b, reason: collision with root package name */
    public final C0671f f7382b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f7383c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f7384d;

    /* renamed from: e, reason: collision with root package name */
    public final f f7385e;

    /* renamed from: f, reason: collision with root package name */
    public final g f7386f;

    /* renamed from: g, reason: collision with root package name */
    public final H1.f f7387g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7388h;

    /* renamed from: i, reason: collision with root package name */
    public final d f7389i;

    public h(o oVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7381a = reentrantReadWriteLock;
        this.f7383c = 3;
        g gVar = (g) oVar.f6874b;
        this.f7386f = gVar;
        int i2 = oVar.f6873a;
        this.f7388h = i2;
        this.f7389i = (d) oVar.f6875c;
        this.f7384d = new Handler(Looper.getMainLooper());
        this.f7382b = new C0671f(0);
        this.f7387g = new H1.f(15, false);
        f fVar = new f(this);
        this.f7385e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f7383c = 0;
            } catch (Throwable th) {
                this.f7381a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new e(fVar));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static h a() {
        h hVar;
        synchronized (f7379j) {
            try {
                hVar = f7380k;
                if (!(hVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return hVar;
    }

    public static boolean c() {
        return f7380k != null;
    }

    public final int b() {
        this.f7381a.readLock().lock();
        try {
            return this.f7383c;
        } finally {
            this.f7381a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f7388h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f7381a.writeLock().lock();
        try {
            if (this.f7383c == 0) {
                return;
            }
            this.f7383c = 0;
            this.f7381a.writeLock().unlock();
            f fVar = this.f7385e;
            h hVar = fVar.f7376a;
            try {
                hVar.f7386f.a(new e(fVar));
            } catch (Throwable th) {
                hVar.e(th);
            }
        } finally {
            this.f7381a.writeLock().unlock();
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f7381a.writeLock().lock();
        try {
            this.f7383c = 2;
            arrayList.addAll(this.f7382b);
            this.f7382b.clear();
            this.f7381a.writeLock().unlock();
            this.f7384d.post(new G1.k(arrayList, this.f7383c, th));
        } catch (Throwable th2) {
            this.f7381a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(EditorInfo editorInfo) {
        if (b() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.f7385e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        l1.b bVar = (l1.b) fVar.f7378c.f4390i;
        int b4 = bVar.b(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", b4 != 0 ? ((ByteBuffer) bVar.f838j).getInt(b4 + bVar.f835d) : 0);
        Bundle bundle2 = editorInfo.extras;
        fVar.f7376a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
