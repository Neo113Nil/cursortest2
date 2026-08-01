package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ch {
    public static final Object j = new Object();
    public static volatile ch k;
    public final ReentrantReadWriteLock a;
    public final g7 b;
    public volatile int c;
    public final Handler d;
    public final yg e;
    public final bh f;
    public final vg g;
    public final int h;
    public final le i;

    public ch(pj pjVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        bh bhVar = (bh) pjVar.b;
        this.f = bhVar;
        int i = pjVar.a;
        this.h = i;
        this.i = (le) pjVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new g7();
        this.g = new vg(17);
        yg ygVar = new yg(this);
        this.e = ygVar;
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
                bhVar.h(new xg(ygVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static ch a() {
        ch chVar;
        synchronized (j) {
            try {
                chVar = k;
                if (!(chVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return chVar;
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
            o8.t("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
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
            yg ygVar = this.e;
            ch chVar = ygVar.a;
            try {
                chVar.f.h(new xg(ygVar));
            } catch (Throwable th) {
                chVar.d(th);
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
            this.d.post(new y8(arrayList, this.c, th));
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
        t70[] t70VarArr;
        v70 v70Var = null;
        if (!(b() == 1)) {
            o8.t("Not initialized yet");
            return null;
        }
        if (i < 0) {
            o8.j("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            o8.j("end cannot be negative");
            return null;
        }
        vw.l("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        vw.l("start should be < than charSequence length", i <= charSequence.length());
        vw.l("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        r6 r6Var = this.e.b;
        r6Var.getClass();
        boolean z = charSequence instanceof s30;
        if (z) {
            ((s30) charSequence).a();
        }
        try {
            if (!z) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, t70.class) <= i2) {
                            v70Var = new v70();
                            v70Var.f = false;
                            v70Var.g = new SpannableString(charSequence);
                        }
                        if (v70Var != null && (t70VarArr = (t70[]) v70Var.g.getSpans(i, i2, t70.class)) != null && t70VarArr.length > 0) {
                            for (t70 t70Var : t70VarArr) {
                                int spanStart = v70Var.g.getSpanStart(t70Var);
                                int spanEnd = v70Var.g.getSpanEnd(t70Var);
                                if (spanStart != i2) {
                                    v70Var.removeSpan(t70Var);
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
                                v70 v70Var2 = (v70) r6Var.v(charSequence2, i3, i4, Integer.MAX_VALUE, false, new h5(v70Var, (vg) r6Var.b, 12));
                                if (v70Var2 != null) {
                                    Spannable spannable = v70Var2.g;
                                    if (z) {
                                        ((s30) charSequence2).b();
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
                        ((s30) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z) {
                        throw th;
                    }
                    ((s30) charSequence2).b();
                    throw th;
                }
            }
            v70Var = new v70((Spannable) charSequence);
            if (v70Var != null) {
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
            ((s30) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z) {
            }
        }
    }

    public final void f(ah ahVar) {
        vw.o(ahVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(ahVar);
                this.a.writeLock().unlock();
            }
            this.d.post(new y8(Arrays.asList(ahVar), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }
}
