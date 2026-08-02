package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpp {
    private static fpp e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new fpn(this));
    public fpo c;
    public fpo d;

    private fpp() {
    }

    public static fpp a() {
        fpp fppVar = e;
        if (fppVar != null) {
            return fppVar;
        }
        fpp fppVar2 = new fpp();
        e = fppVar2;
        return fppVar2;
    }

    public final void b(fpo fpoVar) {
        int i = fpoVar.a;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(fpoVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, fpoVar), i);
    }

    public final void c() {
        fpo fpoVar = this.d;
        if (fpoVar != null) {
            this.c = fpoVar;
            this.d = null;
            kee keeVar = (kee) ((WeakReference) fpoVar.c).get();
            if (keeVar == null) {
                this.c = null;
                return;
            }
            Object obj = keeVar.a;
            Handler handler = fpk.a;
            handler.sendMessage(handler.obtainMessage(0, obj));
        }
    }

    public final boolean d(fpo fpoVar, int i) {
        kee keeVar = (kee) ((WeakReference) fpoVar.c).get();
        if (keeVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(fpoVar);
        Object obj = keeVar.a;
        Handler handler = fpk.a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, obj));
        return true;
    }

    public final void e(kee keeVar) {
        synchronized (this.a) {
            if (g(keeVar)) {
                fpo fpoVar = this.c;
                if (!fpoVar.b) {
                    fpoVar.b = true;
                    this.b.removeCallbacksAndMessages(fpoVar);
                }
            }
        }
    }

    public final void f(kee keeVar) {
        synchronized (this.a) {
            if (g(keeVar)) {
                fpo fpoVar = this.c;
                if (fpoVar.b) {
                    fpoVar.b = false;
                    b(fpoVar);
                }
            }
        }
    }

    public final boolean g(kee keeVar) {
        fpo fpoVar = this.c;
        return fpoVar != null && fpoVar.a(keeVar);
    }

    public final boolean h(kee keeVar) {
        fpo fpoVar = this.d;
        return fpoVar != null && fpoVar.a(keeVar);
    }
}
