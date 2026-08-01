package androidx.emoji2.text;

import android.os.Trace;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = j0.h.f2137b;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (l.f454k != null) {
                l.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Method method2 = j0.h.f2137b;
            Trace.endSection();
            throw th;
        }
    }
}
