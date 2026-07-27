package b2;

import Z1.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: b2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f4813d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f4814e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final j f4815a;

    /* renamed from: b, reason: collision with root package name */
    public long f4816b;

    /* renamed from: c, reason: collision with root package name */
    public int f4817c;

    public C0278d() {
        if (W1.e.f3404b == null) {
            Pattern pattern = j.f3772c;
            W1.e.f3404b = new W1.e();
        }
        W1.e eVar = W1.e.f3404b;
        if (j.f3773d == null) {
            j.f3773d = new j(eVar);
        }
        this.f4815a = j.f3773d;
    }

    public final synchronized boolean a() {
        boolean z;
        if (this.f4817c != 0) {
            this.f4815a.f3774a.getClass();
            z = System.currentTimeMillis() > this.f4816b;
        }
        return z;
    }

    public final synchronized void b(int i2) {
        long min;
        if ((i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404) {
            synchronized (this) {
                this.f4817c = 0;
            }
            return;
        }
        this.f4817c++;
        synchronized (this) {
            if (i2 == 429 || (i2 >= 500 && i2 < 600)) {
                double pow = Math.pow(2.0d, this.f4817c);
                this.f4815a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f4814e);
            } else {
                min = f4813d;
            }
            this.f4815a.f3774a.getClass();
            this.f4816b = System.currentTimeMillis() + min;
        }
        return;
    }
}
