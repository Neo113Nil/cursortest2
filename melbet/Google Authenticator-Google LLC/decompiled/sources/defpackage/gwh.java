package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gwh {
    public final Object a;
    public final Object b;
    public Object c;

    public gwh(Context context, byte[] bArr) {
        this.a = new fbc();
        exf.o(context != null, "Context cannot be null", new Object[0]);
        this.b = context.getApplicationContext();
    }

    public final File a() {
        Object obj;
        File dataDir;
        synchronized (this.a) {
            if (this.c == null) {
                dataDir = ((Context) this.b).getDataDir();
                this.c = dataDir;
            }
            obj = this.c;
        }
        return (File) obj;
    }

    public final void b(aej aejVar) {
        Object obj = this.c;
        if (obj != null) {
            ((agc) obj).run();
        }
        agc agcVar = new agc((ael) this.a, aejVar);
        this.c = agcVar;
        ((Handler) this.b).postAtFrontOfQueue(agcVar);
    }

    public gwh(hoq hoqVar, Object obj) {
        this.b = hoqVar;
        this.a = obj;
    }

    public gwh(aer aerVar) {
        this.a = new ael(aerVar);
        this.b = new Handler(Looper.getMainLooper());
    }

    public gwh(drb drbVar, dov dovVar) {
        this.a = drbVar;
        this.b = dovVar;
    }

    public gwh(Context context) {
        this.a = new Object();
        this.b = context.getApplicationContext();
    }
}
