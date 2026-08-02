package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.widget.ListView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evt {
    private static boolean d;
    public final int a;
    public final Object b;
    public final Object c;

    public evt(hac hacVar) {
        csm csmVar = new csm(20);
        this.b = hacVar;
        this.a = Math.max(5, 10);
        this.c = csmVar;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [hac, java.lang.Object] */
    public final void a() {
        synchronized (evt.class) {
            if (!d) {
                evp evpVar = new evp(this, 3);
                long j = this.a;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                hvm hvmVar = (hvm) this.b.bB();
                eos.J(hvmVar.schedule(new gof(evpVar, hvmVar, j, timeUnit, 1), j, timeUnit));
                d = true;
            }
        }
    }

    public final ListView b() {
        return ((ki) this.b).e;
    }

    public evt(kl klVar, gd gdVar, int i) {
        this.b = klVar;
        this.c = gdVar;
        this.a = i;
    }

    public evt(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.c = colorStateList;
        this.b = configuration;
        this.a = theme == null ? 0 : theme.hashCode();
    }

    public evt(cnn cnnVar, int i, cms cmsVar) {
        this.c = cnnVar;
        this.a = i;
        this.b = cmsVar;
    }
}
