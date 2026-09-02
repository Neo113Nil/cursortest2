package D1;

import B1.l;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import y1.C0760d;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f379d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f380e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final l f381a;

    /* renamed from: b, reason: collision with root package name */
    public long f382b;

    /* renamed from: c, reason: collision with root package name */
    public int f383c;

    public e() {
        if (C0760d.f6234f == null) {
            Pattern pattern = l.f111c;
            C0760d.f6234f = new C0760d();
        }
        C0760d c0760d = C0760d.f6234f;
        if (l.f112d == null) {
            l.f112d = new l(c0760d);
        }
        this.f381a = l.f112d;
    }

    public final synchronized boolean a() {
        boolean z5;
        if (this.f383c != 0) {
            this.f381a.f113a.getClass();
            z5 = System.currentTimeMillis() > this.f382b;
        }
        return z5;
    }

    public final synchronized void b(int i7) {
        long min;
        if ((i7 >= 200 && i7 < 300) || i7 == 401 || i7 == 404) {
            synchronized (this) {
                this.f383c = 0;
            }
            return;
        }
        this.f383c++;
        synchronized (this) {
            if (i7 == 429 || (i7 >= 500 && i7 < 600)) {
                double pow = Math.pow(2.0d, this.f383c);
                this.f381a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f380e);
            } else {
                min = f379d;
            }
            this.f381a.f113a.getClass();
            this.f382b = System.currentTimeMillis() + min;
        }
        return;
    }
}
