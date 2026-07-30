package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xu1 {
    public static xu1 e;
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public xu1(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new tu1(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public static synchronized xu1 k(Context context) {
        xu1 xu1Var;
        synchronized (xu1.class) {
            try {
                if (e == null) {
                    e = new xu1(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new po0("MessengerIpcClient"))));
                }
                xu1Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xu1Var;
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.b).getStrokeCap();
        int i = strokeCap == null ? -1 : w5.a[strokeCap.ordinal()];
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
        int i = strokeJoin == null ? -1 : w5.b[strokeJoin.ordinal()];
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
        ((Paint) this.b).setBlendMode(op.O(i));
    }

    public void e(long j) {
        ((Paint) this.b).setColor(la0.W(j));
    }

    public void f(md mdVar) {
        this.d = mdVar;
        ((Paint) this.b).setColorFilter(mdVar != null ? mdVar.a : null);
    }

    public void g(Shader shader) {
        this.c = shader;
        ((Paint) this.b).setShader(shader);
    }

    public void h(int i) {
        ((Paint) this.b).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void i(int i) {
        ((Paint) this.b).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void j(int i) {
        ((Paint) this.b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public synchronized zu1 l(vu1 vu1Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(vu1Var.toString()));
            }
            if (!((tu1) this.d).d(vu1Var)) {
                tu1 tu1Var = new tu1(this);
                this.d = tu1Var;
                tu1Var.d(vu1Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return vu1Var.b.a;
    }

    public xu1(Paint paint) {
        this.b = paint;
        this.a = 3;
    }
}
