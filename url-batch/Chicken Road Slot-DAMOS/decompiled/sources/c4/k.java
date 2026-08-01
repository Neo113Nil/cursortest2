package c4;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.i0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile k f1756k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f1757a;

    /* renamed from: b, reason: collision with root package name */
    public final s.f f1758b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1759c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1760d;

    /* renamed from: e, reason: collision with root package name */
    public final g f1761e;

    /* renamed from: f, reason: collision with root package name */
    public final j f1762f;
    public final u8.d g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1763h;

    /* renamed from: i, reason: collision with root package name */
    public final e f1764i;

    public k(t tVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1757a = reentrantReadWriteLock;
        this.f1759c = 3;
        j jVar = (j) tVar.f1754b;
        this.f1762f = jVar;
        int i3 = tVar.f1753a;
        this.f1763h = i3;
        this.f1764i = (e) tVar.f1755c;
        this.f1760d = new Handler(Looper.getMainLooper());
        this.f1758b = new s.f(0);
        this.g = new u8.d(15);
        g gVar = new g(this);
        this.f1761e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.f1759c = 0;
            } catch (Throwable th) {
                this.f1757a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                jVar.b(new f(gVar));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static k a() {
        k kVar;
        synchronized (j) {
            try {
                kVar = f1756k;
                if (!(kVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return kVar;
    }

    public static boolean c() {
        return f1756k != null;
    }

    public final int b() {
        this.f1757a.readLock().lock();
        try {
            return this.f1759c;
        } finally {
            this.f1757a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f1763h == 1)) {
            i0.l("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (b() == 1) {
            return;
        }
        this.f1757a.writeLock().lock();
        try {
            if (this.f1759c == 0) {
                return;
            }
            this.f1759c = 0;
            this.f1757a.writeLock().unlock();
            g gVar = this.f1761e;
            k kVar = gVar.f1750a;
            try {
                kVar.f1762f.b(new f(gVar));
            } catch (Throwable th) {
                kVar.e(th);
            }
        } finally {
            this.f1757a.writeLock().unlock();
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1757a.writeLock().lock();
        try {
            this.f1759c = 2;
            arrayList.addAll(this.f1758b);
            this.f1758b.clear();
            this.f1757a.writeLock().unlock();
            this.f1760d.post(new b6.d(arrayList, this.f1759c, th));
        } catch (Throwable th2) {
            this.f1757a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009c A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:82:0x0057, B:85:0x005c, B:87:0x0060, B:89:0x006d, B:35:0x008c, B:37:0x0096, B:39:0x0099, B:41:0x009c, B:43:0x00ac, B:44:0x00af), top: B:81:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence f(int i3, int i10, int i11, CharSequence charSequence) {
        CharSequence charSequence2;
        Throwable th;
        int i12;
        int i13;
        y[] yVarArr;
        if (!(b() == 1)) {
            i0.l("Not initialized yet");
            return null;
        }
        if (i3 < 0) {
            a1.e("start cannot be negative");
            return null;
        }
        if (i10 < 0) {
            a1.e("end cannot be negative");
            return null;
        }
        if (!(i3 <= i10)) {
            a1.e("start should be <= than end");
            return null;
        }
        a0 a0Var = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i3 <= charSequence.length())) {
            a1.e("start should be < than charSequence length");
            return null;
        }
        if (!(i10 <= charSequence.length())) {
            a1.e("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i3 == i10) {
            return charSequence;
        }
        boolean z10 = i11 == 1;
        a1.n nVar = this.f1761e.f1751b;
        nVar.getClass();
        boolean z11 = charSequence instanceof w;
        if (z11) {
            ((w) charSequence).a();
        }
        try {
            if (!z11) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i3 - 1, i10 + 1, y.class) <= i10) {
                            a0Var = new a0();
                            a0Var.f1745d = false;
                            a0Var.f1746e = new SpannableString(charSequence);
                        }
                        if (a0Var != null && (yVarArr = (y[]) a0Var.f1746e.getSpans(i3, i10, y.class)) != null && yVarArr.length > 0) {
                            for (y yVar : yVarArr) {
                                int spanStart = a0Var.f1746e.getSpanStart(yVar);
                                int spanEnd = a0Var.f1746e.getSpanEnd(yVar);
                                if (spanStart != i10) {
                                    a0Var.removeSpan(yVar);
                                }
                                i3 = Math.min(spanStart, i3);
                                i10 = Math.max(spanEnd, i10);
                            }
                        }
                        i12 = i3;
                        i13 = i10;
                        if (i12 != i13 || i12 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z11) {
                                return charSequence2;
                            }
                        } else {
                            charSequence2 = charSequence;
                            try {
                                a0 a0Var2 = (a0) nVar.C(charSequence2, i12, i13, Integer.MAX_VALUE, z10, new c6.c(3, a0Var, (u8.d) nVar.f41i));
                                if (a0Var2 != null) {
                                    Spannable spannable = a0Var2.f1746e;
                                    if (z11) {
                                        ((w) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z11) {
                                    return charSequence2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (!z11) {
                                }
                            }
                        }
                        ((w) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    if (!z11) {
                    }
                }
            }
            a0Var = new a0((Spannable) charSequence);
            if (a0Var != null) {
                while (r1 < r3) {
                }
            }
            i12 = i3;
            i13 = i10;
            if (i12 != i13) {
            }
            charSequence2 = charSequence;
            if (!z11) {
            }
            ((w) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
            th = th;
            if (!z11) {
                throw th;
            }
            ((w) charSequence2).b();
            throw th;
        }
    }

    public final void g(i iVar) {
        i7.a.A(iVar, "initCallback cannot be null");
        this.f1757a.writeLock().lock();
        try {
            if (this.f1759c != 1 && this.f1759c != 2) {
                this.f1758b.add(iVar);
                this.f1757a.writeLock().unlock();
            }
            this.f1760d.post(new b6.d(Arrays.asList(iVar), this.f1759c, (Throwable) null));
            this.f1757a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1757a.writeLock().unlock();
            throw th;
        }
    }
}
