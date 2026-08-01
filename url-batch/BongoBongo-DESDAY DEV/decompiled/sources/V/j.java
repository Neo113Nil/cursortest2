package V;

import L.C0014l;
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
    public static final Object f896j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f897k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f898a;

    /* renamed from: b, reason: collision with root package name */
    public final p.c f899b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f900c;
    public final Handler d;

    /* renamed from: e, reason: collision with root package name */
    public final f f901e;

    /* renamed from: f, reason: collision with root package name */
    public final i f902f;

    /* renamed from: g, reason: collision with root package name */
    public final K0.e f903g;

    /* renamed from: h, reason: collision with root package name */
    public final int f904h;
    public final d i;

    public j(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f898a = reentrantReadWriteLock;
        this.f900c = 3;
        i iVar = (i) sVar.f894b;
        this.f902f = iVar;
        int i = sVar.f893a;
        this.f904h = i;
        this.i = (d) sVar.f895c;
        this.d = new Handler(Looper.getMainLooper());
        this.f899b = new p.c();
        this.f903g = new K0.e(9);
        f fVar = new f(this);
        this.f901e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f900c = 0;
            } catch (Throwable th) {
                this.f898a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.s(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f896j) {
            try {
                jVar = f897k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f898a.readLock().lock();
        try {
            return this.f900c;
        } finally {
            this.f898a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f904h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f898a.writeLock().lock();
        try {
            if (this.f900c == 0) {
                return;
            }
            this.f900c = 0;
            this.f898a.writeLock().unlock();
            f fVar = this.f901e;
            j jVar = fVar.f890a;
            try {
                jVar.f902f.s(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f898a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f898a.writeLock().lock();
        try {
            this.f900c = 2;
            arrayList.addAll(this.f899b);
            this.f899b.clear();
            this.f898a.writeLock().unlock();
            this.d.post(new I.a(arrayList, this.f900c, th));
        } catch (Throwable th2) {
            this.f898a.writeLock().unlock();
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
        z zVar;
        x[] xVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        A1.m.h("start should be <= than end", i <= i2);
        z zVar2 = null;
        if (charSequence == null) {
            return null;
        }
        A1.m.h("start should be < than charSequence length", i <= charSequence.length());
        A1.m.h("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C0014l c0014l = this.f901e.f891b;
        c0014l.getClass();
        boolean z2 = charSequence instanceof v;
        if (z2) {
            ((v) charSequence).a();
        }
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, x.class) <= i2) {
                        zVar2 = new z();
                        zVar2.f937a = false;
                        zVar2.f938b = new SpannableString(charSequence);
                    }
                    if (zVar2 != null && (xVarArr = (x[]) zVar2.f938b.getSpans(i, i2, x.class)) != null && xVarArr.length > 0) {
                        for (x xVar : xVarArr) {
                            int spanStart = zVar2.f938b.getSpanStart(xVar);
                            int spanEnd = zVar2.f938b.getSpanEnd(xVar);
                            if (spanStart != i2) {
                                zVar2.removeSpan(xVar);
                            }
                            i = Math.min(spanStart, i);
                            i2 = Math.max(spanEnd, i2);
                        }
                    }
                    i3 = i;
                    i4 = i2;
                    if (i3 != i4 && i3 < charSequence.length()) {
                        zVar = (z) c0014l.j(charSequence, i3, i4, Integer.MAX_VALUE, false, new C.j(zVar2, 4, (K0.e) c0014l.f542a));
                        if (zVar != null) {
                            if (!z2) {
                                return charSequence;
                            }
                            return charSequence;
                        }
                        Spannable spannable = zVar.f938b;
                        if (z2) {
                            ((v) charSequence).b();
                        }
                        return spannable;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((v) charSequence).b();
                }
            }
        }
        zVar2 = new z((Spannable) charSequence);
        if (zVar2 != null) {
            while (r1 < r5) {
            }
        }
        i3 = i;
        i4 = i2;
        if (i3 != i4) {
            zVar = (z) c0014l.j(charSequence, i3, i4, Integer.MAX_VALUE, false, new C.j(zVar2, 4, (K0.e) c0014l.f542a));
            if (zVar != null) {
            }
        }
        return charSequence;
    }

    public final void f(h hVar) {
        A1.m.j(hVar, "initCallback cannot be null");
        this.f898a.writeLock().lock();
        try {
            if (this.f900c != 1 && this.f900c != 2) {
                this.f899b.add(hVar);
                this.f898a.writeLock().unlock();
            }
            this.d.post(new I.a(Arrays.asList(hVar), this.f900c, (Throwable) null));
            this.f898a.writeLock().unlock();
        } catch (Throwable th) {
            this.f898a.writeLock().unlock();
            throw th;
        }
    }
}
