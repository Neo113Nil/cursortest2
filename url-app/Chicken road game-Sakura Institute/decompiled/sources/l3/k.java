package l3;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f5906j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile k f5907k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f5908a;

    /* renamed from: b, reason: collision with root package name */
    public final i.f f5909b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5910c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f5911d;

    /* renamed from: e, reason: collision with root package name */
    public final f f5912e;

    /* renamed from: f, reason: collision with root package name */
    public final j f5913f;

    /* renamed from: g, reason: collision with root package name */
    public final m4.f f5914g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5915h;

    /* renamed from: i, reason: collision with root package name */
    public final d f5916i;

    public k(t tVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5908a = reentrantReadWriteLock;
        this.f5910c = 3;
        j jVar = (j) tVar.f5901b;
        this.f5913f = jVar;
        int i7 = tVar.f5900a;
        this.f5915h = i7;
        this.f5916i = (d) tVar.f5902c;
        this.f5911d = new Handler(Looper.getMainLooper());
        this.f5909b = new i.f(0);
        this.f5914g = new m4.f();
        f fVar = new f(this);
        this.f5912e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f5910c = 0;
            } catch (Throwable th) {
                this.f5908a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                jVar.a(new e(fVar));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static k a() {
        k kVar;
        synchronized (f5906j) {
            try {
                kVar = f5907k;
                if (!(kVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return kVar;
    }

    public static boolean c() {
        return f5907k != null;
    }

    public final int b() {
        this.f5908a.readLock().lock();
        try {
            return this.f5910c;
        } finally {
            this.f5908a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f5915h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f5908a.writeLock().lock();
        try {
            if (this.f5910c == 0) {
                return;
            }
            this.f5910c = 0;
            this.f5908a.writeLock().unlock();
            f fVar = this.f5912e;
            k kVar = fVar.f5897a;
            try {
                kVar.f5913f.a(new e(fVar));
            } catch (Throwable th) {
                kVar.e(th);
            }
        } finally {
            this.f5908a.writeLock().unlock();
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f5908a.writeLock().lock();
        try {
            this.f5910c = 2;
            arrayList.addAll(this.f5909b);
            this.f5909b.clear();
            this.f5908a.writeLock().unlock();
            this.f5911d.post(new i(arrayList, this.f5910c, th));
        } catch (Throwable th2) {
            this.f5908a.writeLock().unlock();
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
        f fVar = this.f5912e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        m3.b bVar = (m3.b) fVar.f5899c.f4160g;
        int a3 = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a3 != 0 ? ((ByteBuffer) bVar.f3416i).getInt(a3 + bVar.f3413f) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
