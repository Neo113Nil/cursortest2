package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class f {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f12131o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final Object f12132p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static volatile f f12133q;

    /* renamed from: b, reason: collision with root package name */
    private final Set f12135b;

    /* renamed from: e, reason: collision with root package name */
    private final b f12138e;

    /* renamed from: f, reason: collision with root package name */
    final h f12139f;

    /* renamed from: g, reason: collision with root package name */
    private final j f12140g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f12141h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f12142i;

    /* renamed from: j, reason: collision with root package name */
    final int[] f12143j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f12144k;

    /* renamed from: l, reason: collision with root package name */
    private final int f12145l;

    /* renamed from: m, reason: collision with root package name */
    private final int f12146m;

    /* renamed from: n, reason: collision with root package name */
    private final e f12147n;

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f12134a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f12136c = 3;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f12137d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.i f12148b;

        /* renamed from: c, reason: collision with root package name */
        private volatile n f12149c;

        /* renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        class C0104a extends i {
            C0104a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                a.this.f12151a.n(th);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                a.this.d(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.b
        void a() {
            try {
                this.f12151a.f12139f.a(new C0104a());
            } catch (Throwable th) {
                this.f12151a.n(th);
            }
        }

        @Override // androidx.emoji2.text.f.b
        CharSequence b(CharSequence charSequence, int i4, int i5, int i6, boolean z4) {
            return this.f12148b.h(charSequence, i4, i5, i6, z4);
        }

        @Override // androidx.emoji2.text.f.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f12149c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f12151a.f12141h);
        }

        void d(n nVar) {
            if (nVar == null) {
                this.f12151a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f12149c = nVar;
            n nVar2 = this.f12149c;
            j jVar = this.f12151a.f12140g;
            e eVar = this.f12151a.f12147n;
            f fVar = this.f12151a;
            this.f12148b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f12142i, fVar.f12143j, androidx.emoji2.text.h.a());
            this.f12151a.o();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final f f12151a;

        b(f fVar) {
            this.f12151a = fVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i4, int i5, int i6, boolean z4);

        abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final h f12152a;

        /* renamed from: b, reason: collision with root package name */
        j f12153b;

        /* renamed from: c, reason: collision with root package name */
        boolean f12154c;

        /* renamed from: d, reason: collision with root package name */
        boolean f12155d;

        /* renamed from: e, reason: collision with root package name */
        int[] f12156e;

        /* renamed from: f, reason: collision with root package name */
        Set f12157f;

        /* renamed from: g, reason: collision with root package name */
        boolean f12158g;

        /* renamed from: h, reason: collision with root package name */
        int f12159h = -16711936;

        /* renamed from: i, reason: collision with root package name */
        int f12160i = 0;

        /* renamed from: j, reason: collision with root package name */
        e f12161j = new androidx.emoji2.text.e();

        protected c(h hVar) {
            A.h.g(hVar, "metadataLoader cannot be null.");
            this.f12152a = hVar;
        }

        protected final h a() {
            return this.f12152a;
        }

        public c b(int i4) {
            this.f12160i = i4;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.f.j
        public androidx.emoji2.text.j a(p pVar) {
            return new q(pVar);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i4, int i5, int i6);
    }

    /* renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0105f {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final List f12162b;

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f12163c;

        /* renamed from: d, reason: collision with root package name */
        private final int f12164d;

        g(AbstractC0105f abstractC0105f, int i4) {
            this(Arrays.asList((AbstractC0105f) A.h.g(abstractC0105f, "initCallback cannot be null")), i4, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f12162b.size();
            int i4 = 0;
            if (this.f12164d != 1) {
                while (i4 < size) {
                    ((AbstractC0105f) this.f12162b.get(i4)).a(this.f12163c);
                    i4++;
                }
            } else {
                while (i4 < size) {
                    ((AbstractC0105f) this.f12162b.get(i4)).b();
                    i4++;
                }
            }
        }

        g(Collection collection, int i4) {
            this(collection, i4, null);
        }

        g(Collection collection, int i4, Throwable th) {
            A.h.g(collection, "initCallbacks cannot be null");
            this.f12162b = new ArrayList(collection);
            this.f12164d = i4;
            this.f12163c = th;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    public interface j {
        androidx.emoji2.text.j a(p pVar);
    }

    private f(c cVar) {
        this.f12141h = cVar.f12154c;
        this.f12142i = cVar.f12155d;
        this.f12143j = cVar.f12156e;
        this.f12144k = cVar.f12158g;
        this.f12145l = cVar.f12159h;
        this.f12139f = cVar.f12152a;
        this.f12146m = cVar.f12160i;
        this.f12147n = cVar.f12161j;
        androidx.collection.b bVar = new androidx.collection.b();
        this.f12135b = bVar;
        j jVar = cVar.f12153b;
        this.f12140g = jVar == null ? new d() : jVar;
        Set set = cVar.f12157f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f12157f);
        }
        this.f12138e = new a(this);
        m();
    }

    public static f c() {
        f fVar;
        synchronized (f12131o) {
            fVar = f12133q;
            A.h.h(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i4, int i5, boolean z4) {
        return androidx.emoji2.text.i.b(inputConnection, editable, i4, i5, z4);
    }

    public static boolean g(Editable editable, int i4, KeyEvent keyEvent) {
        return androidx.emoji2.text.i.c(editable, i4, keyEvent);
    }

    public static f h(c cVar) {
        f fVar;
        f fVar2 = f12133q;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (f12131o) {
            try {
                fVar = f12133q;
                if (fVar == null) {
                    fVar = new f(cVar);
                    f12133q = fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static boolean i() {
        return f12133q != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.f12134a.writeLock().lock();
        try {
            if (this.f12146m == 0) {
                this.f12136c = 0;
            }
            this.f12134a.writeLock().unlock();
            if (e() == 0) {
                this.f12138e.a();
            }
        } catch (Throwable th) {
            this.f12134a.writeLock().unlock();
            throw th;
        }
    }

    public int d() {
        return this.f12145l;
    }

    public int e() {
        this.f12134a.readLock().lock();
        try {
            return this.f12136c;
        } finally {
            this.f12134a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f12144k;
    }

    public void l() {
        A.h.h(this.f12146m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f12134a.writeLock().lock();
        try {
            if (this.f12136c == 0) {
                return;
            }
            this.f12136c = 0;
            this.f12134a.writeLock().unlock();
            this.f12138e.a();
        } finally {
            this.f12134a.writeLock().unlock();
        }
    }

    void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f12134a.writeLock().lock();
        try {
            this.f12136c = 2;
            arrayList.addAll(this.f12135b);
            this.f12135b.clear();
            this.f12134a.writeLock().unlock();
            this.f12137d.post(new g(arrayList, this.f12136c, th));
        } catch (Throwable th2) {
            this.f12134a.writeLock().unlock();
            throw th2;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f12134a.writeLock().lock();
        try {
            this.f12136c = 1;
            arrayList.addAll(this.f12135b);
            this.f12135b.clear();
            this.f12134a.writeLock().unlock();
            this.f12137d.post(new g(arrayList, this.f12136c));
        } catch (Throwable th) {
            this.f12134a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i4, int i5) {
        return r(charSequence, i4, i5, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int i4, int i5, int i6) {
        return s(charSequence, i4, i5, i6, 0);
    }

    public CharSequence s(CharSequence charSequence, int i4, int i5, int i6, int i7) {
        boolean z4;
        A.h.h(k(), "Not initialized yet");
        A.h.d(i4, "start cannot be negative");
        A.h.d(i5, "end cannot be negative");
        A.h.d(i6, "maxEmojiCount cannot be negative");
        A.h.a(i4 <= i5, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        A.h.a(i4 <= charSequence.length(), "start should be < than charSequence length");
        A.h.a(i5 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i4 == i5) {
            return charSequence;
        }
        if (i7 != 1) {
            z4 = i7 != 2 ? this.f12141h : false;
        } else {
            z4 = true;
        }
        return this.f12138e.b(charSequence, i4, i5, i6, z4);
    }

    public void t(AbstractC0105f abstractC0105f) {
        A.h.g(abstractC0105f, "initCallback cannot be null");
        this.f12134a.writeLock().lock();
        try {
            if (this.f12136c != 1 && this.f12136c != 2) {
                this.f12135b.add(abstractC0105f);
                this.f12134a.writeLock().unlock();
            }
            this.f12137d.post(new g(abstractC0105f, this.f12136c));
            this.f12134a.writeLock().unlock();
        } catch (Throwable th) {
            this.f12134a.writeLock().unlock();
            throw th;
        }
    }

    public void u(AbstractC0105f abstractC0105f) {
        A.h.g(abstractC0105f, "initCallback cannot be null");
        this.f12134a.writeLock().lock();
        try {
            this.f12135b.remove(abstractC0105f);
        } finally {
            this.f12134a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f12138e.c(editorInfo);
    }
}
