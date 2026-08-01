package T;

import K.C0011l;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f788j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f789k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f790a;

    /* renamed from: b, reason: collision with root package name */
    public final o.c f791b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f792c;
    public final Handler d;

    /* renamed from: e, reason: collision with root package name */
    public final f f793e;

    /* renamed from: f, reason: collision with root package name */
    public final i f794f;

    /* renamed from: g, reason: collision with root package name */
    public final M0.e f795g;
    public final int h;
    public final d i;

    public j(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f790a = reentrantReadWriteLock;
        this.f792c = 3;
        i iVar = (i) sVar.f786b;
        this.f794f = iVar;
        int i = sVar.f785a;
        this.h = i;
        this.i = (d) sVar.f787c;
        this.d = new Handler(Looper.getMainLooper());
        this.f791b = new o.c();
        this.f795g = new M0.e(6);
        f fVar = new f(this);
        this.f793e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f792c = 0;
            } catch (Throwable th) {
                this.f790a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.h(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f788j) {
            try {
                jVar = f789k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f790a.readLock().lock();
        try {
            return this.f792c;
        } finally {
            this.f790a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f790a.writeLock().lock();
        try {
            if (this.f792c == 0) {
                return;
            }
            this.f792c = 0;
            this.f790a.writeLock().unlock();
            f fVar = this.f793e;
            j jVar = fVar.f782a;
            try {
                jVar.f794f.h(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f790a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f790a.writeLock().lock();
        try {
            this.f792c = 2;
            arrayList.addAll(this.f791b);
            this.f791b.clear();
            this.f790a.writeLock().unlock();
            this.d.post(new H.b(arrayList, this.f792c, th));
        } catch (Throwable th2) {
            this.f790a.writeLock().unlock();
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
        A a2;
        y[] yVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        u1.d.e("start should be <= than end", i <= i2);
        A a3 = null;
        if (charSequence == null) {
            return null;
        }
        u1.d.e("start should be < than charSequence length", i <= charSequence.length());
        u1.d.e("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C0011l c0011l = this.f793e.f783b;
        c0011l.getClass();
        boolean z2 = charSequence instanceof w;
        if (z2) {
            ((w) charSequence).a();
        }
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, y.class) <= i2) {
                        a3 = new A();
                        a3.f776a = false;
                        a3.f777b = new SpannableString(charSequence);
                    }
                    if (a3 != null && (yVarArr = (y[]) a3.f777b.getSpans(i, i2, y.class)) != null && yVarArr.length > 0) {
                        for (y yVar : yVarArr) {
                            int spanStart = a3.f777b.getSpanStart(yVar);
                            int spanEnd = a3.f777b.getSpanEnd(yVar);
                            if (spanStart != i2) {
                                a3.removeSpan(yVar);
                            }
                            i = Math.min(spanStart, i);
                            i2 = Math.max(spanEnd, i2);
                        }
                    }
                    i3 = i;
                    i4 = i2;
                    if (i3 != i4 && i3 < charSequence.length()) {
                        a2 = (A) c0011l.s(charSequence, i3, i4, Integer.MAX_VALUE, false, new B.j(a3, 4, (M0.e) c0011l.f404b));
                        if (a2 != null) {
                            if (!z2) {
                                return charSequence;
                            }
                            return charSequence;
                        }
                        Spannable spannable = a2.f777b;
                        if (z2) {
                            ((w) charSequence).b();
                        }
                        return spannable;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((w) charSequence).b();
                }
            }
        }
        a3 = new A((Spannable) charSequence);
        if (a3 != null) {
            while (r1 < r5) {
            }
        }
        i3 = i;
        i4 = i2;
        if (i3 != i4) {
            a2 = (A) c0011l.s(charSequence, i3, i4, Integer.MAX_VALUE, false, new B.j(a3, 4, (M0.e) c0011l.f404b));
            if (a2 != null) {
            }
        }
        return charSequence;
    }

    public final void f(h hVar) {
        u1.d.g(hVar, "initCallback cannot be null");
        this.f790a.writeLock().lock();
        try {
            if (this.f792c != 1 && this.f792c != 2) {
                this.f791b.add(hVar);
                this.f790a.writeLock().unlock();
            }
            this.d.post(new H.b(Arrays.asList(hVar), this.f792c, (Throwable) null));
            this.f790a.writeLock().unlock();
        } catch (Throwable th) {
            this.f790a.writeLock().unlock();
            throw th;
        }
    }
}
