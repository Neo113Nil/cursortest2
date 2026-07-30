package h2;

import c2.e;
import f2.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: h2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f5160d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f5161e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final j f5162a;

    /* renamed from: b, reason: collision with root package name */
    public long f5163b;

    /* renamed from: c, reason: collision with root package name */
    public int f5164c;

    public C0473d() {
        if (e.f4187i == null) {
            Pattern pattern = j.f4796c;
            e.f4187i = new e();
        }
        e eVar = e.f4187i;
        if (j.f4797d == null) {
            j.f4797d = new j(eVar);
        }
        this.f5162a = j.f4797d;
    }

    public final synchronized boolean a() {
        boolean z7;
        if (this.f5164c != 0) {
            this.f5162a.f4798a.getClass();
            z7 = System.currentTimeMillis() > this.f5163b;
        }
        return z7;
    }

    public final synchronized void b(int i2) {
        long min;
        if ((i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404) {
            synchronized (this) {
                this.f5164c = 0;
            }
            return;
        }
        this.f5164c++;
        synchronized (this) {
            if (i2 == 429 || (i2 >= 500 && i2 < 600)) {
                double pow = Math.pow(2.0d, this.f5164c);
                this.f5162a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f5161e);
            } else {
                min = f5160d;
            }
            this.f5162a.f4798a.getClass();
            this.f5163b = System.currentTimeMillis() + min;
        }
        return;
    }
}
