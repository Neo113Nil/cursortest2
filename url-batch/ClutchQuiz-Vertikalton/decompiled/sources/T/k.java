package T;

import K.C0012m;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f815j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile k f816k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f817a;

    /* renamed from: b, reason: collision with root package name */
    public final o.c f818b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f819c;
    public final Handler d;

    /* renamed from: e, reason: collision with root package name */
    public final g f820e;

    /* renamed from: f, reason: collision with root package name */
    public final j f821f;

    /* renamed from: g, reason: collision with root package name */
    public final O0.e f822g;
    public final int h;
    public final e i;

    public k(u uVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f817a = reentrantReadWriteLock;
        this.f819c = 3;
        j jVar = (j) uVar.f813b;
        this.f821f = jVar;
        int i = uVar.f812a;
        this.h = i;
        this.i = (e) uVar.f814c;
        this.d = new Handler(Looper.getMainLooper());
        this.f818b = new o.c();
        this.f822g = new O0.e(8);
        g gVar = new g(this);
        this.f820e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f819c = 0;
            } catch (Throwable th) {
                this.f817a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                jVar.i(new f(gVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static k a() {
        k kVar;
        synchronized (f815j) {
            try {
                kVar = f816k;
                if (!(kVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return kVar;
    }

    public final int b() {
        this.f817a.readLock().lock();
        try {
            return this.f819c;
        } finally {
            this.f817a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f817a.writeLock().lock();
        try {
            if (this.f819c == 0) {
                return;
            }
            this.f819c = 0;
            this.f817a.writeLock().unlock();
            g gVar = this.f820e;
            k kVar = gVar.f809a;
            try {
                kVar.f821f.i(new f(gVar));
            } catch (Throwable th) {
                kVar.d(th);
            }
        } finally {
            this.f817a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f817a.writeLock().lock();
        try {
            this.f819c = 2;
            arrayList.addAll(this.f818b);
            this.f818b.clear();
            this.f817a.writeLock().unlock();
            this.d.post(new H.b(arrayList, this.f819c, th));
        } catch (Throwable th2) {
            this.f817a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:67:0x0059, B:70:0x005e, B:72:0x0062, B:74:0x006f, B:29:0x008b, B:31:0x0095, B:33:0x0098, B:35:0x009b, B:37:0x00ab, B:39:0x00ae, B:44:0x00bd, B:47:0x00c4, B:49:0x00db, B:27:0x0081), top: B:66:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:67:0x0059, B:70:0x005e, B:72:0x0062, B:74:0x006f, B:29:0x008b, B:31:0x0095, B:33:0x0098, B:35:0x009b, B:37:0x00ab, B:39:0x00ae, B:44:0x00bd, B:47:0x00c4, B:49:0x00db, B:27:0x0081), top: B:66:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4;
        C c2;
        A[] aArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        A.c.i(i <= i2, "start should be <= than end");
        C c3 = null;
        if (charSequence == null) {
            return null;
        }
        A.c.i(i <= charSequence.length(), "start should be < than charSequence length");
        A.c.i(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C0012m c0012m = this.f820e.f810b;
        c0012m.getClass();
        boolean z2 = charSequence instanceof y;
        if (z2) {
            ((y) charSequence).a();
        }
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, A.class) <= i2) {
                        c3 = new C();
                        c3.f803a = false;
                        c3.f804b = new SpannableString(charSequence);
                    }
                    if (c3 != null && (aArr = (A[]) c3.f804b.getSpans(i, i2, A.class)) != null && aArr.length > 0) {
                        for (A a2 : aArr) {
                            int spanStart = c3.f804b.getSpanStart(a2);
                            int spanEnd = c3.f804b.getSpanEnd(a2);
                            if (spanStart != i2) {
                                c3.removeSpan(a2);
                            }
                            i = Math.min(spanStart, i);
                            i2 = Math.max(spanEnd, i2);
                        }
                    }
                    i3 = i;
                    i4 = i2;
                    if (i3 != i4 && i3 < charSequence.length()) {
                        c2 = (C) c0012m.s(charSequence, i3, i4, Integer.MAX_VALUE, false, new B.j(c3, 4, (O0.e) c0012m.f422b));
                        if (c2 != null) {
                            if (!z2) {
                                return charSequence;
                            }
                            return charSequence;
                        }
                        Spannable spannable = c2.f804b;
                        if (z2) {
                            ((y) charSequence).b();
                        }
                        return spannable;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((y) charSequence).b();
                }
            }
        }
        c3 = new C((Spannable) charSequence);
        if (c3 != null) {
            while (r1 < r5) {
            }
        }
        i3 = i;
        i4 = i2;
        if (i3 != i4) {
            c2 = (C) c0012m.s(charSequence, i3, i4, Integer.MAX_VALUE, false, new B.j(c3, 4, (O0.e) c0012m.f422b));
            if (c2 != null) {
            }
        }
        return charSequence;
    }

    public final void f(i iVar) {
        A.c.k(iVar, "initCallback cannot be null");
        this.f817a.writeLock().lock();
        try {
            if (this.f819c != 1 && this.f819c != 2) {
                this.f818b.add(iVar);
                this.f817a.writeLock().unlock();
            }
            this.d.post(new H.b(Arrays.asList(iVar), this.f819c, (Throwable) null));
            this.f817a.writeLock().unlock();
        } catch (Throwable th) {
            this.f817a.writeLock().unlock();
            throw th;
        }
    }
}
