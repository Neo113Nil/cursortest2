package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class lj {
    public static final Object j = new Object();
    public static volatile lj k;
    public final ReentrantReadWriteLock a;
    public final z6 b;
    public volatile int c;
    public final Handler d;
    public final hj e;
    public final kj f;
    public final ej g;
    public final int h;
    public final dg i;

    public lj(yl ylVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        kj kjVar = (kj) ylVar.b;
        this.f = kjVar;
        int i = ylVar.a;
        this.h = i;
        this.i = (dg) ylVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new z6();
        this.g = new ej(19);
        hj hjVar = new hj(this);
        this.e = hjVar;
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
                kjVar.i(new gj(hjVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static lj a() {
        lj ljVar;
        synchronized (j) {
            try {
                ljVar = k;
                if (!(ljVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return ljVar;
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
            g9.s("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
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
            hj hjVar = this.e;
            lj ljVar = hjVar.a;
            try {
                ljVar.f.i(new gj(hjVar));
            } catch (Throwable th) {
                ljVar.d(th);
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
            this.d.post(new q9(arrayList, this.c, th));
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
        ta0[] ta0VarArr;
        ya0 ya0Var = null;
        if (!(b() == 1)) {
            g9.s("Not initialized yet");
            return null;
        }
        if (i < 0) {
            g9.i("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            g9.i("end cannot be negative");
            return null;
        }
        b9.d("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        b9.d("start should be < than charSequence length", i <= charSequence.length());
        b9.d("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        k6 k6Var = this.e.b;
        k6Var.getClass();
        boolean z = charSequence instanceof j60;
        if (z) {
            ((j60) charSequence).a();
        }
        try {
            if (!z) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, ta0.class) <= i2) {
                            ya0Var = new ya0();
                            ya0Var.f = false;
                            ya0Var.g = new SpannableString(charSequence);
                        }
                        if (ya0Var != null && (ta0VarArr = (ta0[]) ya0Var.g.getSpans(i, i2, ta0.class)) != null && ta0VarArr.length > 0) {
                            for (ta0 ta0Var : ta0VarArr) {
                                int spanStart = ya0Var.g.getSpanStart(ta0Var);
                                int spanEnd = ya0Var.g.getSpanEnd(ta0Var);
                                if (spanStart != i2) {
                                    ya0Var.removeSpan(ta0Var);
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
                                ya0 ya0Var2 = (ya0) k6Var.A(charSequence2, i3, i4, Integer.MAX_VALUE, false, new a5(ya0Var, (ej) k6Var.g, 14));
                                if (ya0Var2 != null) {
                                    Spannable spannable = ya0Var2.g;
                                    if (z) {
                                        ((j60) charSequence2).b();
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
                        ((j60) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z) {
                        throw th;
                    }
                    ((j60) charSequence2).b();
                    throw th;
                }
            }
            ya0Var = new ya0((Spannable) charSequence);
            if (ya0Var != null) {
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
            ((j60) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z) {
            }
        }
    }

    public final void f(jj jjVar) {
        b9.f(jjVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(jjVar);
                this.a.writeLock().unlock();
            }
            this.d.post(new q9(Arrays.asList(jjVar), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }
}
