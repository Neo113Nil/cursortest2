package androidx.emoji2.text;

import android.os.Trace;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class o implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = j0.g.f1893a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (l.f332k != null) {
                l.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i4 = j0.g.f1893a;
            Trace.endSection();
            throw th;
        }
    }
}
