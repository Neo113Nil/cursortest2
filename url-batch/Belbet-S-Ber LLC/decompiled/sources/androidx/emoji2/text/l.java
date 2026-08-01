package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f453j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile l f454k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f455a;

    /* renamed from: b, reason: collision with root package name */
    public final q.g f456b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f457c;
    public final Handler d;

    /* renamed from: e, reason: collision with root package name */
    public final f f458e;

    /* renamed from: f, reason: collision with root package name */
    public final k f459f;

    /* renamed from: g, reason: collision with root package name */
    public final o2.f f460g;
    public final int h;
    public final d i;

    public l(v vVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f455a = reentrantReadWriteLock;
        this.f457c = 3;
        k kVar = (k) vVar.f449b;
        this.f459f = kVar;
        int i = vVar.f448a;
        this.h = i;
        this.i = (d) vVar.f450c;
        this.d = new Handler(Looper.getMainLooper());
        this.f456b = new q.g();
        this.f460g = new o2.f(3);
        f fVar = new f(this);
        this.f458e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f457c = 0;
            } catch (Throwable th) {
                this.f455a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                kVar.g(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static l a() {
        l lVar;
        synchronized (f453j) {
            try {
                lVar = f454k;
                if (!(lVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return lVar;
    }

    public final int b() {
        this.f455a.readLock().lock();
        try {
            return this.f457c;
        } finally {
            this.f455a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f455a.writeLock().lock();
        try {
            if (this.f457c == 0) {
                return;
            }
            this.f457c = 0;
            this.f455a.writeLock().unlock();
            f fVar = this.f458e;
            l lVar = fVar.f445a;
            try {
                lVar.f459f.g(new e(fVar));
            } catch (Throwable th) {
                lVar.d(th);
            }
        } finally {
            this.f455a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f455a.writeLock().lock();
        try {
            this.f457c = 2;
            arrayList.addAll(this.f456b);
            this.f456b.clear();
            this.f455a.writeLock().unlock();
            this.d.post(new j(arrayList, this.f457c, th));
        } catch (Throwable th2) {
            this.f455a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:28:0x005a, B:31:0x005f, B:33:0x0063, B:35:0x0070, B:37:0x008f, B:39:0x0099, B:41:0x009c, B:43:0x009f, B:45:0x00af, B:46:0x00b2), top: B:27:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i, int i4) {
        Throwable th;
        CharSequence charSequence2;
        int i5;
        int i6;
        a0[] a0VarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        b4.l.f("start should be <= than end", i <= i4);
        c0 c0Var = null;
        if (charSequence == null) {
            return null;
        }
        b4.l.f("start should be < than charSequence length", i <= charSequence.length());
        b4.l.f("end should be < than charSequence length", i4 <= charSequence.length());
        if (charSequence.length() == 0 || i == i4) {
            return charSequence;
        }
        t tVar = this.f458e.f446b;
        tVar.getClass();
        boolean z4 = charSequence instanceof y;
        if (z4) {
            ((y) charSequence).a();
        }
        try {
            if (!z4) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i4 + 1, a0.class) <= i4) {
                            c0Var = new c0();
                            c0Var.f440f = false;
                            c0Var.f441g = new SpannableString(charSequence);
                        }
                        if (c0Var != null && (a0VarArr = (a0[]) c0Var.f441g.getSpans(i, i4, a0.class)) != null && a0VarArr.length > 0) {
                            for (a0 a0Var : a0VarArr) {
                                int spanStart = c0Var.f441g.getSpanStart(a0Var);
                                int spanEnd = c0Var.f441g.getSpanEnd(a0Var);
                                if (spanStart != i4) {
                                    c0Var.removeSpan(a0Var);
                                }
                                i = Math.min(spanStart, i);
                                i4 = Math.max(spanEnd, i4);
                            }
                        }
                        i5 = i;
                        i6 = i4;
                        if (i5 != i6 || i5 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z4) {
                                return charSequence2;
                            }
                        } else {
                            try {
                                charSequence2 = charSequence;
                            } catch (Throwable th2) {
                                charSequence2 = charSequence;
                                th = th2;
                                if (z4) {
                                }
                            }
                            try {
                                c0 c0Var2 = (c0) tVar.j(charSequence2, i5, i6, Integer.MAX_VALUE, false, new q(c0Var, (o2.f) tVar.f472a, 0));
                                if (c0Var2 != null) {
                                    Spannable spannable = c0Var2.f441g;
                                    if (z4) {
                                        ((y) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z4) {
                                    return charSequence2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                if (z4) {
                                }
                            }
                        }
                        ((y) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z4) {
                        throw th;
                    }
                    ((y) charSequence2).b();
                    throw th;
                }
            }
            c0Var = new c0((Spannable) charSequence);
            if (c0Var != null) {
                while (r1 < r5) {
                }
            }
            i5 = i;
            i6 = i4;
            if (i5 != i6) {
            }
            charSequence2 = charSequence;
            if (!z4) {
            }
            ((y) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z4) {
            }
        }
    }

    public final void f(i iVar) {
        b4.l.h(iVar, "initCallback cannot be null");
        this.f455a.writeLock().lock();
        try {
            if (this.f457c != 1 && this.f457c != 2) {
                this.f456b.add(iVar);
                this.f455a.writeLock().unlock();
            }
            this.d.post(new j(Arrays.asList(iVar), this.f457c, (Throwable) null));
            this.f455a.writeLock().unlock();
        } catch (Throwable th) {
            this.f455a.writeLock().unlock();
            throw th;
        }
    }
}
