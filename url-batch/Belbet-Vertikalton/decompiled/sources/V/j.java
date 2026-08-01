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
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f1274k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f1275a;

    /* renamed from: b, reason: collision with root package name */
    public final q.c f1276b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1277c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1278d;
    public final f e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1279f;

    /* renamed from: g, reason: collision with root package name */
    public final N0.e f1280g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1281h;
    public final d i;

    public j(t tVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1275a = reentrantReadWriteLock;
        this.f1277c = 3;
        i iVar = (i) tVar.f1272b;
        this.f1279f = iVar;
        int i = tVar.f1271a;
        this.f1281h = i;
        this.i = (d) tVar.f1273c;
        this.f1278d = new Handler(Looper.getMainLooper());
        this.f1276b = new q.c();
        this.f1280g = new N0.e(9);
        f fVar = new f(this);
        this.e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f1277c = 0;
            } catch (Throwable th) {
                this.f1275a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.e(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (j) {
            try {
                jVar = f1274k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f1275a.readLock().lock();
        try {
            return this.f1277c;
        } finally {
            this.f1275a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f1281h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f1275a.writeLock().lock();
        try {
            if (this.f1277c == 0) {
                return;
            }
            this.f1277c = 0;
            this.f1275a.writeLock().unlock();
            f fVar = this.e;
            j jVar = fVar.f1268a;
            try {
                jVar.f1279f.e(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f1275a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1275a.writeLock().lock();
        try {
            this.f1277c = 2;
            arrayList.addAll(this.f1276b);
            this.f1276b.clear();
            this.f1275a.writeLock().unlock();
            this.f1278d.post(new J.a(arrayList, this.f1277c, th));
        } catch (Throwable th2) {
            this.f1275a.writeLock().unlock();
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
        B b2;
        z[] zVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        H1.d.j("start should be <= than end", i <= i2);
        B b3 = null;
        if (charSequence == null) {
            return null;
        }
        H1.d.j("start should be < than charSequence length", i <= charSequence.length());
        H1.d.j("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        I0.h hVar = this.e.f1269b;
        hVar.getClass();
        boolean z2 = charSequence instanceof x;
        if (z2) {
            ((x) charSequence).a();
        }
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, z.class) <= i2) {
                        b3 = new B();
                        b3.f1263a = false;
                        b3.f1264b = new SpannableString(charSequence);
                    }
                    if (b3 != null && (zVarArr = (z[]) b3.f1264b.getSpans(i, i2, z.class)) != null && zVarArr.length > 0) {
                        for (z zVar : zVarArr) {
                            int spanStart = b3.f1264b.getSpanStart(zVar);
                            int spanEnd = b3.f1264b.getSpanEnd(zVar);
                            if (spanStart != i2) {
                                b3.removeSpan(zVar);
                            }
                            i = Math.min(spanStart, i);
                            i2 = Math.max(spanEnd, i2);
                        }
                    }
                    i3 = i;
                    i4 = i2;
                    if (i3 != i4 && i3 < charSequence.length()) {
                        b2 = (B) hVar.s(charSequence, i3, i4, Integer.MAX_VALUE, false, new B1.c(b3, 6, (N0.e) hVar.f591b));
                        if (b2 != null) {
                            if (!z2) {
                                return charSequence;
                            }
                            return charSequence;
                        }
                        Spannable spannable = b2.f1264b;
                        if (z2) {
                            ((x) charSequence).b();
                        }
                        return spannable;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((x) charSequence).b();
                }
            }
        }
        b3 = new B((Spannable) charSequence);
        if (b3 != null) {
            while (r1 < r5) {
            }
        }
        i3 = i;
        i4 = i2;
        if (i3 != i4) {
            b2 = (B) hVar.s(charSequence, i3, i4, Integer.MAX_VALUE, false, new B1.c(b3, 6, (N0.e) hVar.f591b));
            if (b2 != null) {
            }
        }
        return charSequence;
    }

    public final void f(h hVar) {
        H1.d.l(hVar, "initCallback cannot be null");
        this.f1275a.writeLock().lock();
        try {
            if (this.f1277c != 1 && this.f1277c != 2) {
                this.f1276b.add(hVar);
                this.f1275a.writeLock().unlock();
            }
            this.f1278d.post(new J.a(Arrays.asList(hVar), this.f1277c, (Throwable) null));
            this.f1275a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1275a.writeLock().unlock();
            throw th;
        }
    }
}
