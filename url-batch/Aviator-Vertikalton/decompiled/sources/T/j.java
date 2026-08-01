package T;

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
    public static final Object f787j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f788k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f789a;

    /* renamed from: b, reason: collision with root package name */
    public final o.c f790b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f791c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f792d;

    /* renamed from: e, reason: collision with root package name */
    public final f f793e;

    /* renamed from: f, reason: collision with root package name */
    public final i f794f;

    /* renamed from: g, reason: collision with root package name */
    public final H0.e f795g;
    public final int h;
    public final d i;

    public j(t tVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f789a = reentrantReadWriteLock;
        this.f791c = 3;
        i iVar = (i) tVar.f785b;
        this.f794f = iVar;
        int i = tVar.f784a;
        this.h = i;
        this.i = (d) tVar.f786c;
        this.f792d = new Handler(Looper.getMainLooper());
        this.f790b = new o.c();
        this.f795g = new H0.e(6);
        f fVar = new f(this);
        this.f793e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f791c = 0;
            } catch (Throwable th) {
                this.f789a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.q(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f787j) {
            try {
                jVar = f788k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f789a.readLock().lock();
        try {
            return this.f791c;
        } finally {
            this.f789a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f789a.writeLock().lock();
        try {
            if (this.f791c == 0) {
                return;
            }
            this.f791c = 0;
            this.f789a.writeLock().unlock();
            f fVar = this.f793e;
            j jVar = fVar.f781a;
            try {
                jVar.f794f.q(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f789a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f789a.writeLock().lock();
        try {
            this.f791c = 2;
            arrayList.addAll(this.f790b);
            this.f790b.clear();
            this.f789a.writeLock().unlock();
            this.f792d.post(new H.b(arrayList, this.f791c, th));
        } catch (Throwable th2) {
            this.f789a.writeLock().unlock();
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
        q1.d.f("start should be <= than end", i <= i2);
        B b3 = null;
        if (charSequence == null) {
            return null;
        }
        q1.d.f("start should be < than charSequence length", i <= charSequence.length());
        q1.d.f("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        r rVar = this.f793e.f782b;
        rVar.getClass();
        boolean z2 = charSequence instanceof x;
        if (z2) {
            ((x) charSequence).a();
        }
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, z.class) <= i2) {
                        b3 = new B();
                        b3.f775a = false;
                        b3.f776b = new SpannableString(charSequence);
                    }
                    if (b3 != null && (zVarArr = (z[]) b3.f776b.getSpans(i, i2, z.class)) != null && zVarArr.length > 0) {
                        for (z zVar : zVarArr) {
                            int spanStart = b3.f776b.getSpanStart(zVar);
                            int spanEnd = b3.f776b.getSpanEnd(zVar);
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
                        b2 = (B) rVar.s(charSequence, i3, i4, Integer.MAX_VALUE, false, new B.j(b3, 4, (H0.e) rVar.f810b));
                        if (b2 != null) {
                            if (!z2) {
                                return charSequence;
                            }
                            return charSequence;
                        }
                        Spannable spannable = b2.f776b;
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
            b2 = (B) rVar.s(charSequence, i3, i4, Integer.MAX_VALUE, false, new B.j(b3, 4, (H0.e) rVar.f810b));
            if (b2 != null) {
            }
        }
        return charSequence;
    }

    public final void f(h hVar) {
        q1.d.h(hVar, "initCallback cannot be null");
        this.f789a.writeLock().lock();
        try {
            if (this.f791c != 1 && this.f791c != 2) {
                this.f790b.add(hVar);
                this.f789a.writeLock().unlock();
            }
            this.f792d.post(new H.b(Arrays.asList(hVar), this.f791c, (Throwable) null));
            this.f789a.writeLock().unlock();
        } catch (Throwable th) {
            this.f789a.writeLock().unlock();
            throw th;
        }
    }
}
