package m1;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import j.C0532f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n1.C0720b;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f6944j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile i f6945k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f6946a;

    /* renamed from: b, reason: collision with root package name */
    public final C0532f f6947b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f6948c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f6949d;

    /* renamed from: e, reason: collision with root package name */
    public final C0648f f6950e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0650h f6951f;

    /* renamed from: g, reason: collision with root package name */
    public final A1.i f6952g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6953h;

    /* renamed from: i, reason: collision with root package name */
    public final C0646d f6954i;

    public i(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6946a = reentrantReadWriteLock;
        this.f6948c = 3;
        InterfaceC0650h interfaceC0650h = sVar.f6976a;
        this.f6951f = interfaceC0650h;
        int i3 = sVar.f6977b;
        this.f6953h = i3;
        this.f6954i = sVar.f6978c;
        this.f6949d = new Handler(Looper.getMainLooper());
        this.f6947b = new C0532f();
        this.f6952g = new A1.i(28, false);
        C0648f c0648f = new C0648f(this);
        this.f6950e = c0648f;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.f6948c = 0;
            } catch (Throwable th) {
                this.f6946a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC0650h.b(new C0647e(c0648f));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static i a() {
        i iVar;
        synchronized (f6944j) {
            try {
                iVar = f6945k;
                if (!(iVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return iVar;
    }

    public static boolean c() {
        return f6945k != null;
    }

    public final int b() {
        this.f6946a.readLock().lock();
        try {
            return this.f6948c;
        } finally {
            this.f6946a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f6953h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f6946a.writeLock().lock();
        try {
            if (this.f6948c == 0) {
                return;
            }
            this.f6948c = 0;
            this.f6946a.writeLock().unlock();
            C0648f c0648f = this.f6950e;
            i iVar = c0648f.f6939a;
            try {
                iVar.f6951f.b(new C0647e(c0648f));
            } catch (Throwable th) {
                iVar.e(th);
            }
        } finally {
            this.f6946a.writeLock().unlock();
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f6946a.writeLock().lock();
        try {
            this.f6948c = 2;
            arrayList.addAll(this.f6947b);
            this.f6947b.clear();
            this.f6946a.writeLock().unlock();
            this.f6949d.post(new RunnableC0649g(arrayList, this.f6948c, th));
        } catch (Throwable th2) {
            this.f6946a.writeLock().unlock();
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
        C0648f c0648f = this.f6950e;
        c0648f.getClass();
        Bundle bundle = editorInfo.extras;
        C0720b c0720b = (C0720b) c0648f.f6941c.f2093e;
        int a3 = c0720b.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a3 != 0 ? ((ByteBuffer) c0720b.f4353g).getInt(a3 + c0720b.f4350d) : 0);
        Bundle bundle2 = editorInfo.extras;
        c0648f.f6939a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
