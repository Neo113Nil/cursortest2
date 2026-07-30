package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vs3 {
    public static vs3 e;
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public vs3(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new gq3(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public static synchronized vs3 j(Context context) {
        vs3 vs3Var;
        synchronized (vs3.class) {
            try {
                if (e == null) {
                    e = new vs3(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new wo1("MessengerIpcClient"))));
                }
                vs3Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vs3Var;
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.b).getStrokeCap();
        int i = strokeCap == null ? -1 : ha.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : ha.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void d(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            x6.s(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(x6.w(i)));
        }
    }

    public void e(long j) {
        ((Paint) this.b).setColor(ap.H(j));
    }

    public void f(mo moVar) {
        this.d = moVar;
        ((Paint) this.b).setColorFilter(moVar != null ? moVar.a : null);
    }

    public void g(int i) {
        ((Paint) this.b).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void h(int i) {
        ((Paint) this.b).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void i(int i) {
        ((Paint) this.b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public synchronized ys3 k(ds3 ds3Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(ds3Var.toString()));
            }
            if (!((gq3) this.d).d(ds3Var)) {
                gq3 gq3Var = new gq3(this);
                this.d = gq3Var;
                gq3Var.d(ds3Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ds3Var.b.a;
    }

    public vs3(Paint paint) {
        this.b = paint;
        this.a = 3;
    }
}
