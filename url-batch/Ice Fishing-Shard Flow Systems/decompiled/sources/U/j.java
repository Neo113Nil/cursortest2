package U;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import u.C0935f;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f2666i = new Object();
    public static volatile j j;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f2667a;

    /* renamed from: b, reason: collision with root package name */
    public final C0935f f2668b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f2669c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2670d;

    /* renamed from: e, reason: collision with root package name */
    public final f f2671e;

    /* renamed from: f, reason: collision with root package name */
    public final i f2672f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2673g;

    /* renamed from: h, reason: collision with root package name */
    public final d f2674h;

    public j(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2667a = reentrantReadWriteLock;
        this.f2669c = 3;
        i iVar = qVar.f2697a;
        this.f2672f = iVar;
        int i2 = qVar.f2698b;
        this.f2673g = i2;
        this.f2674h = qVar.f2699c;
        this.f2670d = new Handler(Looper.getMainLooper());
        this.f2668b = new C0935f(0);
        f fVar = new f(this);
        this.f2671e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f2669c = 0;
            } catch (Throwable th) {
                this.f2667a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.a(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f2666i) {
            try {
                jVar = j;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f2667a.readLock().lock();
        try {
            return this.f2669c;
        } finally {
            this.f2667a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f2673g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f2667a.writeLock().lock();
        try {
            if (this.f2669c == 0) {
                return;
            }
            this.f2669c = 0;
            this.f2667a.writeLock().unlock();
            f fVar = this.f2671e;
            j jVar = fVar.f2663a;
            try {
                jVar.f2672f.a(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f2667a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2667a.writeLock().lock();
        try {
            this.f2669c = 2;
            arrayList.addAll(this.f2668b);
            this.f2668b.clear();
            this.f2667a.writeLock().unlock();
            this.f2670d.post(new O0.d(arrayList, this.f2669c, th));
        } catch (Throwable th2) {
            this.f2667a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0160, code lost:
    
        if (r4 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0162, code lost:
    
        ((U.t) r12).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0168, code lost:
    
        return r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0143 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:119:0x0051, B:122:0x0056, B:124:0x005a, B:126:0x0067, B:32:0x007a, B:34:0x0084, B:36:0x0087, B:38:0x008b, B:40:0x009b, B:42:0x009e, B:46:0x00ab, B:49:0x00b3, B:54:0x00d2, B:78:0x00de, B:82:0x00ea, B:83:0x00f4, B:66:0x0103, B:69:0x010a, B:57:0x010f, B:59:0x011a, B:88:0x0121, B:90:0x0125, B:92:0x012b, B:94:0x012f, B:97:0x0137, B:100:0x0143, B:101:0x0148, B:103:0x0156, B:30:0x0070), top: B:118:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0156 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {all -> 0x006d, blocks: (B:119:0x0051, B:122:0x0056, B:124:0x005a, B:126:0x0067, B:32:0x007a, B:34:0x0084, B:36:0x0087, B:38:0x008b, B:40:0x009b, B:42:0x009e, B:46:0x00ab, B:49:0x00b3, B:54:0x00d2, B:78:0x00de, B:82:0x00ea, B:83:0x00f4, B:66:0x0103, B:69:0x010a, B:57:0x010f, B:59:0x011a, B:88:0x0121, B:90:0x0125, B:92:0x012b, B:94:0x012f, B:97:0x0137, B:100:0x0143, B:101:0x0148, B:103:0x0156, B:30:0x0070), top: B:118:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:119:0x0051, B:122:0x0056, B:124:0x005a, B:126:0x0067, B:32:0x007a, B:34:0x0084, B:36:0x0087, B:38:0x008b, B:40:0x009b, B:42:0x009e, B:46:0x00ab, B:49:0x00b3, B:54:0x00d2, B:78:0x00de, B:82:0x00ea, B:83:0x00f4, B:66:0x0103, B:69:0x010a, B:57:0x010f, B:59:0x011a, B:88:0x0121, B:90:0x0125, B:92:0x012b, B:94:0x012f, B:97:0x0137, B:100:0x0143, B:101:0x0148, B:103:0x0156, B:30:0x0070), top: B:118:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i2, int i5) {
        o oVar;
        int codePointAt;
        w wVar;
        int i7;
        int a7;
        u[] uVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i2 <= i5)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        w wVar2 = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i5 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() != 0 && i2 != i5) {
            P0.c cVar = this.f2671e.f2664b;
            cVar.getClass();
            boolean z7 = charSequence instanceof t;
            if (z7) {
                ((t) charSequence).a();
            }
            if (!z7) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i5 + 1, u.class) <= i5) {
                            wVar2 = new w(charSequence);
                        }
                        if (wVar2 != null && (uVarArr = (u[]) wVar2.f2710e.getSpans(i2, i5, u.class)) != null && uVarArr.length > 0) {
                            for (u uVar : uVarArr) {
                                int spanStart = wVar2.f2710e.getSpanStart(uVar);
                                int spanEnd = wVar2.f2710e.getSpanEnd(uVar);
                                if (spanStart != i5) {
                                    wVar2.removeSpan(uVar);
                                }
                                i2 = Math.min(spanStart, i2);
                                i5 = Math.max(spanEnd, i5);
                            }
                        }
                        if (i2 != i5 && i2 < charSequence.length()) {
                            oVar = new o((r) ((P0.i) cVar.f2189e).f2202c);
                            codePointAt = Character.codePointAt(charSequence, i2);
                            int i8 = 0;
                            wVar = wVar2;
                            loop1: while (true) {
                                i7 = i2;
                                while (i2 < i5 && i8 < Integer.MAX_VALUE) {
                                    a7 = oVar.a(codePointAt);
                                    if (a7 != 1) {
                                        i7 += Character.charCount(Character.codePointAt(charSequence, i7));
                                        if (i7 < i5) {
                                            codePointAt = Character.codePointAt(charSequence, i7);
                                        }
                                        i2 = i7;
                                    } else if (a7 == 2) {
                                        i2 += Character.charCount(codePointAt);
                                        if (i2 < i5) {
                                            codePointAt = Character.codePointAt(charSequence, i2);
                                        }
                                    } else if (a7 == 3) {
                                        if (!cVar.v(charSequence, i7, i2, oVar.f2685d.f2701b)) {
                                            if (wVar == null) {
                                                wVar = new w((Spannable) new SpannableString(charSequence));
                                            }
                                            wVar.setSpan(new u(oVar.f2685d.f2701b), i7, i2, 33);
                                            i8++;
                                        }
                                    }
                                }
                            }
                            if (oVar.f2682a == 2 && oVar.f2684c.f2701b != null && ((oVar.f2687f > 1 || oVar.c()) && i8 < Integer.MAX_VALUE && !cVar.v(charSequence, i7, i2, oVar.f2684c.f2701b))) {
                                if (wVar == null) {
                                    wVar = new w(charSequence);
                                }
                                wVar.setSpan(new u(oVar.f2684c.f2701b), i7, i2, 33);
                            }
                            if (wVar == null) {
                                Spannable spannable = wVar.f2710e;
                                if (z7) {
                                    ((t) charSequence).b();
                                }
                                return spannable;
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (z7) {
                        ((t) charSequence).b();
                    }
                    throw th;
                }
            }
            wVar2 = new w((Spannable) charSequence);
            if (wVar2 != null) {
                while (r7 < r6) {
                }
            }
            if (i2 != i5) {
                oVar = new o((r) ((P0.i) cVar.f2189e).f2202c);
                codePointAt = Character.codePointAt(charSequence, i2);
                int i82 = 0;
                wVar = wVar2;
                loop1: while (true) {
                    i7 = i2;
                    while (i2 < i5) {
                        a7 = oVar.a(codePointAt);
                        if (a7 != 1) {
                        }
                    }
                }
                if (oVar.f2682a == 2) {
                    if (wVar == null) {
                    }
                    wVar.setSpan(new u(oVar.f2684c.f2701b), i7, i2, 33);
                }
                if (wVar == null) {
                }
            }
        }
        return charSequence;
    }

    public final void f(h hVar) {
        AbstractC1053a.j(hVar, "initCallback cannot be null");
        this.f2667a.writeLock().lock();
        try {
            if (this.f2669c != 1 && this.f2669c != 2) {
                this.f2668b.add(hVar);
                this.f2667a.writeLock().unlock();
            }
            this.f2670d.post(new O0.d(Arrays.asList(hVar), this.f2669c, (Throwable) null));
            this.f2667a.writeLock().unlock();
        } catch (Throwable th) {
            this.f2667a.writeLock().unlock();
            throw th;
        }
    }
}
