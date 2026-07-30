package l3;

import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5921f = 0;

    public /* synthetic */ o() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5921f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    int i7 = x2.g.f9671a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (k.c()) {
                        k.a().d();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i8 = x2.g.f9671a;
                    Trace.endSection();
                    throw th;
                }
            default:
                throw null;
        }
    }

    public o(l4.r rVar) {
    }
}
