package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class kh {
    public static final Object j = new Object();
    public static volatile kh k;
    public final ReentrantReadWriteLock a;
    public final p6 b;
    public volatile int c;
    public final Handler d;
    public final gh e;
    public final jh f;
    public final dh g;
    public final int h;
    public final ke i;

    public kh(uj ujVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        jh jhVar = (jh) ujVar.b;
        this.f = jhVar;
        int i = ujVar.a;
        this.h = i;
        this.i = (ke) ujVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new p6();
        this.g = new dh(16);
        gh ghVar = new gh(this);
        this.e = ghVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                jhVar.e(new fh(ghVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static kh a() {
        kh khVar;
        synchronized (j) {
            try {
                khVar = k;
                if (!(khVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return khVar;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            t8.t("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            gh ghVar = this.e;
            kh khVar = ghVar.a;
            try {
                khVar.f.e(new fh(ghVar));
            } catch (Throwable th) {
                khVar.d(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new d9(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:29:0x005a, B:32:0x005f, B:34:0x0063, B:36:0x0070, B:38:0x008f, B:40:0x0099, B:42:0x009c, B:44:0x009f, B:46:0x00af, B:47:0x00b2), top: B:28:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i, int i2) {
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        m70[] m70VarArr;
        o70 o70Var = null;
        if (!(b() == 1)) {
            t8.t("Not initialized yet");
            return null;
        }
        if (i < 0) {
            t8.k("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            t8.k("end cannot be negative");
            return null;
        }
        zo.c("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        zo.c("start should be < than charSequence length", i <= charSequence.length());
        zo.c("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        a6 a6Var = this.e.b;
        a6Var.getClass();
        boolean z = charSequence instanceof h30;
        if (z) {
            ((h30) charSequence).a();
        }
        try {
            if (!z) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, m70.class) <= i2) {
                            o70Var = new o70();
                            o70Var.f = false;
                            o70Var.g = new SpannableString(charSequence);
                        }
                        if (o70Var != null && (m70VarArr = (m70[]) o70Var.g.getSpans(i, i2, m70.class)) != null && m70VarArr.length > 0) {
                            for (m70 m70Var : m70VarArr) {
                                int spanStart = o70Var.g.getSpanStart(m70Var);
                                int spanEnd = o70Var.g.getSpanEnd(m70Var);
                                if (spanStart != i2) {
                                    o70Var.removeSpan(m70Var);
                                }
                                i = Math.min(spanStart, i);
                                i2 = Math.max(spanEnd, i2);
                            }
                        }
                        i3 = i;
                        i4 = i2;
                        if (i3 != i4 || i3 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z) {
                                return charSequence2;
                            }
                        } else {
                            try {
                                charSequence2 = charSequence;
                            } catch (Throwable th2) {
                                charSequence2 = charSequence;
                                th = th2;
                                if (z) {
                                }
                            }
                            try {
                                o70 o70Var2 = (o70) a6Var.v(charSequence2, i3, i4, Integer.MAX_VALUE, false, new q4(o70Var, (dh) a6Var.b, 15));
                                if (o70Var2 != null) {
                                    Spannable spannable = o70Var2.g;
                                    if (z) {
                                        ((h30) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z) {
                                    return charSequence2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                if (z) {
                                }
                            }
                        }
                        ((h30) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z) {
                        throw th;
                    }
                    ((h30) charSequence2).b();
                    throw th;
                }
            }
            o70Var = new o70((Spannable) charSequence);
            if (o70Var != null) {
                while (r1 < r2) {
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4) {
            }
            charSequence2 = charSequence;
            if (!z) {
            }
            ((h30) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z) {
            }
        }
    }

    public final void f(ih ihVar) {
        zo.g(ihVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(ihVar);
                this.a.writeLock().unlock();
            }
            this.d.post(new d9(Arrays.asList(ihVar), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }
}
