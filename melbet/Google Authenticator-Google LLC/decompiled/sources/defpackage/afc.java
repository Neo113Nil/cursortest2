package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afc extends aez {
    public afc() {
    }

    @Override // defpackage.aez
    public void i(Object obj) {
        aez.b("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public final void k(Object obj) {
        Object obj2;
        Object obj3;
        Handler createAsync;
        synchronized (this.b) {
            obj2 = this.f;
            obj3 = aez.a;
            this.f = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        Runnable runnable = this.h;
        ow owVar = op.a().b;
        oq oqVar = (oq) owVar;
        if (oqVar.c == null) {
            synchronized (oqVar.a) {
                if (((oq) owVar).c == null) {
                    createAsync = Handler.createAsync(Looper.getMainLooper());
                    ((oq) owVar).c = createAsync;
                }
            }
        }
        oqVar.c.post(runnable);
    }

    public afc(Object obj) {
        super(obj);
    }
}
