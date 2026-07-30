package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ag0 {
    public static final Object j = new Object();
    public static volatile ag0 k;
    public final ReentrantReadWriteLock a;
    public final ii b;
    public volatile int c;
    public final Handler d;
    public final wf0 e;
    public final zf0 f;
    public final u30 g;
    public final int h;
    public final d80 i;

    public ag0(tp0 tp0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        zf0 zf0Var = (zf0) tp0Var.b;
        this.f = zf0Var;
        int i = tp0Var.a;
        this.h = i;
        this.i = (d80) tp0Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ii(0);
        this.g = new u30(5);
        wf0 wf0Var = new wf0(this);
        this.e = wf0Var;
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
        if (c() == 0) {
            try {
                zf0Var.a(new vf0(wf0Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static ag0 a() {
        ag0 ag0Var;
        synchronized (j) {
            try {
                ag0Var = k;
                if (!(ag0Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return ag0Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        if (!(c() == 1)) {
            lh.g("Not initialized yet");
            return 0;
        }
        j8.o(charSequence, "charSequence cannot be null");
        mh mhVar = this.e.b;
        mhVar.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            f13[] f13VarArr = (f13[]) spanned.getSpans(i, i + 1, f13.class);
            if (f13VarArr.length > 0) {
                return spanned.getSpanStart(f13VarArr[0]);
            }
        }
        return ((mg0) mhVar.A(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new mg0(i))).n;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            lh.g("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            wf0 wf0Var = this.e;
            ag0 ag0Var = wf0Var.a;
            try {
                ag0Var.f.a(new vf0(wf0Var));
            } catch (Throwable th) {
                ag0Var.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new xr(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009c A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:82:0x0057, B:85:0x005c, B:87:0x0060, B:89:0x006d, B:35:0x008c, B:37:0x0096, B:39:0x0099, B:41:0x009c, B:43:0x00ac, B:44:0x00af), top: B:81:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        f13[] f13VarArr;
        i23 i23Var = null;
        if (!(c() == 1)) {
            lh.g("Not initialized yet");
            return null;
        }
        if (i < 0) {
            lh.e("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            lh.e("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            lh.e("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            lh.e("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            lh.e("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        mh mhVar = this.e.b;
        mhVar.getClass();
        boolean z2 = charSequence instanceof xn2;
        if (z2) {
            ((xn2) charSequence).a();
        }
        try {
            if (!z2) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, f13.class) <= i2) {
                            i23Var = new i23();
                            i23Var.m = false;
                            i23Var.n = new SpannableString(charSequence);
                        }
                        if (i23Var != null && (f13VarArr = (f13[]) i23Var.n.getSpans(i, i2, f13.class)) != null && f13VarArr.length > 0) {
                            for (f13 f13Var : f13VarArr) {
                                int spanStart = i23Var.n.getSpanStart(f13Var);
                                int spanEnd = i23Var.n.getSpanEnd(f13Var);
                                if (spanStart != i2) {
                                    i23Var.removeSpan(f13Var);
                                }
                                i = Math.min(spanStart, i);
                                i2 = Math.max(spanEnd, i2);
                            }
                        }
                        i4 = i;
                        i5 = i2;
                        if (i4 != i5 || i4 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z2) {
                                return charSequence2;
                            }
                        } else {
                            charSequence2 = charSequence;
                            try {
                                i23 i23Var2 = (i23) mhVar.A(charSequence2, i4, i5, Integer.MAX_VALUE, z, new t21(16, i23Var, (u30) mhVar.n));
                                if (i23Var2 != null) {
                                    Spannable spannable = i23Var2.n;
                                    if (z2) {
                                        ((xn2) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z2) {
                                    return charSequence2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (!z2) {
                                }
                            }
                        }
                        ((xn2) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    if (!z2) {
                    }
                }
            }
            i23Var = new i23((Spannable) charSequence);
            if (i23Var != null) {
                while (r1 < r0) {
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
            }
            charSequence2 = charSequence;
            if (!z2) {
            }
            ((xn2) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
            th = th;
            if (!z2) {
                throw th;
            }
            ((xn2) charSequence2).b();
            throw th;
        }
    }

    public final void h(yf0 yf0Var) {
        j8.o(yf0Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(yf0Var);
                this.a.writeLock().unlock();
            }
            this.d.post(new xr(Arrays.asList(yf0Var), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        wf0 wf0Var = this.e;
        wf0Var.getClass();
        Bundle bundle = editorInfo.extras;
        ll1 ll1Var = (ll1) wf0Var.c.m;
        int a = ll1Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? ((ByteBuffer) ll1Var.p).getInt(a + ll1Var.m) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
