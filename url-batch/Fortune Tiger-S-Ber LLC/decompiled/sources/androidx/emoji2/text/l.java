package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f339j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile l f340k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f341a;

    /* renamed from: b, reason: collision with root package name */
    public final n.g f342b;
    public volatile int c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f343d;

    /* renamed from: e, reason: collision with root package name */
    public final f f344e;

    /* renamed from: f, reason: collision with root package name */
    public final k f345f;
    public final g2.f g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final d f346i;

    public l(u uVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f341a = reentrantReadWriteLock;
        this.c = 3;
        k kVar = (k) uVar.f337b;
        this.f345f = kVar;
        int i4 = uVar.f336a;
        this.h = i4;
        this.f346i = (d) uVar.c;
        this.f343d = new Handler(Looper.getMainLooper());
        this.f342b = new n.g();
        this.g = new g2.f(3);
        f fVar = new f(this);
        this.f344e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i4 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.f341a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                kVar.f(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static l a() {
        l lVar;
        synchronized (f339j) {
            try {
                lVar = f340k;
                if (!(lVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return lVar;
    }

    public final int b() {
        this.f341a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.f341a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f341a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.f341a.writeLock().unlock();
            f fVar = this.f344e;
            l lVar = fVar.f334a;
            try {
                lVar.f345f.f(new e(fVar));
            } catch (Throwable th) {
                lVar.d(th);
            }
        } finally {
            this.f341a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f341a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.f342b);
            this.f342b.clear();
            this.f341a.writeLock().unlock();
            this.f343d.post(new j(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.f341a.writeLock().unlock();
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
    public final CharSequence e(CharSequence charSequence, int i4, int i5) {
        Throwable th;
        CharSequence charSequence2;
        int i6;
        int i7;
        a0[] a0VarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        k3.d.e("start should be <= than end", i4 <= i5);
        c0 c0Var = null;
        if (charSequence == null) {
            return null;
        }
        k3.d.e("start should be < than charSequence length", i4 <= charSequence.length());
        k3.d.e("end should be < than charSequence length", i5 <= charSequence.length());
        if (charSequence.length() == 0 || i4 == i5) {
            return charSequence;
        }
        s sVar = this.f344e.f335b;
        sVar.getClass();
        boolean z3 = charSequence instanceof y;
        if (z3) {
            ((y) charSequence).a();
        }
        try {
            if (!z3) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i4 - 1, i5 + 1, a0.class) <= i5) {
                            c0Var = new c0();
                            c0Var.f330f = false;
                            c0Var.g = new SpannableString(charSequence);
                        }
                        if (c0Var != null && (a0VarArr = (a0[]) c0Var.g.getSpans(i4, i5, a0.class)) != null && a0VarArr.length > 0) {
                            for (a0 a0Var : a0VarArr) {
                                int spanStart = c0Var.g.getSpanStart(a0Var);
                                int spanEnd = c0Var.g.getSpanEnd(a0Var);
                                if (spanStart != i5) {
                                    c0Var.removeSpan(a0Var);
                                }
                                i4 = Math.min(spanStart, i4);
                                i5 = Math.max(spanEnd, i5);
                            }
                        }
                        i6 = i4;
                        i7 = i5;
                        if (i6 != i7 || i6 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z3) {
                                return charSequence2;
                            }
                        } else {
                            try {
                                charSequence2 = charSequence;
                            } catch (Throwable th2) {
                                charSequence2 = charSequence;
                                th = th2;
                                if (z3) {
                                }
                            }
                            try {
                                c0 c0Var2 = (c0) sVar.s(charSequence2, i6, i7, Integer.MAX_VALUE, false, new a2.s(c0Var, (g2.f) sVar.f357b, 1));
                                if (c0Var2 != null) {
                                    Spannable spannable = c0Var2.g;
                                    if (z3) {
                                        ((y) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z3) {
                                    return charSequence2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                if (z3) {
                                }
                            }
                        }
                        ((y) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z3) {
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
            i6 = i4;
            i7 = i5;
            if (i6 != i7) {
            }
            charSequence2 = charSequence;
            if (!z3) {
            }
            ((y) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z3) {
            }
        }
    }

    public final void f(i iVar) {
        k3.d.h(iVar, "initCallback cannot be null");
        this.f341a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.f342b.add(iVar);
                this.f341a.writeLock().unlock();
            }
            this.f343d.post(new j(Arrays.asList(iVar), this.c, (Throwable) null));
            this.f341a.writeLock().unlock();
        } catch (Throwable th) {
            this.f341a.writeLock().unlock();
            throw th;
        }
    }
}
