package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcf {
    public static final TimeUnit a = TimeUnit.MILLISECONDS;
    public final Context b;
    public final htr c;
    public final String d;
    public final Handler e;
    public final hac f;
    public final TimeUnit g;
    public final hgv h = new hhy(new TreeMap(hih.a), new hhv());
    public final Object i = new Object();

    public fcf(fcc fccVar) {
        this.b = fccVar.a;
        this.c = fccVar.b;
        this.d = fccVar.c;
        this.e = fccVar.d;
        this.f = fccVar.e;
        this.g = fccVar.f;
    }

    public final void a(Uri uri) {
        int i = hel.d;
        heg hegVar = new heg(4);
        synchronized (this.i) {
            hegVar.j(this.h.c(uri));
        }
        hel g = hegVar.g();
        int i2 = ((his) g).c;
        for (int i3 = 0; i3 < i2; i3++) {
            ((Runnable) g.get(i3)).run();
        }
    }
}
