package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjn {
    public final bar a;
    public final List b;
    public final bah c;
    public boolean d;
    public boolean e;
    public Bitmap f;
    public int g;
    public int h;
    public int i;
    public blk j;
    public blk k;
    public blk l;
    private final Handler m;
    private final bed n;
    private boolean o;
    private baf p;

    public bjn(azj azjVar, bar barVar, int i, int i2, bbp bbpVar, Bitmap bitmap) {
        bed bedVar = azjVar.b;
        bah c = azj.c(azjVar.a());
        baf f = azj.c(azjVar.a()).b().f(((blf) ((blf) blf.b(bdg.b).G()).F()).u(i, i2));
        this.b = new ArrayList();
        this.c = c;
        Handler handler = new Handler(Looper.getMainLooper(), new cqn(this, 1));
        this.n = bedVar;
        this.m = handler;
        this.p = f;
        this.a = barVar;
        d(bbpVar, bitmap);
    }

    final int a() {
        return ((bav) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        blk blkVar = this.l;
        if (blkVar != null) {
            this.l = null;
            f(blkVar);
            return;
        }
        this.o = true;
        bar barVar = this.a;
        bav bavVar = (bav) barVar;
        bat batVar = bavVar.f;
        int i2 = batVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = bavVar.e) >= 0) {
            i3 = i < i2 ? ((bas) batVar.e.get(i)).i : -1;
        }
        long uptimeMillis = SystemClock.uptimeMillis() + i3;
        barVar.b();
        this.k = new blk(this.m, bavVar.e, uptimeMillis);
        baf d = this.p.f((blf) new blf().x(new bls(Double.valueOf(Math.random())))).d(barVar);
        d.i(this.k, d, bma.a);
    }

    public final void c() {
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.f = null;
        }
    }

    final void d(bbp bbpVar, Bitmap bitmap) {
        a.v(bitmap, "Argument must not be null");
        this.f = bitmap;
        this.p = this.p.f(new blf().z(bbpVar, true));
        this.g = bmi.a(bitmap);
        this.h = bitmap.getWidth();
        this.i = bitmap.getHeight();
    }

    public final void e() {
        this.d = false;
    }

    public final void f(blk blkVar) {
        this.o = false;
        if (this.e) {
            this.m.obtainMessage(2, blkVar).sendToTarget();
            return;
        }
        if (!this.d) {
            this.l = blkVar;
            return;
        }
        if (blkVar.b != null) {
            c();
            blk blkVar2 = this.j;
            this.j = blkVar;
            List list = this.b;
            for (int size = list.size() - 1; size >= 0; size--) {
                bjj bjjVar = (bjj) list.get(size);
                Object callback = bjjVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    bjjVar.stop();
                    bjjVar.invalidateSelf();
                } else {
                    bjjVar.invalidateSelf();
                    blk blkVar3 = bjjVar.a.a.j;
                    if ((blkVar3 != null ? blkVar3.a : -1) == r5.a() - 1) {
                        bjjVar.c++;
                    }
                    if (bjjVar.d != -1 && bjjVar.c >= 0) {
                        bjjVar.stop();
                    }
                }
            }
            if (blkVar2 != null) {
                this.m.obtainMessage(2, blkVar2).sendToTarget();
            }
        }
        b();
    }
}
