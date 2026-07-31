package d4;

import a0.g1;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f2266j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile l f2267k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f2268a;

    /* renamed from: b, reason: collision with root package name */
    public final o.f f2269b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f2270c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2271d;

    /* renamed from: e, reason: collision with root package name */
    public final g f2272e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2273f;

    /* renamed from: g, reason: collision with root package name */
    public final w5.f f2274g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2275h;
    public final e i;

    public l(w wVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2268a = reentrantReadWriteLock;
        this.f2270c = 3;
        k kVar = wVar.f2300a;
        this.f2273f = kVar;
        int i = wVar.f2301b;
        this.f2275h = i;
        this.i = wVar.f2302c;
        this.f2271d = new Handler(Looper.getMainLooper());
        this.f2269b = new o.f();
        this.f2274g = new w5.f(9);
        g gVar = new g(this);
        this.f2272e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f2270c = 0;
            } catch (Throwable th) {
                this.f2268a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                kVar.a(new f(gVar));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static l a() {
        l lVar;
        synchronized (f2266j) {
            try {
                lVar = f2267k;
                if (!(lVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return lVar;
    }

    public static boolean c() {
        return f2267k != null;
    }

    public final int b() {
        this.f2268a.readLock().lock();
        try {
            return this.f2270c;
        } finally {
            this.f2268a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f2275h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f2268a.writeLock().lock();
        try {
            if (this.f2270c == 0) {
                return;
            }
            this.f2270c = 0;
            this.f2268a.writeLock().unlock();
            g gVar = this.f2272e;
            l lVar = gVar.f2260a;
            try {
                lVar.f2273f.a(new f(gVar));
            } catch (Throwable th) {
                lVar.e(th);
            }
        } finally {
            this.f2268a.writeLock().unlock();
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2268a.writeLock().lock();
        try {
            this.f2270c = 2;
            arrayList.addAll(this.f2269b);
            this.f2269b.clear();
            this.f2268a.writeLock().unlock();
            this.f2271d.post(new j(arrayList, this.f2270c, th));
        } catch (Throwable th2) {
            this.f2268a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:30:0x0060, B:33:0x0065, B:35:0x0069, B:37:0x0076, B:39:0x0095, B:41:0x009f, B:43:0x00a2, B:45:0x00a5, B:47:0x00b5, B:48:0x00b8), top: B:29:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence f(int i, int i8, int i9, CharSequence charSequence) {
        Throwable th;
        CharSequence charSequence2;
        int i10;
        int i11;
        b0[] b0VarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        h0.a.m("start should be <= than end", i <= i8);
        d0 d0Var = null;
        if (charSequence == null) {
            return null;
        }
        h0.a.m("start should be < than charSequence length", i <= charSequence.length());
        h0.a.m("end should be < than charSequence length", i8 <= charSequence.length());
        if (charSequence.length() == 0 || i == i8) {
            return charSequence;
        }
        boolean z3 = i9 == 1;
        g1 g1Var = this.f2272e.f2261b;
        g1Var.getClass();
        boolean z7 = charSequence instanceof z;
        if (z7) {
            ((z) charSequence).a();
        }
        try {
            if (!z7) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i8 + 1, b0.class) <= i8) {
                            d0Var = new d0();
                            d0Var.f2255d = false;
                            d0Var.f2256e = new SpannableString(charSequence);
                        }
                        if (d0Var != null && (b0VarArr = (b0[]) d0Var.f2256e.getSpans(i, i8, b0.class)) != null && b0VarArr.length > 0) {
                            for (b0 b0Var : b0VarArr) {
                                int spanStart = d0Var.f2256e.getSpanStart(b0Var);
                                int spanEnd = d0Var.f2256e.getSpanEnd(b0Var);
                                if (spanStart != i8) {
                                    d0Var.removeSpan(b0Var);
                                }
                                i = Math.min(spanStart, i);
                                i8 = Math.max(spanEnd, i8);
                            }
                        }
                        i10 = i;
                        i11 = i8;
                        if (i10 != i11 || i10 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z7) {
                                return charSequence2;
                            }
                        } else {
                            charSequence2 = charSequence;
                            try {
                                d0 d0Var2 = (d0) g1Var.F(charSequence2, i10, i11, Integer.MAX_VALUE, z3, new a0.a0(5, d0Var, (w5.f) g1Var.f84b));
                                if (d0Var2 != null) {
                                    Spannable spannable = d0Var2.f2256e;
                                    if (z7) {
                                        ((z) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z7) {
                                    return charSequence2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (!z7) {
                                    throw th;
                                }
                                ((z) charSequence2).b();
                                throw th;
                            }
                        }
                        ((z) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    if (!z7) {
                    }
                }
            }
            d0Var = new d0((Spannable) charSequence);
            if (d0Var != null) {
                while (r1 < r3) {
                }
            }
            i10 = i;
            i11 = i8;
            if (i10 != i11) {
            }
            charSequence2 = charSequence;
            if (!z7) {
            }
            ((z) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
            th = th;
            if (!z7) {
            }
        }
    }

    public final void g(i iVar) {
        h0.a.o(iVar, "initCallback cannot be null");
        this.f2268a.writeLock().lock();
        try {
            if (this.f2270c != 1 && this.f2270c != 2) {
                this.f2269b.add(iVar);
                this.f2268a.writeLock().unlock();
            }
            this.f2271d.post(new j(Arrays.asList(iVar), this.f2270c, null));
            this.f2268a.writeLock().unlock();
        } catch (Throwable th) {
            this.f2268a.writeLock().unlock();
            throw th;
        }
    }
}
