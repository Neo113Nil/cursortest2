package defpackage;

import java.net.URL;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bg {
    public long a;
    public int b;
    public final Object c;

    public bg() {
        if (tc1.e == null) {
            Pattern pattern = cm1.b;
            tc1.e = new tc1(2);
        }
        tc1 tc1Var = tc1.e;
        if (cm1.c == null) {
            cm1.c = new cm1(tc1Var);
        }
        this.c = cm1.c;
    }

    public synchronized boolean a() {
        boolean z;
        if (this.b != 0) {
            ((cm1) this.c).a.getClass();
            z = System.currentTimeMillis() > this.a;
        }
        return z;
    }

    public synchronized void b(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.b = 0;
            }
            return;
        }
        this.b++;
        synchronized (this) {
            if (i != 429 && (i < 500 || i >= 600)) {
                min = 86400000;
                ((cm1) this.c).a.getClass();
                this.a = System.currentTimeMillis() + min;
            }
            double pow = Math.pow(2.0d, this.b);
            ((cm1) this.c).getClass();
            min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            ((cm1) this.c).a.getClass();
            this.a = System.currentTimeMillis() + min;
        }
        return;
    }

    public bg(int i, URL url, long j) {
        this.b = i;
        this.c = url;
        this.a = j;
    }
}
