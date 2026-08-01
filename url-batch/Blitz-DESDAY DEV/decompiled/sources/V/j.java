package V;

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
    public static final Object f886j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f887k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f888a;

    /* renamed from: b, reason: collision with root package name */
    public final q.c f889b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f890c;
    public final Handler d;

    /* renamed from: e, reason: collision with root package name */
    public final f f891e;

    /* renamed from: f, reason: collision with root package name */
    public final i f892f;

    /* renamed from: g, reason: collision with root package name */
    public final L0.e f893g;
    public final int h;
    public final d i;

    public j(r rVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f888a = reentrantReadWriteLock;
        this.f890c = 3;
        i iVar = (i) rVar.f884b;
        this.f892f = iVar;
        int i = rVar.f883a;
        this.h = i;
        this.i = (d) rVar.f885c;
        this.d = new Handler(Looper.getMainLooper());
        this.f889b = new q.c();
        this.f893g = new L0.e(8);
        f fVar = new f(this);
        this.f891e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f890c = 0;
            } catch (Throwable th) {
                this.f888a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.p(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f886j) {
            try {
                jVar = f887k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f888a.readLock().lock();
        try {
            return this.f890c;
        } finally {
            this.f888a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f888a.writeLock().lock();
        try {
            if (this.f890c == 0) {
                return;
            }
            this.f890c = 0;
            this.f888a.writeLock().unlock();
            f fVar = this.f891e;
            j jVar = fVar.f880a;
            try {
                jVar.f892f.p(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f888a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f888a.writeLock().lock();
        try {
            this.f890c = 2;
            arrayList.addAll(this.f889b);
            this.f889b.clear();
            this.f888a.writeLock().unlock();
            this.d.post(new J.a(arrayList, this.f890c, th));
        } catch (Throwable th2) {
            this.f888a.writeLock().unlock();
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
        y yVar;
        w[] wVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        z1.l.o("start should be <= than end", i <= i2);
        y yVar2 = null;
        if (charSequence == null) {
            return null;
        }
        z1.l.o("start should be < than charSequence length", i <= charSequence.length());
        z1.l.o("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        A1.j jVar = this.f891e.f881b;
        jVar.getClass();
        boolean z2 = charSequence instanceof u;
        if (z2) {
            ((u) charSequence).a();
        }
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, w.class) <= i2) {
                        yVar2 = new y();
                        yVar2.f922a = false;
                        yVar2.f923b = new SpannableString(charSequence);
                    }
                    if (yVar2 != null && (wVarArr = (w[]) yVar2.f923b.getSpans(i, i2, w.class)) != null && wVarArr.length > 0) {
                        for (w wVar : wVarArr) {
                            int spanStart = yVar2.f923b.getSpanStart(wVar);
                            int spanEnd = yVar2.f923b.getSpanEnd(wVar);
                            if (spanStart != i2) {
                                yVar2.removeSpan(wVar);
                            }
                            i = Math.min(spanStart, i);
                            i2 = Math.max(spanEnd, i2);
                        }
                    }
                    i3 = i;
                    i4 = i2;
                    if (i3 != i4 && i3 < charSequence.length()) {
                        yVar = (y) jVar.u(charSequence, i3, i4, Integer.MAX_VALUE, false, new D.j(yVar2, 5, (L0.e) jVar.f80b));
                        if (yVar != null) {
                            if (!z2) {
                                return charSequence;
                            }
                            return charSequence;
                        }
                        Spannable spannable = yVar.f923b;
                        if (z2) {
                            ((u) charSequence).b();
                        }
                        return spannable;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((u) charSequence).b();
                }
            }
        }
        yVar2 = new y((Spannable) charSequence);
        if (yVar2 != null) {
            while (r1 < r5) {
            }
        }
        i3 = i;
        i4 = i2;
        if (i3 != i4) {
            yVar = (y) jVar.u(charSequence, i3, i4, Integer.MAX_VALUE, false, new D.j(yVar2, 5, (L0.e) jVar.f80b));
            if (yVar != null) {
            }
        }
        return charSequence;
    }

    public final void f(h hVar) {
        z1.l.q(hVar, "initCallback cannot be null");
        this.f888a.writeLock().lock();
        try {
            if (this.f890c != 1 && this.f890c != 2) {
                this.f889b.add(hVar);
                this.f888a.writeLock().unlock();
            }
            this.d.post(new J.a(Arrays.asList(hVar), this.f890c, (Throwable) null));
            this.f888a.writeLock().unlock();
        } catch (Throwable th) {
            this.f888a.writeLock().unlock();
            throw th;
        }
    }
}
