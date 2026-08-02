package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gbk implements Runnable {
    final List a = new ArrayList();
    Runnable b;

    @Override // java.lang.Runnable
    public final void run() {
        fao.c();
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
